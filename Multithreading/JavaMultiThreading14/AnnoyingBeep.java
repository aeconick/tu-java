import java.util.Timer;
import java.util.TimerTask;
import java.awt.Toolkit;
public class AnnoyingBeep {
    Toolkit toolkit;
    Timer timer;

    public AnnoyingBeep() {
        toolkit = Toolkit.getDefaultToolkit();
        timer = new Timer();
        timer.schedule(new RemindTask(),
                0,
                1*1000);
    }

    class RemindTask extends TimerTask {
        int numWarningBeeps = 3;

        public void run() {
            if (numWarningBeeps > 0) {
                toolkit.beep();
                System.out.format("Beep!%n");
                numWarningBeeps--;
            } else {
                toolkit.beep();
                System.out.format("Time's up!%n");
                System.exit(0);
            }
        }
    }

    public static void main(String args[]) {
        System.out.format("About to schedule task.%n");
        new AnnoyingBeep();
        System.out.format("Task scheduled.%n");
    }
}
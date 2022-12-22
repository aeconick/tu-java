public class bmi {

    // method to check bmi category
    public static String bmiCategory(double weight,
                                     double height) {

        // calculate bmi
        double bmi = weight / (height * height);

        // check range
        if (bmi < 18.5)
            return "Thinness";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }
}

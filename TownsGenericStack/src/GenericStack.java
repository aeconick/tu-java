public class GenericStack<E> {
    private java.util.ArrayList<E> list = new java.util.ArrayList<>();

    public int getSize() {
        return list.size();
    }

    public E peek() {
        return list.get(getSize() - 1);
    }

    public void push(E o) {
        list.add(o);
    }

    public E pop() {
        E o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }

    public static void main(String[] args) {

        GenericStack<String> stack1 = new GenericStack<>();
        stack1.push("Sofia");
        stack1.push("Pazardjik");
        stack1.push("Plovdiv");
        GenericStack<Integer> stack2 = new GenericStack<>();
        stack2.push(1); // autoboxing 1 to an Integer object
        stack2.push(2);
        stack2.push(3);

        stack1.pop();
        stack2.pop();
        print(stack1);
        print(stack2);
    }

    public static <E> void print(GenericStack<E> list) {
             System.out.print(list + " ");
    }


}
public class Second {
    public static void main(String[] args) {
        first(args);  // calling the static method
    }

    public static void first(String[] run) {
        char i = 'A';
        System.out.println("The character is: " + i);
    }
}

public class Welcome {
    public static void main(String[] args) {
        Greeting greeting = () -> {
            System.out.println("Hello");
        };
        greeting.greet();
    }
}

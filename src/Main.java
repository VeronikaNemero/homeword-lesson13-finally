public class Main {
    public static void main(String[] args) {
        try
        {
            int num = 15;
            for (int i = 0; i < num; i++) {
                num /= i;
                System.out.println(num);
            }
        }
        catch (ArithmeticException e) {
            System.out.println (e.getMessage());
            System.exit(505);
        }
        finally {
            System.out.println ("All code is done.");
        }
    }
}
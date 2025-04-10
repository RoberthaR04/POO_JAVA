public class Main {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 0;
            String s = null;
            System.out.print(s.toLowerCase());
        }catch (ArithmeticException e)
        {System.out.print("erro 1");
        }catch (Exception e) {
            System.out.print("erro 2");
        }finally {System.out.print("fim");}



    }
}
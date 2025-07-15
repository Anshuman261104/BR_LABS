public class TypeCasting1
{
    public static void main(String[] args)
    {
        // Widening (Implicit)
        int a = 100;
        double b = a;  // int to double (automatic)
        System.out.println("Widening: int to double: " + b);

        // Narrowing (Explicit)
        double x = 123.45;
        int y = (int) x;  // double to int (manual)
        System.out.println("Narrowing: double to int: " + y);

        // char to int
        char c = 'A';
        int cInt = c;  // char to int (ASCII value)
        System.out.println("char to int (ASCII): " + cInt);

        // int to char
        int d = 66;
        char dChar = (char) d; // int to char
        System.out.println("int to char: " + dChar);

        // int to byte (narrowing)
        int largeNum = 130;
        byte smallNum = (byte) largeNum;
        System.out.println("int to byte : " + smallNum);
    }
}

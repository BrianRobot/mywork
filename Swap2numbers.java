public class main {
    public static void main(String args[]) {
        // Declare two int variables
        int a = 5;
        int b = 2;
        //  Print them without swapping
        System.out.println(a + " " + b);

        //Swap the numbers
        int c = a; //5 goes to c
        a = b; //2 goes to a
        b = c; // 5 goes from c to b

        //number print in there new places.
        System.out.println(a + " " + b);
    }
}

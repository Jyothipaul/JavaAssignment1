package loveProgramming;

public class OperationOnNumbers {

    static int i = 125;
    static int j = 24;

    public static void main(String[] args) {

        System.out.printf("Test Data");
        System.out.printf("\nInput first number: "+ i);
        System.out.printf("\nInput second number: " + j);

//        Operations on numbers

        System.out.printf("\n125 + 24 = " + (i+j));
        System.out.printf("\n125 - 24 = " + (i-j));
        System.out.printf("\n125 x 24 = " + (i*j));
        System.out.printf("\n125 / 24 = " + (i/j));
        System.out.printf("\n125 mod 24 = " + (i % j));
    }
}
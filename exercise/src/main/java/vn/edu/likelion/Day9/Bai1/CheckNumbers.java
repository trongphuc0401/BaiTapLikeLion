package vn.edu.likelion.Day9.Bai1;

/**
 * checkNumbers -
 *
 * @param
 * @return
 * @throws
 */
public class CheckNumbers {

    public static boolean checkEven(int numbers) {


        String stringNumber = String.valueOf(numbers);
        int checkNumber;
        for (int i = 0 ; i < stringNumber.length();i++) {
            checkNumber = Integer.valueOf(stringNumber.charAt(i));

        }
        return true;
    }
    public static boolean checkEven1(int numbers) {
        int quotient = numbers /10;
        int remainder = numbers%2;
        if((remainder  & 1) ==0) return false;
        if (quotient > 0) return checkEven1(quotient);
        return true;
    }

    public static void main(String[] args) {
        int numbers =11111;
        System.out.println("Input an integer: "+numbers);
        System.out.println("Check whether every digit of the said integer is even or not!");
        if (checkEven1(numbers)) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }

}

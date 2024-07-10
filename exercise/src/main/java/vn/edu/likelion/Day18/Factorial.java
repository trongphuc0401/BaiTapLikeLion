package vn.edu.likelion.Day18;

/**
 * Factorial -
 *
 * @param
 * @return
 * @throws
 */
public class Factorial {
    public static void main(String[] args) {
        int number = 5;


        System.out.println("Giai thừa của: "+number+ "! là "+factorial(number));
    }

    private static int factorial(int number) {

        // nếu n = 0 hoặc n  =1 trả  về 1
        if (number ==0 || number ==1) return 1;

        //đệ quy factoial cho n -1; và  nhân với n
        return number*factorial(number-1);

    }
}

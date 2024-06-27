package vn.edu.likelion.Day9.Bai1;

import javax.xml.transform.Result;
import java.rmi.Remote;

/**
 * ExtractDigit -
 *
 * @param
 * @return
 * @throws
 */
public class ExtractDigit {

    public static int extractFirstDigit(int number) {
        boolean negative = number<0;
        number = Math.abs(number);
        int quotient = number/10;
        if(quotient < 10) return quotient;
        return negative ? -extractFirstDigit(quotient): extractFirstDigit1(quotient);
    }
    public static int extractFirstDigit1(int number) {
        boolean negative = number<0;
        number = Math.abs(number);
        while(number >= 10) {
            number = number/10;
        }
       return negative ? -number : number;
    }
    
    public static void extractFirstDigit3(int number){
        boolean negative = number < 0;
       String stringNumber = String.valueOf(number);
       if (negative) {
           System.out.println(stringNumber.substring(0,2));
       }else {
           System.out.println(stringNumber.substring(0,1));
       }

    }


    public static void main(String[] args) {
        int number =  -1234;
        extractFirstDigit3(number);
        System.out.println("Input an integer(positive/negative): "+number);
        System.out.println( "Extract the first digit from the said integer: "+extractFirstDigit1(number));
    }
}

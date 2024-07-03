package vn.edu.likelion.Day13;

/**
 * ConvertBinary -
 *
 * @param
 * @return
 * @throws
 */
public class ConvertBinary {

    ConvertBi convertBi = (num) -> {
        int[] binary = new int[35];

        int count = 0;
        while(num >0) {
            binary[count++] = num %2;
            num = num/2;
        }
        for (int i =count -1 ; i >= 0 ; i-- ) {
            System.out.print(binary[i]+ " ");
        }
    };

    public static void main(String[] args) {
        int num = 33;
        ConvertBinary convertBinary = new ConvertBinary();

        convertBinary.convertBi.convertBinary(num);
    }
}

 /*
- Bin2Dec allows the user to enter strings of up to 8 binary digits, 0's and 1's, in any sequence and then displays its decimal equivalent.

. This challenge requires that the developer implementing it follow these constraints:

1. Arrays may not be used to contain the binary digits entered by the user

2. Determining the decimal equivalent of a particular binary digit in the sequence must be calculated using a single mathematical function,
for example the natural logarithm. It's up to you to figure out which function to use.

*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner myScanner = new Scanner(System.in);
        String binaryInput;
        int binaryValue = 0;
        int binaryDigit;
        byte i;

        System.out.println("Type the binary value ( 8 digits ): ");
        binaryInput = myScanner.nextLine();
        myScanner.close();

        if (binaryInput.length() == 8 && binaryInput.matches("[01]+")) {
            for (i = 0; i < binaryInput.length(); i++) {
                binaryDigit = Integer.parseInt(binaryInput.substring(i, i+1));
                binaryValue = (binaryValue * 2) + binaryDigit;
            }
            System.out.println(binaryInput + " To decimal -> " + binaryValue);
        } else {
            System.out.println("Incorrect value!");
        }

    }
}

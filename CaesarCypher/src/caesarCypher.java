/* Using the char data type and the ASCII table to  */
/* to decrypt and encrypt messages				    */
/*													*/
/*	Jarrad Self										*/
/*	HW2 CS3626 SO2									*/
/*	Question 1												*/
import java.util.*;

public class caesarCypher {
    public static String string;
    public static int choice;

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter text for Encryption or Decryption: ");
        string = (scan.nextLine()).toUpperCase();
        System.out.println("Type 0 for Encryption, and type 1 for Decryption:");
        choice = scan.nextInt();

        encryptOrDecrypt();
    }
    public static void encryptOrDecrypt()
    {
        if (choice == 0) {									//encryption if statement
            for (int a = 0; a < string.length(); a++){

            char result = string.charAt(a);
                int value = result;
            if((int)result == 32)
                System.out.print(" ");
            else if ((int)result + 42 > 90)
            {
            	value = 65 + ((int)result + 42 - 65) % 26;
                System.out.print((char)value);
            } else {
                System.out.print((char)(value + 42));
            }
        }
        } else {											//if 0 is not chosen the else if ran (decrypt)
            for (int a = 0; a< string.length(); a++) {

                char result = string.charAt(a);
                int value = result;
                if ((int) result == 32)
                    System.out.print(" ");
                else if ((int) result - 42 > 122) {
                    value = 65 + ((int) result - 42 - 65) % 26;
                    System.out.print((char) value);
                } else {
                    System.out.print((char) (value + 42));
                }
            }

        }
    }

}
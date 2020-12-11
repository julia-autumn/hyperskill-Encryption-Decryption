package encryptdecrypt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // String strMessageToEnc = scanner.nextLine().trim();
        String strMessageToEnc = "we found a treasure!";
        String strMessageEncrypted = "";

        for (int i = 0; i < strMessageToEnc.length() ; i++) {
            if (strMessageToEnc.charAt(i) >= 97 && strMessageToEnc.charAt(i) <= 122) {
                strMessageEncrypted += Character.toString(122 - (strMessageToEnc.charAt(i) - 97));
                //System.out.print(Character.toString(122 - (strMessageToEnc.charAt(i) - 97)));
            }
            else
                strMessageEncrypted += Character.toString(strMessageToEnc.charAt(i));
                //System.out.print(strMessageToEnc.charAt(i));
        }

          System.out.println(strMessageEncrypted);




        //System.out.println("Hello World!");
    }
}

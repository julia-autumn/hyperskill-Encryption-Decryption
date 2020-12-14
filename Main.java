package encryptdecrypt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      //  Scanner scanner = new Scanner(System.in);
     //   String strMessageToEnc = "welcome to hyperskill";
         Message message = MessageReader.readMessageFromConsole();

        Encryptor enc = new Encryptor(message.getMessage());
        System.out.println(enc.encryptMessage(message.getKey()));


        //System.out.println("Hello World!");
    }
}

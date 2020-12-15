package encryptdecrypt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //   String strMessageToEnc = "welcome to hyperskill";
        String strOperation = scanner.nextLine();
        Message message = MessageReader.readMessageFromConsole();

        Enigma enc = new Enigma(message);

        switch (strOperation) {
            case "enc":
                System.out.println(enc.encryptMessage());
                break;
            case "dec":
                System.out.println(enc.decryptMessage());


                //System.out.println("Hello World!");
        }
    }
}

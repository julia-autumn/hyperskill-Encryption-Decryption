package encryptdecrypt;

import java.util.Scanner;

import static encryptdecrypt.Operation.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //   String strMessageToEnc = "welcome to hyperskill";
    //    String strOperation = scanner.nextLine();
      //  Message message = MessageReader.readFromConsole();
        Message message = MessageReader.readFromCommandLine(args);

        Enigma enc = new Enigma(message);
        switch (message.getOperation()) {
            case "enc":
                System.out.println(enc.encryptMessage());
                break;
            case "dec":
                System.out.println(enc.decryptMessage());
                break;
            default:
                System.out.println("Incorrect mode");


                //System.out.println("Hello World!");
        }
    }
}

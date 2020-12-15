package encryptdecrypt;

import java.util.Scanner;

public class MessageReader {
    public static Message readMessageFromConsole(){
        Scanner scanner = new Scanner(System.in);
       // Message message1 = new Message(scanner.nextLine(), scanner.nextInt());
        return new Message(scanner.nextLine(), scanner.nextInt());
        //return message1;
    }

}

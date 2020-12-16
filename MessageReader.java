package encryptdecrypt;

import java.util.Scanner;

public class MessageReader {
    public static Message readFromConsole(){
        Scanner scanner = new Scanner(System.in);
        return new Message(scanner.nextLine(), scanner.nextLine(), scanner.nextInt());
    }

    public static Message readFromCommandLine(String[] args ) {
        String strOperation = "";
        String strMessage = "";
        int nKey = 0;

        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "-mode":
                    strOperation = args[i + 1];
                    break;
                case "-key":
                    nKey = Integer.parseInt(args[i + 1]);
                    break;
                case "-data":
                    strMessage = args[i + 1];
            }
        }
            return new Message(strOperation, strMessage, nKey);
    }

}

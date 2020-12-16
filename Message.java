package encryptdecrypt;

public class Message {
    private String operation;
    private String strMessage;
    private int nKey;

    public Message (String operation, String strMessage, int nKey) {
        this.operation = operation;
        this.strMessage = strMessage;
        this.nKey = nKey;
    }

    public String getOperation() { return operation;}

    public String getMessage() {
        return strMessage;
    }

    public int getKey() {
        return nKey;
    }

}

package encryptdecrypt;

public class Message {
    private String strMessage;
    private int nKey;

    public Message (String strMessage, int nKey) {
        this.strMessage = strMessage;
        this.nKey = nKey;
    }

    public String getMessage() {
        return strMessage;
    }

    public int getKey() {
        return nKey;
    }


}

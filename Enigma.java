package encryptdecrypt;

public class Encryptor {
    private String strMessage;

    public Encryptor(String strMessage) {
        this.strMessage = strMessage;
    }

    public String encryptMessage(int nKey) {
        String strMessageEncrypted = "";

        for (int i = 0; i < strMessage.length(); i++) {
            if (strMessage.charAt(i) >= 97 && strMessage.charAt(i) <= 122) {
                strMessageEncrypted += Character.toString (((strMessage.charAt(i) - 97 + nKey) % 26) + 97);
            } else
                strMessageEncrypted += Character.toString(strMessage.charAt(i));

        }
            return strMessageEncrypted;


    }

}

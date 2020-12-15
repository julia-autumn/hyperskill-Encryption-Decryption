package encryptdecrypt;

public class Enigma {
    private String strMessage;
    private int nKey;

    public Enigma(Message message) {
        this.strMessage = message.getMessage();
        this.nKey = message.getKey();
    }

    public String encryptMessage() {
        String strMessageEncrypted = "";

        for (int i = 0; i < strMessage.length(); i++) {
            //if (strMessage.charAt(i) >= 97 && strMessage.charAt(i) <= 122) {
                strMessageEncrypted += Character.toString ((strMessage.charAt(i) + nKey) % Character.MAX_CODE_POINT);
            //} else
              //  strMessageEncrypted += Character.toString(strMessage.charAt(i));

        }
            return strMessageEncrypted;
    }

    public String decryptMessage() {
        String strMessageDecrypted = "";

        for (int i = 0; i < strMessage.length(); i++) {
         //   if (strMessage.charAt(i) >= 97 && strMessage.charAt(i) <= 122) {
                strMessageDecrypted += Character.toString ((strMessage.charAt(i) - nKey) % Character.MAX_CODE_POINT);
           // } else
             //   strMessageDecrypted += Character.toString(strMessage.charAt(i));

        }
        return strMessageDecrypted;

    }

}

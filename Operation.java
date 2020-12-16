package encryptdecrypt;

public enum Operation {
    ENCRYPT ("enc"),
    DECRYPT ("dec");

    private String alias;

    Operation(String alias) {
         this.alias = alias;
   }

    public String getAlias() {
          return alias;
    }
}

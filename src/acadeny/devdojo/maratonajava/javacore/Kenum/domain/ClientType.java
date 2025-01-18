package acadeny.devdojo.maratonajava.javacore.Kenum.domain;

public enum ClientType {
    NATURAL_PERSON(1, "Natural Person"), LEGAL_ENTITY(2, "Legal Entity");
    public final int VALUE;
    private String relatoryName;

    ClientType (int value, String relatoryName){
        this.VALUE = value;
        this.relatoryName = relatoryName;
    }

    public int getVALUE() {
        return VALUE;
    }

    public String getRelatoryName() {
        return relatoryName;
    }
}

package acadeny.devdojo.maratonajava.javacore.Kenum.domain;

public enum ClientType {
    NATURAL_PERSON(1), LEGAL_ENTITY(2);
    public final int VALUE;

    ClientType (int value){
        this.VALUE = value;
    }
}

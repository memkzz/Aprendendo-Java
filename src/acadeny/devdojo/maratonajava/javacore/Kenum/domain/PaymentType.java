package acadeny.devdojo.maratonajava.javacore.Kenum.domain;

public enum PaymentType {
    DEBIT {
        public double calculateDiscount(double valor){
            return valor * 0.1;
        }

    }, CREDIT {
        public double calculateDiscount(double valor){
            return valor * 0.05;
        }

    };
    public double calculateDiscount(double valor){
        return 0;
    }

}

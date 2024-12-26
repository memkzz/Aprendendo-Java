package acadeny.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimentionais02 {
    public static void main(String[] args) {
        int[][] arrayint2 = {{1,2,3,4,5,6,7,8,9,10,11,12}};
        for (int[] arrayBase : arrayint2){
            for (int num: arrayBase){
                System.out.println(num);
            }
        }

        }
    }


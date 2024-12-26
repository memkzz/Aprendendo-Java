package acadeny.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int[][]dias = new int[12][1];
        dias[0][0] = 31;
        dias[1][0] = 28;
        dias[2][0] = 31;
        dias[3][0] = 30;
        dias[4][0] = 31;
        dias[5][0] = 31;
        dias[6][0] = 30;
        dias[7][0] = 31;
        dias[8][0] = 31;
        dias[9][0] = 31;
        dias[10][0] = 30;
        dias[11][0] = 31;


        for (int[] arrBase: dias){
            for (int num: arrBase) {
                System.out.println(num);
            }
        }
        }
    }


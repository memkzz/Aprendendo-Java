package acadeny.devdojo.maratonajava.javacore.Einicializationblocks.domain;

public class Anime {
    private String name;
    private int[] episodes;
    {
        System.out.println("Bloco de inicialização");
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime(){
        episodes = new int[100];
        for (int i = 1; i <= episodes.length ; i++) {
            System.out.print(i+" ");
            
        }


        }

    public String getName() {
        return name;

    }
    public int[] getEpisodes() {
        return episodes;
    }
}



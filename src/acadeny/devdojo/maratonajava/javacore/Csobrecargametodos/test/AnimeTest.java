package acadeny.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import acadeny.devdojo.maratonajava.javacore.Csobrecargametodos.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("TV","Super 11",267, "Action" );


        anime.imprime();
    }
}

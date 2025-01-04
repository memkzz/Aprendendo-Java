package acadeny.devdojo.maratonajava.javacore.Dconstrutores.test;

import acadeny.devdojo.maratonajava.javacore.Dconstrutores.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Streaming","One Piece",987,"Action","Zprodct");
        Anime anime1 = new Anime("TV","Super 11", 167, "Sport");
        anime.imprime();
        anime1.imprime();
    }
}

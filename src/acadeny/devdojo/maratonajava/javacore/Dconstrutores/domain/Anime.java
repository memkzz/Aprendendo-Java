package acadeny.devdojo.maratonajava.javacore.Dconstrutores.domain;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private String gender;
    private String studio;

    public Anime(String type, String name, int episodes, String gender){
        this.type = type;
        this.name = name;
        this.episodes = episodes;
        this.gender = gender;
    }
    public Anime(String type, String name, int episodes, String gender, String studio){
        this(type, name,episodes,gender);
        this.studio =  studio;
    }

        public void imprime(){
        System.out.println("Type name: "+this.type);
        System.out.println("Anime name: "+this.name);
        System.out.println("Number of episodes: "+this.episodes);
        System.out.println("Anime genre: "+this.gender);
        System.out.println("Anime Studio: "+this.studio);


    }
    public void setName(String name){
        this.name = name;
    }
    public void setType(String type){
        this.type = type;

    }
    public void setEpisodes(int episodes){
        this.episodes = episodes;
    }
    public String getName(){
        return this.name;
    }
    public int getEpisodes(){
        return this.episodes;
    }
    public String getType(){
        return this.type;
    }
}

package goingabsract;

public abstract class Music {

    //Attributes of a Music Object
   private String genre;

    //constructor acting low key as setter but actually is the construction of objects
    //that will extend this abstract class...
    public Music(String genre){
        this.genre =  genre;
    }

    String getGenre(){
        return this.genre;
    }

    abstract void playMusic();

}

class Reggae extends Music{

    //After extending lemme create a construstor that matches the parent class
    //default constructor
    public Reggae(String music){
        super(music);
    }

    @Override
    void playMusic() {
        System.out.println("Listening to... " + getGenre() + " music.");
    }
}



class MusicRecords {
    public static void main(String[] args) {
        Reggae reggaeMusic = new Reggae("Reggae");
        String valOfMusic = reggaeMusic.getGenre();

        System.out.println(valOfMusic);
        System.out.println(reggaeMusic.getGenre());

        reggaeMusic.playMusic();
    }
}



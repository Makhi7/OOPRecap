package mytypes;

interface Sport{

    void playSport();

}

public class Athelete implements Sport {
    public void playSport(){
        System.out.println("Athelete playing a sport");
    }
}

class MixedMartialArts extends Athelete {
    public void playSport(){
        System.out.println("Fighter playing in the UFC");
    }
}

class AtheleteTest {

    public static void main(String [] args){

        //Athelete ref type with Athelete object type
            Athelete player1 = new Athelete ();
             player1.playSport();

        //Athelete ref type with MixedMartialArts object type
        //Polymorphism in motion
            Athelete player2 = new MixedMartialArts();
            player2.playSport();

        //Sport ref type with MixedMartialArts object type
        //Polymorphism in motion
            Sport player3 = new MixedMartialArts();
            player3.playSport();

    }


}




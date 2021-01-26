package mytypes;

public class Training implements WarmUp{

    private String exercise;

    //setting the exercise
    public void setExercise(String exercise){
        this.exercise = exercise;
    }

    //getting the exercise
    public String getExercise(){
        return exercise;
    }

    public void doExcercise(){
        System.out.println("Lets get ready to sweat and do " + exercise);
    }

    public int countReps(){
        int repCounter = 0;
        if(getExercise() != null){
            //create a loop
            for(int x = 0; x<10;x++)
                repCounter++;
                System.out.println("you have completed "+ repCounter + " " +exercise + " reps");
        }else{
            System.out.println("you are not working out..");
        }
        return repCounter;
    }
    //constructor
    public Training (){

    }

    public Training (String exercise){
        this.exercise = exercise;
    }

    public static void main(String[] args) {
        Training workout = new Training("jump squats");
        workout.dynamicStretching();
        workout.doExcercise();
        workout.countReps();



        //use the training
//        Training training = new Training();
//        training.doExcercise();
//        training.countReps();
//        training.setExercise("Pull Ups");
//        training.doExcercise();
//        training.countReps();
//        training.countReps()
    }

    @Override
    public void dynamicStretching() {
        System.out.println("Stretching muscles to train");
    }
}



package mytypes;

public class WeightLifting extends Training implements WarmUp{

    @Override
    public void dynamicStretching() {
        System.out.println("Stretching muscles to lift weights");
    }

    public int countReps(){
        int repCounter = 0;
        if(getExercise() != null){
            //create a loop
            for(int x = 0; x<8 ;x++)
                repCounter++;
            System.out.println("you have completed "+ repCounter + " " +getExercise() + " reps");
        }else{
            System.out.println("you are not working out..");
        }
        return repCounter;
    }

    public static void main(String[] args) {
        WeightLifting lifting = new WeightLifting();
        lifting.setExercise("bench press");
        System.out.println(lifting.getExercise()) ;
        int wY = lifting.countReps();
        System.out.println(wY);


        Training polyWeightLift = new WeightLifting();
        polyWeightLift.dynamicStretching();
        polyWeightLift.setExercise("Deadlift");
        polyWeightLift.countReps();


    }
}

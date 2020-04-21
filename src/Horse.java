public class Horse extends Animal {

    public Horse(String name,int runDistance, int swimmingDistance, int jumpHeight){
        super(name,runDistance, swimmingDistance, jumpHeight);
    }


    public void voice(){
        System.out.println(name + " igogo");
    }

}
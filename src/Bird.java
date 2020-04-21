public class Bird extends Animal {

    public Bird(String name, int runDistance, int swimmingDistance, double jumpHeight){
        super(name, runDistance, swimmingDistance, (int) jumpHeight);
    }


    public void voice(){
        System.out.println(name + " tweet");
    }

}
public class Dog extends Animal {

    public Dog(String name, int runDistance, int swimmingDistance, double jumpHeight){
        super(name, runDistance, swimmingDistance, (int) jumpHeight);
    }
    public void voice(){
        System.out.println(name + " bark");
    }

}
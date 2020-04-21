public class Cat extends Animal  {

    public Cat(String name, int runDistance, int swimmingDistance, int jumpHeight){
        super(name, runDistance, swimmingDistance, jumpHeight);
    }
    public void voice(){
        System.out.println(name + " meow");
    }

}

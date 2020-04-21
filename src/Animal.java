public class Animal {

    protected String name;
    protected int runDistance;
    protected int swimmingDistance;
    protected int jumpHeight;

    public Animal(String name, int runDistance, int swimmingDistance, int jumpHeight){

        this.runDistance = runDistance;
        this.swimmingDistance = swimmingDistance;
        this.jumpHeight = jumpHeight;
        this.name = name;

    }


    protected void voice(){
        System.out.println(name + " aaa");
    }

}

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat c = new Cat("White Cat", 200, 0, 2);
        Cat c1 = new Cat("Black Cat", 250, 0, 3);
        Dog d = new Dog("Red Dog", 390, 15, 0.8);
        Dog d1 = new Dog("Gray Dog", 500, 10, 0.5);
        Horse h = new Horse("Yong Horse",1500,100,3);
        Horse h1 = new Horse("Old Horse",900,52,2);
        Bird b = new Bird("Home Bird", 5, 0, 1.5);
        Bird b1 = new Bird("Wild Bird", 7, 0, 1.5);
        int distance = 300;
        int swimming = 50;
        double jump = 1;

        Animal[] zoo = {c, c1, d, d1, b, b1, h, h1};
        for(int i = 0; i <zoo.length; i++){
            System.out.println(zoo[i].name + " может пробежать " + zoo[i].runDistance + "м, может проплыть " + zoo[i].swimmingDistance + "м, высота прыжка " + zoo[i].jumpHeight+"м");
            if(zoo[i].runDistance < distance){
                System.out.println(zoo[i].name + " не справился(ась) с забегом");
            }
            if(zoo[i].runDistance >= distance){
                System.out.println(zoo[i].name + " справился(ась) с забегом");
            }
            if(zoo[i].swimmingDistance < swimming){
                System.out.println(zoo[i].name + " не справился(ась) с заплывом");
            }
            if(zoo[i].swimmingDistance >= swimming){
                System.out.println(zoo[i].name + " справился(ась) с заплывом");
            }
            if(zoo[i].jumpHeight < jump){
                System.out.println(zoo[i].name + " не справился(ась) с прыжком");
            }
            if(zoo[i].jumpHeight >= jump){
                System.out.println(zoo[i].name + " справился(ась) с прыжком");
            }
        }
    }
}

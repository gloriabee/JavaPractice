package HierInheritance;

public class Vehicle {
    private int topSpeed;

    public void setTopspeed(int speed){
        topSpeed=speed;
        System.out.println("The top speed of "+getClass().getSimpleName()+" is set to "+speed);

    }
}

class Car extends Vehicle{

}

class Truck extends Vehicle{

}

class Main{
    public static void main(String[] args) {
        Car c1=new Car();
        c1.setTopspeed(100);

        Truck t1=new Truck();
        t1.setTopspeed(200);
        
    }
}
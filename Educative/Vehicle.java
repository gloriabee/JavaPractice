public class Vehicle {
    private int topSpeed;

    public void setTopspeed(int speed){
        topSpeed=speed;
        System.out.println("The top speed is set to: "+topSpeed);
    }


}


class Car extends Vehicle{
    public void openTruck(){
        System.out.println("The car trunk is open now!");
    }
}

class Pirus extends Car{
    public void turnOnHybrid(){
        System.out.println("The Hybrid mode is turned on!"); 
    }
}

class PMain{
    public static void main(String[] args) {
        Pirus p=new Pirus();
        p.setTopspeed(220);
        p.openTruck();
        p.turnOnHybrid();
    }
}
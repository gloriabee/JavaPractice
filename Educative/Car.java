public class Car {
    // private int topSpeed=100;
    // private int totalSeats;
    // private int fuelCapactiy;
    // private String manufacturer;

    private int topSpeed;
    static int maxCapacity=4;

    final int capacity=4;

    public void refuel(){

    }
    protected void park(){
        System.out.println("parked");
    }

    public void drive(){
        System.out.println("The car is driving with speed "+topSpeed);
    }

    public int printSpeed(int speed){
        return speed+5;
    }
    public int getTopSpeed() {
        return topSpeed;
    }
    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }



}

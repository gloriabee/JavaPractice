package DerivedClass;

public class Vehicle {
    private String speed;
    private String model;
    

    public Vehicle() {
        speed="100";
        model="Tesla";
    }

    public String getSpeed(){
        return speed;
    }

    public String getModel(){
        return model;
    }
    
}

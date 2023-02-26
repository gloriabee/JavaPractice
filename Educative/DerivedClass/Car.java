package DerivedClass;

public class Car extends Vehicle{
    public String name;

    Car(){name=" ";}

    public void setDetails(String carName){
        name=carName;
    }

    public String getDetails(String carName){
        String result= carName+" "+getSpeed() +" "+getModel();
        return result;
    }

    

}

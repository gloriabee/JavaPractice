public class Date {
    private int day;
    private int month;
    private int year;
    private String event;

    public Date(){
        //define the default values for day,month, and year
        day=0;
        month=0;
        year=0;
    }

    public Date(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    
    public Date(int day,int month,int year,String event){
        this(day, month, year);
        this.event=event;
    }
    public void printDate(){
        System.out.println("Date: "+ day+"/"+month+"/"+year+" ----> "+ event);
    }

    
}

class DateDemo{
    public static void main(String[] args) {
        Date date=new Date(1,1,2024,"New Year");
        date.printDate();
    }
}

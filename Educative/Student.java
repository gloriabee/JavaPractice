public class Student {
    private String name;
    private double mark1;
    private double mark2;

    public Student(String name, double mark1, double mark2) {
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    public Student(){
        name=null;
        mark1=0;
        mark2=0;
    }

    public double getMarks(int markNumber){
        if(markNumber==1){
            return mark1;
        }

        else{
            return mark2;
        }
    }

    public double calcTotal(){
        return mark1+mark2;
    }

}

class StudentDemo{
    public static void main(String[] args) {
       Student student=new Student("Jack",60,70);
       System.out.println(student.getMarks(1));
       System.out.println(student.getMarks(2));
       System.out.println(student.calcTotal());
       
    }
}



public class SquareSum {
   
    double squareSum(double num1,double num2,double num3){
        double sum=0;

        sum=(num1*num1)+(num2*num2)+(num3*num3);

        return sum;
    }

}

class SSDemo{
    public static void main(String[] args) {
        SquareSum ss=new SquareSum();
        System.out.println( ss.squareSum(2, 3, 4));
       
    }
}

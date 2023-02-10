import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String input=sc.next();
        System.out.print("The reversed string of "+input+" is ");
        for(int i=input.length()-1;i>=0;i--){
            System.out.print(input.charAt(i));
        }
       

    }
}

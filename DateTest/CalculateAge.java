
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculateAge {
    public static void main(String[] args) {
    
      LocalDate today=LocalDate.now();
      LocalDate birthdate=LocalDate.of(1999, 5, 1);

      System.out.println("You are "+Period.between(birthdate, today).getYears()+" years and "+ Period.between(birthdate, today).getMonths()+"months old ");
        
    }
}

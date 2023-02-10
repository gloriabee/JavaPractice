import java.util.Random;

public class RollingDice {
    public static void main(String[] args) {
        
        Random r=new Random();
        int rand=r.nextInt(6)+1;
        System.out.println("You rolled at "+rand);
    }
}

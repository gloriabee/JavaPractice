import java.util.ArrayList;


public class FindPrime {
    public static void main(String[] args) {
       System.out.println(findPrimes(1, 10));


    }

    public static ArrayList<Integer> findPrimes(int start,int end){
        ArrayList<Integer> primes=new ArrayList<>();

        

        for(int n=start;n<end;n++){
            int i=2;
        boolean prime=true;
            while(i<=n/2){
                if(n%i==0){
                    prime=false;
                    break;
                }
                i++;
            }

            if(prime){
                primes.add(n);
            }
           
        }

        return primes;
    }
}

public class FizzBuzz {

    //checks whether an int is prime or not.
    private boolean isPrime(int n) {
        //check if n is a multiple of 2
        if (n%2==0) return false;
        //if not, then just check the odds
        for(int i=3;i*i<=n;i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }


    public String answer (int number){
        if (isPrime(number)){
            return "whiz";
        }
        else if (number % 3 == 0){
            if (number % 5 == 0) {
                return "fizzbuzz";
            }else {
                return "fizz";
            }
        }else if (number % 5 == 0){
            return "buzz";
        }
        return String.valueOf(number);
    }
}

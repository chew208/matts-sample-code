import java.util.Scanner;

public class FizzBuzz {

    public void fizzBuzz(int num) {


        if (num % 3 == 0 && num % 5 == 0) {
            System.out.print("FizzBuzz");
        } else if (num % 3 == 0) {
            System.out.print("Fizz");
        } else if (num % 5 == 0) {
            System.out.print("Buzz");
        }
    }

    private void fizzBuzz() {
    }

}

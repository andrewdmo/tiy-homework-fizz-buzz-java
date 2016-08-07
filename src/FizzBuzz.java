/**
 * Created by andrewdmo on 8/5/16.
 */
public class FizzBuzz {

    private int start;
    private int end;


    //constructor:
    FizzBuzz(int start, int end) {
        this.start = start;
        this.end = end;
    }


    //method:
    public void doIt() {
        for  (int start = 0; (start <= end); start = start + 1)

        {
            if ((start % 3 == 0) && (start % 5 == 0)) {
                System.out.println("FizzBuzz"); }

            else if (start % 3 == 0) {
                System.out.println("Fizz");

            }
            else if (start % 5 == 0) {
                System.out.println("Buzz");
            }
            else {System.out.println(start) ;}

        }
    }
}


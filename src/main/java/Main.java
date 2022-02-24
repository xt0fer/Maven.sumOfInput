import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        Main main_object = new Main();

        int t = 5;
        int x = 0;

        x = main_object.sumOfNumbers(t);
        System.out.println(x);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int s = scanner.nextInt();
        x = main_object.sumOfNumbers(s);
        System.out.println(x);

        scanner.close();
    }
    
    int sumOfNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += n;
        }
        return sum;
    }
    
    // for Extra Credit
    int gaussianSumOfNumbers(int n) {
        return 0;
    }
   
    // for Extra extra credit - compare the methods and show which one is faster
    
}

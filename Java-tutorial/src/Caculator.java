import java.util.ArrayList;
import java.util.Scanner;

public class Caculator {
    public static int Sum(ArrayList<Integer> arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.print("Enter the number of inputs: ");
        int numOfInputs = sc.nextInt();

        for (int i = 0; i < numOfInputs; i++){
            System.out.print("Enter a number: ");
            int input = sc.nextInt();
            arr.add(input);
        }

        int result = Sum(arr);
        System.out.println("Sum of the elements: " + result);
    }
}

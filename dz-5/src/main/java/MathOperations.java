import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {

        Scanner numbersInput = new Scanner(System.in);
        System.out.println("Enter value A");
        int a = numbersInput.nextInt();
        System.out.println("Enter value B");
        int b = numbersInput.nextInt();
        System.out.println("Enter value C");
        int c = numbersInput.nextInt();
        System.out.println("Enter value D");
        int d = numbersInput.nextInt();

//        int a = 11;
//        int b = 15;
//        int c = 20;
//        int d = 5;

        int sumAB = a;
        sumAB += b;

        int sumCD = c + d;

        boolean firstComparingSum = sumAB < sumCD;

        System.out.println(firstComparingSum);

        int incrementSumAB = ++sumAB;
        System.out.println(sumAB);

        int minusSumCD = sumCD - 2;
        System.out.println(minusSumCD);

        boolean secondComparingSum = sumAB > sumCD;

        System.out.println(secondComparingSum);

        int modAB = incrementSumAB % 2;
        int modCD = minusSumCD % 2;

        boolean compareMods = (modAB != 1 || modCD != 1);
        System.out.println(compareMods);


    }
}

import java.util.Scanner;
// Made by Kassymova Sabina;
//BTW
//Talgar is the best town!
public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Hello, which task would you like to check?");
            System.out.println("1. Minimum\n2. Average\n3. Check prime\n4. Factorial\n5. Fibonacci\n6. Pow\n7. Permutations\n8. Check digit string\n9. Binomial coefficient\n10. GCD\n0. Exit");
            System.out.println("Please, enter the number of chosen task");
            int n = sc.nextInt();

            if (n == 1) {

                System.out.println("Enter number of elements");
                int l = sc.nextInt();
                int[] arr = new int[l];
                System.out.println("Enter your elements");
                for (int i = 0; i < l; i++) {
                    arr[i] = sc.nextInt();
                }
                System.out.println(Assignment.min(arr));
            }
            else if (n == 2) {
                System.out.println("Enter number of elements");
                int l = sc.nextInt();
                int[] arr = new int[l];
                System.out.println("Enter your elements");
                for (int i = 0; i < l; i++) {
                    arr[i] = sc.nextInt();
                }
                System.out.println(Assignment.mean(arr));
            } else if (n == 3) {
                System.out.println("Enter your number");
                int l = sc.nextInt();
                System.out.println(Assignment.isPrime(l));
            } else if (n == 4) {
                System.out.println("Enter your number");
                int l = sc.nextInt();
                System.out.println(Assignment.factorial(l));
            } else if (n == 5) {
                System.out.println("Enter your number");
                int l = sc.nextInt();
                System.out.println(Assignment.fibonacci(l));
            } else if (n == 6) {
                System.out.println("Enter two numbers");
                int l = sc.nextInt();
                int k = sc.nextInt();
                System.out.println(Assignment.pow(l, k));
            } else if (n == 7) {
                System.out.println("Enter your string");
                String str = sc.next();
                char[] charr = str.toCharArray();
                Assignment.permutationsRecursive(charr);
            } else if (n == 8) {
                System.out.println("Enter your string");
                String str = sc.next();
                char[] charr;
                charr = str.toCharArray();
                Assignment.isOnlyDigits(charr);
            } else if (n == 9) {
                System.out.println("Enter two numbers");
                int l = sc.nextInt();
                int k = sc.nextInt();
                System.out.println(Assignment.binomialCoeff(l, k));
            } else if (n == 10) {

                System.out.println("Enter two numbers");

                int l = sc.nextInt();
                int k = sc.nextInt();
                System.out.println(Assignment.GCD(l, k));
            } else {
                System.out.println("Thank you for attention\n10% for creativity?)");
                break;
            }
            System.out.println("---------------------");
        }
    }

    }

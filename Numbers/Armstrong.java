

import java.util.Scanner;

class Armstrong {
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        int numberOfDigits = String.valueOf(n).length(); // Calculate number of digits

        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, numberOfDigits);
            n /= 10;
        }

        return original == sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scanner.nextInt();
        boolean result = isArmstrong(n);
        System.out.println(result);
    }
}




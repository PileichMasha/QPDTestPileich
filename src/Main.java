import java.util.Scanner;

/*Вводить ЦЕЛЫЕ числа, пока не будет введен ноль.
Вывести число с максимальной суммой цифр в нем.*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxNumber = 0;
        int maxDigitsSum = 0;
        int number;
        int digitsSum;

        while (true) {
            System.out.println("Введите целое число или ноль для завершения программы:");
            number = sc.nextInt();

            if (number == 0) break;

            digitsSum = sumOfDigits(Math.abs(number));

            if (digitsSum > maxDigitsSum) {
                maxDigitsSum = digitsSum;
                maxNumber = number;
            }
        }

        if (maxDigitsSum == 0) {
            System.out.println("Не было введено число, больше нуля");
        } else {
            System.out.println("Число с максимальной суммой цифр в нем: " + maxNumber);
            System.out.println("Сумма цифр: " + maxDigitsSum);
        }
    }

    private static int sumOfDigits(int number) {
        int sum = 0;

        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }

        return sum;
    }
}
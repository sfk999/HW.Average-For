import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int sum = 0;
        int sumEvenNumbers = 0;
        int countEvenNumbers = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число диапазона: ");
        int i = scanner.nextInt();
        System.out.println("Введите второе число диапазона ");
        int k = scanner.nextInt();

        while (i <= k) {
            sum += i;
            ++i;
            ++count;
            if (i % 2 == 0) {
                sumEvenNumbers += i;
                ++countEvenNumbers;
            }
            }
        System.out.println("Среднее арифметическое чисел равно " + sum / count);
        System.out.println("Среднее арифметическое четных чисел равно " + sumEvenNumbers / countEvenNumbers);
        }
    }

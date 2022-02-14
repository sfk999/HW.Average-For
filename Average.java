import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int sum = 0;
        int sumChet = 0;
        double jChet = 0;
        double j = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число диапазона: ");
        int i = scanner.nextInt();
        System.out.println("Введите второе число диапазона ");
        int k = scanner.nextInt();
//     while (i<=k){
//         sum += i;
//         ++ i;
//         ++ j;
//     }

        while (i <= k) {
            if (i % 2 == 0) {
                sumChet += i;
                sum += i;
                ++i;
                ++jChet;
                ++j;
            } else {
                sum += i;
                ++i;
                ++j;
            }
        }
        System.out.println("Сумма чисел в диапазоне равна " + sum);
        System.out.println("Среднее арифметическое чисел равно " + sum / j);
        System.out.println("Среднее арифметическое четных чисел равно " + sumChet / jChet);
    }
}
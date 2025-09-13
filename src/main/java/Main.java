import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        int num_1 = new Scanner(System.in).nextInt();
        System.out.println("Введите число:");
        int num_2 = new Scanner(System.in).nextInt();
        int sum = num_1 + num_2;
        System.out.println("Сумма введенных чисел:" + sum);
        int diff = num_1 - num_2;
        System.out.println("Разность введенных чисел:" + diff);
        int product = num_1 * num_2;
        System.out.println("Произведение введенных чисел:" + product);
        double div = (double) num_1 / num_2;
        System.out.println("Частное введенных чисел:" + div);

    }
}

import java.util.Scanner;

/*
апишите программу, которая запрашивает у пользователя
три целых числа и выводит их среднее арифметическое
(складывает все числа и делит на их количество).
Примечение: обратите внимание, что результат может быть дробным числом
 */
public class Task5 {
    public static void main(String[] args) {
        System.out.println("Enter please three numbers:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double result = (a+b+c)/3.0;
        System.out.println(result);
    }
}

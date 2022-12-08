import java.util.Scanner;

/*
Написать консольную программу, которая запрашивает у пользователя два
вещественных числа
(числа с запятой) и выводит на консоль результаты: сложения, вычитания,
умножения и деления.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello! Enter please two double-format numbers:");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println("Now enter please the second number:");
        double b = sc.nextDouble();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    }
}
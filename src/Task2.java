import java.util.Scanner;

/*
Написать консольную программу, которая запрашивает
имя пользователя и выводит на консоль текст:
Hello имя пользователя!
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println("Hi. What`s your name?");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        System.out.println("Hello "+answer+" !");
    }
}

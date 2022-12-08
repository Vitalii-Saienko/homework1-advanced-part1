import java.util.Scanner;

import static java.lang.Math.pow;

/*
Напишите программу, которая запрашивает у пользователя
радиус круга (вещественное число) и печатает на консоль
периметр и площадь круга.
 */
public class Task4 {
    public static void main(String[] args) {
        System.out.println("Enter the radius:");
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();
        System.out.println("Perimeter is: "+Math.PI*2*number);//длина окружности = ПИ*Диаметр
        System.out.println("Area is: "+pow(number,2)*Math.PI);//площадь это ПИ * радиус в квадрате
    }
}

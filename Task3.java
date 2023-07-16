// Необходимо написать программу, где бы пользователю предлагалось ввести 3 числа. 
//Нужно: проверить какое число большее и какое меньшее из 3-ёх, а также посчитать среднее арифметическое (результат должен быть целым числом).

import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);

        System.out.println("Enter the first number");
        int a = scan1.nextInt();

        System.out.println("Enter the second number");
        int b = scan2.nextInt();

        System.out.println("Enter the third number");
        int c = scan3.nextInt();

        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int avg = (min + max)/2;

        System.out.println(min + "\n" + max + "\n" + avg);
        
        scan1.close();
        scan2.close();
        scan3.close();
  }   
}


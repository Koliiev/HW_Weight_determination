//public class Main {
//    public static void main(String[] args) {
    /*    //1. Сделать так, чтобы нижний sout выводил true. Для этого используйте
        // логические операторы вместо ...
        System.out.println(5 < 10);
        //2. Сделать так, чтобы нижний sout выводил false. Для этого используйте
        // логические операторы вместо ...
        System.out.println(5 > 10);
        //3. Сделать так, чтобы нижний sout выводил true. Для этого используйте
        // логические операторы вместо ...
        System.out.println(10 == 10);
        //4. Сделать так, чтобы нижний sout выводил false. Для этого используйте
        // логические операторы вместо ...
        System.out.println(5 > 5);
        //5. Сделать так, чтобы нижний sout выводил true. Для этого используйте
        // логические операторы вместо ...
        System.out.println(true != false);
        //6. Сделать так, чтобы нижний sout выводил false. Для этого используйте
        // логические операторы вместо ...
        System.out.println(true == false);

     */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\t***Программа определения весов товаров***\n\n\n");

        System.out.println("Введите первый вес: ");
        double first = new Scanner(System.in).nextDouble();

        System.out.println("Введите второй вес: ");
        double second = new Scanner(System.in).nextDouble();

        System.out.println("Введите третий вес: ");
        double third = new Scanner(System.in).nextDouble();

        double greatest = 0;
        if (first > second && first > third) {
            System.out.println(greatest = first);
        } else if (second > first && second > third) {
            System.out.println(greatest = second);
        } else {
            System.out.println(greatest = third);
        }


            double average = ((first + second + third) / 3);

        double smallest = 0;
        if (first < second && first < third) {
            System.out.println(smallest = first);
        } else if (second < first && second < third) {
            System.out.println(smallest = second);
        } else {
            System.out.println(smallest = third);
        }
            //todo дописать логику программы ниже.

        /* Если первое число больше второго числа, мы первое число сравниваем с третьим,
        если первое число больше третьего выводим первое число в greatest.
        Если первое число меньше второго, мы второе число с третьим, если второе число
        больше третьего мы выводим второе число в greatest.
        Если первое число меньше второго, мы второе число сравниваем с третьим, если второе
        число меньше третьего, мы третье число выводим в greatest.
         */


            //todo


            System.out.println("Наибольший вес: " + greatest);
            System.out.println("Средний вес: " + average);
            System.out.println("Наименьший вес: " + smallest);
        }
    }
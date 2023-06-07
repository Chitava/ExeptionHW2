/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное
значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно
запросить у пользователя ввод данных.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        float input = Input();
       while (input == 0)
           input = Input();
        System.out.println(input);
    }

    public static float Input () {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        try {
            float result = in.nextInt();
            return result;
        }catch (InputMismatchException e){
            System.out.println("Неверный формат данных");
            return 0;
        }


    }


}

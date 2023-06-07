//Если необходимо, исправьте данный код

public class Task2 {
    public static void main(String[] args) {
        CodeFix();
    }

    public static void CodeFix(){
        int[] intArray = {1, 5, 6, 8, 7, 9, 2, 1, 9}; //Нужно добавить инициализацию массива
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }




}

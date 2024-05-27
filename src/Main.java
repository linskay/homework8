import java.io.Console;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, наставник!:)");
        System.out.println("Task 1+2");
        int[] massiveNoName = new int[3];
        int[] arr = new int[3];
        massiveNoName[0] = 9;
        arr[0] = massiveNoName[0];
        massiveNoName[1] = 0;
        arr[1] = massiveNoName[1];
        massiveNoName[2] = 7;
        arr[2] = massiveNoName[2];
        {
            System.out.printf("%s, %s, %s \n", massiveNoName[0], massiveNoName[1], massiveNoName[2]);
            System.out.println(Arrays.toString(arr)); ///или так? не было условий, можно ли в "[]" выводить
        }
        double[] massiveDouble = {1.57, 7.654, 9.986};
        {
            System.out.println(massiveDouble[0] + ", " + massiveDouble[1] + ", " + massiveDouble[2]);
        }
        int[] massiveRandom = new int[4];
        massiveRandom[0] = 4;
        massiveRandom[1] = 44;
        massiveRandom[2] = 404;
        massiveRandom[3] = 4040;
        System.out.print(massiveRandom[0]);
        for (int i = 1; i < massiveRandom.length; i++) {
            System.out.print(", " + massiveRandom[i]);
        }
        System.out.println();

        System.out.println("Task 3");
        System.out.printf("Первый массив: %s, %s, %s \n", massiveNoName[2], massiveNoName[1], massiveNoName[0]);
        System.out.println("Второй массив: " + massiveDouble[2] + ", " + massiveDouble[1] + ", " + massiveDouble[0]);
        System.out.print("Третий массив: ");
        for (int i = massiveRandom.length - 1; i >= 0; i--) {
            System.out.print(massiveRandom[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Task 4");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i]++;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
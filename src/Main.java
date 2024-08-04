
public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1");

        int[] arr1 = {2000, 4000, 10000, 20000, 12500};

        int sum = 0;

        for (int element : arr1) {
            sum = sum + element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        //Task 2
        System.out.println("Task 2");

        int[] arr2 = {7000, 5000, 10000, 22200, 11500};

        int maxSpending = arr2[0];
        int minSpending = arr2[0];

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < minSpending) {

                minSpending = arr2[i];
            }
            if (arr2[i] > maxSpending) {

                maxSpending = arr2[i];
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + maxSpending + " рублей.");
        System.out.println("Минимальная сумма трат за неделю составила " + minSpending + " рублей.");

        //Task 3
        System.out.println("Task 3");

        int[] arr3 = {10000, 20000, 30000, 20000, 15000};
        int sum2 = 0;
        for (int element : arr3) {
            sum2 = sum2 + element;
        }
        int averageAmountSpent = sum2 / arr3.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageAmountSpent + " рублей.");

        //Task 4
        System.out.println("Task 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = 0; i < reverseFullName.length / 2; i++) {
            int leftIndex = i;
            int rightIndex = reverseFullName.length - i - 1;
            char temp = reverseFullName[leftIndex];
            reverseFullName[leftIndex] = reverseFullName[rightIndex];
            reverseFullName[rightIndex] = temp;

        }
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
        }

    }
}
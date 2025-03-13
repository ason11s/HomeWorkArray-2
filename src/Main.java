public class Main {
    public static void main(String[] args) {

        // Task1
        System.out.println(" Task1 ");

        int[] pay = {45_000, 24_000, 15_000, 21_000, 28_000};
        int total = 0;
        for (int i = 0; i < pay.length; i++) {
            total += pay[i];
        }
        System.out.println(" Сумма трат за месяц составила " + total + " рублей ");

        // Task2
        System.out.println(" Task2 ");

        int[] payments = {9_000, 16_000, 7_000, 27_000, 4_000};
        int maxPayment = 0;
        for (int i : payments) {
            if (i > maxPayment) {
                maxPayment = i;
            }
        }
        System.out.println(" Максимальная сумма трат за неделю составила " + maxPayment + " рублей ");

        int minPayment = 100_000;
        for(int i : payments){
            if(i<minPayment) {
                minPayment = i;
            }
        }
        System.out.println(" Минимальная сумма трат за неделю составила " + minPayment + " рублей ");

        // Task 3
        System.out.println("Task3");

        int [] payment = {5_000, 24_000, 11_000, 15_000, 19_000};
        int total1 = 0;
        double averageValue = 0;
        for(int i : payment){
            total1 = i + total1;
            averageValue = total1 / 5;
        }
        System.out.println("Средняя сумма трат за месяц составила " + averageValue + " рублей ");

        // Task 4
        System.out.println("Task4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);


        }

    }



    }

public class Main {
    public static void main(String[] args) {

        double[] fraction = {10.5, 25.3, -26.1, 15.3, -7.2, 1.2, 39, 4, -28.6, -9.3, 12.3, 7.9, -9.7, -10.6, -3.3, 11.1};
        boolean examination = false;
        int zeroInt = 0;
        double zeroDouble = 0;

        for (double numbers : fraction) {
            if (numbers < 0) {
                examination = true;
            } else if (numbers > 0 && examination) {
                zeroDouble = numbers;
                zeroInt++;
                System.out.println(numbers);
            }
        }
        System.out.println("Вывод среднего арифметческого числа :" + zeroDouble / zeroInt);
        sorting();
    }

    public static void sorting() {

        int[] num = {-3, 22, 18, -10, -17};
        int zero = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length ; j++) {
                if (num[i] >num[j]) {
                    zero = num [i];
                    num[i] = num[j];
                    num[j] = zero;
                }
            }
        }
            System.out.println("Сортировка: ");
            for (int i = 0; i < num.length; i++) {
                System.out.print(num[i] + " ");


        }
    }
}




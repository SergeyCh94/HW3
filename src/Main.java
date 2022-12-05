public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println("\n");
    }

    public static void task2 () {
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--){
            System.out.println(i);
        }
        System.out.println("\n");
    }

    public static void task3 () {
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
        System.out.println("\n");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--){
            System.out.println(i);
        }
        System.out.println("\n");
    }

    public static void task5 () {
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i++){
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0){
                System.out.println(i + " год является високосным");
            }
        }
        System.out.println("\n");
    }

    public static void task6 () {
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i += 7){
            System.out.println(i);
        }
        System.out.println("\n");
    }

    public static void task7 () {
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i *= 2){
            System.out.println(i);
        }
        System.out.println("\n");
    }

    public static void task8 () {
        System.out.println("Задача 8");
        int sum = 0;
        int deposit = 29000;
        for (int i = 1; i <= 12; i++){
            sum += deposit;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей");
        }
        System.out.println("\n");
    }

    public static void task9 () {
        System.out.println("Задача 9");
        int sum = 0;
        int deposit = 29000;
        for (int i = 1; i <= 12; i++){
            sum += sum / 100;
            sum += deposit;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей");
        }
        System.out.println("\n");
    }

    public static void task10 () {
        System.out.println("Задача 10");
        int n1 = 1;
        int n2 = 1;
        int n3;
        System.out.println(n1 + " ");
        System.out.println(n2 + " ");
        for (int i = 3; i <= 11; i++){
            n3 = n1 + n2;
            System.out.println(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
        System.out.println("\n");
    }

    public static void task11 () {
        System.out.println("Задача 11");
        int sum = 0;
        int deposit = 15000;
        int moun = 1;
        while (sum <= 2459000) {
            sum += sum / 100;
            sum += deposit;
            System.out.println("Месяц " + moun + ", сумма накоплений равна " + sum + " рублей");
            moun++;
        }
        System.out.println("\n");
    }

    public static void task12 () {
        System.out.println("Задача 12");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println("\n");
    }

    public static void task13 () {
        System.out.println("Задача 13");
        int populationCityY = 1200000;
        int birth = 17;
        int death = 8;
        int difference = birth - death;
        for (int i = 1; i <= 10; i++) {
            populationCityY += populationCityY * difference / 1000;
            System.out.println("Год " + i + ", численность населения составляет " + populationCityY);
        }
        System.out.println("\n");
    }

    public static void task14 () {
        System.out.println("Задача 14");
        int sum = 15000;
        int moun = 1;
        do {
            sum += (sum / 100) * 7;
            System.out.println("Месяц " + moun + ", сумма накоплений равна " + sum + " рублей");
            moun++;
        } while (sum <= 1200000);
        System.out.println("\n");
    }

    public static void task15 () {
        System.out.println("Задача 15");
        int sum = 15000;
        int moun = 1;
        while (sum <= 1200000) {
            sum += (sum / 100) * 7;
            if (moun % 6 == 0){
                System.out.println("Месяц " + moun + ", сумма накоплений равна " + sum + " рублей");
            }
            moun++;
        }
        System.out.println("\n");
    }

    public static void task16 () {
        System.out.println("Задача 16");
        int sum = 15000;
        int year = 9;
        int moun = 1;
        do {
            sum += (sum / 100) * 7;
            if (moun % 6 == 0){
                System.out.println("Месяц " + moun + ", сумма накоплений равна " + sum + " рублей");
            }
            moun++;
        } while (moun <= year * 12);

        System.out.println("\n");
    }

    public static void task17 () {
        System.out.println("Задача 17");
        int day = 5;
        for (int i = 1; i <= 31; i++) {
            if (i % day == 0) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
            }
        }
        System.out.println("\n");
    }

    public static void task18 () {
        System.out.println("Задача 18");
        int year = 2022;
        int before = year - 200;
        int after = year + 100;
        for (int i = before; i <= year ; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
        for (int i = year; i <= after; i++){
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("\n");
    }

}
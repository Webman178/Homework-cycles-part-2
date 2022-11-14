public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 2459000) {
           total = total + salary;
           i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }


        //Задание 2
        System.out.println("Задание 2");
        i = 10;
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("");
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println("");

        //Задание 3
        System.out.println("Задание 3");
        int allPopulation = 12_000_000;
        int fertilityFor1Year = 17;
        int mortalityFor1Year = 8;
        i = 1;
        int total1 = allPopulation;
        int populationDynamics = fertilityFor1Year - mortalityFor1Year;
        for (i = 1; i <= 10; i++) {
            total1 += populationDynamics * 12000;
            System.out.println("Год " + i + ", численность населения составляет " + total1);
        }

        //Задание 4
        System.out.println("Задание 4");
        double salary2 = 15000;
        int i2 = 0;
        while (salary2 < 12_000_000) {
            salary2 = salary2 * 1.07;
            i2++;
            System.out.println("Сумма накоплений " + (int)salary2 + " за " + i2 + " месяцев");
        }

        //Задание 5
        System.out.println("Задание 5");
        int i3 = 0;
        salary2 = 15000;
        while (salary2 < 12_000_000) {
            salary2 = salary2 * 1.07;
            i3++;
            if (i3 % 6 == 0) {
                System.out.println("Сумма накоплений " + (int) salary2 + " за " + i3 + " месяцев");
            }
        }

        //Задание 6
        System.out.println("Задание 6");
        double salary4 = 15000;
        double i4 = 0;
        for (i4 = 1; i4 <= 9*12; i4 ++) {
            salary4 = salary4 * 1.07;
            if (i4 % 6 ==0)
            System.out.println("Сумма накоплений " + (int)salary4 + " за " + i4 + " месяцев");
        }

        //Задание 7
        System.out.println("Задание 7");
        int friday = 3;
        int allDayInMonth = 31;
        for (i = friday; i <= 31; i++) {
            if (i % 7 == friday)
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
        }

        //Задание 8
        System.out.println("Задание 8");
        int fromAge = 1822;
        int afterAge = 2122;
        for (i = fromAge; i <= afterAge; i++) {
            if (i % 79 == 0)
                System.out.println(i);
        }

        //Задание 9
        System.out.println("Задание 9");
        int a = 2;
        for (i = 1; i <= 10; i++) {
            System.out.println(a + "*" + i + "=" + (a*i));
        }
    }
}
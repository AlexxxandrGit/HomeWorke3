public class Main {
    public static void main(String[] args) {

        //Задача 1.
        System.out.println("Задача 1.");
        int amountInt = 1000;
        System.out.println("Значение переменной amountInt с типом int равно " + amountInt);
        byte amountByte = 1;
        System.out.println("Значение переменной amountByte с типом byte равно " + amountByte);
        short amountShort = 500 ;
        System.out.println("Значение переменной amountShort с типом short равно " + amountShort);
        long amountLong = 10000L;
        System.out.println("Значение переменной amountLong с типом long равно " + amountLong);
        float amountFloat = 3.1234567F;
        System.out.println("Значение переменной amountFloat с типом float равно " + amountFloat);
        double amountDouble = 4.1234567891112;
        System.out.println("Значение переменной amountDouble с типом double равно " + amountDouble);
        System.out.println("");

        //Задача 2.
        System.out.println("Задача 2.");
        float meaningFloat = 27.12F;
        long meaningLong = 987_678_965_549L;
        double meaningDouble = 2.786;
        boolean meaningFalse = false;
        char meaningChar = 569;
        short meaningSort = -159;
        int meaningInt = 27897;
        byte meaningByte = 67;
        System.out.println("По условиям задачи, результат в консоль не выводится");
        System.out.println("");

        //Задача 3.
        System.out.println("Задача 3.");

        byte lyudmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short totalPaper = 480;
        int totalStudent = lyudmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        int paperForOneStudent = totalPaper / totalStudent;
        System.out.println("На каждого ученика рассчитона по " + paperForOneStudent+ "листов бумаги ");
        System.out.println("");

        //Задача 4.
        System.out.println("Задача 4.");

        byte machinePerformance2min = 16;
        byte machinePerformanceMin1 = 16 / 2;
        int minutesInDay = 60 * 24;
        int machinePerformanceMin20 = machinePerformanceMin1 * 20;
        System.out.println("За 20 минут работы, машина произвела " +machinePerformanceMin20+ " бутылок");
        int machinePerformanceDay = machinePerformanceMin1 * minutesInDay;
        System.out.println("За суки работы, машина произвела " +machinePerformanceDay+ " бутылок");
        int machinePerformanceDay3 = machinePerformanceMin1 * minutesInDay * 3;
        System.out.println("За 3 дней работы, машина произвела " +machinePerformanceDay3+ " бутылок");
        int machinePerformanceDay30 = machinePerformanceMin1 * minutesInDay * 30;
        System.out.println("За 30 дней работы, машина произвела " +machinePerformanceDay30+ " бутылок");
        System.out.println("");

        //Задача 5.
        System.out.println("Задача 5.");
        int totalPaint = 120;
        int oneClassWhitePaint = 2;
        int oneClassBrownPain = 4;
        int totalClass = 120 / 6;
        int totalWhitePaint = oneClassWhitePaint * totalClass;
        int totalBrownPain = oneClassBrownPain * totalClass;
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPain + " банок коричневой краски");
        System.out.println("");

        //Задача 6.
        System.out.println("Задача 6.");
        int bananas = 5 * 80;
        int milk = 2 * 105;
        int iceCreamSundae = 2 * 100;
        int rawEggs = 4 * 70;
        float sportsBreakfastWeightGram = bananas + milk + iceCreamSundae + rawEggs;
        int Kg = 1000;
        float sportsBreakfastWeightKg = sportsBreakfastWeightGram / Kg;
        System.out.println(sportsBreakfastWeightKg);
        System.out.println("");

        //Возник вопрос. Почему при делении int на doable Число без точки, а при делении doable на doable

        //Задача 7.
        System.out.println("Задача 7.");
        int justLoseWeight = 7000;
        int minGramsPerDay = 250;
        int maxGramsPerDay = 500;
        int amountOfDays250 = justLoseWeight / minGramsPerDay;
        System.out.println(+ amountOfDays250 + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 250гр. ");
        int amountOfDays500 = justLoseWeight / maxGramsPerDay;
        System.out.println(+ amountOfDays500 + " дней уйдёт на похудение, если спортсмен будет терять каждый день по 500гр. ");
        int averageGramsPerDay = justLoseWeight / (minGramsPerDay + maxGramsPerDay) ;
        System.out.println(+averageGramsPerDay+ " дней в среднем, чтобы добиться результата похудения");
        System.out.println("");

        //Задача 8.
        System.out.println("Задача 8");
        double ReceivedaMonthMasha = 67_760;
        double ReceivedaMonthDenis = 83_690;
        double ReceivedaMonthKristina = 76_230;
        double ReceivesPerMonthMash = (ReceivedaMonthMasha * 0.10 + ReceivedaMonthMasha);
        double ReceivesPerMonthDenis = ReceivedaMonthDenis * 0.10 + ReceivedaMonthDenis;
        double ReceivesPerMonthKristina = ReceivedaMonthKristina * 0.10 + ReceivedaMonthKristina;
        double ReceivesPerYearMasha = ReceivesPerMonthMash * 12;
        double ReceivesPerYearDenis = ReceivesPerMonthDenis * 12;
        double ReceivesPerYearKristina = ReceivesPerMonthKristina * 12;
        double ReceivedPerYearMasha = ReceivedaMonthMasha * 12;
        double ReceivedPerYearDenis = ReceivedaMonthDenis * 12;
        double ReceivedPerYearKristina = ReceivedaMonthKristina * 12;
        double annualDifferenceMasha = ReceivesPerYearMasha - ReceivedPerYearMasha;
        double annualDifferenceDenis = ReceivesPerYearDenis - ReceivedPerYearDenis;
        double annualDifferenceKristina = ReceivesPerYearKristina - ReceivedPerYearKristina;
        System.out.println("Маша теперь получает " + ReceivesPerMonthMash + " руб. в месяц. Годовой доход вырос на " + annualDifferenceMasha + " руб.");
        System.out.println("Денис теперь получает " + ReceivesPerMonthDenis + " руб. в месяц. Годовой доход вырос на " + annualDifferenceDenis + " руб.");
        System.out.println("Кристина теперь получает " + ReceivesPerMonthKristina + " руб. в месяц. Годовой доход вырос на " + annualDifferenceKristina + " руб.");


























































    }
}
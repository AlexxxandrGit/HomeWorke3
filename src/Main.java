public class Main {
    public static void main(String[] args) {

        //Задача 1.
        System.out.println("Задача 1.");
        System.out.println("");
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























    }
}
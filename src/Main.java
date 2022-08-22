public class Main {
    public static void main(String[] args) {
        byte b = -12;
        short s = 34;
        int i = 13467;
        long l = 348567349L;
        float f = 567.6f;
        double d = 8.44444444444;
        char c = 6543;

        System.out.println("Второе задание");
        float weightFirst = 78.2f;
        float weightSecond = 82.7f;
        System.out.println("Общий вес " + (weightFirst+ weightSecond) + " кг");
        System.out.println("Разница в весе " + (weightSecond - weightFirst) + " кг");

        System.out.println("Третье задание");
        float gramsBananas = 5f * 80;
        float gramsMilk = 200f * 105;
        float gramsIceCream = 2f * 100;
        float gramsEggs = 4f * 70;
        System.out.println("Общий вес завтрака "  + ((gramsEggs + gramsBananas + gramsMilk + gramsIceCream) / 1000) + " кг");

        System.out.println("Четвертое задание");
        int kgVgrams = 7;
        float gramsVkg250 = 250f / 1000;
        float gramsVkg500 = 500f / 1000;
        System.out.println("Если по 250 грамм, то в " + (kgVgrams / gramsVkg250) + " дней");
        System.out.println("Если по 500 грамм, то в " + (kgVgrams / gramsVkg500) + " дней");
        System.out.println("Среднее кол-во дней " + ((kgVgrams / gramsVkg500) +(kgVgrams / gramsVkg500) / 2));

        System.out.println("Пятое задание");
        float zpMasha = 67760f;
        float godzpMasha = zpMasha * 12;
        float zpDenis = 83690f;
        float godzpDenis = zpDenis * 12;
        float zpKristina = 76230f;
        float goszpKristina = zpKristina * 12;
        var procentMasha = (zpMasha * 10) / 100;
        zpMasha += procentMasha;
        var procentDenis = (zpDenis * 10) / 100;
        zpDenis += procentDenis;
        var procentKristina = (zpKristina * 10 ) / 100;
        zpKristina += procentKristina;
        System.out.println("Маша теперь получает " + zpMasha + " рублей. А годовой доход вырос на " + (godzpMasha % (zpMasha * 12) + " рублей"));
        System.out.println("Денис теперь получает " + zpDenis + " рублей. А годовой доход вырос на " + (godzpDenis % (zpDenis * 12) + " рублей"));
        System.out.println("Кристина теперь получает " + zpKristina + " рублей. А годовой доход вырос на " + (goszpKristina % (zpKristina * 12)) + " рублей");





    }
}
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

    }
}
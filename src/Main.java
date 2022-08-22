public class Main {
    public static void main(String[] args) {
            //Задание 1
        int apple = 7;
        byte cucumber = 1;
        short cat = 3;
        long orange = 23L;
        double sugar = 2.15;
        float salt = 2.5f;
        boolean catAdult = cat > 10;
        char bar = 33;
        System.out.println(catAdult);

        //Задание 2
        double firstBoxWeight = 78.2;
        double secondBoxWeight = 82.7;
        double allBoxWeight = firstBoxWeight + secondBoxWeight;
        System.out.println(firstBoxWeight + secondBoxWeight + "кг общий вес бойцов!");
        double weightDifference = firstBoxWeight - secondBoxWeight;
        System.out.println(firstBoxWeight - secondBoxWeight + "кг разница бойцов!");

        //Задание 3
        int banana = 5;
        int weightOneBanana = 80;
        int allWeightBanana = banana * weightOneBanana;
        int milk = 200;
        int weightOneMilk = 105;
        int allWeightMilk = milk + weightOneMilk;
        int iceCream = 2;
        int weightOneIceCream = 100;
        int allWeightIceCream = iceCream + weightOneIceCream;
        int eggs = 4;
        int weightOneEggs = 70;
        int allWeightEggs = eggs + weightOneEggs;
        int breakfastWeight = allWeightBanana + allWeightMilk + allWeightIceCream + allWeightEggs;
        System.out.println(breakfastWeight + " " + "кол-во грамм в этом спорт-завтраке!");
        int kg = 1000;
        float allWeightBreakfastKg = breakfastWeight / (float)kg;
        System.out.println(allWeightBreakfastKg + "кг в завтраке");

        //Задание 4
        int weightSportsman = 250;
        int weightSportsmanTwo = 500;
        int weightResult = 7;
        double weightFirstSportsmanDay = weightResult / weightSportsman  ;//Дней нужно первому спортсмену
        double weightSecondSportsmanDay = weightResult / weightSportsmanTwo;//Дней нужно второму спортсмену
        var weightPlusMinus = (weightSportsman + weightResult) % weightSportsmanTwo;
        System.out.println(weightPlusMinus + " " + "Потребуется дней в среднем");

        //Задание 5
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int percent = 10;
        double multi = percent / (100 * 1.0);

        int mashaNewZp = (int) (masha + (masha * multi));
        int denisNewZp = (int) (denis + (denis * multi));
        int kristinaNewZp = (int) (kristina + (kristina * multi));

        int mashaDifference = (mashaNewZp - masha) * 12;
        int denisDifference = (denisNewZp - denis) * 12;
        int kristinaDifference = (kristinaNewZp - kristina) *12;

        System.out.println("Кристина тепер получает" + " " + kristina + " " + "рублей." + " " + "Годовой доход вырос на" + " " +
                kristinaDifference + " " + "рублей.");
        System.out.println("Маша тепер получает" + " " + masha + " " + "рублей." + " " + "Годовой доход вырос на" + " " +
                mashaDifference + " " + "рублей.");
        System.out.println("Денис тепер получает" + " " + denis + " " + "рублей." + " " + "Годовой доход вырос на" + " " +
                denisDifference + " " + "рублей.");






    }
}
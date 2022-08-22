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
        int zpmasha = 67760 / 100 * 10;
        System.out.println(zpmasha + " " + "рублей нужно добавить к зп Маши");
        int zpdenis = 83690 / 100 * 10;
        System.out.println(zpdenis + " " + "рублей нужно добавить к зп Дениса");
        int zpkristina = 76230 / 100 * 10;
        System.out.println(zpkristina + " " + "рублей нужно добавить к зп Кристины");
        int dayYears = 365;
        int zpNewMasha = 67760 + 6770;
        System.out.println("Маша тепер получает" + " " + zpNewMasha + " " + "рублей." + " " + "Годовой доход вырос на" + " " +
                zpmasha + " " + "рублей.");
        int zpNewDenis = 83690 + 8360;
        System.out.println("Денис тепер получает" + " " + zpNewDenis + " " + "рублей." + " " + "Годовой доход вырос на" + " " +
                zpdenis + " " + "рублей.");
        int zpNewKristina = 76230 + 7620;
        System.out.println("Кристина тепер получает" + " " + zpNewKristina + " " + "рублей." + " " + "Годовой доход вырос на" + " " +
                zpkristina + " " + "рублей.");






    }
}
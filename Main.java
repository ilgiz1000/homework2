public class Main {
    public static void main(String[] args) {
        int applesWeight = 230;
        System.out.println("Значение переменной applesWeight с типом int равно " + applesWeight);
        byte numberOfComputers = 127;
        System.out.println("Значение переменной numberOfComputers с типом byte равно " + numberOfComputers);
        short numberOfApples = 1000;
        System.out.println("Значение переменной numberOfApples с типом short равно " + numberOfApples);
        long numberOfChocolate = 9000000;
        System.out.println("Значение переменной numberOfChocolate с типом long равно " + numberOfChocolate);
        float numberOfShop = 400000000;
        System.out.println("Значение переменной numberOfShop с типом float равно " + numberOfShop);
        double numberOfPears = 300000;
        System.out.println("Значение переменной numberOfPears с типом double равно " + numberOfPears);

        double numberOfTables = 27.12;
        System.out.println(numberOfTables);
        long numberOfSchools = 987_678_965_549L;
        System.out.println(numberOfSchools);
        double numberOfChair = 2.786;
        System.out.println(numberOfChair);
        short a = 567;
        System.out.println(a);
        short b = -159;
        System.out.println(b);
        long c = 27897;
        System.out.println(c);
        byte h = 67;
        System.out.println(h);

        short LyudmilaPavlovna = 23;
        System.out.println(LyudmilaPavlovna);
        short AnnaSergeyevna = 27;
        System.out.println(AnnaSergeyevna);
        short EkaterinaAndreevna = 30;
        System.out.println(EkaterinaAndreevna);
        short numberOfSheets = 480;
        System.out.println(numberOfSheets);
        int numberOfSheetsOneStudent = numberOfSheets / LyudmilaPavlovna + AnnaSergeyevna + EkaterinaAndreevna;
        System.out.println("На каждого ученика рассчитано " + numberOfSheetsOneStudent + " листов бумаги");

        byte machinePerformanceInTwoMinutes = 16;
        System.out.println("За 2 минуты машина произвела " + machinePerformanceInTwoMinutes + " штук бутылок");
        long machinePerformanceInTwentyMinutes =  machinePerformanceInTwoMinutes * 10;
        System.out.println("За 20 минут машина произвела " + machinePerformanceInTwentyMinutes + " штук бутылок");
        long machinePerformanceInOneDay = (24*60 / 2) * machinePerformanceInTwoMinutes;
        System.out.println("За 1 день машина произвела " + machinePerformanceInOneDay + " штук бутылок");
        long machinePerformanceInThreeDay = machinePerformanceInOneDay * 3;
        System.out.println("За 3 дня машина произвела " + machinePerformanceInThreeDay + " штук бутылок");
        long machinePerformanceInOneMonth = machinePerformanceInOneDay * 30;
        System.out.println("За 1 месяц машина произвела " + machinePerformanceInOneMonth + " штук бутылок");

        short NumberOfCans = 120;
        System.out.println(NumberOfCans);
        short numberOfCansOfWhitePaintOneClass = 2;
        System.out.println(numberOfCansOfWhitePaintOneClass);
        short numberOfCansOfBrownPaintOneClass = 4;
        System.out.println(numberOfCansOfBrownPaintOneClass);
        long numberOfClasses = numberOfCansOfWhitePaintOneClass + numberOfCansOfBrownPaintOneClass;
        System.out.println(numberOfClasses);
        long numberOfCansOfWhitePaint = (NumberOfCans / numberOfClasses)  * numberOfCansOfWhitePaintOneClass;
        System.out.println(numberOfCansOfWhitePaint);
        long numberOfCansOfBrownPaint = (NumberOfCans / numberOfClasses) * numberOfCansOfBrownPaintOneClass;
        System.out.println(numberOfCansOfBrownPaint);
        System.out.println("В школе, где " + numberOfClasses + " классов, " + " нужно " + numberOfCansOfWhitePaint + " банок белой краски и " + numberOfCansOfBrownPaint + " банок коричневой краски" );

        byte numberOfBananas = 5;
        System.out.println(numberOfBananas);
        byte weightOfOneBananaInGrams = 80;
        System.out.println(weightOfOneBananaInGrams);
        double weightOfMilkInMilliliters = 200;
        System.out.println(weightOfMilkInMilliliters);
        long oneHundredGrams = 100;
        System.out.println(oneHundredGrams);
        byte weightOfOneHundredMillilitersOfMilkInGrams = 105;
        System.out.println(weightOfOneHundredMillilitersOfMilkInGrams);
        byte numberOfIceCreamInBriquettes = 2;
        System.out.println(numberOfIceCreamInBriquettes);
        byte weightOfOneIceCreamInBriquettesInGrams = 100;
        System.out.println(weightOfOneIceCreamInBriquettesInGrams);
        long numberOfRawEggs = 4;
        System.out.println(numberOfRawEggs);
        byte weightOfOneRawEggInGrams = 70;
        System.out.println(weightOfOneRawEggInGrams);
        double totalWeightOfProducts = (numberOfBananas * weightOfOneBananaInGrams) + weightOfMilkInMilliliters / oneHundredGrams * weightOfOneHundredMillilitersOfMilkInGrams + numberOfIceCreamInBriquettes * weightOfOneIceCreamInBriquettesInGrams + numberOfRawEggs*weightOfOneRawEggInGrams;
        System.out.println(totalWeightOfProducts);
        double numberOfGramsInOneKilogram = 1000;
        System.out.println(numberOfGramsInOneKilogram);
        double totalWeightOfProductsInKilogram =  totalWeightOfProducts / numberOfGramsInOneKilogram;
        System.out.println(totalWeightOfProductsInKilogram);

        long numberOfKgToLoseWeight = 7;
        System.out.println(numberOfKgToLoseWeight);
        long numberOfGramsInAKilogram = 1000;
        System.out.println(numberOfGramsInAKilogram);
        long firstAmountOfGramsForWeightLossEveryDay = 250;
        System.out.println(firstAmountOfGramsForWeightLossEveryDay);
        long SecondAmountOfGramsForWeightLossEveryDay = 500;
        System.out.println(SecondAmountOfGramsForWeightLossEveryDay);
        long firstNumberOfDaysToAchieveResults = (numberOfKgToLoseWeight * numberOfGramsInAKilogram) / firstAmountOfGramsForWeightLossEveryDay;
        System.out.println(firstNumberOfDaysToAchieveResults);
        long secondNumberOfDaysToAchieveResults = (numberOfKgToLoseWeight * numberOfGramsInAKilogram) / SecondAmountOfGramsForWeightLossEveryDay;
        System.out.println(secondNumberOfDaysToAchieveResults);
        long averageNumberOfDaysToAchieveResults = (firstNumberOfDaysToAchieveResults + secondNumberOfDaysToAchieveResults) / 2;
        System.out.println(averageNumberOfDaysToAchieveResults);

        long MashaSSalary = 67760;
        System.out.println(MashaSSalary);
        long DenisSSalary = 83690;
        System.out.println(DenisSSalary);
        long ChristinaSSalary = 76230;
        System.out.println(ChristinaSSalary);
        long percentageForSalaryIncrease = 10;
        System.out.println(percentageForSalaryIncrease);
        long MashaSIncreasedSalary = MashaSSalary + (MashaSSalary*percentageForSalaryIncrease) / 100;
        System.out.println("Маша теперь получает " + MashaSIncreasedSalary + " рублей");
        long DenisSIncreasedSalary = DenisSSalary + (DenisSSalary*percentageForSalaryIncrease) / 100;
        System.out.println("Денис теперь получает " + DenisSIncreasedSalary + " рублей");
        long ChristinaSIncreasedSalary= ChristinaSSalary +(ChristinaSSalary*percentageForSalaryIncrease) / 100;
        System.out.println("Кристина теперь получает " + ChristinaSIncreasedSalary + " рублей");
        long differenceInMashaSIncome = MashaSIncreasedSalary-MashaSSalary;
        System.out.println("Годовой доход Маши вырос на " + differenceInMashaSIncome + " рублей");
        long differenceInDenisSIncome =  DenisSIncreasedSalary- DenisSSalary;
        System.out.println("Годовой доход Дениса вырос на " + differenceInDenisSIncome + " рублей");
        long differenceInChristinaSIncome = ChristinaSIncreasedSalary - ChristinaSSalary;
        System.out.println("Годовой доход Кристины вырос на " + differenceInChristinaSIncome + " рублей");























    }

}
package ru.skypro.homework2;

public class Homework2 {
    public static void main(String[] args) {

        var task1 = 1;
        System.out.println("Задача " + task1 + ".");
        byte mango = 17;
        System.out.println("There are " + mango + " mangos.");
        short note = 256;
        System.out.println("There are " + note + " notes in a box.");
        int book = 1;
        System.out.println("There is " + book + " book on a desk only.");
        long bottles = 2L;
        System.out.println(bottles + " bottles of water");
        float box = 25.7f;
        System.out.println("Box weight is " + box + " kg.");
        double cookie = 1.5;
        System.out.println("A cookie weight is " + cookie + " gram.");


        var task2 = 2;
        System.out.println("Задача " + task2 + ".");
        float boxer1 = 78.2f;
        float boxer2 = 82.7f;
        var totalWeight = boxer1 + boxer2;
        System.out.println("The total weight of 2 boxers is " + totalWeight + " kg.");
        var weightDifference = boxer2 - boxer1;
        System.out.println("Weight difference of 2 boxers is " + weightDifference + ".");


        var task3 = 3;
        System.out.println("Задача " + task3 + ".");
        short banana = 5;
        short bananaWeight = 80;
        int totalBananaWeight = banana * bananaWeight;
        System.out.println("Weight of 5 bananas is " + totalBananaWeight + " gram.");
        short milk = 200;
        short standartMilkAmount = 100;
        short milkAmountOf100Ml = 105;
        int totalMilkWeight = milk / standartMilkAmount * milkAmountOf100Ml;
        System.out.println("200ml milk weight is " + totalMilkWeight + " gram.");
        short iceCream = 2;
        short onePieceOfIceCream = 100;
        int totalIceCreamWeight = iceCream * onePieceOfIceCream;
        System.out.println("Weight of 2 ice cream pieces is " + totalIceCreamWeight + " gram.");
        short eggs = 4;
        short oneEggWeight = 70;
        int totalEggWeight = eggs * oneEggWeight;
        System.out.println("Weight of 4 eggs is " + totalEggWeight + " gram.");
        int totalBrekfastWeight = totalBananaWeight + totalMilkWeight + totalIceCreamWeight + totalEggWeight;
        System.out.println("Breakfast weight is " + totalBrekfastWeight + " gram.");
        int oneKg = 1_000;
        float breakfastWeightInKg = totalBrekfastWeight / oneKg;
        System.out.println("Breakfast weight is " + breakfastWeightInKg + " kg.");


        var task4 = 4;
        System.out.println("Задача " + task4 + ".");
        short loseWeight = 7;
        int gramPerOneKg = 1_000;
        int loseWeightGram = loseWeight * gramPerOneKg;
        int loseWeihgtPerDay1 = 250;
        int loseWeihgtPerDay2 = 500;
        int days1 = loseWeightGram / loseWeihgtPerDay1;
        int days2 = loseWeightGram / loseWeihgtPerDay2;
        System.out.println("It will take " + days1 + " days to lose 7 kg.");
        System.out.println("It will take " + days2 + " days to lose 7 kg.");
        float averageValue = days1 + days2 / 2;
        System.out.println("Aproximatly, it should take " + averageValue + " days to lose 7 kg.");


        var task5 = 5;
        System.out.println("Задача " + task5 + ".");
        long masha = 67_760L;
        long denis = 83_690L;
        long kristina = 76_230L;
        long masha10percent = masha * 10 / 100;
        long mashaNewSalary = masha + masha10percent;
        long mashaOldAnnualSalary = masha * 12;
        long mashaNewAnnualSalary = mashaNewSalary * 12;
        long mashaAnnualSalaryDifference = mashaNewAnnualSalary - mashaOldAnnualSalary;
        System.out.println("Masha' salary is going to be " + mashaNewSalary + " Rubles a month.");
        System.out.println("The annual salary difference is  " + mashaAnnualSalaryDifference + " Rubles.");
        long denis10percent = denis * 10 / 100;
        long denisNewSalary = denis + denis10percent;
        long denisOldAnnualSalary = denis * 12;
        long denisNewAnnualSalary = denisNewSalary * 12;
        long denisAnnualSalaryDifference = denisNewAnnualSalary - denisOldAnnualSalary;
        System.out.println("Denis' salary is going to be " + denisNewSalary + " Rubels a month.");
        System.out.println("The annual salary difference is  " + denisAnnualSalaryDifference + " Rubles.");
        long kristina10percent = kristina * 10 / 100;
        long kristinaNewSalary = kristina + kristina10percent;
        long kristinaOldAnnualSalary = kristina * 12;
        long kristinaNewAnnualSalary = kristinaNewSalary * 12;
        long kristinaAnnualSalaryDifference = kristinaNewAnnualSalary - kristinaOldAnnualSalary;
        System.out.println("Kristina' salary is going to be " + kristinaNewSalary + " Rubels a month.");
        System.out.println("The annual salary difference is  " + kristinaAnnualSalaryDifference + " Rubles.");

        var task6 = 6;
        System.out.println("Задача " + task6 + ".");
        var a = 12;
        var b = 27;
        var c = 44;
        var d = 15;
        var e = 9;
        long result = a * (b + (c - d * e));
        long oppositeResult = result * -1;
        System.out.println("Result is " + result + ".");
        System.out.println("The opposite result is " + oppositeResult + ".");

        var task7 = 7;
        System.out.println("Задача " + task7 + ".");
        short task7A = 5;
        short task7B = 7;
        int newA = task7A * task7B / task7A;
        int newB = task7B * task7A / task7B;
        System.out.println("a = " + newA);
        System.out.println("b = " + newB);

    }
}



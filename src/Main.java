public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalBoxersWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общая масса обоих бойцов " + totalBoxersWeight + " кг.");
        var weightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница масс боксеров состовляет " + weightDifference + " кг.");

        var differenceSubtraction = secondBoxerWeight - firstBoxerWeight;
        var differenceRemainder = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница масс боксеров, посчитанная с помощью вычитания: " + differenceSubtraction + " кг.");
        System.out.println("Разница масс боксеров, посчитанная с помощью остатка от деления: " + differenceRemainder + " кг.");

        var totalTime = 680;
        var hoursWork = 8;
        var worker = totalTime / hoursWork;
        System.out.println("Всего в компании - " + worker + " человек.");
        worker = worker + 94;
        totalTime = worker * hoursWork;
        System.out.println("Если в компании работает " + worker + " человек, то всего " + totalTime + " часов работы может быть поделено между сотрудниками");

    }

}
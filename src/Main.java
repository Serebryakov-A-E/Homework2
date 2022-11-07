public class Main {
    public static void main(String[] args) {
        //exercise 1
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //exercise 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //exercise 3
        dog = (int) (dog - 3.5);
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //exercise 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //exercise 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //exercise 6
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var weightAddition = firstBoxerWeight + secondBoxerWeight;
        System.out.println(weightAddition);
        var weightSubtraction = firstBoxerWeight - secondBoxerWeight;
        System.out.println(weightSubtraction);

        //exercise 7
        weightSubtraction = secondBoxerWeight - firstBoxerWeight;
        System.out.println(weightSubtraction);
        weightSubtraction = secondBoxerWeight % firstBoxerWeight;
        System.out.println(weightSubtraction);

        //exercise 8
        var hoursTotal = 640;
        var hoursPerEmployee = 8;
        var amountOfEmployees = hoursTotal / hoursPerEmployee;
        System.out.println("Всего работников в компании - " + amountOfEmployees + " человек");

        //exercise 9
        amountOfEmployees = amountOfEmployees + 94;
        hoursTotal = amountOfEmployees * hoursPerEmployee;
        System.out.println("Если в компании работает " + amountOfEmployees + " человека, то всего " + hoursTotal
                + " часов работы может быть поделено между сотрудниками");
    }
}
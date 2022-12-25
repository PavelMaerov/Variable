public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        var dog=8.0;
        var cat=3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        System.out.println("Задача 2");
        dog=dog+4;
        cat=cat+4;
        paper = paper+4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        System.out.println("Задача 3");
        dog=dog-3.5;
        cat=cat-1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        //Инициализируйте (присвойте значение) переменную friend значением 19.
        //Увеличьте значение переменной на 2, после чего поделите значение на 7.
        //После каждой операции выводите значение переменной в консоль. В итоге у вас должно быть выведено 3 значения одной переменной.
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println();

        //Инициализируйте переменную frog значением 3.5.
        //Увеличьте переменную в 10 раз и поделите на 3.5. Добавьте к последнему значению переменной 4.
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println();

        System.out.println("Задача 6");
        //Вес одного боксера — 78.2 кг.
        //Вес второго боксера — 82.7 кг.
        var weight1 = 78.2;
        var weight2 = 82.7;
        System.out.println("Общий вес 2х бойцов - " + (weight1 + weight2));
        System.out.println("Разница между весами бойцов - " + (weight2 - weight1));
        System.out.println();

        System.out.println("Задача 7");
        System.out.println("Разница между весами бойцов (2й способ) - " + (weight2 % weight1));
        System.out.println("Способ применим, только если больший вес - не более чем вдвое больше меньшего");
        System.out.println();

        //640 часов работы поделено между сотрудниками.
        //Если каждый сотрудник посвящает работе 8 часов, то сколько всего работников в компании?
        //Выведите результат задачи в консоль в формате: «Всего работников в компании — … человек».
        //Посчитайте, сколько часов работы должно быть поделено между сотрудниками,
        //если в компании работает на 94 человека больше.
        //Выведите результат задачи в консоль в формате: «Если в компании работает … человек, то всего … часов работы может быть поделено между сотрудниками»
        System.out.println("Задача 8");
        var totalHours = 640;
        var employeeHours = 8;
        var employeeQuantity = totalHours / employeeHours;
        System.out.println("Всего работников в компании — " + employeeQuantity + " человек");
        employeeQuantity = employeeQuantity + 94;
        totalHours = employeeQuantity * employeeHours;
        System.out.println("Если в компании работает " + employeeQuantity + " человек," +
            " то всего " + totalHours + " часов работы может быть поделено между сотрудниками");

    }
}
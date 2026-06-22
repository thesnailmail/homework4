//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача 1
        byte age = 5;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
        age = 26;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
        //Задача 2
        byte temp = -3;
        if (temp <= 5) {
            System.out.println("На улице " + temp + " градусов, холодно, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temp + " градусов, cегодня тепло, можно идти без шапки.");
        }
        temp = 18;
        if (temp <= 5) {
            System.out.println("На улице " + temp + " градусов, холодно, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temp + " градусов, cегодня тепло, можно идти без шапки.");
        }
        //Задача 3
        byte speed = 112;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, можно ездить спокойно.");
        }
        speed = 39;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, можно ездить спокойно.");
        }
        //Задача 4
        age = 4;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        }
        if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет.");
        }
        if (age >= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу.");
        }
        age = 12;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        }
        if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет.");
        }
        if (age >= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу.");
        }
        age = 20;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        }
        if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет.");
        }
        if (age >= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу.");
        }
        age = 29;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        }
        if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет.");
        }
        if (age >= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу.");
        }
        //Задача 5
        age = 3;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");
        }
        if (age >= 5 && age <= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении.");
        }
        if (age > 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }
        age = 11;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");
        }
        if (age >= 5 && age <= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении.");
        }
        if (age > 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }
        age = 16;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");
        }
        if (age >= 5 && age <= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении.");
        }
        if (age > 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }
        //Задача 6
        byte place = 103;
        if (place > 102) {
            System.out.println("Мест нет - вагон заполнен.");
        } else {
            if (place <= 60) {
                System.out.println("Место в вагоне есть - сидячее.");
            }
            if (place > 60 && place <= 102) {
                System.out.println("Место в вагоне есть - стоячее.");
            }
        }
        place = 48;
        if (place > 102) {
            System.out.println("Мест нет - вагон заполнен.");
        } else {
            if (place <= 60) {
                System.out.println("Место в вагоне есть - сидячее.");
            }
            if (place > 60 && place <= 102) {
                System.out.println("Место в вагоне есть - стоячее.");
            }
        }
        place = 99;
        if (place > 102) {
            System.out.println("Мест нет - вагон заполнен.");
        } else {
            if (place <= 60) {
                System.out.println("Место в вагоне есть - сидячее.");
            }
            if (place > 60 && place <= 102) {
                System.out.println("Место в вагоне есть - стоячее.");
            }
        }
        //Задача 7
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Максимальное число: " + one);
        } else {
            if (two > three) {
                System.out.println("Максимальное число: " + two);
            } else {
                System.out.println("Максимальное число: " + three);
            }
        }
        one = 1;
        two = 3;
        three = 2;
        if (one > two && one > three) {
            System.out.println("Максимальное число: " + one);
        } else {
            if (two > three) {
                System.out.println("Максимальное число: " + two);
            } else {
                System.out.println("Максимальное число: " + three);
            }
        }
        one = 3;
        two = 2;
        three = 1;
        if (one > two && one > three) {
            System.out.println("Максимальное число: " + one);
        } else {
            if (two > three) {
                System.out.println("Максимальное число: " + two);
            } else {
                System.out.println("Максимальное число: " + three);
            }
        }
    }
}
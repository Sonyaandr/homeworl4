public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int age = 20;
        if (age >=18){
            System.out.println("Если возраст человека равен " + age +", то он совершеннолетний");
        }else {
            System.out.println("Если возраст человека равен " + age +", то он не достиг совершеннолетия, нужно немного подождать ");
        }
        System.out.println("Задание 2");
        int temperatura = 5;
        if (temperatura >=5){
            System.out.println("На улице " + temperatura + " градусов, можно идти без шапки");
        }else{
            System.out.println("На улице " + temperatura + " градусов, нужно надеть шапку");
        }
        System.out.println("Задание 3");
        int speed = 40;
        if (speed >=60){
            System.out.println("Если скорость " + speed + " то, придется заплатить штраф");
        } else{
            System.out.println("Если скорость " + speed + ", можно ездить спокойно");
        }
        System.out.println("Задание 4");
        int humanAge = 76;
        if (humanAge>=2 && humanAge<=6){
            System.out.println("Eсли возраст человека равен "+ humanAge +" то ему нужно ходить в садик");
        }else if (humanAge>=7 && humanAge<=17){
            System.out.println("Eсли возраст человека равен "+ humanAge +" то ему нужно ходить в школу");
        }else if (humanAge>=18 && humanAge<=24) {
            System.out.println("Eсли возраст человека равен " + humanAge + " то его место в университете");
        } else if (humanAge>24){
            System.out.println("Eсли возраст человека равен " + humanAge + " то ему пора ходить на работу");
        }
        System.out.println("Задание 5");
        int childAge = 8;
        if (childAge<=5){
            System.out.println("Eсли возраст равен " + childAge + " то ему нельзя кататься на аттракционе");
        }else if (childAge>5 && childAge<=14){
            System.out.println("Eсли возраст равен " + childAge + " то ему можно кататься на аттракционе в сопровождении взрослого");
        }else if ( childAge>14){
            System.out.println("Eсли возраст равен " + childAge + " то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println("Задание 6");
        int people = 70;
        if (people <=60){
            System.out.println("В вагоне есть сидячие и стоячие места ");
        }else if (people>60 && people<=102){
            System.out.println("В вагоне есть только стоячие места");
        }else if (people>102){
            System.out.println("Вагон полностью забит");
        }
        System.out.println("Задание 7");
        int one = 6;
        int two = 4;
        int three = 5;
        if ((one<two && two<three) || (two<one && one<three)){
            System.out.println("Самое большое число " + three);
        }else if ((one>two && two>three) || (two<three && one>three)){
            System.out.println("Самое большое число " + one);
        }else if ((one<two && one>three) || (two>three && one<three)){
            System.out.println("Самое большое число " + two);
        }
    }
}

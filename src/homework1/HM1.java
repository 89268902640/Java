package homework1;

public class HM1 {

    public static void main(String[] args) {

        System.out.println("a * (b + (c / d)) = " + one(1,2,3,4));
        System.out.println(two(8, 9));
        Three(-5);
        Four("Александр - Java Гуру");


    }
    

    //1. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат с плавающей точкой, где a, b, c, d – целочисленные входные параметры этого метода;
    static double one(int a, int b, int c, float d) {
        System.out.println("Задание №1");
        return a * (b + (c / d));
    }
    //2. Написать метод, принимающий на вход два целых числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    static boolean two(int x, int y) {
        System.out.println("Задание №2");
        int sum = x + y;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }
//3. Написать метод, которому в качестве параметра передается целое число, метод должен проверить положительное ли число передали, или отрицательное. Замечание: ноль считаем положительным числом. Результат работы метода вывести в консоль
    static void Three (int i) {
        System.out.println("Задание №3");
        if (i >= 0) System.out.println("Число " + i + "положительное");
        else System.out.println("Число " + i + " отрицательное");
    }
//4. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вернуть приветственное сообщение «Привет, переданное_имя!»; Вывести приветствие в консоль.
    static void Four(String name){
        System.out.println("Задание №4");
        System.out.println("Привет, " + name + "!");
    }



    }






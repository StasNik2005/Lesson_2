package itschool;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//func1();
//func2();
//func3();
//func5();
//func4();
//        func6();

//        func7();
//        func8();
//        func9();
//        func10();
        func11();
    }

    private static void func11() {
        Scanner str = new Scanner(System.in);
        char c = str.next().charAt(0);
        if (c >= '0' && c <= '9') {
            System.out.println("Digit: " + c);
        } else if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
            System.out.println(" Letter: " + c);
        } else
            System.out.println();


    }

    private static void func10() {
        double res, sinx, cosx, tgx, ctgx, x = Math.PI / 2, y = -0.5;
        if (Math.sin(x) != 0 && Math.cos(x) != 0 && Math.abs(Math.cos(x) - 0) > 0.0000000001) {
            System.out.println(Math.sin(x));
            System.out.println(Math.cos(x));
            tgx = Math.tan(x);
            ctgx = 1 / tgx;
            res = Math.pow((1 - tgx), ctgx) + Math.cos(x - y);
            System.out.println(res);
        } else {
            System.out.println("Решений нет");
        }
    }

    private static void func9() {
        double a = 2, b = -5, c = 4.5 / 4, d = 0, x1 = 0, x2 = 0;
        System.out.println(a + "*X^2 + " + b + "*X + " + c);
        d = Math.pow(b, 2) - 4 * a * c;
        if (d > 0) {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        } else if (d < 0) {
            System.out.println("Некомплексных решений не существует");
        } else {
            x1 = -b / (2 * a);
            System.out.println("x = " + x1);
        }
    }

    private static void func8() {
        boolean b = true;
        int a = 5;
        a = a << 2;
        System.out.println(a);

        System.out.println(Integer.toBinaryString(-1));
        System.out.println(Integer.toBinaryString(-1 >> 16));
        System.out.println(Integer.toBinaryString(-1 >>> 16));

    }

    private static void func7() {
        String number = "3";
        switch (number) // (number)—выражение-селектор.
        {
            case "1": // "1"—постоянное выражение.
            {
                System.out.println("Один"); // Ветвь1
                break;
            }
            case "2":
            case "3":
            case "4": // “2"—постоянное выражение.
            {
                System.out.println("Два"); // Ветвь2
                break;
            }
            default:
                System.out.println("Smth else");
        }
    }

    private static void func6() {
        int n = 0, password = 12345, k = 0;

        Scanner str = new Scanner(System.in);

        do {
            System.out.println("Input password: ");
            n = str.nextInt();
            k++;

            if (n == password) {
                System.out.println("правильно!!!");
                break;
            }
        } while (k < 3);

        if (k <= 3)
            System.out.println("OK. You entered after " + k + " times");
        else
            System.out.println("Return in 15 minutes");
    }

    private static void func5() {
        int dano = 256, kvdano, kvcufr, third, second, first;
        kvdano = dano * dano;
        first = dano / 100 % 10;
        second = dano / 10 % 10;
        third = dano / 1 % 10;
        kvcufr = (first * first * first) + (second * second * second) + (third * third * third);
        if (kvdano == kvcufr) {
            System.out.println("Они равны");
        } else {
            System.out.println("Они не равны");
        }
    }

    private static void func4() {
        int n = 0;
        /*
        for (int i = 100; n < 15; i++)
        {
            if (i % 19 == 0) {
                System.out.println((n+1)+") "+i);
                n++;
            }
        }
        */
        int i = 100;
        while (n < 15) {
            if (i % 19 == 0) {
                System.out.println((n + 1) + ") " + i);
                n++;
            }
            i++;
        }

        i = 100;
        n = 20;
        do {
            if (i % 19 == 0) {
                System.out.println((n + 1) + ") " + i);
                n++;
            }
            i++;
        } while (n < 15);

    }

    private static void func3() {
        int number = 12345;
        int tensOfThousands = 0, thousands = 0, hundreds = 0, decimals = 0, ones = 0;
        ones = number / 1 % 10;//5
        decimals = number / 10 % 10;//4
        hundreds = number / 100 % 10;//3
        thousands = number / 1000 % 10;//2
        tensOfThousands = number / 10000 % 10;//1
        if (tensOfThousands > ones) {
            System.out.println("Первая больше");
        } else {
            System.out.println("Последняя больше");
        }

        if (tensOfThousands > thousands) {
            System.out.println("Первая больше");
        } else {
            System.out.println("Вторая больше");
        }

        if (thousands > ones) {
            System.out.println("Вторая больше");
        } else {
            System.out.println("Последняя больше");
        }
    }

    private static void func2() {
        Scanner natri = new Scanner(System.in);
        if (natri.nextInt() / 3 == 0) {
            System.out.println("Число" + natri + "нацело на три делится.");
        } else {
            System.out.println("Число" + natri + "нацело на три не делится.");
        }
    }

    private static void func1() {
        int n = 0, da = 1794;

        Scanner str = new Scanner(System.in);
/*
        do {
            System.out.println("В каком году была основана Одесса?");
            n = str.nextInt();

            if (n != da)
                System.out.println("Вы ответили неправильно!!!");
        } while (n != da);
*/
        while (n != da) {
            System.out.println("В каком году была основана Одесса?");
            n = str.nextInt();

            if (n != da)
                System.out.println("Вы ответили неправильно!!!");
        }

        System.out.println("Вы ответили правильно, Одесса была основана в 1794 году!");
    }
}

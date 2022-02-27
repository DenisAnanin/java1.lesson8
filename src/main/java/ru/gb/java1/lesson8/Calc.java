package ru.gb.java1.lesson8;

public class Calc {

    public String calc(String n1, String n2, String o) {
        int num1 = Integer.parseInt(n1);
        int num2 = Integer.parseInt(n2);
//      При возврате из case значения ненужен break
        switch (o) {
            case "+":
                return Integer.toString( num1 + num2);

            case "-":
                return Integer.toString(num1 - num2);

            case "*":
                return Integer.toString(num1 * num2);

            case "/":
                return Integer.toString(num1 / num2);

            default:
                return "Все пошло не так!";
        }
    }
}

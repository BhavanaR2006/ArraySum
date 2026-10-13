package com.example;

public class App {

public int sumArray(int[] numbers) {
    int sum = 0;

    for (int number : numbers) {
        sum += number;
    }

    return sum;
}

public static void main(String[] args) {
    App obj = new App();

    int[] numbers = {10, 20, 30, 40, 50};

    System.out.println("Sum of Array Elements: "
            + obj.sumArray(numbers));
}

}
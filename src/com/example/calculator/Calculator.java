package com.example.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner calculator = new Scanner(System.in);
        double first = 0;
        double second = 0;
        double result = 0;
        int operation = 0;

        System.out.println("Please enter the first number");
        first=calculator.nextDouble();
        System.out.println("Please enter the second number ");
        second=calculator.nextDouble();
        System.out.println("Calculator Menu \n---------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Which operation do you want to perform?");
        operation = calculator.nextInt();

        switch (operation){ // No esta especificado en la orden creo, pero que caso pudiera romper este codigo?
            case 1:
             result = first + second;
             System.out.println("The result of the operation is " + result + ". Goodbye!"); //<- Mira a ver si se te ocurre alguna forma de eliminar/reusar la
                                                                                            // repeticion de esta linea en cada case
             break;
            case 2:
            result = first - second;
            System.out.println("The result of the operation is " + result + ". Goodbye!");
            break;
            case 3:
                result = first * second;
                System.out.println("The result of the operation is " + result + ". Goodbye!");
                break;
            case 4:
                result = first / second;
                System.out.println("The result of the operation is " + result + ". Goodbye!");
                break;
            default:
                System.out.println("Error: Invalid Selection! Terminating program.");
        }
    } //La indentacion de las } es importante sino te vas a perder cuando se complique
    }


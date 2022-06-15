/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author EXT02D47194
 */
public class Base {
    double number1;
    double number2;
    double resultAvarage;
    double resultSumming;
    double resultExtraction;
    double resultMultiplication;
    double resultDivision;

    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    public double getResultAvarage() {
        return (number1 + number2) / 2;
    }

    public double getResultSumming() {
        return number1 + number2;
    }

    public double getResultExtraction() {
        return number1 - number2;
    }

    public double getResultMultiplication() {
        return number1 * number2;
    }

    public double getResultDivision() {
        return number1 / number2;
    }
    
}

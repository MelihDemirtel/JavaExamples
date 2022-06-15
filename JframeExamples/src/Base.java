/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author EXT02D47194
 */
public class Base {
    private double number1;
    private double number2;
    private double resultAvarage;
    private double resultSumming;
    private double resultExtraction;
    private double resultMultiplication;
    private double resultDivision;

    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
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

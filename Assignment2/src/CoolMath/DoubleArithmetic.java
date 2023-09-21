package CoolMath;

public class DoubleArithmetic {
    private double num1; //this line contains an error
    private double num2; //this line contains an error

    public DoubleArithmetic(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return this.num1 + this.num2;
    }

    public double subtraction() {
        return this.num1 - this.num2 ; //this line contains an error
    }

    public double multiplication() {
        return this.num1 * this.num2;
    }

    public double division() {
        return this.num1 / this.num2;
    }

    public void increaseValues(double increaseNum1, double increaseNum2) {
        this.num1 = sumTwoValues(this.num1, increaseNum1);
        this.num2 = sumTwoValues(this.num2, increaseNum2);
    }
    private static double sumTwoValues(double num1, double num2) {
        return num1 + num2;
    }

    public double getValueOfNum1() {
        return this.num1;
    }

    public double getValueOfNum2() {
        return this.num2;
    }
}

//
public class DoubleArithmetic {
    public double num1; //this line contains an error
    private int num2; //this line contains an error

    public DoubleArithmetic(double num1, double num2) {
        num1 = this.num1; //this line contains errors
        num2 = this.num1; //this line contains errors
    }

    public double add() {
        return 0; //this line contains an error
    }

    public double subtraction() {
        return ; //this line contains an error
    }

    public double multiplication() {
        return this.num1*this.num2;
    }

    public double division() {
        return this.num1 / this.num2;
    }

    public void increaseValues(int increaseNum1, double increaseNum2) { //this line contains an error
        this.num1 = sumTwoValues(this.num1, increaseNum1);
        this.num2 = sumTwoValues(this.num2, increaseNum2);
    }
    private double sumTwoValues(double num1, double num2) { //this line contains an error
        return num1 + num2;
    }

    public double getValueOfNum1() {
        return num1; //this line contains an error
    }

    public double getValueOfNum2() {
        return this.num1; //this line contains an error
    }
}

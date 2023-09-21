package CoolMath;

public class IntegerArithmetic {
    private int num1;  //this line contains an error
    private int num2;  //this line contains an error

    public IntegerArithmetic(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add() {
        return this.num1 + this.num2;
    }

    public int subtraction() {
        return this.num1 - this.num2;
    }

    public int multiplication() {
        return this.num1 * this.num2;
    }

    public int division() {
        return this.num1 / this.num2;
    }

    public void increaseValues(int increaseNum1, int increaseNum2) {
        this.num1 = sumTwoValues(this.num1, increaseNum1); //this line contains errors
        this.num2 = sumTwoValues(this.num2, increaseNum2); //this line contains errors
    }
    private static int sumTwoValues(int num1, int num2) { //this line contains errors
        return num1 + num2;
    }

    public int getValueOfNum1() {
        return this.num1;
    }

    public int getValueOfNum2() {
        return this.num2;
    }
}

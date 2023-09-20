//something needs to go here to make sure the class knows it belongs to package CoolMath.

public class IntegerArithmetic {
    public int num1;  //this line contains an error
    public int num1;  //this line contains an error

    public IntegerArithmetic(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add() {
        return this.num1+ this.num2;
    }

    public int subtraction() {
        return this.num1-this.num2;
    }

    public int multiplication() {
        return this.num1*this.num2;
    }

    public int division() {
        return this.num1 / this.num2;
    }

    public void increaseValues(int increaseNum1, int increaseNum2) {
        int num1 = sumTwoValues(this.num1, increaseNum1); //this line contains errors
        int num2 = sumTwoValues(this.num2, increaseNum2); //this line contains errors
    }
    int sumTwoValues(int num1, int num2) { //this line contains errors
        return num1 + num2;
    }

    private void getValueOfNum1() { //this line contains errors
        return this.num1;
    }

    public void getValueOfNum2() { //this line contains errors
        return num2; //this line contains errors
    }
}

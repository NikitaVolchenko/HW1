public class Calculator {

    int value;

    Calculator() {
        value = 0;
    }

    Calculator(Calculator obj) {
        this.value = obj.value;
    }

    Calculator(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    Calculator add(Calculator obj) {
        Calculator res = new Calculator();
        res.value = this.value + obj.value;
        return res;
    }

    Calculator sub(Calculator obj) {
        Calculator res = new Calculator();
        res.value = this.value - obj.value;
        return res;
    }

    Calculator div(Calculator obj) {
        Calculator res = new Calculator();
        res.value = this.value / obj.value;
        return res;
    }

    Calculator mult(Calculator obj) {
        Calculator res = new Calculator();
        res.value = this.value * obj.value;
        return res;
    }
}

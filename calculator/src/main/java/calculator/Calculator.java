package calculator;

public class Calculator {

    public int addTwoInteger(int first, int second) {
        return first + second;
    }

    public double division(double first, double second) throws Exception{
        if(second==0)
            throw new Exception();
        return first / second;
    }
}

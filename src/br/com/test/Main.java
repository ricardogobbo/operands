package br.com.test;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        Sum sum = new Sum();
        Value value1 = new Value(10.0);
        Value value2 = new Value(12.0);
        Value value3 = new Value(112.0);
        ArrayList<Operand<Double, Double>> operands = new ArrayList<>();
        operands.add(value1);
        operands.add(value2);
        operands.add(value3);
        sum.setOperands(operands);

        Value multValue = new Value(2.0);
        ArrayList<Operand<Double, Double>> operands1 = new ArrayList<>();
        operands1.add(sum);
        operands1.add(multValue);

        Multiply multiply = new Multiply();
        multiply.setOperands(operands1);

        Value subValue = new Value(3.0);
        ArrayList<Operand<Double, Double>> operands2 = new ArrayList<>();
        operands2.add(multiply);
        operands2.add(subValue);

        Subtract sub = new Subtract();
        sub.setOperands(operands2);

        Divide divide = new Divide(new Value(10.0), sub);

        System.out.println(divide.evaluate());
        System.out.println(divide.toString());

        Double a = (10.0 / (((10.0 + 12.0 + 112.0) * 2.0) - 3.0));
        System.out.println(a);
    }
}

package br.com.test;

import java.util.List;

public class Multiply implements Operand<Double, Double>{

    private List<Operand<Double, Double>> operands;

    @Override
    public Double evaluate() {
        Double prod = 1.0;
        for (Operand<Double, Double> operand : operands) {
            prod = prod * operand.evaluate();
        }
        return prod;
    }

    @Override
    public String toString() {
        StringBuilder toReturn = new StringBuilder("(");
        for(int i = 0; i < operands.size(); i++){
            toReturn.append(operands.get(i).toString());
            if(i < operands.size() - 1){
                toReturn.append(" x ");
            }
        }
        return toReturn + ")";
    }

    public List<Operand<Double, Double>> getOperands() {
        return operands;
    }

    public void setOperands(List<Operand<Double, Double>> operands) {
        this.operands = operands;
    }
}

package br.com.test;

public interface Operand<TOperandType, TReturnType> {

    public TReturnType evaluate();
    public String toString();

}

package org.aleh4min.LenTester.Primers;

import java.util.ArrayList;

public abstract class AbstractPrimer<T extends Number> {
    private char operationSymbol;

    protected final ArrayList<T> numbers;
    protected int len = 2;
    protected T answerLimit;

    protected T answer;
    protected T userAnswer;


    public AbstractPrimer(T limit) {
        numbers = new ArrayList<>(len);
        answerLimit = limit;
        generatePrimer();
        setAnswer();
    }

    public AbstractPrimer(T limit, int numCount) {
        if (numCount > 2) len = numCount;
        numbers = new ArrayList<>(len);
        answerLimit = limit;
        generatePrimer();
        setAnswer();
    }

    protected void setOperationSymbol(char sym) {
        operationSymbol = sym;
    }

    protected abstract void generatePrimer();

    protected abstract void setAnswer();

    public abstract void setUserAnswer(String answer);

    public boolean isAnswerRight() {
        return answer.equals(userAnswer);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.size(); ++i) {
            sb.append(numbers.get(i));
            if (i != numbers.size()-1) sb.append(operationSymbol);
            else sb.append('=');
        }
        return sb.toString();
    }
}

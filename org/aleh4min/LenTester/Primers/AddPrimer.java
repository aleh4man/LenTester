package org.aleh4min.LenTester.Primers;

import java.util.Random;

public class AddPrimer extends AbstractPrimer<Integer> {
    public AddPrimer(Integer limit) {
        super(limit);
        setOperationSymbol('+');
    }

    public AddPrimer(Integer limit, int len) {
        super(limit, len);
        setOperationSymbol('+');
    }

    @Override
    protected void generatePrimer() {
        int lim = answerLimit;
        Random rand = new Random(System.currentTimeMillis());
        for (int i = 0; i < len; ++i) {
            int tmp = (int)Math.round((rand.nextDouble()*(lim-1)+1));
            if (tmp < 0) tmp = 0;
            numbers.add(tmp);
            lim -= tmp;
        }
    }

    @Override
    protected void setAnswer() {
        int tmp = 0;
        for (int num : numbers) {
            tmp += num;
        }
        answer = tmp;
    }

    @Override
    public void setUserAnswer(String answer) {
        userAnswer = Integer.parseInt(answer);
    }
}

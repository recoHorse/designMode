package com.example.designmode.模式.装饰模式.v1;

import com.example.designmode.模式.装饰模式.v0.SchoolReport;

/**
 * @description: some desc
 * @author: liaomw
 * @email: liaomawei@bluemoon.com.cn
 * @date: 2023/4/26 21:49
 */
public class HighScoreDecorator extends Decorator {

    public HighScoreDecorator() {
    }

    public HighScoreDecorator(SchoolReport report) {
        super(report);
    }

    private void reportHighScore(){
        System.out.println("这次考试语文最高是75，数学是78,自然是80");
    }

    @Override
    public void report() {
        reportHighScore();
        super.report();

    }
}

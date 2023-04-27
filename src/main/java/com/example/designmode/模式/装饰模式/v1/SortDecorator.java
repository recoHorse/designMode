package com.example.designmode.模式.装饰模式.v1;

import com.example.designmode.模式.装饰模式.v0.SchoolReport;

/**
 * @description: some desc
 * @author: liaomw
 * @email: liaomawei@bluemoon.com.cn
 * @date: 2023/4/26 21:50
 */
public class SortDecorator extends Decorator{

    public SortDecorator() {
    }

    public SortDecorator(SchoolReport report) {
        super(report);
    }

    private void reportSort(){
        System.out.println("我是排名第38名");
    }

    @Override
    public void report() {
        super.report();
        reportSort();
    }
}

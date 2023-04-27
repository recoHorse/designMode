package com.example.designmode.模式.装饰模式.v1;

import com.example.designmode.模式.装饰模式.v0.SchoolReport;

/**
 * @description: some desc
 * @author: liaomw 修饰的抽象类
 * @email: liaomawei@bluemoon.com.cn
 * @date: 2023/4/26 21:44
 */
public abstract class Decorator extends SchoolReport {

    //首先我要知道是哪个成绩单
    private SchoolReport report;

    public Decorator() {
    }

    //构造函数
    public Decorator(SchoolReport report) {
        this.report = report;
    }

    @Override
    public void report() {
        report.report();
    }

    @Override
    public void sign(String name) {
        report.sign(name);
    }
}

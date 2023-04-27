package com.example.designmode.模式.装饰模式.v0;

/**
 * @description: some desc
 * @author: liaomw 抽象成绩单
 * @email: liaomawei@bluemoon.com.cn
 * @date: 2023/4/26 21:05
 */
public abstract class SchoolReport {

    /**
     * 成绩单主要展示的就是你的成绩情况
     */
    public abstract void report();

    /**
     * 成绩单要家长签名，这个是最要命的
     */
    public abstract void sign(String name);
}

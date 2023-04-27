package com.example.designmode.模式.装饰模式.v0;

/**
 * @description: some desc
 * @author: liaomw 四年级成绩单
 * @email: liaomawei@bluemoon.com.cn
 * @date: 2023/4/26 21:07
 */
public class FouthGradeSchoolReport extends SchoolReport{

    @Override
    public void report() {
        System.out.println("尊敬的XXX家长：");
        System.out.println(".......");
        System.out.println("语文62 数学 65 体育98 自然63");
        System.out.println(".......");
        System.out.println("                            家长签名：      ");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签名为"+name);
    }
}

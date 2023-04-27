package com.example.designmode.模式.装饰模式.v0;

/**
 * @description: some desc
 * @author: liaomw
 * @email: liaomawei@bluemoon.com.cn
 * @date: 2023/4/26 21:10
 */
public class Father {
    /* test1
    public static void main(String[] args) {
        FouthGradeSchoolReport fouthCradeSchoolReport = new FouthGradeSchoolReport();
        fouthCradeSchoolReport.report();
        fouthCradeSchoolReport.sign("张三");
    }*/

    public static void main(String[] args) {
        SchoolReport fouthCradeSchoolReport = new SugarFouthGradeSchoolReport();
        fouthCradeSchoolReport.report();
        fouthCradeSchoolReport.sign("张三");
    }
}

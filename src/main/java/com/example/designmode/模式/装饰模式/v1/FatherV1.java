package com.example.designmode.模式.装饰模式.v1;

import com.example.designmode.模式.装饰模式.v0.FouthGradeSchoolReport;
import com.example.designmode.模式.装饰模式.v0.SchoolReport;

/**
 * @description: some desc
 * @author: liaomw
 * @email: liaomawei@bluemoon.com.cn
 * @date: 2023/4/26 21:51
 */
public class FatherV1 {

    public static void main(String[] args) {
        SchoolReport schoolReport;
        schoolReport = new FouthGradeSchoolReport();
        schoolReport = new HighScoreDecorator(schoolReport);
        schoolReport = new SortDecorator(schoolReport);
        schoolReport.report();
        schoolReport.sign("老三");
    }
}

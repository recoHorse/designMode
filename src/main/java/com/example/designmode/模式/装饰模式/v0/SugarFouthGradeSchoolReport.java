package com.example.designmode.模式.装饰模式.v0;

/**
 * @description: some desc
 * @author: liaomw 修饰成绩单
 * @email: liaomawei@bluemoon.com.cn
 * @date: 2023/4/26 21:36
 */
public class SugarFouthGradeSchoolReport extends FouthGradeSchoolReport{

    /**
     * 首先要定义你要美化的方法，先给老爸说学校最高成绩
     */
    private void reportHighScore(){
        System.out.println("这次考试语文最高是75，数学是78,自然是80");
    }

    /**
     * 在老爸看完成绩后，再汇报学校的排名的情况
     */
    private void reportSort(){
        System.out.println("我是排名第38名");
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
        this.reportSort();
    }
}

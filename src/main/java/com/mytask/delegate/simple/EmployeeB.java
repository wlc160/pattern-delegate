package com.mytask.delegate.simple;

/**
 * 工程名:pattern-delegate
 * 包名:com.mytask.delegate.simple
 * 文件名:EmployeeB
 * description:
 *
 * @author lcwen
 * @version V1.0: EmployeeB.java 2019/10/14 10:10
 **/
public class EmployeeB implements Employee{

    @Override
    public void doing(String command) {
        System.out.println("我是EmployeeB，我现在开始做" + command + "工作");
    }

}

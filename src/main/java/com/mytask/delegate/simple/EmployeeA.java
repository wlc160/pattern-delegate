package com.mytask.delegate.simple;

/**
 * 工程名:pattern-delegate
 * 包名:com.mytask.delegate.simple
 * 文件名:EmployeeA
 * description:
 *
 * @author lcwen
 * @version V1.0: EmployeeA.java 2019/10/14 10:10
 **/
public class EmployeeA implements Employee {
    @Override
    public void doing(String command) {
        System.out.println("我是EmployeeA，我现在开始做" + command + "工作");
    }
}

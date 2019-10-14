package com.mytask.delegate.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * 工程名:pattern-delegate
 * 包名:com.mytask.delegate.simple
 * 文件名:Leader
 * description:
 *
 * @author lcwen
 * @version V1.0: Leader.java 2019/10/14 10:07
 **/
public class Leader {

    public Map<String ,Employee> employees = new HashMap<>();

    public Leader(){
        employees.put("算账",new EmployeeA());
        employees.put("开发",new EmployeeB());
    }


    public void doing(String command){
        System.out.println("leader分配任务...");
        employees.get(command).doing(command);
    }


}

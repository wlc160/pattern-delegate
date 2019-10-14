package com.mytask.delegate.simple;

/**
 * 工程名:pattern-delegate
 * 包名:com.mytask.delegate.simple
 * 文件名:Boss
 * description:
 *
 * @author lcwen
 * @version V1.0: Boss.java 2019/10/14 10:07
 **/
public class Boss {

    public Leader leader;

    public Boss(Leader leader){
        this.leader = leader;
    }

    public void command(String command){
        System.out.println("boss命令leader做" + command + "...");
        leader.doing(command);
    }

}

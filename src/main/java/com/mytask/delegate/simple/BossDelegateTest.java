package com.mytask.delegate.simple;

/**
 * 工程名:pattern-delegate
 * 包名:com.mytask.delegate.simple
 * 文件名:BossDelegateTest
 * description:
 *
 * @author lcwen
 * @version V1.0: BossDelegateTest.java 2019/10/14 10:12
 **/
public class BossDelegateTest {

    public static void main(String[] args) {
        new Boss(new Leader()).command("开发");
    }
}

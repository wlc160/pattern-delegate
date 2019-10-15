**设计模式之委派模式**

**1、基本作用：**（精简程序逻辑，提升代码的可读性）

负责任务的调度和分配任务，跟代理模式很像，可以看做是一种特殊情况下的静态代理的全权代理，但是代理模式注重过程，而委派模式注重结果。
如在spring的dispatcherServlet

**2、spring源码中委派模式，如：** dispatchServlet，关系图如下：

![Image text](https://github.com/wlc160/img-folder/blob/master/DispatchServlet.png)


/*
学习目标：接口(具体明确各个类必须实现的行为的抽象类型)；与协议类似；是抽象方法的集合;
实际应用：- 多人协作编程；面向接口编程；一个类通过继承接口的方式，从而来继承接口的抽象方法。
        - Simulate multiple inheritance: An interface may inherit multiple interfaces and a class may implement multiple interfaces.
概念定义：- 接口与实现分离
        - A common interface can be expressed differently for each different subtype.
        - A common interface establishes a basic form of what is common for all the derived classes
        - 抽象类可使用共同的接口操纵一组类
        - An interface is a form and used to establish a protocol between classes
        - 接口不能被实例化
另请参阅：- https://en.wikipedia.org/wiki/Interface_(Java)
        - https://en.wikipedia.org/wiki/Multiple_inheritance
        - https://www.youtube.com/watch?v=UYPxgmTNoHs&t=497s
        - https://www.youtube.com/watch?v=Yat8l37XGFA
        - https://www.runoob.com/java/java-interfaces.html
        - https://www.runoob.com/java/java-polymorphism.html
        - https://www.geeksforgeeks.org/interfaces-in-java/
        - https://www.bilibili.com/read/cv4960817?share_medium=iphone&share_plat=ios&share_source=WEIXIN&share_tag=s_i&timestamp=1599004301&unique_k=GyZ5KM
*/

package com.company;

import javax.print.Doc;

public class Main {

    public static void main(String[] args) {
        Doctor ZhongNanShan = new Doctor();
        Student Amy = new Student();

        ZhongNanShan.CheckHealth(Amy.ageOfStudent, Amy.heightOfStudent);
    }
}


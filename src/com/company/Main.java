/*
学习目标：接口(具体明确各个类必须实现的行为的抽象类型)；与协议类似；是抽象方法的集合;
实际应用：多人协作编程；面向接口编程；一个类通过继承接口的方式，从而来继承接口的抽象方法。
概念定义：- 接口与实现分离
        - A common interface can be expressed differently for each different subtype.
        - A common interface establishes a basic form of what is common for all the derived classes
        - 抽象类可使用共同的接口操纵一组类
        - An interface is a form and used to establish a protocol between classes
        - 接口不能被实例化
另请参阅：- https://en.wikipedia.org/wiki/Interface_(Java)
        - https://en.wikipedia.org/wiki/Multiple_inheritance
        - https://www.youtube.com/watch?v=UYPxgmTNoHs&t=497s
        - https://www.runoob.com/java/java-interfaces.html
        - https://www.bilibili.com/read/cv4960817?share_medium=iphone&share_plat=ios&share_source=WEIXIN&share_tag=s_i&timestamp=1599004301&unique_k=GyZ5KM
*/

package com.company;

public class Main {

    public static void main(String[] args) {
        LivingOrganisms Teddy = new Bear();
        System.out.print("My bear eats " + Teddy.eat() + " fish every day. ");
        System.out.print("My bear walks ");
        Teddy.travel();
        System.out.print("My bear never drinks " + Teddy.drink() + ".");
        System.out.println("Is my bear old? " + Teddy.isSenior());

        LivingOrganisms Jim = new Cousin();
        System.out.print("Jim ate " + Jim.eat() + " burgers last year. ");
        System.out.print("Jim visits ");
        Jim.travel();
        System.out.print("Jim always drinks " + Jim.drink() + " before he goes to bed.");
        System.out.println(" Is Jim old? " + Jim.isSenior());

        LivingOrganisms COVID = new Virus();
        System.out.print("Coronaviruses ate " + COVID.eat() + " cell yesterday.");
        System.out.print(" Coronaviruses sometimes ");
        COVID.travel();
        System.out.print("Coronaviruses drink " + COVID.drink());
        System.out.print("Are coronaviruses old? " + COVID.isSenior());
    }
}


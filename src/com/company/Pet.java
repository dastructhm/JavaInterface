package com.company;

// 老板：小李，你负责写这个类的实现代码
// 小李必须按照接口写实现代码，不能自己想写什么就写什么
public class Pet implements CheckHealth {
    // 域age,height将被CheckUp方法调用
    int age = 12;
    double height = 6;
    public String CheckUp(int fieldAgeValue, double fieldHeightValue) {
        if (age > 10 & height < 10.5) {
            System.out.print("You are " + fieldAgeValue + " years old." + " Your height is " + fieldHeightValue + " cm. ");
            return "So, you are unhealthy.";
        } else {
            return "You are healthy.";
        }
    }
}

package com.company;

// 老板：小李，你负责写这个类的实现代码
// 小李必须按照接口写实现代码，不能自己想写什么就写什么
public class Pet implements CheckHealth {
    int age = 12;
    double height = 6;
    public String CheckUp(int age, double height) {
        return "Nothing";
    }
}

package com.company;

// 老板：小王，你负责写这个类的实现代码
// 小王必须按照接口写实现代码，不能自己想写什么就写什么
public class Doctor implements CheckHealth {
    public String CheckUp(int age, double height){
        if (age > 10 & height < 10.5) {
            System.out.println("You are " + age + " years old." + " Your height is " + height + " cm.");
            return "So, you are unhealthy.";
        } else {
            return "You are healthy.";
        }
    }
}

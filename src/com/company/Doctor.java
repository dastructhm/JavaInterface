package com.company;

// 老板：小王，你负责写这个类的实现代码
public class Doctor implements CheckHealth {
    public String CheckUp(int age, double height){
        if (age > 35 & height < 1.5) {
            System.out.println("You are " + age + " years old." + " Your height is " + height);
            return "So you are unhealthy.";
        }else{
            return "You are healthy.";
        }
    }
}

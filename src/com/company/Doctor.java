// 老板：小王，你负责写这个类的实现代码

package com.company;

public class Doctor implements CheckHealth {
    public String CheckUp(int age, double height){
        if (age > 35 & height < 1.5) {
            return "You are unhealthy.";
        }else{
            return "You are healthy.";
        }
    }
}

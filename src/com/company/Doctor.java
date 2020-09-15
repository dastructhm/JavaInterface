// 老板：小王，你负责写这个类的实现代码

package com.company;

public class Doctor implements CheckHealth {
    int ageOfStudent = 40;
    double heightOfStudent = 1.4;

    public String CheckUp(int ageOfStudent, double heightOfStudent){
        if (this.ageOfStudent > 35 & this.heightOfStudent < 1.5) {
            return "You are unhealthy.";
        }else{
            return "You are healthy.";
        }
    }
}

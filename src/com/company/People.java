// 老板和小王、小李开会约定的接口

package com.company;

// 只有定义的接口，只有方法的签名，但没有实现
public interface People {
    int ageOfStudent = 30;
    double heightOfStudent = 120;
    int CheckHealth(int ageOfStudent, double heightOfStudent);
}

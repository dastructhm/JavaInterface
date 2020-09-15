// 老板、小王、小李开会时约定的接口

package com.company;

// 只有定义的接口，只有方法的签名，但没有实现
public interface CheckHealth {
    int ageOfStudent = 30;
    double heightOfStudent = 1.73;

    String CheckUp(int ageOfStudent, double heightOfStudent);
}

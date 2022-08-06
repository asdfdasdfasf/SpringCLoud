package com.kyrie.study.doubleLink;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/4/16 12:35
 */
public class DoubleLinkTest {
    public static void main(String[] args) {
        MyDoubleLink<Integer> doubleLink=new MyDoubleLink<>();
        doubleLink.initLink();
        doubleLink.insertTail(1);
        doubleLink.insertTail(2);
        doubleLink.insertTail(3);
        doubleLink.print();
    }
}

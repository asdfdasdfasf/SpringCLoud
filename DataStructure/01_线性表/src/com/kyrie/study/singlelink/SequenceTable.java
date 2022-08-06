package com.kyrie.study.singlelink;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/4/14 22:08
 * 顺序表的数组实现方式
 */
public class SequenceTable {
    public static void main(String[] args) throws Exception {
        SeqList<Integer> seqList=new SeqList<>(3);
        seqList.add(18,1);
        seqList.add(19,2);
        seqList.add(20,3);
        System.out.println(seqList.getElementByIndex(1));
        System.out.println(seqList.getElementByIndex(2));
        System.out.println(seqList.getElementByIndex(3));
        seqList.print();
    }
}



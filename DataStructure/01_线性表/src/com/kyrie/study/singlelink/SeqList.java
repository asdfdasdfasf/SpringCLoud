package com.kyrie.study.singlelink;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/4/15 13:45
 * 定义数组顺序表结构
 */
public class SeqList<T> {
    /**
     * 定义数组的最大长度
     */
    private int maxSize;

    /**
     * 顺序表的长度
     */
    private int length;

    /**
     * 创建T类型的数组
     */
    private T[] data;

    public SeqList(int maxSize) {
        this.maxSize = maxSize;
        initList();
        this.length = 0;
    }

    /**
     * 顺序表初始化
     */
    @SuppressWarnings("unchecked")
    private void initList() {
        data = (T[]) new Object[maxSize];
    }

    /**
     * 数组的插入操作
     */
    public void add(T element, int position) throws Exception {
        if (length >= maxSize) {
            throw new Exception("当前数组已满，无法进行插入操作");
        }
        if (position <= 0 || position > length + 1) {
            throw new Exception("数组插入元素的位置不正确");
        }
        for (int i = length - 1; i >= position; i--) {
            data[i + 1] = data[i];
        }
        data[position - 1] = element;
        length++;
    }

    /**
     * 打印数组元素信息
     */
    public void print() {
        for (int i = 0; i < length; i++) {
            System.out.print(data[i] + " ");
        }
    }

    /**
     * 删除指定元素位置的元素
     *
     * @param position
     * @return
     * @throws Exception
     */
    public T delete(int position) throws Exception {
        if (length == 0) {
            throw new Exception("当前数组元素为空，无法删除对象");
        }
        if (position < 0 || position > length) {
            throw new Exception("删除的位置不正确");
        }
        T result = data[position - 1];
        for (int i = position - 1; i < length - 1; i++) {
            data[i] = data[i + 1];
        }
        length--;
        return result;
    }

    /**
     * 查找第i个位置的数组信息
     */
    public T getElementByIndex(int index) throws Exception {
        if (index <= 0 || index > length) {
            throw new Exception("数组元素位置不正确");
        }
        return data[index - 1];
    }
}
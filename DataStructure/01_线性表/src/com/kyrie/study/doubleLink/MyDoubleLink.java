package com.kyrie.study.doubleLink;

import lombok.Data;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/4/16 12:35
 * 创建双向链表
 */
public class MyDoubleLink<T>{
    /**
     * 链表的长度
     */
   private int length;

    /**
     * 双向链表的头结点
     */
    private LinkNode<T> head;

    /**
     * 双向链表的尾节点
     */
    private LinkNode<T> tail;

   public void initLink(){
       this.length=0;
       head=new LinkNode(-1);
       tail=head;
   }
    /**
     * 双向链表的头部插入操作
     */
    public void insert(T data){
        LinkNode node=new LinkNode(data);
        node.next=head.next;
        if(head.next!=null){
            head.next.pre=node;
        }
        head.next=node;
        node.pre=head;
        this.length++;
    }

    /**
     * 双向链表的尾部插入
     */
    public void insertTail(T data){
        LinkNode node=new LinkNode(data);
        tail.next=node;
        node.pre=tail;
        tail=node;
        this.length++;
    }

    /**
     * 寻找指定位置的节点
     */
    public LinkNode<T> getNodeByIndex(int index){
        if(index<0||index>length){
            System.out.println("寻找数据位置不正确");
            return null;
        }
        LinkNode iterator=head;
        for(int i=0;i<index;i++){
            iterator=iterator.next;
        }
        return iterator;
    }

    /**
     * 删除指定位置的元素的数据
     */
    public void deleteByIndex(int index){
        if(index<0||index>length){
            System.out.println("删除数据位置不正确");
            return;
        }
        LinkNode<T> node = getNodeByIndex(index);
        node.pre.next=node.next;
        if(node.next!=null){
            node.next.pre=node.pre;
        }
        this.length--;
    }

    /**
     * 双向链表的遍历
     */
    public void print() {
        LinkNode<T> temp=head.next;
        while(temp!=null){
            System.out.print(temp.getData()+" ");
            temp=temp.next;
        }
    }
}

@Data
class LinkNode<T>{
  private T data;
  public LinkNode pre;
  public LinkNode next;

  public LinkNode(T data){
      this.data=data;
  }

}

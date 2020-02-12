package com.gfg.stack;

public class StackImpl {

    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // M


    boolean isEmpty()
    {
        return (top < 0);
    }
    StackImpl()
    {
        top = -1;
    }

    boolean push(int x){
        if(top > (MAX-1)){
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            a[++top]=x;
            return false;
        }
    }


    int pop()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top--];
            return x;
        }
    }

    int peek()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top];
            return x;
        }
    }

    public static void main(String[] args) {
        StackImpl s=new StackImpl();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");

    }
}
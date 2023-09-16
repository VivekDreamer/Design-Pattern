package com.vivek.SingletonDesignPattern;

public class SingletonDesign3 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ABC obj = ABC.getInstance();
                System.out.println(obj.hashCode());
            }    
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                ABC obj = ABC.getInstance();
                System.out.println(obj.hashCode());
            }    
        });
        thread1.start();
        thread2.start();
    }
}
//this piece of code will have two threads who are creating the ABC class object 
//both threads invokes the getInstance() method of ABC class at the same time.
//So, in this case two objects will be created.
//one way to stop this is to make getInstance() method synchronized.
//but, what if getInstance() method has lot of work to do, to make the complete method synchronized is not a feasible option.
//it will affect the performance
//To solve this, instead of making complete getInstance() method as synchronized, I will use the double check locking mechanism.

class ABC{
    static ABC obj;
    private ABC(){System.out.println("instance created.");};
    public static synchronized ABC getInstance(){
        if(obj == null) obj = new ABC();
        return obj;
    }
}

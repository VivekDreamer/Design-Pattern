package com.vivek.SingletonDesignPattern;

public class SingletonDesign4 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
               PQR obj = PQR.getInstance();
               System.out.println(obj.hashCode());
            } 
        });
        Thread thread2 = new Thread(new Runnable(){
            @Override
            public void run(){
                PQR obj = PQR.getInstance();
                System.out.println(obj.hashCode());
            }
        });
        thread1.start();
        /*try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        thread2.start();
    }
}
//if you don't want to use synchronized keyword but still want that it will not break the singleton design pattern,
//there are two ways, you can use sleep method in between the starting of two threads who are creating the object.
//Second way is you can use the double check locking, wherever the object is creating, enclosed that in synchronized block.
//Singleton pattern can also be created with the help of enum.
class PQR{
    public static PQR obj;
    private PQR(){System.out.println("inside constructor");}
    public static PQR getInstance(){
        if(obj == null){
            synchronized(PQR.class){   //double check locking
                if(obj == null)
                    obj = new PQR();
            }
        }
        return obj;
    }
}

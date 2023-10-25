package com.vivek.BuilderDesignPattern.second_example;

public class Main {
    public static void main(String[] args) {
        URL url = new URL();
        url.setProtocol("https://");
        url.setHostname("mywebsite");
        url.setPort(":8080/");
        url.setPathParam("homepage");
        url.setPathParam("random");
        System.out.println(url.getProtocol());
        System.out.println(url.getHostname());
        System.out.println(url.getPort());
        System.out.println(url.getPathParam());
        
    }
}

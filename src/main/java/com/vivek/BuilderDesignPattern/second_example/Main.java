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

        URLBuilder.Builder builder = new URLBuilder.Builder();
        builder.protocol("https://").hostname("mywebsite:").port("443");
        URLBuilder urlBuilder = builder.build();
        System.out.print(urlBuilder.protocol);
        System.out.print(urlBuilder.hostname);
        System.out.println(urlBuilder.port);

        URLBuilder.Builder builder2 = new URLBuilder.Builder();
        builder2.protocol("https://").hostname("mywebsite2").pathParam("/abc");
        URLBuilder urlBuilder2 = builder2.build();
        System.out.print(urlBuilder2.protocol);
        System.out.print(urlBuilder2.hostname);
        System.out.print(urlBuilder2.pathParam );
    }
}

package com.vivek.BuilderDesignPattern.second_example;

public class URLTelescopic {
    private String protocol;
    private String hostname;
    private String port;
    private String pathParam;
    private String queryParam;
    public URLTelescopic() {
    }
    public URLTelescopic(String protocol) {
        this.protocol = protocol;
    }
    public URLTelescopic(String protocol, String hostname) {
        this(protocol);
        this.hostname = hostname;
    }
    public URLTelescopic(String protocol, String hostname, String port) {
        this(protocol,hostname);
        this.port = port;
    }
    public URLTelescopic(String protocol, String hostname, String port, String pathParam) {
        this(protocol,hostname,port);
        this.pathParam = pathParam;
    }
    public URLTelescopic(String protocol, String hostname, String port, String pathParam, String queryParam) {
        this(protocol,hostname,port,pathParam);
        this.queryParam = queryParam;
    }
}

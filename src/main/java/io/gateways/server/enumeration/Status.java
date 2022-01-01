package io.gateways.server.enumeration;

/**
 * @version 1.0
 * @author: abhilashgd
 * @since: 1/1/22
 */
public enum Status {
    SERVER_UP("SERVER_UP"),
    SERVER_DOWN("SERVER_DOWN");

    private final String status;

    Status(String status){
        this.status=status;
    }

    public String getStatus(){
        return this.status;
    }
}

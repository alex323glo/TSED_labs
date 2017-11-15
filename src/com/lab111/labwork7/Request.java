package com.lab111.labwork7;

/**
 * Request model. Aggregates request's type and body.
 *
 * @author alex323glo
 * @version 1.0.0
 */
public class Request {

    private String type;

    private String body;

    /**
     * Constructor.
     * */
    public Request() {
    }

    /**
     * Constructor with parameters.
     * */
    public Request(String type, String body) {
        this.type = type;
        this.body = body;
    }

    /**
     * Getter of type field.
     *
     * @return field value.
     * */
    public String getType() {
        return type;
    }

    /**
     * Setter of type field.
     *
     * @param type initial value.
     * */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter of body field.
     *
     * @return field value.
     * */
    public String getBody() {
        return body;
    }

    /**
     * Setter of body field.
     *
     * @param body initial value.
     * */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * Presents request's data as String.
     *
     * @return data, compressed to String.
     * */
    @Override
    public String toString() {
        return "Request{" +
                "type='" + type + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}

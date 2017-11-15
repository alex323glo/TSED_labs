package com.lab111.labwork7;

/**
 * Realisation of request filter Command.
 *
 * @author alex323glo
 * @version 1.0.0
 *
 * @see Action
 * */
public class RequestsFilter implements Action {

    private RequestQueue requestQueue;
    private String[] restrictedTypes;

    /**
     * Constructor.
     * */
    public RequestsFilter() {
    }

    /**
     * Constructor with parameters.
     * */
    public RequestsFilter(RequestQueue requestQueue, String... restrictedTypes) {
        this.requestQueue = requestQueue;
        this.restrictedTypes = restrictedTypes;
    }

    /**
     * Getter of requestQueue field.
     *
     * @return field value.
     * */
    public RequestQueue getRequestQueue() {
        return requestQueue;
    }

    /**
     * Setter of requestQueue field.
     *
     * @param requestQueue initial value.
     * */
    public void setRequestQueue(RequestQueue requestQueue) {
        this.requestQueue = requestQueue;
    }

    /**
     * Getter of restrictedTypes field.
     *
     * @return field value.
     * */
    public String[] getRestrictedTypes() {
        return restrictedTypes;
    }

    /**
     * Setter of restrictedTypes field.
     *
     * @param restrictedTypes initial value.
     * */
    public void setRestrictedTypes(String... restrictedTypes) {
        this.restrictedTypes = restrictedTypes;
    }

    /**
     * Carries out command's logic.
     */
    @Override
    public void execute() {
        System.out.println(" * RequestFilter: execute()");
        for (String type: restrictedTypes) {
            requestQueue.removeAll(type);
        }
    }
}

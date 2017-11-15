package com.lab111.labwork7;

/**
 * Realisation of priority change Command.
 *
 * @author alex323glo
 * @version 1.0.0
 *
 * @see Action
 * */
public class RequestsPriorityChanger implements Action {

    private RequestQueue requestQueue;
    private String priorityType;

    /**
     * Constructor.
     * */
    public RequestsPriorityChanger() {
    }

    /**
     * Constructor with parameters.
     * */
    public RequestsPriorityChanger(RequestQueue requestQueue, String priorityType) {
        this.requestQueue = requestQueue;
        this.priorityType = priorityType;
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
     * Getter of priorityType field.
     *
     * @return field value.
     * */
    public String getPriorityType() {
        return priorityType;
    }

    /**
     * Setter of priorityType field.
     *
     * @param priorityType initial value.
     * */
    public void setPriorityType(String priorityType) {
        this.priorityType = priorityType;
    }

    /**
     * Carries out command's logic.
     */
    @Override
    public void execute() {
        System.out.println(" * RequestsPriorityChanger: execute()");
        requestQueue.setPriority(priorityType);
    }
}

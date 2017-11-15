package com.lab111.labwork7;

/**
 * Invoker of request-processing commands.
 * Aggregates Action instances - Commands.
 *
 * @author alex323glo
 * @version 1.0.0
 *
 * @see Action
 * */
public class RequestController {

    private Action filter;
    private Action priorityChanger;

    /**
     * Constructor.
     * */
    public RequestController() {
    }

    /**
     * Constructor with parameters.
     * */
    public RequestController(Action filter, Action priorityChanger) {
        this.filter = filter;
        this.priorityChanger = priorityChanger;
    }

    /**
     * Getter of filter field.
     *
     * @return field value.
     * */
    public Action getFilter() {
        return filter;
    }

    /**
     * Setter of filter field.
     *
     * @param filter initial value.
     * */
    public void setFilter(Action filter) {
        this.filter = filter;
    }

    /**
     * Getter of priorityChanger field.
     *
     * @return field value.
     * */
    public Action getPriorityChanger() {
        return priorityChanger;
    }

    /**
     * Setter of priorityChanger field.
     *
     * @param priorityChanger initial value.
     * */
    public void setPriorityChanger(Action priorityChanger) {
        this.priorityChanger = priorityChanger;
    }

    /**
     * Removes from queue requests, which headers matches
     * filter's restriction rules.
     * */
    public void filterRequests() {
        filter.execute();
    }

    /**
     * Marks (as priority) requests, which headers matches
     * priorityChanger's priority rules.
     * */
    public void changeRequestsPriority() {
        priorityChanger.execute();
    }

}

package com.lab111.labwork7;

import java.util.ArrayList;
import java.util.List;

/**
 * Container, which stores Requests. Inner structure
 * based on List interface.
 *
 * @author alex323glo
 * @version 1.0.0
 *
 * @see List
 * @see Request
 * */
public class RequestQueue {

    private List<Request> requests;

    /**
     * Constructor.
     * */
    public RequestQueue() {
        requests = new ArrayList<>();
    }

    /**
     * Adds new Request to queue.
     *
     * @param request new element, which will be added to queue.
     *
     * @see Request
     * */
    public void add(Request request) {
        requests.add(request);
        System.out.println(" * RequestQueue: added \"" + request + "\".");
    }

    /**
     * Gives List of all Requests in request queue.
     *
     * @return List of stored Requests.
     *
     * @see List
     * @see Request
     * */
    public List<Request> getAll() {
        return requests;
    }

    /**
     * Removes all requests, which type is equal to parameter.
     *
     * @param type matcher of needed type.
     * */
    public void removeAll(String type) {
        for (int i = 0; i < requests.size(); i++) {
            if (requests.get(i).getType().equals(type)) {
                System.out.println(" * RequestQueue: removed \"" + requests.remove(i) + "\".");
                i--;
            }
        }
    }

    /**
     * Swap to the top of queue all requests, which type is equal to parameter.
     *
     * @param type matcher of needed type.
     * */
    public void setPriority(String type) {
        for (int i = 0; i < requests.size(); i++) {

            for (int j = i; j < requests.size(); j++) {
                if (requests.get(j).getType().equals(type) && !requests.get(j).getType().equals(type)) {
                    Request temp = requests.get(j);
                    requests.set(j, requests.get(i));
                    requests.set(i, temp);
                    System.out.printf(
                            " * RequestQueue: \"%s\" was marked as priority and moved from %d to %d position.\n",
                            temp, j, i);
                }
                break;
            }

        }
    }

}

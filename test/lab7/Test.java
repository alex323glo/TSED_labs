package lab7;

import com.lab111.labwork7.*;

/**
 * Created by alex323glo on 15.11.17.
 */
public class Test {

    private static RequestQueue requestQueue = new RequestQueue();

    private static RequestsFilter filter =
            new RequestsFilter(requestQueue, "head");

    private static RequestsPriorityChanger priorityChanger =
            new RequestsPriorityChanger(requestQueue, "get");

    public static void main(String[] args) {
        setupQueue();
        status();

        RequestController requestController = new RequestController(filter, priorityChanger);

        requestController.filterRequests();
        status();

        requestController.changeRequestsPriority();
        status();
    }

    private static void setupQueue() {
        requestQueue.add(new Request("get", "?id=1"));
        requestQueue.add(new Request("get", "?id=2"));
        requestQueue.add(new Request("head", "?id=11"));
        requestQueue.add(new Request("head", "?id=12"));
        requestQueue.add(new Request("post", "?id=23&value=hello"));
        requestQueue.add(new Request("post", "?id=24&value=world"));
        requestQueue.add(new Request("delete", "?id=35"));
        requestQueue.add(new Request("delete", "?id=36"));
    }

    private static void status() {
        System.out.println("\n_________ Requests queue _____________");
        requestQueue.getAll().forEach(System.out::println);
        System.out.println("--------------------------------------\n");
    }

}

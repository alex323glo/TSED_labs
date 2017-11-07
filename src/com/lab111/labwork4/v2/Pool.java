package com.lab111.labwork4.v2;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by alex323glo on 02.11.17.
 */
public class Pool {

    public static Map<String, Dot> dotMap;

    static {
        dotMap = new HashMap<>();
    }

    public static Dot getDot(String colorRGB) {
        Dot resDot = dotMap.get(colorRGB);

        if (resDot == null) {
            String[] parts = colorRGB.split("\\.");
            resDot = new Dot(new Color(
                    Integer.parseInt(parts[0]),
                    Integer.parseInt(parts[1]),
                    Integer.parseInt(parts[2])
            ));
            dotMap.put(colorRGB, resDot);

            System.out.println("(created new Dot: + " + resDot.getColor() + ")");
        } else {
            System.out.println("(used existing Dot: ) + " + resDot.getColor());
        }

        return resDot;
    }

}

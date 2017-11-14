package com.lab111.labwork4;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Pool of "heavy" Dots (inner state of flyweight Dots).
 * Gives an existing required Dot or creates new and adds to Dot Map.
 * Based on Singleton.
 * @author alex323glo
 * @version 1.0.0
 * @see Dot
 * @see Map
 * */
public class DotPool {

    private static DotPool singleton;

    private static Map<String, Dot> dotMap;

    /**
     * Private constructor. Assigns dotMap Map.
     * */
    private DotPool() {
        dotMap = new HashMap<>();
    }

    /**
     * Gives either existing Dot or new one.
     * @param rgbColor identifier of requested dot. Used
     *                 to create new Dot if dotMap doesn't
     *                 contain any.
     * @return ref to needed Dot (Dot object stored inn dotMap).
     * @see Dot
     * */
    public Dot getDot(String rgbColor) {
        if (dotMap.containsKey(rgbColor)) {
            return dotMap.get(rgbColor);
        }

        String[] rgbParts = rgbColor.split(";");
        Dot newDot = new Dot(new Color(
                Integer.valueOf(rgbParts[0]),
                Integer.valueOf(rgbParts[1]),
                Integer.valueOf(rgbParts[2]))
        );
        dotMap.put(rgbColor, newDot);
        System.out.println("(created new dot \"" + rgbColor + "\")");
        return newDot;
    }

    /**
     * Gives ref to singleton object.
     * @return ref to singleton DotPool object.
     * @see DotPool#singleton
     * */
    public static DotPool getInstance() {
        if (singleton == null) {
            singleton = new DotPool();
        }

        return singleton;
    }

}

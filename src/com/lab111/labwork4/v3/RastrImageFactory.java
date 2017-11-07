package com.lab111.labwork4.v3;

import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by alex323glo on 02.11.17.
 */
public class RastrImageFactory {
    private static Map<String, Color> colorMap;

    static {
        colorMap = new HashMap<>();
    }

    public static RectImage createRectImage(Dot... dots) {
        return new RectImage(Arrays.asList(dots));
    }

    public static Dot createDot(int x, int y, String colorRGB) {
        Color color = colorMap.get(colorRGB);

        if (color == null) {
            String[] parts = colorRGB.split("\\.");
            color = new Color(
                    Integer.parseInt(parts[0]),
                    Integer.parseInt(parts[1]),
                    Integer.parseInt(parts[2])
            );
            colorMap.put(colorRGB, color);

            System.out.println("(created new Color: ) + " + color.toString());
        } else {
            System.out.println("(used existing Color: ) + " + color.toString());
        }

        return new Dot(x, y, color);
    }
}

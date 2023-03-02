package com.devdev.testmod;

import arc.graphics.Color;
import mindustry.type.Item;

public class Items
{
    public static Item cobalt;

    public static void load()
    {
        cobalt = new Item("cobalt", Color.valueOf("4c4379"))
        {{
            hardness = 2;
        }};
    }
}

package com.devdev.testmod;

import mindustry.world.Block;
import mindustry.world.blocks.environment.OreBlock;

public class Blocks
{
    public static Block cobaltOre;

    public static void load()
    {
        cobaltOre = new OreBlock("ore-cobalt", Items.cobalt)
        {{
            oreDefault = true;
            oreThreshold = 0.8f;
            oreScale = 30f;
        }};
    }
}

package com.devdev.testmod;

import arc.*;
import arc.util.*;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class Main extends Mod
{
    public Main()
    {
        Log.info("Loaded ExampleJavaMod constructor.");

        Events.on(TapEvent.class, e ->
        {
            Gson gson = new Gson();
            String tileName =  (e.tile.block().name + e.tile.floor().name + e.tile.overlay().name).replace("air", "");
            Data data = new Data(e.player.name, tileName);
            Log.infoTag("[gold]Test Mod", gson.toJson(data));
        });
    }

    @Override
    public void loadContent()
    {
        Log.info("Loading some example content.");
    }


    public class Data
    {
        @SerializedName(value = "PlayerName")
        private String playerName;
        @SerializedName(value = "TileName")
        private String tileName;

        public Data(String playerName, String tileName)
        {
            this.playerName = playerName;
            this.tileName = tileName;
        }
    }
}

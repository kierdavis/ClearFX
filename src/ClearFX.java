package com.kierdavis.clearfx;

import org.bukkit.plugin.java.JavaPlugin;

public class ClearFX extends JavaPlugin {
    public void onEnable() {
        getCommand("clearfx").setExecutor(new ClearFXCommandExecutor(this));
    }
}

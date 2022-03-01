package me.dodo.pvpevent;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public final class PvPEvent extends JavaPlugin {
    private PvPEvent instance;

    @Override
    public void onEnable() {
        instance = this;

        
    }

    @Override
    public void onDisable() {
        // Give players inventories if event is working
        // Eliminate player if the leave on event
    }

    public PvPEvent getInstance() {
        return instance;
    }
}

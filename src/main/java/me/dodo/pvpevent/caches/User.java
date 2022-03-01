package me.dodo.pvpevent.caches;

import org.bukkit.inventory.Inventory;

import java.util.UUID;

public class User {
    private UUID uuid;
    private Inventory inventory;
    private boolean death;

    User(UUID uuid, Inventory inventory, boolean death) {
        this.uuid = uuid;
        this.inventory = inventory;
        this.death = death;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public void setDeath(boolean death) {
        this.death = death;
    }

    public UUID getUuid() {
        return uuid;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public boolean isDeath() {
        return death;
    }
}

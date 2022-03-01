package me.dodo.pvpevent.caches;

import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class Event {
    private List<User> Users;

    public Event() {
        Users = new ArrayList<>();
    }

    public List<User> getUsers() {
        return Users;
    }

    public void addUser(Player player) {
        User user = new User(player.getUniqueId(), player.getInventory(), false);
        Users.add(user);
    }

    public void setUsers(List<User> users) {
        Users = users;
    }
}

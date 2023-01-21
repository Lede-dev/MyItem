package me.lede.myitem;

import org.bukkit.entity.Item;

public interface MyItem {

    Item getBukkitItem();

    int getMaxProtectionTicks();

    int getCurrentProtectionTicks();

    void setMaxProtectionTicks(int ticks);

    void setCurrentProtectionTicks(int ticks);

    boolean isProtected();

}

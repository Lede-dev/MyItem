package me.lede.myitem;

import org.bukkit.Bukkit;

public class MyItemScheduler {

    private static int task = -1;

    public static void start() {
        if (task != -1) {
            stop();
        }

        task = Bukkit.getScheduler().scheduleSyncRepeatingTask(MyItemPlugin.getPlugin(), () -> {

        }, 0, 5);
    }

    public static void stop() {
        Bukkit.getScheduler().cancelTask(task);
        task = -1;
    }

}

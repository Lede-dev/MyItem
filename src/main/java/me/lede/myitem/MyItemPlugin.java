package me.lede.myitem;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandMap;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class MyItemPlugin extends JavaPlugin {

    private static MyItemPlugin plugin;

    public static MyItemPlugin getPlugin() {
        return plugin;
    }

    @Override
    public void onEnable() {
        plugin = this;

        saveDefaultConfig();


        Bukkit.getPluginManager().registerEvents(new MyItemListener(), this);
        getCommandMap().register("myitem", new MyItemCommand());

        MyItemScheduler.start();
    }

    @Override
    public void onDisable() {
        MyItemScheduler.stop();
    }

    private CommandMap getCommandMap() {
        //TODO: 커맨드맵 가져오기
        return null;
    }

}

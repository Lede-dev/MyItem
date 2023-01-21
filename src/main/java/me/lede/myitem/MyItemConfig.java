package me.lede.myitem;

import org.bukkit.configuration.file.FileConfiguration;

public class MyItemConfig {

    private int schedulerPeriodTicks;
    private boolean enableDropHolo;
    private boolean protectDropItem;
    private boolean protectSpawnItem;

    private String timeFormat;
    private String protectionHoloFormat;
    private String nonProtectionHoloFormat;

    private static MyItemConfig config;

    public static MyItemConfig getConfig() {
        if (config == null) {
            config = new MyItemConfig();
        }
        return config;
    }

    private MyItemConfig() {}

    public void reloadConfig() {
        final MyItemPlugin plugin = MyItemPlugin.getPlugin();

        plugin.saveDefaultConfig();
        final FileConfiguration config = plugin.getConfig();

        this.schedulerPeriodTicks = config.getInt("");
        this.enableDropHolo = config.getBoolean("");
        this.protectDropItem = config.getBoolean("");
        this.protectSpawnItem = config.getBoolean("");

        this.timeFormat = config.getString("");
        this.protectionHoloFormat = config.getString("");
        this.nonProtectionHoloFormat = config.getString("");
    }

    public int getSchedulerPeriodTicks() {
        return schedulerPeriodTicks;
    }

    public boolean isDropHoloEnabled() {
        return enableDropHolo;
    }

    public boolean isDropItemProtected() {
        return protectDropItem;
    }

    public boolean isSpawnItemProtected() {
        return protectSpawnItem;
    }

    public String getTimeFormat() {
        return timeFormat;
    }

    public String getProtectionHoloFormat() {
        return protectionHoloFormat;
    }

    public String getNonProtectionHoloFormat() {
        return nonProtectionHoloFormat;
    }
}

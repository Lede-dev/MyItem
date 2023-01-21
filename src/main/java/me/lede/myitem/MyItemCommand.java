package me.lede.myitem;

import com.google.common.collect.Lists;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MyItemCommand extends BukkitCommand {

    public MyItemCommand() {
        super("myitem", "MyItem Command", "/myitem", Lists.newArrayList("mi"));
        setPermission("myitem.command.use");
    }

    @Override
    public boolean execute(@NotNull CommandSender sender, @NotNull String commandLabel, @NotNull String[] args) {
        if (!sender.hasPermission("myitem.command.use")) {
            return false;
        }

        final int len = args.length;
        if (len == 0) {
            sender.sendMessage("/myitem reload");
            return false;
        }

        final String key = args[0];
        if (key.equalsIgnoreCase("reload")) {
            MyItemPlugin.getPlugin().reloadConfig();
            sender.sendMessage("MyItem config reloaded.");
            return false;
        }

        return false;
    }

    @NotNull
    @Override
    public List<String> tabComplete(@NotNull CommandSender sender, @NotNull String alias, @NotNull String[] args) throws IllegalArgumentException {
        final int len = args.length;
        if (len == 1) {
            return Lists.newArrayList("reload");
        }
        return Lists.newArrayList();
    }

}

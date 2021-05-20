package de.kawamo.instanttnt;
/**
 * @author Florian Dohms
 * <p>
 * Copyright (c) 2017 - 2021 by KamiKazozi to present. All rights served.
 */

import de.kawamo.instanttnt.listeners.BlockPlaceListener;
import de.kawamo.instanttnt.listeners.EntityExplodeListener;
import de.kawamo.instanttnt.manager.Timer;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class InstantTnT extends JavaPlugin {

    public static InstantTnT Instance;

    private Timer timer = new Timer();

    @Override
    public void onEnable() {
        Instance = this;
        registerListener();
        registerCommands();

        timer.setFirstTimer();
    }

    public void registerListener() {
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new BlockPlaceListener(), this);
        pluginManager.registerEvents(new EntityExplodeListener(), this);
    }

    public void registerCommands() {

    }

    public static InstantTnT getInstance() {
        return Instance;
    }

    public Timer getTimer() {
        return timer;
    }
}
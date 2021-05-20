package de.kawamo.instanttnt.manager;

import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

/**
 * @author Florian Dohms
 * <p>
 * Copyright (c) 2017 - 2021 by KamiKazozi to present. All rights served.
 */
public class Timer {

    File file = new File("plugins/InstantTnT", "explodingTimer.yml");
    YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);

    public void setFirstTimer() {
        if(!file.exists()) {
            file.mkdir();
            cfg.set("timeToExplode", 4);
            saveFile();
        }
    }

    public void setTimer(Integer time) {
        cfg.set("timeToExplode", time);
        saveFile();
    }

    public Integer getTime() {
        return cfg.getInt("timeToExplode");
    }

    private void saveFile() {
        try {
            cfg.save(file);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}

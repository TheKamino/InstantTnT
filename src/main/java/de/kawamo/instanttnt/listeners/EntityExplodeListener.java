package de.kawamo.instanttnt.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

/**
 * @author Florian Dohms
 * <p>
 * Copyright (c) 2017 - 2021 by KamiKazozi to present. All rights served.
 */
public class EntityExplodeListener implements Listener {

    @EventHandler
    public void onEntityExplode(EntityExplodeEvent event) {
        event.blockList().clear();
    }
}

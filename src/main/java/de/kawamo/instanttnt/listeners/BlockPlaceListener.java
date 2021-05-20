package de.kawamo.instanttnt.listeners;

import de.kawamo.instanttnt.InstantTnT;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

/**
 * @author Florian Dohms
 * <p>
 * Copyright (c) 2017 - 2021 by KamiKazozi to present. All rights served.
 */
public class BlockPlaceListener implements Listener {

    @EventHandler
    public void onBlockBreak(BlockPlaceEvent event) {
        Player player = event.getPlayer();
○
        Block block = event.getBlock();
        if(block.getType() == Material.TNT) {
            block.setType(Material.AIR);
            TNTPrimed explodingTnT = (TNTPrimed)block.getWorld().spawn(block.getLocation(), TNTPrimed.class);
            explodingTnT.setFuseTicks(InstantTnT.getInstance().getTimer().getTime() * 10);
        }
    }
}

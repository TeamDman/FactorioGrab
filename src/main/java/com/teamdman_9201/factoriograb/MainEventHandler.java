package com.teamdman_9201.factoriograb;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.*;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import java.awt.*;

/**
 * Created by s401321 on 07/12/2015.
 */
public class MainEventHandler {
    @SubscribeEvent
    public void onRightClick(PlayerInteractEvent event) {
        if (!event.world.isRemote && event.action == PlayerInteractEvent.Action.RIGHT_CLICK_BLOCK && event.entityPlayer.isSneaking()) {
            Block block = event.world.getBlock(event.x, event.y, event.z);
                TileEntity tile = event.world.getTileEntity(event.x, event.y, event.z);
                ItemStack toMove = event.entityPlayer.getCurrentEquippedItem();
                if (tile instanceof IInventory&&toMove!=null) {
                for (int i = 0; i < ((IInventory) tile).getSizeInventory(); i++) {
                    ItemStack there = ((IInventory) tile).getStackInSlot(i);
                    ((IInventory) tile).setInventorySlotContents(i,there);
                }
                if (toMove.stackSize > 0) {
                    event.setCanceled(true);
                    event.entityPlayer.addChatMessage(new ChatComponentText("There is no more room in this inventory!"));
                }
            }
            if (block instanceof BlockContainer) {
                BlockContainer container = (BlockContainer) block;
            }
        }
    }
}

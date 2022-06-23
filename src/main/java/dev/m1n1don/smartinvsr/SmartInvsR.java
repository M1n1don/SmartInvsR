package dev.m1n1don.smartinvsr;

import dev.m1n1don.smartinvsr.inventory.InventoryManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class SmartInvsR extends JavaPlugin
{
    private static SmartInvsR plugin;

    private InventoryManager invManager;

    @Override
    public void onEnable()
    {
        plugin = this;

        invManager = new InventoryManager(this);
        invManager.init();
    }

    public static SmartInvsR getPlugin()
    {
        return plugin;
    }

    public InventoryManager getInvManager()
    {
        return invManager;
    }
}

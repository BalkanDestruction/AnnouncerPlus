package balkandestruction.announcerplus;

import org.bukkit.plugin.java.JavaPlugin;

public class AnnouncerPlus extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("AnnouncerPlus is starting...");
    }

    @Override
    public void onDisable() {
        getLogger().info("AnnouncerPlus is shutting down...");
    }
}

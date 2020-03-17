package me.vann.minecraft.noplayercollision;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author VeeAyeInIn
 */
public final class NoPlayerCollision
        extends JavaPlugin /* Defines it as a plugin */
        implements Listener /* Lets it 'listen' to events, and collect data */ {

    /**
     * Runs when the server is starting up.
     */
    @Override
    public void onEnable() {

        // this - means using THIS class
        // getServer() - the server running the plugin
        // getPluginManager() - how the server manages the plugins, and how you can as well
        // registerEvents(this, this) - Registers the listener (this) under the plugin (this)

        this.getServer().getPluginManager().registerEvents(this /* Listener */, this /* Plugin */);
    }

    /* Useless right now, as nothing happens when the server is shutdown.
     *
     * @Override
     * public void onDisable() {
     *
     * }
     */

    /**
     * Runs when a player joins the server.
     *
     * @param e the event and data concerning the player joining the server
     */
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {

        /*
         * This is relatively self-explanatory, from the join event 'e,' we get access to the player who joined. From
         * that, we can edit data regarding the player, and can disable collisions. This does not check if a player has
         * collisions disabled already, however it is simpler to change the value instead of checking the value then
         * setting the value, when it all ends the same.
         */

        e.getPlayer().setCollidable(false /* Collidable */);
    }
}

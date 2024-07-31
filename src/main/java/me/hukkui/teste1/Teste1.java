package me.hukkui.teste1;

import me.hukkui.teste1.ParrotCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class Teste1 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Register the command
        this.getCommand("parrot").setExecutor(new ParrotCommand(this));

        // Register the event listener
        getServer().getPluginManager().registerEvents(new ParrotListener(this), this);

        getLogger().info("Plugin carregado com sucesso!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin desabilitado com sucesso!");
    }
}

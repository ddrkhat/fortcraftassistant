package DDRKhat.fortcraftassistant;

import org.bukkit.plugin.java.JavaPlugin;


public class FCmain extends JavaPlugin
	{
	private FCcmdexe FCcmdexe;
	@Override
	public void onEnable()
	{
		// Command stuff!
		FCcmdexe = new FCcmdexe(this);
		getCommand("join").setExecutor(FCcmdexe);
		
		//Chat stuff!
		getServer().getPluginManager().registerEvents(new FCchat(), this);
		
		// We activated!
		getLogger().info("Fortcraft Assistant enabled!");
	}
	 
	public void onDisable()
	{ 
		getLogger().info("Fortcraft Assistant disabled!");
	}
}
package DDRKhat.fortcraftassistant;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

public class FCchat implements Listener
{
	@EventHandler(priority = EventPriority.NORMAL)
	public void onPlayerChat (PlayerChatEvent event)
	{
		String OurGuy = ChatColor.AQUA+event.getPlayer().getName();
		event.getPlayer().sendMessage("<"+OurGuy+"> "+event.getMessage());
		/*
		if(event.getMessage().equalsIgnoreCase("brb"))
		{
			event.getPlayer().sendMessage(ChatColor.AQUA + " You went auto AFK!");
			//event.getPlayer().performCommand("afk");
		}
		*/
	}
}
package DDRKhat.fortcraftassistant;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FCcmdexe implements CommandExecutor
{
	@SuppressWarnings("unused")
	private FCmain plugin;
	
	public FCcmdexe(FCmain plugin)
	{
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		@SuppressWarnings("unused")
		Player player = null;
		if (sender instanceof Player) player = (Player) sender;
		else return false;
	 
		if (cmd.getName().equalsIgnoreCase("join"))
		{
			sender.sendMessage("You tried to join " + args[0] + " team.");
			return true;
		}
		return false;
	}

}

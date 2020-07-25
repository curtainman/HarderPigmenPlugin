package curtain.harderpigmen;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class HarderPigmen extends JavaPlugin
{

	@Override
	public void onEnable()
	{
		Bukkit.getPluginManager().registerEvents(new PigmenListener(), this);
	}
}

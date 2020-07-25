package curtain.harderpigmen;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.PigZombie;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class PigmenListener implements Listener
{

	//TODO- make the pigmans be really fast uwu owo
	
	
	@EventHandler
	public void pigmanSpawn(EntitySpawnEvent event)
	{
		if(event.getEntity().getType().equals(EntityType.ZOMBIFIED_PIGLIN))
		{
			Entity entity = event.getEntity();
			PigZombie thing = (PigZombie) entity;
			thing.setAngry(true);
			thing.setAnger(100);
			for(Entity entities : thing.getNearbyEntities(100, 100, 100))
			{
				if(entities.getType().equals(EntityType.PLAYER))
				{
					thing.setTarget((LivingEntity) entities);
				}
			}
		//	Bukkit.broadcastMessage("target " + thing.getTarget().getType());
		}
	}
	
	//tee hee
	//if anyone can find a better way to do this lmk this is on a small server anyway nbd
	@EventHandler
	public void onMove(PlayerMoveEvent event)
	{
		Player player = event.getPlayer();
		for(Entity entities : player.getNearbyEntities(100, 100, 100))
		{
			if(entities.getType().equals(EntityType.ZOMBIFIED_PIGLIN))
			{
				PigZombie thing = (PigZombie) entities;
				thing.setAngry(true);
				thing.setAnger(100);
				thing.setTarget(player);
			}
		}
	}
	
}

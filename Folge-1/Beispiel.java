package de.name.projektname;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class DeinProjektName extends JavaPlugin implements Listener
{
	
	public void onEnable()
	{
		
		System.out.println("Das Plugin ProjektName wurde geladen!");
		
	}
	
	public void onDisable()
	{
		
		System.out.println("Das Plugin ProjektName wurde entladen!");
		
	}

}

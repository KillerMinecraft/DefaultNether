package com.ftwinston.KillerMinecraft.Modules.DefaultNether;

import org.bukkit.Material;
import org.bukkit.World.Environment;

import com.ftwinston.KillerMinecraft.WorldGenerator;
import com.ftwinston.KillerMinecraft.WorldGeneratorPlugin;

public class Plugin extends WorldGeneratorPlugin
{
	@Override
	public Environment getWorldType() { return Environment.NETHER; }
	
	@Override
	public String[] getDescriptionText() { return new String[] {"Using the default nether generator"}; }
	
	@Override
	public Material getMenuIcon() { return Material.NETHERRACK; }
	
	@Override
	public WorldGenerator createInstance()
	{
		return new DefaultNether();
	}
}
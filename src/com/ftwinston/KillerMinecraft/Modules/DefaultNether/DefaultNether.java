package com.ftwinston.KillerMinecraft.Modules.DefaultNether;

import com.ftwinston.KillerMinecraft.Option;
import com.ftwinston.KillerMinecraft.WorldConfig;
import com.ftwinston.KillerMinecraft.WorldGenerator;

public class DefaultNether extends WorldGenerator
{
	@Override
	public Option[] setupOptions()
	{
		return new Option[] { };
	}
	
	@Override
	public void setupWorld(WorldConfig world, Runnable runWhenDone)
	{
		createWorld(world, runWhenDone);
	}
}

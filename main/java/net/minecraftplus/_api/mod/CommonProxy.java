package net.minecraftplus._api.mod;

import java.util.Map;

import net.minecraftplus._api.Proxy;
import net.minecraftplus._api.tool.DevTool;

public class CommonProxy extends Proxy
{
	@Override
	public void register()
	{
		MCP.TILES().initialize(false);

		MCP.FUELS().initialize(false);
		MCP.SMELTS().initialize(false);
	}

	@Override
	public void Items() {
		MCP.ITEMS().initialize(false);
		
	}

	@Override
	public boolean getSide() {
		// TODO Auto-generated method stub
		return false;
	}
}

package net.minecraftplus._api.mod;

import java.util.Map;

import net.minecraftplus._api.tool.DevTool;

public class ClientProxy extends CommonProxy
{
	@Override
	public void register()
	{
		super.register();

		MCP.RENDERS().initialize(true);
		MCP.ICONS().initialize(true);
	}

	@Override
	public void devTool(String string, String modid, Map<String, Object> map) {
		DevTool.createModInfo("mcp_" + modid,map);
		
	}
	
	@Override
	public void Items() {
		MCP.ITEMS().initialize(true);
		
	}
	@Override
	public boolean getSide() {
		// TODO Auto-generated method stub
		return true;
	}
}

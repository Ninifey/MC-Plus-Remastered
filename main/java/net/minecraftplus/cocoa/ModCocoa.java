package net.minecraftplus.cocoa;

import net.minecraft.item.Item;
import net.minecraftplus._api.Proxy;
import net.minecraftplus._api.mod.MCP;
import net.minecraftplus._common.ItemFoodstuff;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MCP.MCPID + ModCocoa.MODID, version = ModCocoa.VERSION, dependencies = "required-after:" + MCP.MODID)
public class ModCocoa extends MCP
{
	public static final String MODID = "cocoa";
	public static final String VERSION = "1.3.1";

	@Instance(MCP.MCPID + MODID)
	public static ModCocoa INSTANCE;

	@SidedProxy(clientSide = MCP.MCPDIR + "." + MODID + "." + MCP.CLIENTPROXY, serverSide = MCP.MCPDIR + "." + MODID + "." + MCP.COMMONPROXY)
	public static Proxy proxy;

	public static final Item cocoaBar = new ItemFoodstuff(4, 0.2F).setUnlocalizedName("cocoa_bar");
	public static final Item cocoaPie = new ItemFoodstuff(7, 0.5F).setUnlocalizedName("cocoa_pie");

	public ModCocoa()
	{
		super(MODID, VERSION);
	}

	@EventHandler
	@Override
	public void PreInitialize(FMLPreInitializationEvent parEvent)
	{
		super.PreInitialize(parEvent);

		MCP.ITEMS().add(cocoaBar).setOreDict("foodCocoa");
		MCP.ITEMS().add(cocoaPie).setOreDict("pieCocoa");

		proxy.Items();

		proxy.register();
	}

	@EventHandler
	@Override
	public void Initialize(FMLInitializationEvent parEvent)
	{
		super.Initialize(parEvent);
	}

	@EventHandler
	@Override
	public void PostInitialize(FMLPostInitializationEvent parEvent)
	{
		super.PostInitialize(parEvent);
	}
}

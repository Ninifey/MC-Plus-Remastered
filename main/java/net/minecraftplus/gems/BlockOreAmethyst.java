package net.minecraftplus.gems;

import java.util.Random;

import net.minecraft.item.Item;

public class BlockOreAmethyst extends BlockOreGem
{
	@Override
	public Item getItemDropped(int par1, Random par2Random, int par3)
	{
		return ModGems.amethyst;
	}
}

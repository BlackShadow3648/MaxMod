package blackshadow3648.maxmod.objects.blocks;

import java.util.Random;

import blackshadow3648.maxmod.Main;
import blackshadow3648.maxmod.init.BlockInit;
import blackshadow3648.maxmod.init.ItemInit;
import blackshadow3648.maxmod.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {
	
	public BlockBase(String name, Material material) {
		
		super(material);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.maxModBlocks);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
	}
	
	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}

//	public int quantityDropped(int meta, int fortune, Random rand) {
//		
//		return 1 + rand.nextInt(fortune);
//		
//	}

}

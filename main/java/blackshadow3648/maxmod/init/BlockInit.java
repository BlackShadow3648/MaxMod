package blackshadow3648.maxmod.init;

import java.util.ArrayList;
import java.util.List;

import blackshadow3648.maxmod.objects.blocks.BlockBase;
import blackshadow3648.maxmod.objects.blocks.RubyOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block RUBY_BLOCK = new BlockBase("ruby_block", Material.IRON);
	public static final Block RUBY_ORE = new RubyOre("ruby_ore", Material.ROCK);

}

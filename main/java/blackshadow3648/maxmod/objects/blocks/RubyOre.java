package blackshadow3648.maxmod.objects.blocks;

import java.util.Random;

import blackshadow3648.maxmod.init.ItemInit;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RubyOre extends BlockBase {

	public RubyOre(String name, Material material) {
		
		super(name, material);
		
		setHarvestLevel("pickaxe", 2);
		setHardness(3);
		setResistance(15);
		
	}

	public int quantityDropped(IBlockState state, int fortune, Random random) {

		// return super.quantityDropped(state, fortune, random);
		
		return 1 + random.nextInt(fortune < 1 ? 1 : fortune);
		
	}

	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		
		return ItemInit.RUBY;
		
	}

	// public void dropXpOnBlockBreak(World worldIn, BlockPos pos, int amount) {
		
		// super.dropXpOnBlockBreak(worldIn, pos, amount);
		
	// }

}

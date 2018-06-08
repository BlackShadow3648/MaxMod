package blackshadow3648.maxmod.objects.tools;

import blackshadow3648.maxmod.Main;
import blackshadow3648.maxmod.init.ItemInit;
import blackshadow3648.maxmod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IHasModel {
	
	public ToolAxe(String name, ToolMaterial material) {
		
		super(material, 6.0F, -3.2F);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.maxModTools);
		
		ItemInit.ITEMS.add(this);
		
	}

	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
		
}

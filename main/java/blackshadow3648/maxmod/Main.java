package blackshadow3648.maxmod;

import blackshadow3648.maxmod.init.BlockInit;
import blackshadow3648.maxmod.init.ItemInit;
import blackshadow3648.maxmod.proxy.CommonProxy;
import blackshadow3648.maxmod.util.Reference;
import blackshadow3648.maxmod.util.handlers.RegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		RegistryHandler.otherRegistries();
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	public static CreativeTabs maxModItems = new CreativeTabs("max_mod_items") {
		
		@Override
		public ItemStack getTabIconItem() {
			
			return new ItemStack(ItemInit.RUBY);
			
		}
		
	};
	
	public static CreativeTabs maxModBlocks = new CreativeTabs("max_mod_blocks") {
		
		@Override
		public ItemStack getTabIconItem() {
			
			return new ItemStack(BlockInit.RUBY_BLOCK);
			
		}
		
	};
	
	public static CreativeTabs maxModTools = new CreativeTabs("max_mod_tools") {
		
		@Override
		public ItemStack getTabIconItem() {
			
			return new ItemStack(ItemInit.RUBY_AXE);
			
		}
		
	};
	
	public static CreativeTabs maxModCombat = new CreativeTabs("max_mod_combat") {
		
		@Override
		public ItemStack getTabIconItem() {
			
			return new ItemStack(ItemInit.RUBY_SWORD);
			
		}
		
	};

}

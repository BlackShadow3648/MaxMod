package blackshadow3648.maxmod.init;

import java.util.ArrayList;
import java.util.List;

import blackshadow3648.maxmod.objects.armour.ArmourBase;
import blackshadow3648.maxmod.objects.items.ItemBase;
import blackshadow3648.maxmod.objects.tools.ToolAxe;
import blackshadow3648.maxmod.objects.tools.ToolHoe;
import blackshadow3648.maxmod.objects.tools.ToolPickaxe;
import blackshadow3648.maxmod.objects.tools.ToolShovel;
import blackshadow3648.maxmod.objects.tools.ToolSword;
import blackshadow3648.maxmod.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	// Materials
	
	public static final ToolMaterial RUBY_TOOL = EnumHelper.addToolMaterial("ruby_tool", 3, 905, 7.0F, 3.0F, 12);
	public static final ArmorMaterial RUBY_ARMOUR = EnumHelper.addArmorMaterial("ruby_armour",Reference.MODID + ":ruby" , 20, new int[]{3, 5, 7, 3}, 9, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
	
	// Items
	
	public static final Item RUBY = new ItemBase("ruby");
	
	// Tools
	
	public static final Item RUBY_AXE = new ToolAxe("ruby_axe", RUBY_TOOL);
	public static final Item RUBY_HOE = new ToolHoe("ruby_hoe", RUBY_TOOL);
	public static final Item RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", RUBY_TOOL);
	public static final Item RUBY_SHOVEL = new ToolShovel("ruby_shovel", RUBY_TOOL);
	public static final Item RUBY_SWORD = new ToolSword("ruby_sword", RUBY_TOOL);
	
	// Armour
	
	public static final Item RUBY_HELMET = new ArmourBase("ruby_helmet", RUBY_ARMOUR, 1, EntityEquipmentSlot.HEAD);
	public static final Item RUBY_CHESTPLATE = new ArmourBase("ruby_chestplate", RUBY_ARMOUR, 1, EntityEquipmentSlot.CHEST);
	public static final Item RUBY_LEGGINGS = new ArmourBase("ruby_leggings", RUBY_ARMOUR, 2, EntityEquipmentSlot.LEGS);
	public static final Item RUBY_BOOTS = new ArmourBase("ruby_boots", RUBY_ARMOUR, 1, EntityEquipmentSlot.FEET);

}

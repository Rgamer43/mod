package net.mcreator.creation_mod;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@Elementscreation_mod.ModElement.Tag
public class MCreatorMortarandPestleT1V2 extends Elementscreation_mod.ModElement {
	@ObjectHolder("creation_mod:mortarandpestlet1v2")
	public static final Item block = null;

	public MCreatorMortarandPestleT1V2(Elementscreation_mod instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).containerItem(block).maxStackSize(64));
			setRegistryName("mortarandpestlet1v2");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}

package mildlywarm.smallnether.items;

import mildlywarm.smallnether.Main;
import mildlywarm.smallnether.init.ModItems;
import mildlywarm.smallnether.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
    public ItemBase (String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        // Add Items to Item list.
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModles()
    {
        Main.proxy.registerItemRenderer(this, 0, "inventory");

    }
}

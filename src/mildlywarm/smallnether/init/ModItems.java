package mildlywarm.smallnether.init;

import mildlywarm.smallnether.items.ItemBase;
import net.minecraft.item.Item;

import java.util.List;
import java.util.ArrayList;

public class ModItems
{
    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item NETHER_BASE = new ItemBase("nether_base");
    public static final Item TINY_NETHER_PORTAL = new ItemBase("tiny_nether_portal");

}

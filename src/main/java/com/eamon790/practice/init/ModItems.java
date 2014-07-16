package com.eamon790.practice.init;

import com.eamon790.practice.item.*;
import com.eamon790.practice.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Eamon on 7/16/2014.
 */
public class ModItems {
    public static final ItemPractice ItemMapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(ItemMapleLeaf, ItemMapleLeaf.getUnlocalizedName());
    }

}

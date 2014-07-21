package com.eamon790.practice.creativetab;

import com.eamon790.practice.init.ModItems;
import com.eamon790.practice.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabPractice
{
    public static final CreativeTabs PRACTICE_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() {return ModItems.ItemMapleLeaf;}
    };
}

package com.eamon790.practice.init;

import com.eamon790.practice.block.BlockFlag;
import com.eamon790.practice.block.BlockPractice;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Eamon on 7/17/2014.
 */
public class ModBlocks
{
    public static final BlockPractice blockFlag = new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(blockFlag, blockFlag.getUnlocalizedName());
    }
}

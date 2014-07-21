package com.eamon790.practice.util;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class NBTHelper
{
    public static boolean hasTag(ItemStack itemStack, String keyName)
    {
        return itemStack != null && itemStack.stackTagCompound != null && itemStack.stackTagCompound.hasKey(keyName);
    }

    public static void removeTag(ItemStack itemStack, String keyName)
    {
         if(itemStack.stackTagCompound != null)
         {
             itemStack.stackTagCompound.removeTag(keyName);
         }
    }

    private static void initNBTTagCompound(ItemStack itemStack)
    {
        if(itemStack.stackTagCompound == null)
            itemStack.setTagCompound(new NBTTagCompound());
    }

    public static void setLong(ItemStack itemStack, String keyName , long keyValue)
    {
        initNBTTagCompound(itemStack);

        itemStack.stackTagCompound.setLong(keyName, keyValue);
    }

    public static long getLong(ItemStack itemStack, String keyName)
    {
        initNBTTagCompound(itemStack);

        if(!itemStack.stackTagCompound.hasKey(keyName))
        {
            setLong(itemStack,keyName, -1);
            LogHelper.warn("Attempted to read data from NBT with no value, setting value to -1");
        }

        return itemStack.stackTagCompound.getLong(keyName);
    }

    public static void setString(ItemStack itemStack, String keyName, String keyValue)
    {
        initNBTTagCompound(itemStack);

        itemStack.stackTagCompound.setString(keyName, keyValue);
    }


    public static String getString(ItemStack itemStack, String keyName)
    {
        initNBTTagCompound(itemStack);

        if (!itemStack.stackTagCompound.hasKey(keyName))
        {
            setString(itemStack, keyName, "");
            LogHelper.warn("Attempted to read String from NBT with no value, setting value to '' ");
        }

        return itemStack.stackTagCompound.getString(keyName);
    }

    public static void setBoolean(ItemStack itemStack, String keyName, boolean keyValue)
    {
        initNBTTagCompound(itemStack);

        itemStack.stackTagCompound.setBoolean(keyName, keyValue );
    }

    public static Boolean getBoolean(ItemStack itemStack, String keyName)
    {
        initNBTTagCompound(itemStack);
        if (!itemStack.stackTagCompound.hasKey(keyName))
        {
            setBoolean(itemStack, keyName, false);
            LogHelper.warn("Attempted to read boolean from NBT with no value, setting value to false");
        }

        return itemStack.stackTagCompound.getBoolean(keyName);
    }

    public static void setByte(ItemStack itemStack, String keyName, byte keyValue)
    {
        initNBTTagCompound(itemStack);

        itemStack.stackTagCompound.setByte(keyName, keyValue );
    }

    public static Byte getByte(ItemStack itemStack, String keyName)
    {
        initNBTTagCompound(itemStack);

        if (!itemStack.stackTagCompound.hasKey(keyName))
        {
            setByte(itemStack, keyName, (byte)-1);
            LogHelper.warn("Attempted to read byte from NBT with no value, setting value to -1");
        }

        return itemStack.stackTagCompound.getByte(keyName);
    }

    public static void setInt(ItemStack itemStack, String keyName, int keyValue)
    {
        initNBTTagCompound(itemStack);

        itemStack.stackTagCompound.setInteger(keyName, keyValue );
    }

    public static int getInt(ItemStack itemStack, String keyName)
    {
        initNBTTagCompound(itemStack);

        if (!itemStack.stackTagCompound.hasKey(keyName))
        {
            setInt(itemStack, keyName, -1);
            LogHelper.warn("Attempted to read integer from NBT with no value, setting value to -1");
        }

        return itemStack.stackTagCompound.getInteger(keyName);
    }

    public static void setShort(ItemStack itemStack, String keyName, short keyValue)
    {
        initNBTTagCompound(itemStack);

        itemStack.stackTagCompound.setShort(keyName, keyValue );
    }

    public static short getShort(ItemStack itemStack, String keyName)
    {
        initNBTTagCompound(itemStack);

        if (!itemStack.stackTagCompound.hasKey(keyName))
        {
            setShort(itemStack, keyName, (short)-1);
            LogHelper.warn("Attempted to read short from NBT with no value, setting value to -1");
        }

        return itemStack.stackTagCompound.getShort(keyName);
    }

    public static void setDouble(ItemStack itemStack, String keyName, double keyValue)
    {
        initNBTTagCompound(itemStack);

        itemStack.stackTagCompound.setDouble(keyName, keyValue );
    }

    public static double getDouble(ItemStack itemStack, String keyName)
    {
        initNBTTagCompound(itemStack);

        if (!itemStack.stackTagCompound.hasKey(keyName))
        {
            setDouble(itemStack, keyName, (double)-1);
            LogHelper.warn("Attempted to read double from NBT with no value, setting value to -1");
        }

        return itemStack.stackTagCompound.getDouble(keyName);
    }

    public static void setFloat(ItemStack itemStack, String keyName, float keyValue)
    {
        initNBTTagCompound(itemStack);

        itemStack.stackTagCompound.setFloat(keyName, keyValue );
    }

    public static Float getFloat(ItemStack itemStack, String keyName)
    {
        initNBTTagCompound(itemStack);

        if (!itemStack.stackTagCompound.hasKey(keyName))
        {
            setFloat(itemStack, keyName, (float)-1);
            LogHelper.warn("Attempted to read Float from NBT with no value, setting value to -1");
        }

        return itemStack.stackTagCompound.getFloat(keyName);
    }
}

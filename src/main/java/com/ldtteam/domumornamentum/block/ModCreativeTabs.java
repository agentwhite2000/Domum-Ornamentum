package com.ldtteam.domumornamentum.block;

import com.ldtteam.domumornamentum.util.Constants;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

/**
 * Class used to handle the creativeTab of structurize.
 */
public final class ModCreativeTabs
{
    public static final CreativeModeTab GENERAL = new CreativeModeTab(Constants.MOD_ID + ".general")
    {
        @Override
        public @NotNull ItemStack makeIcon()
        {
            return new ItemStack(ModBlocks.getArchitectsCutter());
        }

        @Override
        public boolean hasSearchBar()
        {
            return false;
        }
    };

    public static final CreativeModeTab EXTRA_BLOCKS = new CreativeModeTab(Constants.MOD_ID + ".extra-blocks")
    {
        @Override
        public @NotNull ItemStack makeIcon()
        {
            return new ItemStack(ModBlocks.getExtraTopBlocks().get(0));
        }

        @Override
        public boolean hasSearchBar()
        {
            return false;
        }
    };
}

package net.riotzero.enoughrubies.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.riotzero.enoughrubies.EnoughRubies;
import net.riotzero.enoughrubies.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup RUBY_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(EnoughRubies.MOD_ID, "ruby_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.RUBY))
                    .displayName(Text.translatable("itemgroup.enoughrubies.ruby_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);

                        entries.add(ModItems.RUBY_SWORD);
                        entries.add(ModItems.RUBY_PICKAXE);
                        entries.add(ModItems.RUBY_SHOVEL);
                        entries.add(ModItems.RUBY_AXE);
                        entries.add(ModItems.RUBY_HOE);
                    }).build());

    public static final ItemGroup RUBY_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(EnoughRubies.MOD_ID, "ruby_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.RUBY_BLOCK))
                    .displayName(Text.translatable("itemgroup.enoughrubies.ruby_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.RUBY_DEEPSLATE_ORE);
                    }).build());



    public static void registerItemGroups() {
        EnoughRubies.LOGGER.info("Registering Item Groups for " + EnoughRubies.MOD_ID);
    }
}

package net.riotzero.enoughrubies.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.tag.ItemTags;
import net.riotzero.enoughrubies.item.ModItems;
import net.riotzero.enoughrubies.util.ModTags;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(ModItems.RUBY)
                .add(Items.STICK);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.RUBY_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.RUBY_PICKAXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.RUBY_SHOVEL);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.RUBY_AXE);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.RUBY_HOE);
    }
}
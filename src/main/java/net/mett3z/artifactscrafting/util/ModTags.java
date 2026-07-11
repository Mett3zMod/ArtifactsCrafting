package net.mett3z.artifactscrafting.util;

import net.mett3z.artifactscrafting.ArtifactsCrafting;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> FOOD=createTag("food");
        public static final TagKey<Item> FISH=createTag("fish");
        public static final TagKey<Item> GLASS_PANE=createTag("glass_pane");

        private static TagKey<Item> createTag(String name){

            return ItemTags.create(Identifier.fromNamespaceAndPath(ArtifactsCrafting.MOD_ID, name));
        }
    }
}

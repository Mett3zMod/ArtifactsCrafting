package net.mett3z.artifactscrafting.util;

import net.mett3z.artifactscrafting.ArtifactsCrafting;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> FOOD = ofItem("food");
        public static final TagKey<Item> FISH = ofItem("fish");
        public static final TagKey<Item> GLASS_PANE = ofItem("glass_pane");

        private static TagKey<Item> ofItem(String path) {
            return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(ArtifactsCrafting.MOD_ID, path));
        }
    }
}

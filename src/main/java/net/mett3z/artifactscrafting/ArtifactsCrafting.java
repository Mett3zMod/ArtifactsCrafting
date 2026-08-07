package net.mett3z.artifactscrafting;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ArtifactsCrafting.MOD_ID, name = ArtifactsCrafting.NAME, version = ArtifactsCrafting.VERSION,
     dependencies = "required-after:artifacts")
public class ArtifactsCrafting
{
    public static final String MOD_ID = "artifactscrafting";
    public static final String NAME = "Artifacts Crafting";
    public static final String VERSION = "1.0.0-1.12.2";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

    }
}

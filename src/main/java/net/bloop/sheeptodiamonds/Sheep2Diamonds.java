package net.bloop.sheeptodiamonds;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = Sheep2Diamonds.MODID, name = Sheep2Diamonds.NAME, version = Sheep2Diamonds.VERSION)
public class Sheep2Diamonds
{
    public static final String MODID = "sheep2diamonds";
    public static final String NAME = "Sheep 2 Diamonds";
    public static final String VERSION = "1.0";

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(new SheepHit());
    }
}

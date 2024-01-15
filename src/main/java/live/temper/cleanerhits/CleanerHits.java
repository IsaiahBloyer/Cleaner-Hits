package live.temper.cleanerhits;

import net.minecraft.client.particle.EntityEnchantmentTableParticleFX;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityEnchantmentTable;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = CleanerHits.MODID, version = CleanerHits.VERSION)
public class CleanerHits
{
    public static final String MODID = "Cleaner Hits";
    public static final String VERSION = "1.0";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println("Cleaner Hits Loaded!");
        MinecraftForge.EVENT_BUS.register(new CleanerHits());
    }
}

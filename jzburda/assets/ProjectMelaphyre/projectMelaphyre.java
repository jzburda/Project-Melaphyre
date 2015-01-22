package jzburda.ProjectMelaphyre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler; // used in 1.6.2
//import cpw.mods.fml.common.Mod.PreInit;    // used in 1.5.2
//import cpw.mods.fml.common.Mod.Init;       // used in 1.5.2
//import cpw.mods.fml.common.Mod.PostInit;   // used in 1.5.2
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
//import cpw.mods.fml.common.network.NetworkMod; // not used in 1.7
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.common.MinecraftForge;
//import cpw.mods.fml.common.network.NetworkMod; // not used in 1.7
@Mod(modid="projectmelaphyre", name="Project Melaphyre", version="0.0.1")
//@NetworkMod(clientSideRequired=true) // not used in 1.7
public class projectMelaphyre {
	
			public static Block Hotstone= new HotStone(Material.rock);
			

	        // The instance of your mod that Forge uses.
	        @Instance(value = "ProjectMelaphyre")
	        public static projectMelaphyre instance;
	        
	        // Says where the client and server 'proxy' code is loaded.
	        @SidedProxy(clientSide="jzburda.ProjectMelaphyre.client.ClientProxy", serverSide="jzburda.ProjectMelaphyre.CommonProxy")
	       	public static CommonProxy proxy;
	        
	        @EventHandler // used in 1.6.2
	        //@PreInit    // used in 1.5.2
	        public void preInit(FMLPreInitializationEvent event) {
	        	GameRegistry.registerBlock(this.Hotstone, this.Hotstone.getUnlocalizedName().substring(5));

	        	    // Stub Method
	        }
	        
	        @EventHandler // used in 1.6.2
	        //@Init       // used in 1.5.2
	        public void load(FMLInitializationEvent event) {
	        
	        	
	        proxy.registerRenderers();
	       
	        }
	        
	        @EventHandler // used in 1.6.2
	        //@PostInit   // used in 1.5.2
	        public void postInit(FMLPostInitializationEvent event) {
	                // Stub Method
	        }
	}



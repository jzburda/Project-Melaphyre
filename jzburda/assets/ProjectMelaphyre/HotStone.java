package jzburda.ProjectMelaphyre;

import net.minecraft.block.material.Material;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
 
	public class HotStone extends Block 
	{
	        public HotStone(Material material) 
	        {
	                super(material);
	                setHardness(1.5F); // Stone's hardness
	                setStepSound(Block.soundTypeStone);
	                setBlockName("Hotstone");
	                setCreativeTab(CreativeTabs.tabBlock);
	                setBlockTextureName("projectmelaphyre:hotStone");
	        }
	}

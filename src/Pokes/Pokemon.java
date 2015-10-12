package Pokes;

import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

public interface Pokemon {
	String getName();
	int getDexNum();
	String getSpecies();
	Double getHeight();
	Double getWeight();
	String getType1();
	String getType2();
	ImageIcon getImage();
	
}

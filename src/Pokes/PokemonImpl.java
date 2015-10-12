package Pokes;

import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

public class PokemonImpl implements Pokemon{
	
	protected String name;
	protected int dexNum;
	protected String species;
	protected Double height;
	protected Double weight;
	protected String t1;
	protected String t2;
	ImageIcon image;//draw using a panel image that implements the draw(); image just like the bg class in DTT

	public PokemonImpl(String name, int dexNum, String species, Double height, Double weight, String t1, String t2, ImageIcon image){
		this.name = name;
		this.dexNum = dexNum;
		this.species = species;
		this.height = height;
		this.weight = weight;
		this.t1 = t1;
		this.t2 = t2;
		this.image = image;
	}
	public String getName(){return name;}
	public int getDexNum(){ return dexNum;}
	public String getSpecies(){return species;}
	public Double getHeight(){return height;}
	public Double getWeight(){return weight;}
	public String getType1(){return t1;}
	public ImageIcon getImage(){return image;}
	public String getType2() {return t2;}
}

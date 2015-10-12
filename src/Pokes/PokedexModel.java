package Pokes;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PokedexModel extends JPanel implements ActionListener {//add button to make it possible to just search pokemon
	PokemonLog pokeLog = new PokemonLog();
	private JLabel dex_num;
	private JLabel name;
	private JLabel weight;
	private JLabel height;
	private JLabel type1;
	private JLabel type2;
	private JLabel species;
	private JFrame picHolder;
	JPanel infoPanel;
	JLabel picLabel;
	JButton moveDown;
	JButton moveUp;
	private static Integer number = 1;
	private ImageIcon image = pokeLog.getPokemon(number).getImage();
	
	public PokedexModel(){
		picLabel = new JLabel(image);
		dex_num = new JLabel("001");
		name = new JLabel("Bulbasaur");
		weight = new JLabel("15.2");
		height = new JLabel("2.04");
		type1 = new JLabel("Grass");
		type2 = new JLabel("Poison");
		species = new JLabel("Seed");
		
		
		moveDown = new JButton("<--");
		moveUp = new JButton("-->");
		moveDown.addActionListener(this);
		moveUp.addActionListener(this);
		
		infoPanel = new JPanel();
		infoPanel.setLayout(new GridLayout(7,1));
		
		
		
		
		infoPanel.add(name);
		infoPanel.add(dex_num);
		infoPanel.add(weight);
		infoPanel.add(height);
		infoPanel.add(type1);
		infoPanel.add(type2);
		infoPanel.add(species);
			
		
		
		setLayout(new BorderLayout());
		add(infoPanel, BorderLayout.EAST);
		add(picLabel, BorderLayout.WEST);
		add(moveDown, BorderLayout.SOUTH);
		add(moveUp, BorderLayout.NORTH);
		
		
		
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource() == moveDown){
		number--;
	} else if(e.getSource() == moveUp){
		number++;
		}
	
	
	if(number == 0){
		number = 151;
	}
	if(number == 152){
		number = 1;
	}

	if(number < 10){
	dex_num.setText("00"+number.toString());
	} else if (number <100){
		dex_num.setText("0"+number.toString());
	} else{
		dex_num.setText(number.toString());
	}
	
	name.setText(pokeLog.getPokemon(number).getName());
	weight.setText(pokeLog.getPokemon(number).getWeight().toString());
	height.setText(pokeLog.getPokemon(number).getHeight().toString());
	type1.setText(pokeLog.getPokemon(number).getType1());
	type2.setText(pokeLog.getPokemon(number).getType2());
	species.setText(pokeLog.getPokemon(number).getSpecies());
	picLabel.setIcon(pokeLog.getPokemon(number).getImage());
	
	}
	
	
	
	

}

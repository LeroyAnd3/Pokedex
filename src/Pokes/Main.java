package Pokes;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
	
	public static void main(String[] args){
		JFrame main_frame = new JFrame();
		main_frame.setTitle("PokeDex");
		main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PokedexModel dex = new PokedexModel();
		
		JPanel top_panel = new JPanel();
		top_panel.setLayout(new BorderLayout());
		top_panel.add(dex, BorderLayout.CENTER);
		main_frame.setContentPane(top_panel);

		main_frame.pack();
		main_frame.setVisible(true);
	}
}

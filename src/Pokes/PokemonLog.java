package Pokes;

import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.*;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class PokemonLog{
	private ArrayList<Pokemon> pokemon;
	ImageIcon image = new ImageIcon(getClass().getResource("/Resources/Bulbasaur.png"));
	
	public PokemonLog(){
		pokemon = new ArrayList<Pokemon>();
		init();
	}


	public void logPokemon(Pokemon p) {
		pokemon.add(p);
		
	}


	public Pokemon getPokemon(int num) {
		for(Pokemon p: pokemon){
			if(p.getDexNum() == num){
				return p;
			}
		}
		return null;
	}
	
	private void init(){
		pokemon.add(new PokemonImpl("Bulbasaur", 001, "Seed", 2.04, 15.2, "Grass", "Poison", new ImageIcon(getClass().getResource("/Resources/Bulbasaur.png"))));
		pokemon.add(new PokemonImpl("Ivysaur", 002, "Seed", 3.03, 28.7, "Grass", "Poison", new ImageIcon(getClass().getResource("/Resources/ivysaur.png"))));
		pokemon.add(new PokemonImpl("Venusaur", 003, "Seed", 6.07, 220.5, "Grass", "Poison", new ImageIcon(getClass().getResource("/Resources/Venusaur.png"))));
		pokemon.add(new PokemonImpl("Charmander", 004, "Lizard", 2.00, 18.7, "Fire", "n/a", new ImageIcon(getClass().getResource("/Resources/Charmander.png"))));
		pokemon.add(new PokemonImpl("Charmeleon", 005, "Flame", 3.07, 41.9, "Fire", "n/a", new ImageIcon(getClass().getResource("/Resources/Charmeleon.png"))));
		pokemon.add(new PokemonImpl("Charizard", 006, "Flame", 5.07, 199.5, "Fire", "Flying", new ImageIcon(getClass().getResource("/Resources/Charizard.png"))));
		pokemon.add(new PokemonImpl("Squirtle", 007, "Tiny Turtle", 1.08, 19.8, "Water", "n/a", new ImageIcon(getClass().getResource("/Resources/Squirtle.png"))));
		pokemon.add(new PokemonImpl("Wartortle", 8, "Turtle", 3.03,49.6, "Water", "n/a", new ImageIcon(getClass().getResource("/Resources/Wartortle.png"))));
		pokemon.add(new PokemonImpl("Blastoise", 9, "Shellfish", 5.03, 188.5, "Water", "n/a", new ImageIcon(getClass().getResource("/Resources/Blastoise.png"))));
		pokemon.add(new PokemonImpl("Caterpie", 10, "Worm", 1.00, 6.4, "Bug", "n/a", new ImageIcon(getClass().getResource("/Resources/Caterpie.png"))));
		pokemon.add(new PokemonImpl("Metapod", 11, "Cocoon", 2.04, 21.8, "Bug", "n/a", new ImageIcon(getClass().getResource("/Resources/Metapod.png"))));
		pokemon.add(new PokemonImpl("Butterfree", 12, "Butterfly", 3.07, 70.5, "Bug", "Flying", new ImageIcon(getClass().getResource("/Resources/Butterfree.png"))));
		pokemon.add(new PokemonImpl("Weedle", 13, "Hairy Bug", 1.00, 7.1, "Bug", "Poison", new ImageIcon(getClass().getResource("/Resources/Weedle.png"))));
		pokemon.add(new PokemonImpl("Kakuna", 14, "Cocoon", 2.00, 22.0, "Bug", "Poison", new ImageIcon(getClass().getResource("/Resources/Kakuna.png"))));
		pokemon.add(new PokemonImpl("Beedrill", 15, "Poison Bee", 3.03, 65.0, "Bug", "Poison", new ImageIcon(getClass().getResource("/Resources/Beedrill.png"))));
		pokemon.add(new PokemonImpl("Pidgey", 16, "Tiny Bird", 1.0, 4.0, "Normal", "Flying", new ImageIcon(getClass().getResource("/Resources/Pidgey.png"))));
		pokemon.add(new PokemonImpl("Pidgeotto", 17, "Bird", 3.07, 66.1, "Normal", "Flying", new ImageIcon(getClass().getResource("/Resources/Pidgeotto.png"))));
		pokemon.add(new PokemonImpl("Pidgeot", 18, "Bird", 4.11, 81.7, "Normal", "Flying", new ImageIcon(getClass().getResource("/Resources/Pidgeot.png"))));
		pokemon.add(new PokemonImpl("Rattata", 19, "Mouse", 1.00, 7.7, "Normal", "na/", new ImageIcon(getClass().getResource("/Resources/Rattata.png"))));
		pokemon.add(new PokemonImpl("Raticate", 20, "Mouse", 2.04, 40.8, "Normal", "n/a", new ImageIcon(getClass().getResource("/Resources/Raticate.png"))));
		pokemon.add(new PokemonImpl("Spearow", 21, "Tiny Bird", 1.00, 4.4, "Normal", "Flying", new ImageIcon(getClass().getResource("/Resources/Spearow.png"))));
		pokemon.add(new PokemonImpl("Fearow", 22, "Beak", 3.11, 83.8, "Normal", "Flying", new ImageIcon(getClass().getResource("/Resources/Fearow.png"))));
		pokemon.add(new PokemonImpl("Ekans", 23, "Snake", 6.07, 15.2, "Poison", "n/a", new ImageIcon(getClass().getResource("/Resources/Ekans.png"))));
		pokemon.add(new PokemonImpl("Arbok", 24, "Cobra", 11.06, 143.3, "Poison", "n/a", new ImageIcon(getClass().getResource("/Resources/Arbok.png"))));
		pokemon.add(new PokemonImpl("Pikachu", 25, "Mouse", 1.04, 13.2, "Electric", "n/a", new ImageIcon(getClass().getResource("/Resources/Pikachu.png"))));
		pokemon.add(new PokemonImpl("Raichu", 26, "Mouse", 2.07, 66.1, "Electric", "n/a", new ImageIcon(getClass().getResource("/Resources/Raichu.png"))));
		pokemon.add(new PokemonImpl("Sandshrew", 27, "Mouse", 2.00, 26.5, "Ground", "n/a", new ImageIcon(getClass().getResource("/Resources/Sandshrew.png"))));
		pokemon.add(new PokemonImpl("Sandslash", 28, "Mouse", 3.03, 65.0, "Ground", "n/a", new ImageIcon(getClass().getResource("/Resources/Sandslash.png"))));
		pokemon.add(new PokemonImpl("Nidoran", 29, "Poison Pin", 1.04, 15.4, "Poison", "n/a", new ImageIcon(getClass().getResource("/Resources/Nidoran.png"))));
		pokemon.add(new PokemonImpl("Nidorina",30, "Poison Pin", 2.07, 44.1, "Poison", "n/a", new ImageIcon(getClass().getResource("/Resources/Nidorina.png"))));
		pokemon.add(new PokemonImpl("Nidoqueen", 31, "Drill", 4.03, 132.3, "Poison", "Ground", new ImageIcon(getClass().getResource("/Resources/Nidoqueen.png"))));
		pokemon.add(new PokemonImpl("Nidoran", 32, "Poison Pin", 1.08, 19.8, "Poison", "n/a", new ImageIcon(getClass().getResource("/Resources/Nidoran(Male).png"))));
		pokemon.add(new PokemonImpl("Nidorino", 33, "Poison Pin", 2.11, 43.0,"Poison", "n/a", new ImageIcon(getClass().getResource("/Resources/Nidorino.png"))));
		pokemon.add(new PokemonImpl("Nidoking", 34, "Drill", 4.07, 136.7,  "Poison","Ground", new ImageIcon(getClass().getResource("/Resources/Nidoking.png"))));
		pokemon.add(new PokemonImpl("Clefairy", 35, "Fairy", 2.00, 16.5, "Fairy", "n/a", new ImageIcon(getClass().getResource("/Resources/Clefairy.png"))));
		pokemon.add(new PokemonImpl("Clefable", 36, "Fairy", 4.03, 88.2, "Fairy", "n/a", new ImageIcon(getClass().getResource("/Resources/Clefable.png"))));
		pokemon.add(new PokemonImpl("Vulpix", 37, "Fox", 2.00, 21.8, "Fire", "n/a", new ImageIcon(getClass().getResource("/Resources/Vulpix.png"))));
		pokemon.add(new PokemonImpl("Ninetales", 38, "Fox", 3.07, 43.9, "Fire", "n/a", new ImageIcon(getClass().getResource("/Resources/Ninetales.png"))));
		pokemon.add(new PokemonImpl("Jigglypuff", 39, "Balloon", 1.08, 12.1, "Normal", "Fairy", new ImageIcon(getClass().getResource("/Resources/Jigglypuff.png"))));
		pokemon.add(new PokemonImpl("Wigglytuff", 40, "Balloon", 3.03, 26.5, "Normal", "Fairy", new ImageIcon(getClass().getResource("/Resources/Wigglytuff.png"))));
		pokemon.add(new PokemonImpl("Zubat", 41, "Bat", 2.07, 16.5, "Poison", "Flying", new ImageIcon(getClass().getResource("/Resources/Zubat.png"))));
		pokemon.add(new PokemonImpl("Golbat", 42, "Bat", 5.03, 121.3,  "Poison","Flying", new ImageIcon(getClass().getResource("/Resources/Golbat.png"))));
		pokemon.add(new PokemonImpl("Oddish", 43, "Weed", 1.08, 11.9, "Grass", "Poison", new ImageIcon(getClass().getResource("/Resources/Oddish.png"))));
		pokemon.add(new PokemonImpl("Gloom", 44, "Weed", 2.07, 19.0, "Grass", "Poison", new ImageIcon(getClass().getResource("/Resources/Gloom.png"))));
		pokemon.add(new PokemonImpl("Vileplume", 45, "Flower", 3.11,41.0, "Grass", "Poison", new ImageIcon(getClass().getResource("/Resources/Vileplume.png"))));
		pokemon.add(new PokemonImpl("Paras", 46, "Mushroom", 1.00, 11.9, "Bug","Grass",  new ImageIcon(getClass().getResource("/Resources/Paras.png"))));
		pokemon.add(new PokemonImpl("Parasect", 47, "Mushroom", 3.03, 65.0, "Bug","Grass", new ImageIcon(getClass().getResource("/Resources/Parasect.png"))));
		pokemon.add(new PokemonImpl("Venonat", 48, "Insect", 3.03, 66.1, "Bug", "Poison",  new ImageIcon(getClass().getResource("/Resources/Venonat.png"))));
		pokemon.add(new PokemonImpl("Venomoth", 49, "Poison Moth", 4.11, 27.6, "Bug", "Poison", new ImageIcon(getClass().getResource("/Resources/Venomoth.png"))));
		pokemon.add(new PokemonImpl("Diglett", 50, "Mole", 0.08, 1.8, "Ground", "n/a", new ImageIcon(getClass().getResource("/Resources/Diglett.png"))));
		pokemon.add(new PokemonImpl("Dugtrio", 51, "Mole", 2.04, 73.4, "Ground", "n/a", new ImageIcon(getClass().getResource("/Resources/Dugtrio.png"))));
		pokemon.add(new PokemonImpl("Meowth", 52, "Scratch Cat", 1.04, 9.3, "Normal", "n/a", new ImageIcon(getClass().getResource("/Resources/Meowth.png"))));
		pokemon.add(new PokemonImpl("Persian", 53, "Classy Cat", 3.03, 70.5, "Normal", "n/a", new ImageIcon(getClass().getResource("/Resources/Persian.png"))));
		pokemon.add(new PokemonImpl("Psyduck", 54, "Duck", 2.07, 43.2, "Water", "n/a", new ImageIcon(getClass().getResource("/Resources/Psyduck.png"))));
		pokemon.add(new PokemonImpl("Golduck", 55, "Duck", 5.07, 168.9, "Water", "n/a", new ImageIcon(getClass().getResource("/Resources/Golduck.png"))));
		pokemon.add(new PokemonImpl("Mankey", 56, "Pig Monkey", 1.08, 61.7,  "Fighting", "n/a", new ImageIcon(getClass().getResource("/Resources/Mankey.png"))));
		pokemon.add(new PokemonImpl("Primeape", 57, "Pig Monkey", 3.03, 70.5, "Fighting", "n/a", new ImageIcon(getClass().getResource("/Resources/Primeape.png"))));
		pokemon.add(new PokemonImpl("Growlithe", 58, "Puppy", 2.04, 41.9, "Fire", "n/a", new ImageIcon(getClass().getResource("/Resources/Growlithe.png"))));
		pokemon.add(new PokemonImpl("Arcanine", 59, "Legendary", 6.03, 341.7, "Fire", "n/a", new ImageIcon(getClass().getResource("/Resources/Arcanine.png"))));
		pokemon.add(new PokemonImpl("Poliwag", 60, "Tadpole", 2.00, 27.3, "Water", "n/a", new ImageIcon(getClass().getResource("/Resources/Poliwag.png"))));
		pokemon.add(new PokemonImpl("Poliwhirl", 61, "Tadpole", 3.03, 44.1, "Water", "n/a", new ImageIcon(getClass().getResource("/Resources/Poliwhirl.png"))));
		pokemon.add(new PokemonImpl("Poliwrath", 62, "Tadpole", 4.03, 119.0, "Water", "Fighting", new ImageIcon(getClass().getResource("/Resources/Poliwrath.png"))));
		pokemon.add(new PokemonImpl("Abra", 63, "Psi", 2.11, 43.0, "Psychic", "n/a", new ImageIcon(getClass().getResource("/Resources/Abra.png"))));
		pokemon.add(new PokemonImpl("Kadabra", 64, "Psi", 4.03, 124.6, "Psychic", "n/a", new ImageIcon(getClass().getResource("/Resources/Kadabra.png"))));
		pokemon.add(new PokemonImpl("Alakazam", 65, "Psi", 4.11, 105.8, "Psychic", "n/a", new ImageIcon(getClass().getResource("/Resources/Alakazam.png"))));
		pokemon.add(new PokemonImpl("Machop", 66, "Superpower", 2.07, 43.0, "Fighting", "n/a", new ImageIcon(getClass().getResource("/Resources/Machop.png"))));
		pokemon.add(new PokemonImpl("Machoke", 67, "Superpower", 4.11, 155.4, "Fighting", "n/a", new ImageIcon(getClass().getResource("/Resources/Machoke.png"))));
		pokemon.add(new PokemonImpl("Machamp", 68, "Superpower", 5.03, 286.6, "Fighting", "n/a", new ImageIcon(getClass().getResource("/Resources/Machamp.png"))));
		pokemon.add(new PokemonImpl("Bellsprout", 69, "Flower", 2.04, 8.8, "Grass", "Poison", new ImageIcon(getClass().getResource("/Resources/Bellsprout.png"))));
		pokemon.add(new PokemonImpl("Weepinbell", 70, "Flycatcher", 3.03, 14.1, "Grass", "Poison", new ImageIcon(getClass().getResource("/Resources/Weepinbell.png"))));
		pokemon.add(new PokemonImpl("Victreebel", 71, "Flycatcher", 5.07, 34.2, "Grass", "Poison", new ImageIcon(getClass().getResource("/Resources/Victreebel.png"))));
		pokemon.add(new PokemonImpl("Tentacool", 72, "Jellyfish", 2.11, 100.3, "Water", "Poison", new ImageIcon(getClass().getResource("/Resources/Tentacool.png"))));
		pokemon.add(new PokemonImpl("Tentacruel", 73, "Jellyfish", 5.03, 121.3, "Water", "Poison", new ImageIcon(getClass().getResource("/Resources/Tentacruel.png"))));
		pokemon.add(new PokemonImpl("Geodude", 74, "Rock", 1.04, 44.1, "Rock", "n/a", new ImageIcon(getClass().getResource("/Resources/Geodude.png"))));
		pokemon.add(new PokemonImpl("Graveler", 75, "Rock", 3.03, 231.5, "Rock", "n/a", new ImageIcon(getClass().getResource("/Resources/Graveler.png"))));
		pokemon.add(new PokemonImpl("Golem", 76, "Megaton", 4.07, 661.4, "Rock", "Ground", new ImageIcon(getClass().getResource("/Resources/Golem.png"))));
		pokemon.add(new PokemonImpl("Ponyta", 77, "Fire Horse", 3.03, 66.1, "Fire", "n/a", new ImageIcon(getClass().getResource("/Resources/Ponyta.png"))));
		pokemon.add(new PokemonImpl("Rapidash", 78, "Fire Horse", 5.07, 209.4, "Fire", "n/a", new ImageIcon(getClass().getResource("/Resources/Rapidash.png"))));
		pokemon.add(new PokemonImpl("Slowpoke", 79, "Dopey", 3.11, 79.4, "Water", "Psychic", new ImageIcon(getClass().getResource("/Resources/Slowpoke.png"))));
		pokemon.add(new PokemonImpl("Slowbro", 80, "Hermit Crab", 5.03, 173.1, "Water", "Psychic", new ImageIcon(getClass().getResource("/Resources/Slowbro.png"))));
		pokemon.add(new PokemonImpl("Magnemite", 81, "Magnet", 1.00, 13.2, "Electric", "Steel", new ImageIcon(getClass().getResource("/Resources/Magnemite.png"))));
		pokemon.add(new PokemonImpl("Magneton", 82, "Magnet", 3.03,132.3, "Electric", "Steel", new ImageIcon(getClass().getResource("/Resources/Magneton.png"))));
		pokemon.add(new PokemonImpl("Farfetch'd", 83, "Wild Duck", 2.07, 33.1, "Normal", "Flying", new ImageIcon(getClass().getResource("/Resources/Farfetch'd.png"))));
		pokemon.add(new PokemonImpl("Doduo", 84, "Twin Bird", 4.07, 86.4, "Normal", "Flying", new ImageIcon(getClass().getResource("/Resources/Doduo.png"))));
		pokemon.add(new PokemonImpl("Dodrio", 85, "Triple Bird", 5.11, 187.8, "Normal", "Flying", new ImageIcon(getClass().getResource("/Resources/Dodrio.png"))));
		pokemon.add(new PokemonImpl("Seel", 86, "Sea Lion", 3.07, 198.4, "Water", "n/a", new ImageIcon(getClass().getResource("/Resources/Seel.png"))));
		pokemon.add(new PokemonImpl("Dewgong", 87, "Sea Lion", 5.07, 264.6, "Water", "Ice", new ImageIcon(getClass().getResource("/Resources/Dewong.png"))));
		pokemon.add(new PokemonImpl("Grimer", 88, "Sludge", 2.11, 66.1,  "Poison","n/a", new ImageIcon(getClass().getResource("/Resources/Grimer.png"))));
		pokemon.add(new PokemonImpl("Muk", 89, "Sludge", 3.11, 66.1, "Poison", "n/a", new ImageIcon(getClass().getResource("/Resources/Muk.png"))));
		pokemon.add(new PokemonImpl("Shellder", 90, "Bivalve", 1.00, 8.8, "Water", "n/a", new ImageIcon(getClass().getResource("/Resources/Shellder.png"))));
		pokemon.add(new PokemonImpl("Cloyster", 91, "Bivalve", 4.11, 292.1, "Water", "Ice", new ImageIcon(getClass().getResource("/Resources/Cloyster.png"))));
		pokemon.add(new PokemonImpl("Gastly", 92, "Gas", 4.03, 0.2, "Ghost", "Poison", new ImageIcon(getClass().getResource("/Resources/Gastly.png"))));
		pokemon.add(new PokemonImpl("Haunter", 93, "Gas", 5.03, 0.2, "Ghost", "Poison", new ImageIcon(getClass().getResource("/Resources/Haunter.png"))));
		pokemon.add(new PokemonImpl("Gengar",94, "Shadow", 4.11, 89.3, "Ghost", "Poison", new ImageIcon(getClass().getResource("/Resources/Gengar.png"))));
		pokemon.add(new PokemonImpl("Onix", 95, "Rock Snake", 28.10, 463.0, "Rock", "Ground", new ImageIcon(getClass().getResource("/Resources/Onix.png"))));
		pokemon.add(new PokemonImpl("Drowsee", 96, "Hypnosis",3.03, 71.4, "Psychic", "n/a", new ImageIcon(getClass().getResource("/Resources/Drowzee.png"))));
		pokemon.add(new PokemonImpl("Hypno", 97, "Hypnosis", 5.03, 166.7, "Psychic", "n/a", new ImageIcon(getClass().getResource("/Resources/Hypno.png"))));
		pokemon.add(new PokemonImpl("Krabby", 98, "River Crab", 1.04, 14.3, "Water", "n/a", new ImageIcon(getClass().getResource("/Resources/Krabby.png"))));
		pokemon.add(new PokemonImpl("Kingler", 99, "Pincer", 4.03, 132.3, "Water", "n/a", new ImageIcon(getClass().getResource("/Resources/Kingler.png"))));
		pokemon.add(new PokemonImpl("Voltorb", 100, "Ball", 1.08, 22.9, "Electric", "n/a", new ImageIcon(getClass().getResource("/Resources/Voltorb.png"))));
		pokemon.add(new PokemonImpl("Electrode",101, "Ball", 3.11, 146.8, "Electric", "n/a", new ImageIcon(getClass().getResource("/Resources/Electrode.png"))));
		pokemon.add(new PokemonImpl("Exeggcute", 102, "Egg", 1.04, 5.5, "Grass", "Psychic", new ImageIcon(getClass().getResource("/Resources/Exeggcute.png"))));
		pokemon.add(new PokemonImpl("Exeggutor", 103, "Coconut", 6.07, 264.6, "Grass", "Psychic", new ImageIcon(getClass().getResource("/Resources/Exeggutor.png"))));
		pokemon.add(new PokemonImpl("Cubone", 104, "Lonely", 1.04, 14.3, "Ground", "n/a", new ImageIcon(getClass().getResource("/Resources/Cubone.png"))));
		pokemon.add(new PokemonImpl("Marowak", 105, "Seed", 3.03, 99.2, "Ground", "n/a", new ImageIcon(getClass().getResource("/Resources/Marowak.png"))));
		pokemon.add(new PokemonImpl("Hitmonlee", 106, "Kicking", 4.11, 109.8, "Fighting", "n/a", new ImageIcon(getClass().getResource("/Resources/Hitmonlee.png"))));
		pokemon.add(new PokemonImpl("Hitmonchan", 107, "Punching", 4.11, 110.7, "Fighting", "n/a", new ImageIcon(getClass().getResource("/Resources/Hitmonchan.png"))));
		pokemon.add(new PokemonImpl("Lickitung", 108, "Licking", 3.11, 144.4, "Normal", "n/a", new ImageIcon(getClass().getResource("/Resources/Lickitung.png"))));
		pokemon.add(new PokemonImpl("Koffing", 109, "Poison Gas", 2.00, 2.2,  "Poison", "n/a", new ImageIcon(getClass().getResource("/Resources/Koffing.png"))));
		pokemon.add(new PokemonImpl("Weezing", 110, "Poison Gas", 3.11, 20.9, "Poison", "n/a", new ImageIcon(getClass().getResource("/Resources/Weezing.png"))));
		pokemon.add(new PokemonImpl("Rhyhorn", 111, "Spikes", 3.03, 253.5, "Ground", "Rock", new ImageIcon(getClass().getResource("/Resources/Rhyhorn.png"))));
		pokemon.add(new PokemonImpl("Rhydon", 112, "Drill", 6.03, 264.6, "Ground", "Rock", new ImageIcon(getClass().getResource("/Resources/Rhydon.png"))));
		pokemon.add(new PokemonImpl("Chansey", 113, "Egg", 3.07, 76.3, "Normal", "n/a", new ImageIcon(getClass().getResource("/Resources/Chansey.png"))));
		pokemon.add(new PokemonImpl("Tangela", 114, "Vine", 3.03, 77.2, "Grass", "n/a", new ImageIcon(getClass().getResource("/Resources/Tangela.png"))));
		pokemon.add(new PokemonImpl("Kangaskhan", 115, "Parent", 7.03, 176.4, "Normal", "n/a", new ImageIcon(getClass().getResource("/Resources/Kangaskhan.png"))));
		pokemon.add(new PokemonImpl("Horsea", 116, "Dragon", 1.04, 17.6, "Water", "n/a", new ImageIcon(getClass().getResource("/Resources/Horsea.png"))));
		pokemon.add(new PokemonImpl("Seadra", 117, "Dragon", 3.11, 55.1, "Water", "n/a", new ImageIcon(getClass().getResource("/Resources/Seadra.png"))));
		pokemon.add(new PokemonImpl("Goldeen", 118, "Goldfish", 2.00, 33.1, "Water", "n/a", new ImageIcon(getClass().getResource("/Resources/Goldeen.png"))));
		pokemon.add(new PokemonImpl("Seaking", 119, "Goldfish", 4.03, 86.0, "Water", "n/a", new ImageIcon(getClass().getResource("/Resources/Seaking.png"))));
		pokemon.add(new PokemonImpl("Staryu", 120, "Star Shape", 2.07, 76.1, "Water", "n/a", new ImageIcon(getClass().getResource("/Resources/Staryu.png"))));
		pokemon.add(new PokemonImpl("Starmie", 121, "Mysterious", 3.07, 176.4, "Water", "Psychic", new ImageIcon(getClass().getResource("/Resources/Starmie.png"))));
		pokemon.add(new PokemonImpl("Mr. Mime", 122, "Barrier", 4.03, 120.1, "Psychic", "Fairy", new ImageIcon(getClass().getResource("/Resources/Mime.png"))));
		pokemon.add(new PokemonImpl("Scyther", 123, "Mantis", 4.11, 123.5, "Bug", "Flying", new ImageIcon(getClass().getResource("/Resources/Scyther.png"))));
		pokemon.add(new PokemonImpl("Jynx", 124, "Human Shape", 4.07, 89.5, "Ice", "Psychic", new ImageIcon(getClass().getResource("/Resources/Jynx.png"))));
		pokemon.add(new PokemonImpl("Electabuzz", 125, "Electric", 3.07, 66.1, "Electric", "n/a", new ImageIcon(getClass().getResource("/Resources/Electabuzz.png"))));
		pokemon.add(new PokemonImpl("Magmar", 126, "Spitfire", 4.03, 98.1, "Fire", "n/a", new ImageIcon(getClass().getResource("/Resources/Magmar.png"))));
		pokemon.add(new PokemonImpl("Pinsir", 127, "Stag Beetle", 4.11, 121.3, "Bug", "n/a", new ImageIcon(getClass().getResource("/Resources/Pinsir.png"))));
		pokemon.add(new PokemonImpl("Tauros", 128, "Wild Bull", 4.07, 194.9, "Normal", "n/a", new ImageIcon(getClass().getResource("/Resources/Tauros.png"))));
		pokemon.add(new PokemonImpl("Magikarp", 129, "Fish", 2.11, 22.0, "Water", "n/a", new ImageIcon(getClass().getResource("/Resources/Magikarp.png"))));
		pokemon.add(new PokemonImpl("Gyarados", 130, "Atrocious", 21.04, 518.1, "Water", "Flying", new ImageIcon(getClass().getResource("/Resources/Gyarados.png"))));
		pokemon.add(new PokemonImpl("Lapras", 131, "Transport", 8.02, 485.0, "Water", "Ice", new ImageIcon(getClass().getResource("/Resources/Lapras.png"))));
		pokemon.add(new PokemonImpl("Ditto", 132, "Transform", 1.00, 8.8, "Normal", "n/a", new ImageIcon(getClass().getResource("/Resources/Ditto.png"))));
		pokemon.add(new PokemonImpl("Eevee", 133, "Evolution", 1.00, 14.3, "Normal", "n/a", new ImageIcon(getClass().getResource("/Resources/Eevee.png"))));
		pokemon.add(new PokemonImpl("Vaporeon", 134, "Bubble Jet", 3.03, 63.9, "Water", "n/a", new ImageIcon(getClass().getResource("/Resources/Vaporeon.png"))));
		pokemon.add(new PokemonImpl("Jolteon", 135, "Lighting", 2.07, 54.0, "Electric", "n/a", new ImageIcon(getClass().getResource("/Resources/Jolteon.png"))));
		pokemon.add(new PokemonImpl("Flareon", 136, "Flame", 2.11, 55.1, "Fire", "n/a", new ImageIcon(getClass().getResource("/Resources/Flareon.png"))));
		pokemon.add(new PokemonImpl("Porygon", 137, "Virtual", 2.07, 80.5, "Normal", "n/a", new ImageIcon(getClass().getResource("/Resources/Porygon.png"))));
		pokemon.add(new PokemonImpl("Omanyte", 138, "Spiral", 1.04, 16.5, "Rock", "Water", new ImageIcon(getClass().getResource("/Resources/Omanyte.png"))));
		pokemon.add(new PokemonImpl("Omastar", 139, "Spiral", 3.03, 77.2, "Rock", "Water", new ImageIcon(getClass().getResource("/Resources/Omastar.png"))));
		pokemon.add(new PokemonImpl("Kabuto", 140, "Shellfish", 1.08, 25.4, "Rock", "Water", new ImageIcon(getClass().getResource("/Resources/Kabuto.png"))));
		pokemon.add(new PokemonImpl("Kabutops", 141, "Shellfish", 4.03, 89.3, "Rock", "Water", new ImageIcon(getClass().getResource("/Resources/Kabutops.png"))));
		pokemon.add(new PokemonImpl("Aerodactyl", 142, "Fossil", 5.11, 130.1, "Rock", "Flying", new ImageIcon(getClass().getResource("/Resources/Aerodactyl.png"))));
		pokemon.add(new PokemonImpl("Snorlax", 143, "Sleeping", 6.11, 1014.1, "Normal", "n/a", new ImageIcon(getClass().getResource("/Resources/Snorlax.png"))));
		pokemon.add(new PokemonImpl("Articuno", 144, "Freeze", 5.07, 122.1, "Ice", "Flying", new ImageIcon(getClass().getResource("/Resources/Articuno.png"))));
		pokemon.add(new PokemonImpl("Zapdos", 145, "Electric", 5.03, 116.0, "Electric", "Flying", new ImageIcon(getClass().getResource("/Resources/Zapdos.png"))));
		pokemon.add(new PokemonImpl("Moltres", 146, "Flame", 6.07, 132.3, "Fire", "Flying", new ImageIcon(getClass().getResource("/Resources/Moltres.png"))));
		pokemon.add(new PokemonImpl("Dratini", 147, "Dragon", 5.11, 7.3, "Dragon", "n/a", new ImageIcon(getClass().getResource("/Resources/Dratini.png"))));
		pokemon.add(new PokemonImpl("Dragonair", 148, "Dragon", 13.01, 36.4, "Dragon", "n/a", new ImageIcon(getClass().getResource("/Resources/Dragonair.png"))));
		pokemon.add(new PokemonImpl("Dragonite", 149, "Dragon", 7.03, 463.0, "Grass", "Flying", new ImageIcon(getClass().getResource("/Resources/Dragonite.png"))));
		pokemon.add(new PokemonImpl("Mewtwo", 150, "Genetic", 6.07, 269.0, "Psychic", "n/a", new ImageIcon(getClass().getResource("/Resources/Mewtwo.png"))));
		pokemon.add(new PokemonImpl("Mew", 151, "New Species", 1.04, 8.8, "Psychic", "n/a", new ImageIcon(getClass().getResource("/Resources/Mew.png"))));
	}
	


}

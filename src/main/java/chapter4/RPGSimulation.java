package chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class RPGSimulation {

	public static void main(String[] args) {

		Random randomNumber = new Random();
		int monsterCount = randomNumber.nextInt(4) + 1;
		
		// define Monster record
		record Monster (String name, int attack, int maxDamage, int defense) {
			static Random random = new Random();
			static int hitPoints = 2;
			static boolean alive = true;
			
			public int rollAttack() {
				return random.nextInt(attack) + 1;
			}
			
			public int rollDamage() {
				return random.nextInt(maxDamage) + 1;
			}
		}
		
		// create new monsters
		List<Monster> monsters = new ArrayList<>();
		
		for (int monsterIdx = 0; monsterIdx < monsterCount; monsterIdx++) {
			
			int typeIdx = randomNumber.nextInt(4);
			
			switch (typeIdx) {
			case 0:
				monsters.add(new Monster("Kobald", 2, 8, 1));
				break;
			case 1:
				monsters.add(new Monster("Skeleton", 2, 8, 2));
				break;
			case 2:
				monsters.add(new Monster("Zombie", 1, 6, 2));
				break;
			default:
				monsters.add(new Monster("Rats", 1, 4, 1));				
			}
		}
		
		// build Spellbook
		Map<String,String> spellbook = new TreeMap<>();
		spellbook.put("Fireball", "A ball of fire that inflicts 8 damage per level of magic.");
		spellbook.put("Healing Touch", "Touching an injured player recovers 5 hit points per character level.");
		spellbook.put("Lightning Bolt", "A stream of lightning that inflicts 10 damage per level of magic.");
		spellbook.put("Create Water", "Creates 10 liters of water per level of magic.");
		spellbook.put("Transmutation", "Converts common items into gold.");
		
		// create Heroes
		Hero byorki = new Hero("Byorki", 4, 5, 5);
		Hero klar = new Hero("K'lar", 8, 12, 3);
		Hero tyrenni = new Hero("Tyrenni", 4, 2, 6, spellbook);
		
		List<Hero> heroes = new ArrayList<>();
		heroes.add(byorki);
		heroes.add(klar);
		heroes.add(tyrenni);
		
		// decide initiative at random
		List<String> playerOrder = new ArrayList();
		
		
	}

}

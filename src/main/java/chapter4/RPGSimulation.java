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
		List<String> monsterNames = new ArrayList<>();
		
		for (int monsterIdx = 0; monsterIdx < monsterCount; monsterIdx++) {
			
			int typeIdx = randomNumber.nextInt(4);
			
			switch (typeIdx) {
			case 0:
				monsters.add(new Monster("Kobald", 8, 8, 1));
				monsterNames.add("Kobald");
				break;
			case 1:
				monsters.add(new Monster("Skeleton", 8, 8, 2));
				monsterNames.add("Skeleton");
				break;
			case 2:
				monsters.add(new Monster("Zombie", 6, 6, 2));
				monsterNames.add("Zombie");
				break;
			default:
				monsters.add(new Monster("Rats", 6, 4, 1));				
				monsterNames.add("Rats");
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
		Hero byorki = new Hero("Byorki", 8, 5, 5);
		Hero klar = new Hero("K'lar", 10, 12, 3);
		Hero tyrenni = new Hero("Tyrenni", 6, 2, 6, spellbook);
		
		List<Hero> heroes = new ArrayList<>();
		List<String> heroNames = new ArrayList<>();
		
		heroes.add(byorki);
		heroes.add(klar);
		heroes.add(tyrenni);
		heroNames.add(byorki.getName());
		heroNames.add(klar.getName());
		heroNames.add(tyrenni.getName());
		
		// decide initiative at random
		List<String> playerOrder = generatePlayerOrder(heroNames, monsterNames);


		// simulate game round
		for (String playerName : playerOrder) {
			
			// check if playerName is a hero or a monster
			if (heroes.contains(playerName)) {
				System.out.println("Hero! " + playerName);
			} else {
				System.out.println("Monster! " + playerName);
			}
		}

	}

	private static List<String> generatePlayerOrder(List<String> heroList, List<String> monsterList) {

		List<String> returnValue = new ArrayList<>();
		Random random = new Random();		
		int playerCount = heroList.size() + monsterList.size();
		
		while (returnValue.size() < playerCount) {
			if (random.nextBoolean()) {
				if (!heroList.isEmpty()) {
					int heroIndex = random.nextInt(heroList.size());
				
					returnValue.add(heroList.get(heroIndex));
					heroList.remove(heroIndex);
				}
			} else {
				if (!monsterList.isEmpty()) {
					int monsterIndex = random.nextInt(monsterList.size());
					
					returnValue.add(monsterList.get(monsterIndex));
					monsterList.remove(monsterIndex);
				}
			}
		}
		
		return returnValue;
	}
}

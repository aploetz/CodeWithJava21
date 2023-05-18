package chapter4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class WorkingWithCollections {

	public static void main(String[] args) {
		String[] heroes = {"Byorki", "K'lar", "Tyrenni", "Athena", "Jarrod"};
		// Set<String> heroSet = new HashSet<>();
		// Set<String> heroSet = new LinkedHashSet<>();
		Set<String> heroSet = new TreeSet<>();

		Collections.addAll(heroSet, heroes);
		
		heroSet.add("Byorki");
		heroSet.add("Rik");
		
		heroSet.remove("Rik");
		
		System.out.println(heroSet);
		
		List<String> monsterList = new ArrayList<>();
		monsterList.add("Kobald");
		monsterList.add("Skeleton");
		monsterList.add("Zombie");
		monsterList.add("Rats");
		monsterList.add("Skeleton");

		Collections.sort(monsterList);
		
		System.out.println(monsterList);

	}

}

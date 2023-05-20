package chapter4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
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
		
		//System.out.println(heroSet);
		printCollection(heroSet);
		
		List<String> monsterList = new ArrayList<>();
		monsterList.add("Kobald");
		monsterList.add("Skeleton");
		monsterList.add("Zombie");
		monsterList.add("Rats");
		monsterList.add("Skeleton");

		Collections.sort(monsterList);
		
		monsterList.remove("Skeleton");
		
		printCollection(monsterList);
		System.out.println(monsterList.get(1));
		
		LinkedList<String> cityList = new LinkedList<>();
		cityList.add("Elddim");
		cityList.add("Crystwind");
		cityList.add("Fallraen");
		cityList.add("Meren");
		cityList.add("Lang");
		
		printCollection(cityList);
		
		System.out.println(cityList.get(3));
		
		cityList.remove("Meren");
		printCollection(cityList);

		System.out.println(cityList.peek());
		System.out.println(cityList.peekLast());
		printCollection(cityList);
		
		System.out.println(cityList.poll());
		printCollection(cityList);

		
	}

	private static void printCollection(Collection collection) {
		
		for (Object element : collection) {
			System.out.printf("%s, ", element.toString());
		}
		
		System.out.println();
	}
	
	private static void printMap(Map<Object,Object> map) {
		
		Set<Object> keys = map.keySet();
		
		for (Object key : keys) {
			System.out.printf("%s: %s, ", key, map.get(key));
		}
	}
}

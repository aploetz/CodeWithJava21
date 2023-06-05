package chapter6;

public class DataStructuresExamples {

	public static void main(String[] args) {

		Stack stack = new Stack();

		// stack of Blu-Rays for me to watch
		Item martian = new Item("The Martian");
		Item patriotGames = new Item("Patriot Games");
		Item bladerunner = new Item("Bladerunner");
		Item bladerunner2049 = new Item("Bladerunner 2049");
		Item apollo13 = new Item("Apollo 13");
		Item firstMan = new Item("First Man");
		Item empireStrikesBack = new Item("The Empire Strikes Back");
		Item rogueOne = new Item("Rogue One");
		Item alexander = new Item("Alexander");
		Item starwars = new Item("Star Wars");
		Item runningMan = new Item("Running Man");
		
		stack.push(firstMan);
		stack.push(apollo13);
		stack.push(rogueOne);
		stack.push(empireStrikesBack);
		stack.push(bladerunner2049);
		stack.push(bladerunner);
		
		System.out.println(stack.pop().getName() + " was popped from the stack.");
		
		stack.push(patriotGames);
		stack.push(martian);
		stack.push(alexander);
		stack.push(runningMan);
		
		System.out.println(stack.pop().getName() + " was popped from the stack.");
		
		
		stack.push(starwars);
		
		//System.out.println(stack.getStackCount());
		System.out.println(stack);
	}

}

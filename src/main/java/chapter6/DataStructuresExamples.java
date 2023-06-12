package chapter6;

public class DataStructuresExamples {

	public static void main(String[] args) {

		Stack stack = new Stack();

		// "stack" of movies for me to watch
		Item martian = new Item("The Martian");
		Item patriotGames = new Item("Patriot Games");
		Item bladeRunner = new Item("Blade Runner");
		Item bladeRunner2049 = new Item("Blade Runner 2049");
		Item apollo13 = new Item("Apollo 13");
		Item firstMan = new Item("First Man");
		Item empireStrikesBack = new Item("The Empire Strikes Back");
		Item rogueOne = new Item("Rogue One");
		Item alexander = new Item("Alexander");
		Item starwars = new Item("Star Wars");
		Item runningMan = new Item("Running Man");
		
		System.out.println("Stack example:");
		
		stack.push(firstMan);
		stack.push(apollo13);
		stack.push(rogueOne);
		stack.push(empireStrikesBack);
		stack.push(bladeRunner2049);
		stack.push(bladeRunner);
		
		System.out.println(stack.pop().getName() + " was popped from the stack.");
		
		stack.push(patriotGames);
		stack.push(martian);
		stack.push(alexander);
		stack.push(runningMan);
		
		System.out.println(stack.pop().getName() + " was popped from the stack.");
		
		stack.push(starwars);
		
		System.out.println(stack);
		
		System.out.println("Queue example:");
		
		Queue queue = new Queue();
		
		queue.enqueue(starwars);
		queue.enqueue(bladeRunner);
		queue.enqueue(empireStrikesBack);
		queue.enqueue(patriotGames);
		queue.enqueue(bladeRunner2049);
		
		System.out.println(queue);
		
		System.out.println(queue.dequeue().getName() + " was dequeued.");
		System.out.println(queue.dequeue().getName() + " was dequeued.");

		System.out.println(queue);
		
		System.out.println("Tree example:");
		
		Tree tree = new Tree(47);
		
		tree.insert(48);
		tree.insert(20);
		tree.insert(15);
		tree.insert(26);
		tree.insert(18);
		
		tree.traverseFromRoot();
		System.out.println();
		tree.reverseFromRoot();
	}
}

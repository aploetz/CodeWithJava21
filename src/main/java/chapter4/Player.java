package chapter4;

import java.util.Random;

public class Player {
	private Random random;
	private String name;
	private int attack;
	private int maxDamage;
	private int defense;
	private int hitPoints;
	private boolean alive;

	public Player(String name, int attack, int maxDamage, int defense) {
		this.name = name;
		this.attack = attack;
		this.maxDamage = maxDamage;
		this.defense = defense;
		this.alive = true;
	}
	
	public int rollAttack() {
		return random.nextInt(attack) + 1;
	}
	
	public int rollDamage() {
		return random.nextInt(maxDamage) + 1;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAttack() {
		return attack;
	}
	
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	public int getMaxDamage() {
		return maxDamage;
	}
	
	public void setMaxDamage(int maxDamage) {
		this.maxDamage = maxDamage;
	}
	
	public int getDefense() {
		return defense;
	}
	
	protected void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}
	
	public void setDefense(int defense) {
		this.defense = defense;
	}
	
	public int getHitPoints() {
		return this.hitPoints;
	}
	
	public void decrementHitPoints(int damage) {
		this.hitPoints = this.hitPoints - damage;
		
	}
	
	public boolean isAlive() {
		return this.alive;
	}
}

package sk.stuba.fiit.Human;

public class Human {

	private String name;
	private int money;
	private int pets;
	
	public Human(String name, int money, int pets) {
		this.name = name;
		this.money = money;
		this.pets = pets;
	}
	
	public int GetMoney() {
		return this.money;
	}
	public void SetMoney(int mn) {
		this.money = mn;
	}
	
}

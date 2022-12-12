package sk.stuba.fiit.Human;

public class Player extends Human {

	private int score = 0;

	public Player(String name, int money, int pets) {
		super(name, money, pets);
	}

	public int GetScore() {
		return this.score;
	}

	public void SetScore(int sc) {
		this.score += sc;
	}

	public void CheckHunger(int hunger) {
		if (hunger >= 90) {
			System.out.println("Hunger of this Pet is full.");
		} else if (hunger < 90 && hunger >= 60) {
			System.out.println("Hunger of this Pet is lower, he would eat.");
		} else if (hunger < 60 && hunger >= 30) {
			System.out.println("This pet is really hungry.");
		} else {
			System.out.println("This pet needs to eat or he will die.");
		}
	}

	public void CheckHappiness(int happ) {
		if (happ >= 90) {
			System.out.println("This Pet is very Happy!");
		} else if (happ < 90 && happ >= 60) {
			System.out.println("This Pet is happy, but could use some more.");
		} else if (happ < 60 && happ >= 30) {
			System.out.println("This Pet is feeling lonely");
		} else {
			System.out.println("This Pet is really sad! Do something!!!");
		}
	}

}

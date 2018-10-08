import java.util.Scanner;

public class Fighter extends Characters {
	private int Armor = 1;
	Scanner s = new Scanner(System.in);

	public Fighter(String name,int bl) {
		super((int)(1.5*bl), 5, (int)(1.5*bl), 5, 4, name);
	}

	@Override
	public String toString() {
		return "Name: " + name + " , Type: Fighter" + " , HP: " + HP + "/" + MaxHP + " , MP: " + MP + "/" + MaxMP+" , skill: "+skill;
	}

	public int getArmor() {
		return this.Armor;
	}

	public void setArmor(int armor) {
		Armor = armor;
	}

	@Override
	public void Fight(Monster c) {
		while (HP > 0 && c.HP > 0) {
			printAction();
			int ac = s.nextInt();
			if (ac == 1) {
				Attack(c);
				System.out.println("Monster HP: " + c.HP);
				}
			else if (ac==2) {
				if(skill==true) {
				int i=0;
				setArmor(2);
				while (i<3) {
					Attack(c);
					System.out.println("Monster HP: " + c.HP);
					if (c.HP <= 0) break;
					c.Attack(this);
					System.out.println("Your HP: " + HP);
					}
				setArmor(1);
				setSkill(false);
				}
				else {System.out.println("Your skill was used.");}			
			}
		if (c.HP <= 0) break;
		c.Attack(this);
		System.out.println("Your HP: " + HP);
			}
	}
	public void printAction() {
		System.out.println("----Action----");
		System.out.println("1: Attack");
		System.out.println("2: Add Armor");
	}

}

import  java.util.Scanner;

public class Archer extends Characters {
	Scanner s = new Scanner(System.in);
	public Archer(String name,int bl) {
		super((int)(1.2*bl), 5, (int)(1.2*bl), 5, 4, name);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: "+name+ " , Type: Archer"+" , HP: "+HP+"/"+MaxHP+" , MP: "+MP+"/"+MaxMP+" , skill: "+skill;
	}
	@Override
	public void Fight(Monster c) {
		while (HP > 0 && c.HP > 0) {
			printAction();
			int ac = s.nextInt();
			if (ac == 1) {
				Attack(c);
				System.out.println("Monster HP: " + c.HP);
				if (c.HP <= 0) break;
				
				}
			else if (ac==2) {
				if(skill==true) {
					Attack(c);
					System.out.println("Monster HP: " + c.HP);
					if (c.HP <= 0) break;
					Attack(c);
					System.out.println("Monster HP: " + c.HP);
					if (c.HP <= 0) break;
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
		System.out.println("2: Double Attack");
	}
	

}


public class Monster extends Characters {
	
	
	public Monster(String name, int bl) {
		super((int)(0.8*bl), 4,(int)(0.8*bl), 4, 3, name);
		// TODO Auto-generated constructor stub
	}

	public void Attack(Characters c) {
		int dm = (int)(Math.random()*damage)+damage;
		if(c instanceof Fighter) {
			if(dm>((Fighter) c).getArmor()) dm -= ((Fighter) c).getArmor();
			else dm = 0;
		}
		c.HP -= dm;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}


}

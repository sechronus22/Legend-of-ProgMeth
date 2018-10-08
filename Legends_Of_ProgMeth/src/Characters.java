
public abstract class Characters {
	protected int MaxHP;
	protected int MaxMP;
	protected int HP;
	protected int MP;
	protected int damage;
	protected String name;
	protected int position=0;
	protected boolean skill=true;
	public Characters(int maxhp,int maxmp,int hp,int mp,int damage,String name) {
		this.HP = hp;
		this.MaxHP = maxhp;
		this.MP = mp;
		this.MaxMP = maxmp;
		this.damage = damage;
		this.name = name;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public abstract String toString();
	public void Attack(Characters m) {
		m.HP -= (int)(Math.random()*damage)+damage;
	}
	
	public void Fight(Monster c) {
			while(HP>0 && c.HP>0) {
				Attack(c);
				System.out.println("Monster HP: "+c.HP);
				if(c.HP<=0) break;
				c.Attack(this);
				System.out.println("Your HP: "+HP);
			
			}
	}
	public void setSkill(boolean skill) {
		this.skill = skill;
	}
	public void setHP(int hp) {
		this.HP = hp;
	}
}

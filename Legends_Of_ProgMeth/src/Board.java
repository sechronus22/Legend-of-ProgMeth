import java.util.ArrayList;
public class Board {
	public Characters[] Board;
	public Characters Player;
	public int BoardSize;
	public Board(int bs) {
		this.Board = new Characters[bs];
		this.BoardSize = bs;
		for(int i=0;i<BoardSize/4;i++) {
			Monster A =new Monster("george",bs);
			int j = 4*i+(int)(Math.random()*4);
			Board[j] = A;
			System.out.println("monster is at"+j);
		}
	}
		public void Walk(Characters e) {
			int x,y;
			x = e.getPosition();
			y=0;
			if(e instanceof Fighter) { y = (int)(Math.random()*3)+1;}
			if(e instanceof Archer) { y = (int)(Math.random()*4)+1;}
			Board[x] = null;
			if(x+y>=Board.length) {e.setPosition(Board.length-1);Board[Board.length-1]=e;}
			else if(Board[x+y]!=null) {
				System.out.println("You found a monster "+Board[x+y].name);
				e.Fight((Monster) Board[x+y]); 
				if(e.HP>0) {
					if(e.HP+5>e.MaxHP) e.setHP(e.MaxHP);
					else e.setHP(e.HP+5);
					Board[x+y] =e;
					e.setPosition(x+y);
					System.out.println("You are at "+e.getPosition());}
				else return;
			}
			else {
			Board[x+y]=e;
			e.setPosition(x+y);
			System.out.println("You are at "+e.getPosition());
			}
		}
	
		
	}
	


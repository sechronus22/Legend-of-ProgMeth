import java.util.Scanner;
public class Game {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Type the length of your board: ");
	int n = s.nextInt();
	Board game = new Board(n) ;
    System.out.println("Create your charaters");
    System.out.println("Type your name: ");
    String x = s.next();
    System.out.println("Choose your career");
    System.out.println("1: Fighter");
	System.out.println("2: Archer");
    int y = s.nextInt();
    Characters c = null;
    if(y==1) c = new Fighter(x,n);
    if(y==2) c = new Archer(x,n);
    game.Player = c;
    int menu = 2;
    while(menu!=0) {
    	if(menu==1) game.Walk(game.Player);
    	else if(menu==2) {
    		System.out.println(game.Player);
    		System.out.println("You are at "+game.Player.getPosition());
    	}
    	if(game.Player.HP<=0) {System.out.println("Game Over");break;}
    	else if(game.Player.position>=n-1) {System.out.println("You Win");break;}
    	else {printMenu();menu = s.nextInt(); }   	
    }
    System.out.println("End game");
}
	public static void printMenu() {
		System.out.println("----Menu-----");
    	System.out.println("0: Exit");
    	System.out.println("1: Walk");
    	System.out.println("2: Show status");
    	}
	
}

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class JavaComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player player[] = new Player[n];
        Checker checker = new Checker();
        
        for(int i=0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
       // Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
	}

}
class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }

	public int compareTo(Player b) {
		// TODO Auto-generated method stub
		return 0;
	}

}
class Checker implements Comparator<Player>{
	
        @Override
        public int compare(Player p1, Player p2) {
            if(p2.score == p1.score){
                return p2.name.compareTo(p1.name);
            }else{
                return p2.score - p1.score;    
            }

        }
}


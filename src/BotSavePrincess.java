import java.io.*;

public class BotSavePrincess  
{
	static void displayPathtoPrincess(int n, String [][] grid)
	{
		System.out.println("hjksfn");
	    int pi=0,pj=0,mi=0,mj=0;
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n;j++){
	            if(grid[i][j]=="p"){
	                pi=i;
	                pj=j;
	            }
	            else if(grid[i][j]=="m"){
	                mi=i;
	                mj=j;
	            }
	        }
	    }
	    if(mi>pi && mj>pj){
	        for(int i=0;i<(mi-pi);i++){
	            System.out.println("UP");
	        }
	        for(int i=0;i<(mj-pj);i++){
	            System.out.println("LEFT");
	        }
	    }
	    else if(mi>pi && mj<pj){
	        for(int i=0;i<(mi-pi);i++){
	            System.out.println("UP");
	        }
	        for(int i=0;i<(pj-mj);i++){
	            System.out.println("RIGHT");
	        }
	    }
	    else if(mi<pi && mj>pj){
	        for(int i=0;i<(pi-mi);i++){
	            System.out.println("DOWN");
	        }
	        for(int i=0;i<(mj-pj);i++){
	            System.out.println("LEFT");
	        }
	    }
	    else if(mi<pi && mj<pj){
	        for(int i=0;i<(pi-mi);i++){
	            System.out.println("DOWN");
	        }
	        for(int i=0;i<(pj-mj);i++){
	            System.out.println("RIGHT");
	        }
	    }
	}
	public static void main(String[] args)throws IOException 
	{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int m;
        m = Integer.parseInt(in.readLine());
        String grid[][] = new String[m][m];
        for(int i = 0; i < m; i++) {
            //for(int j=0;j<m;j++){
                String str=in.readLine();
            	grid[i] = str.split(" ");
              //  System.out.println("sa");
            //}
        }

    displayPathtoPrincess(m,grid);
    }
}

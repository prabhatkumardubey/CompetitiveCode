import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class TheBestAptitudeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			try {
				int T=sc.nextInt();
				for(int i=0;i<T;i++){
					int N=sc.nextInt();
					double gpa[]=new double[N];
					double score[][]=new double[5][N];
					for(int j=0;j<N;j++){
						gpa[j]=sc.nextDouble();
					}
					for(int j=0;j<5;j++){
						for(int k=0;k<N;k++){
							score[j][k]=sc.nextDouble();
						}
					}
					System.out.println(checkBestAptitude(N, gpa, score));
				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

	private static int checkBestAptitude(int n, double[] gpa, double[][] score) {
		// TODO Auto-generated method stub
			int g[]=new int[n];
			int s[][]=new int[5][n];
			int count=-1;
			int index=0;
			double small=0.0;
			int temp=0;
			for(int i=0;i<n;i++){
				small=gpa[i];
				temp=0;
				for(int j=0;j<n;j++){
					//System.out.println(g[j] +" b "+gpa[j]+" small "+ small);
					if(g[j]>=0 && small>gpa[j]){
					//	System.out.println("yes");
						small=gpa[j];
						index=j;
						temp=1;
					}
				}
				if(temp==0){
					g[i]=count;
					count--;
				}
				else{
					g[index]=count;
					count--;
				}
				//System.out.println(index+" "+g[index]);
			}
			//System.out.println("gpa");
			for(int i=0;i<n;i++){
				g[i]*=-1;
				//System.out.print(g[i]+" ");
				
			}
			//System.out.println();
			for(int i=0;i<n;i++){
				for(int j=i+1;j<n;j++){
					if(gpa[i]==gpa[j]){
						g[j]=g[i];
					}
				}
			}
			count=-1;
			index=0;
			small=0;
			temp=0;
			for(int i=0;i<5;i++){
				count=-1;
				for(int j=0;j<n;j++){
					small=score[i][j];
					temp=0;
					for(int k=0;k<n;k++){
						if(s[i][k]>=0 && small>score[i][k]){
							small=score[i][k];
							index=k;
						}
					}
					if(temp==0){
						s[i][j]=count;
						count--;
					}
					else{
						s[i][index]=count;
						count--;
					}
				}
			}
			//System.out.println("score");
			for(int i=0;i<5;i++){
				for(int j=0;j<n;j++){
					s[i][j]*=-1;
				//	System.out.print(s[i][j]+" ");
				}
			//	System.out.println();
			}
			for(int i=0;i<5;i++){
				for(int j=0;j<n;j++){
					for(int k=j+1;k<n;k++){
						if(score[i][j]==score[i][k]){
							s[i][k]=s[i][j];
						}
					}
				}
			}
			index=0;
			small=0;
			for(int i=0;i<5;i++){
				count=0;
				for(int j=0;j<n;j++){
					if(s[i][j]==g[j]){
						count++;
					}
				}
				if(small<count){
					small=count;
					index=i;
				}
			}
		return index+1;
	}

}

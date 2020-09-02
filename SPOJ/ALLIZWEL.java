import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ALLIZWEL 
{
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++)
		{
			String str=br.readLine();
			String RC[]=str.split(" ");
			int R=Integer.parseInt(RC[0]);
			int C=Integer.parseInt(RC[1]);
			char matrix[][]=new char[R][C];
			int temp=0;
			int indexX=0;
			int indexY=0;
			for(int j=0;j<R;j++)
			{
				str=br.readLine();
				for(int k=0;k<C;k++)
				{
					matrix[j][k]=str.charAt(k);
					if(temp==0)
					{
						if(matrix[j][k]=='A')
						{
							indexX=j;
							indexY=k;
							temp=1;
						}
					}
				}
			}
			str="ALLIZZWELL";
			int indx=0;
			temp=0;
			int complete=0;
			boolean check=findPath(matrix,indexX,indexY,str,indx);
			System.out.println(check);
			/*while(temp!=0 && complete!=1)
			{
				if(indx==str.length())
				{
					complete=1;
					continue;
				}
				if(str.charAt(indx)==matrix[indexX][indexY])
				{
					indx++;
					if(str.charAt(indx)==matrix[indexX-1][indexY-1])
					{
						continue;
					}
					if(str.charAt(indx)==matrix[indexX-1][indexY])
					{
						continue;
					}
					if(str.charAt(indx)==matrix[indexX-1][indexY+1])
					{
						continue;
					}
					if(str.charAt(indx)==matrix[indexX][indexY-1])
					{
						continue;
					}
					if(str.charAt(indx)==matrix[indexX][indexY+1])
					{
						continue;
					}
					if(str.charAt(indx)==matrix[indexX+1][indexY-1])
					{
						continue;
					}
					if(str.charAt(indx)==matrix[indexX+1][indexY])
					{
						continue;
					}
					if(str.charAt(indx)==matrix[indexX+1][indexY+1])
					{
						continue;
					}
					temp=1;
				}
				else
				{
					temp=2;
					break;
				}
			}
			*/
		}
	}

	private static boolean findPath(char[][] matrix, int indexX, int indexY, String str, int indx) {
		// TODO Auto-generated method stub
		if(str.charAt(indx)==matrix[indexX][indexY])
		{
			indx++;
			if(indx==str.length())
			{
				return true;
			}
			if(indexX>0 && indexY>0)
			{
				if(findPath(matrix,indexX,indexY,str,indx))
				{
					return true;	
				}
			}
			if(indexX>0)
			{
				if(str.charAt(indx)==matrix[indexX-1][indexY])
				{
					return findPath(matrix,indexX,indexY,str,indx);
				}
				if(str.charAt(indx)==matrix[indexX-1][indexY+1])
				{
					return findPath(matrix,indexX,indexY,str,indx);
				}
			}
			if(indexY>0)
			{
				if(str.charAt(indx)==matrix[indexX][indexY-1])
				{
					return findPath(matrix,indexX,indexY,str,indx);
				}
				if(str.charAt(indx)==matrix[indexX+1][indexY-1])
				{
					return findPath(matrix,indexX,indexY,str,indx);
				}
				
			}
			if(str.charAt(indx)==matrix[indexX][indexY+1])
			{
				return findPath(matrix,indexX,indexY,str,indx);
			}
			if(str.charAt(indx)==matrix[indexX+1][indexY])
			{
				return findPath(matrix,indexX,indexY,str,indx);
			}
			if(str.charAt(indx)==matrix[indexX+1][indexY+1])
			{
				return findPath(matrix,indexX,indexY,str,indx);
			}
		}
		else
		{
			if(indx==str.length())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		return false;
	}
}

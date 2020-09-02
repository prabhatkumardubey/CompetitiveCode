import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MakeCustomersHappy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			String str=br.readLine();
			String strsplit[]=str.split(" ");
			int Na=Integer.parseInt(strsplit[0]);
			int Nb=Integer.parseInt(strsplit[1]);
			int Nc=Integer.parseInt(strsplit[2]);
			int M=Integer.parseInt(br.readLine());
			int temp=0;
			int count=0;
			while(M-->0){
				temp=0;
                int check=0;
				str=br.readLine();
				strsplit=str.split(",");
				for(int i=0;i<strsplit.length;i++){
					if(strsplit[i].equals("A")){
						if(Na>0){
                                Na--;
            			}
						else{
							temp=1;
                            check=i;
                            break;
						}
					}
					else if(strsplit[i].equals("B")){
						if(Nb>0){
                                Nb--;
            			}
						else{
							temp=1;
                            check=i;
                            break;
						}
					}
					else if(strsplit[i].equals("C")){
						if(Nc>0){
					           Nc--;
						}
						else{
							temp=1;
                            check=i;
                            break;
						}
					}
				}
                if(temp==1){
                    for(int i=0;i<check;i++){
                        if(strsplit[i].equals("A")){
                            Na++;
                        }
                        else if(strsplit[i].equals("B")){
                            Nb++;
                        }
                        else if(strsplit[i].equals("C")){
                            Nc++;
                        }
                    }
                }
				if(temp==0){
					count++;
				}
			}
			System.out.println(count);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

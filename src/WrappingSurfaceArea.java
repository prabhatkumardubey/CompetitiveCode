import java.util.Scanner;

class WrappingSurfaceArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int xw=sc.nextInt();
		int xl=sc.nextInt();
		int xh=sc.nextInt();
		int volume=N*(xl*xw*xh);
		int minval=100000000;
		int l=0,w=0,h=0;
		int x=0;
		while((x*x*x)<volume){
			x++;
		}
		int ll=(x+x%xl);
		int ww=(x+x%xw);
		int hh=(x+x%xh);
		for (int length = xl; length <= ll; length+=xl)
        {
            for (int width = xw; width <= ww; width+=xw)
            {
                for (int height = xh; height <= hh; height+=xh)
                {
                    if(length * width * height >= volume){
                        int area = 2*(length*width + width*height + length*height);
                        if(area < minval){
                            l=length;
                            w=width;
                            h=height;
                            minval = area;
                            break;
                        }
                    }
                }
            }
        }
		int surface=2*(l*w+w*h+h*l);
		
		System.out.println(surface);
	}

}

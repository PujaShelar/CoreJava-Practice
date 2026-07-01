public class Pattern8 {
    public static void main(String[] args){
		int n = 5;
		int a = (n*2)-1 , b = 1;
        for(int i = 1; i <= n; i++){
			int c = i;
			for(int j = 1;j <= n; j++){
				if(j % 2 != 0){
					System.out.print(c+" ");
					if(i < 10)
						System.out.print(" ");                    
					c += a;
				}else{
					System.out.print(c+" ");
					if(i < 10)
						System.out.print(" ");
					c += b;
				}
			}
			a -= 2;
			b += 2;
			System.out.println();
		}
	}	
}

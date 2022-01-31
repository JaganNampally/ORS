import java.util.*;
public class KGoodString{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int K=s.nextInt();
		String str=s.next();
		int L=N/2;
		int k=0;
		for(int i=0;i<L;i++){
			if(str.charAt(i) != str.charAt(N-i-1))
				k++;
		}
		if(k==K)
			System.out.println("num of ops"+0);
		else if(k<K)
			System.out.println("num:"+(K-k));
		else
			System.out.println("num:"+(k-K));
			
	}
}
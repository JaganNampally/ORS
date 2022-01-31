import java.util.*;
public class Marathon{

public static void main(String args[]){
	ArrayList<Double> al=new ArrayList<Double>();
	Scanner s=new Scanner(System.in);
	ArrayList<Double> op=new ArrayList<Double>();
	while(s.hasNext())
	{
		if(s.hasNextDouble())
			al.add(s.nextDouble());
		else{
			String in=s.next();
			if(in.equalsIgnoreCase("Q")){
				break;
			}else{
				System.out.println("You did not enter a valid value. Please enter a number or \"Q\" to quit.");
			}
		}
	}
	Iterator itr=al.iterator();
	boolean b=true;
	while (itr.hasNext()) 
    { 
        Double x = (Double)itr.next(); 
            if (x == 42.195) 
                itr.remove();
			if ( x <= 0)
				 b=false;
    }
	System.out.println("Hisghest Distance excluding Finishers:");
	if(b )
	{
		for(int k=0;k<3;k++)
		{
			double max=al.get(0);
			int delI=0;
			for(int i=1;i<al.size();i++)
			{	
				double d=al.get(i);
				if(d > max){
					max=d;
					delI=i;
				}		
			}
			op.add(max);
			al.remove(delI);
		}
		System.out.println(op);
	}
	else
	System.out.println("Invalid Input");
	
}
}

package jagged;

public class Second {
	public static void main(String[] args) {
		
		int[][] jagged=new int[3][];
		
		
		jagged[0]=new int[3]; //length=>3
        jagged[1]=new int[4]; //length=>4
        jagged[2]=new int[2]; // length=>2
        
        int count=1;
        for(int i=0;i<jagged.length;i++)
        {
        	for(int j=0;j<jagged[i].length;j++)
        	{
        		jagged[i][j]=count;
        		 count++;
        		// System.out.println(jagged[i][j]);
        	}
        }
        
        
        for(int i=0;i<3;i++)
        {
        	for(int j=0;j<jagged[i].length;j++)
        	{
        		System.out.print(jagged[i][j]+" ");
        	}
        	System.out.println();
        }
	}

}

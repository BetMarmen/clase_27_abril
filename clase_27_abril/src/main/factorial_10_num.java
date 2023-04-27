package main;

public class factorial_10_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Factorial de los numeros de 1-10:");
		for (int i = 1 ; i<=10 ; i++)
			
		{
			int fact = 1;
			for(int j =1 ; j<=i;j++)
			{
				fact *=j;
			}
			System.out.println("El "+i+"!"+":"+fact);
		}
		
		
	}

}

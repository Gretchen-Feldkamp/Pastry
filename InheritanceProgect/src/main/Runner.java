package main;

public class Runner
	{

		public static void main(String[] args)
			{
				Dessert d = new Pastry();
				
				d.tasteTest();
				
				((Pastry) d).testFlake();
				
				d.testHealth();
				
				d.counterPlus(0);
				
				d.sweetness();
				
				((Pastry) d).tasteTexture();
				
				d.counterPlus(0);
				
			}

	}

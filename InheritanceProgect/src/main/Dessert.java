package main;

public abstract class Dessert
	{
	public int counter=0;
		public void tasteTest() 
		{
			System.out.println("Wow! This is so sweet!");
		}
		public void testHealth()
		{
			System.out.println("Eugh...this cannot be good for my health.");
		}
		public void counterPlus(int counter)
		{
			counter+=1;
			System.out.println(counter);
		}
		public abstract void sweetness();
	}

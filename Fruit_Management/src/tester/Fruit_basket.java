package tester;

import java.util.Scanner;

import com.app.Apple;
import com.app.Fruits;
import com.app.Mango;
import com.app.Orange;

public class Fruit_basket {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter thee size of basket");
		int n = sc.nextInt();
		
		Fruits[] basket = new Fruits[n];
		
		System.out.println("1.Add Apple 2.Add Orange 3.Add Mango 4.Display Fruit Basket"
				+ " 5.Display Basket Details 6.Mark state of the fruit 7.Mark all sour fruits stale"
				+ "8.Fruit Functionality 9.Exit from store");
		
		int ch=0;
		int index=0;
		
		do
		{
			System.out.println("Enter the choice:");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Add apple");
				if(index<basket.length) {
					System.out.println("Enter color weight name");
					basket[index]=new Apple(sc.next(),sc.nextDouble(),sc.next());
					index++;
					System.out.println("Apple added");
				}else 
					System.out.println("Basket is full!!Cant add more fruits");
				break;
				
			case 2:
				System.out.println("Add orange");
				if(index<basket.length) {
					System.out.println("Enter color weight name");
					basket[index]=new Orange(sc.next(),sc.nextDouble(),sc.next());
					index++;
					System.out.println("Orange added");
				}else
					System.out.println("Basket is full!!Cant add more fruits");
				break;
				
			case 3:
				System.out.println("Add Mango");
				if(index<basket.length) {
					System.out.println("Enter color weight name");
					basket[index]=new Mango(sc.next(),sc.nextDouble(),sc.next());
					index++;
					System.out.println("Mango added");
				}else
					System.out.println("Basket is full!!cant add more fruits");
				break;
				
			case 4:
				System.out.println("The fruits in your basket are");
				for(Fruits c : basket) {
					if(c!=null)
					System.out.println(c.getName());
				}
				break;
				
			case 5:
				System.out.println("Details of all fruit in you basket are");
				for(Fruits c :basket) {
					if(c!=null)
						System.out.println(c+" "+c.taste());											
				}
				break;
				
			case 6:
				System.out.println("State of fruit");
				System.out.println("Enter the index of fruit which is to be marked stale");
				int i = sc.nextInt();
				if(i<index) {
				basket[i].setFresh(false);
				System.out.println("The "+basket[i].getName()+" is marked stale");
				}else
					System.out.println("Invalid index entry");
				break;
				
			case 7:
				System.out.println("Checking for sour fruits");
				for(Fruits c : basket) {
					if(c!=null) 
					if(c.taste().contains("sour"))
						c.setFresh(false);
					System.out.println("The "+c.getName()+" is marked stale");
				
				}
				break;
				
			case 8:
				for(Fruits c : basket) {
					if(c instanceof Apple)
						((Apple)c).pulp();
					if(c instanceof Orange)
						((Orange)c).juice();
					if(c instanceof Mango)
						((Mango)c).jam();
				}
				break;
			
			case 9:
				System.out.println("Thanks for shopping");
				break;
				
				default:
					System.out.println("Invalid entry");
			}
		}while(ch!=9);
	sc.close();
	}

}

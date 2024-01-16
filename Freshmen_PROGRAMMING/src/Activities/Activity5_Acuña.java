package Activities;

import java.util.*;

public class Activity5_Acuña {
	

	public static void main(String[] args) {
		
		//--------------------------------------5.-------------------------------				
		
		ArrayList num = new ArrayList ();
		
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(7);
				
		System.out.println(num.get(4));
		System.out.println(num.get(5));
		System.out.println(num.get(6));
		
		//-------------------------------------------------------------------------
		
		num.remove(6);
		num.remove(5);
		
		System.out.println(num);
				
		//-------------------------------------------------------------------------
		
		System.out.println(num.size());
		
		//-------------------------------------------------------------------------
		
		num.add(2,3);
		num.add(4,4);
		num.add(6,5);
		num.add(6);
		num.add(7);
		
		System.out.println(num);
		
		//-------------------------------------------------------------------------
		
		System.out.println(num.size());
		
		//-------------------------------------------------------------------------
		
		System.out.println(num.get(0));
		System.out.println(num.get(1));
		System.out.println(num.get(2));
		
		System.out.println();
		System.out.println();
		
		//-------------------------------------6.----------------------------------
		
		ArrayList <String> brand = new ArrayList();	
		
		brand.add("Huawei");
		brand.add("Apple");
		brand.add("LG");
		brand.add("Vivo");
		brand.add("Oppo");
		brand.add("iPhone");
		brand.add("Huawei");
		brand.add("Samsung");
		brand.add("Nokia");
		
		System.out.println(brand.get(7));
		System.out.println(brand.get(3));
		System.out.println(brand.get(4));
		System.out.println(brand.get(8));
		System.out.println(brand.get(0));
		
		brand.remove(8);
		brand.remove(7);
		
		System.out.println(brand);
		
	}

}

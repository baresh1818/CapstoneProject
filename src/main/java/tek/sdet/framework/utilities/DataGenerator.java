package tek.sdet.framework.utilities;

import net.datafaker.Faker;

public class DataGenerator {
	// Data Faker is a libary
	
		public static void main (String[]args){
			System.out.println(getData("name"));
			System.out.println(getData("email"));
			System.out.println(getData("random"));
			
		}
		public static String getData(String input) {
			
		Faker feker = new Faker();
		String result ="";
		if(input.equals("name")) {
			result = feker.name().fullName().trim();
		}else if (input.equals("email")) {
			result = feker.expression("#{letterify '????.????@tekschool.us'}");
		}else 
			result = feker.expression("#{letterify '????.????@tekschool.us'}");
		return result;
		
	}

}

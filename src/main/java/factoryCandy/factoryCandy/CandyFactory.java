package factoryCandy.factoryCandy;

import java.util.List;

public class CandyFactory {

	public static Candy getCandy(String candyType) {
		switch (candyType) {
		case "choclate":
			return new Choclate();
	    
	    case "HardChoclate":
	    	return new HardChoclate();
	    
		default:
			return null;
		}
	}
	
	public static List<Candy>  getCandyPackage(String type , int quantity) {
		Candy candy = getCandy(type);
		List<Candy> candyPackage = candy.makeCandyPackage(quantity);
		
		return candyPackage;		
	}
}

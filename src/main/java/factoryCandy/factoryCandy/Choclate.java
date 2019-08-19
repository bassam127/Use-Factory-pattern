package factoryCandy.factoryCandy;

import java.util.ArrayList;
import java.util.List;

public class Choclate extends Candy{

	@Override
	public List<Candy> makeCandyPackage(int quantity) {
		List<Candy> Choclates = new ArrayList<>();
		
		for (int i = 0 ; i< quantity ; i++) {
			Choclate choclate = new Choclate();
			Choclates.add(choclate);
		}
		
		System.out.println("One package of " + quantity + " choclates has been made !");
		return Choclates;
	}

}

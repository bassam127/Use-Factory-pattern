package factoryCandy.factoryCandy;

import java.util.ArrayList;
import java.util.List;

public class HardChoclate extends Candy {

	@Override
	public List<Candy> makeCandyPackage(int quantity) {
		List<Candy> hrdChoclates = new ArrayList<>();
		
		for(int i = 0 ; i < quantity ;  i++) {
			HardChoclate hardChoclate = new HardChoclate();
			hrdChoclates.add(hardChoclate);
		}
		
		System.out.println("one package of " + quantity + " hardchoclate made");
		return hrdChoclates;
		
	}

}

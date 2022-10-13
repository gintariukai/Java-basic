package geekbrains.lesson_1.hello_world.task1.aplinka;

import geekbrains.lesson_1.hello_world.task1.interfeses.IsipiltiKuro;

public class DegalinesServisas {

	private int talpyklosLikutis = 1000;

	public void ipiltiKuro(IsipiltiKuro kam, int kiek) {
		
		if (kiek > 0 && talpyklosLikutis >= kiek) {
		
			// TODO: apmokejimas
			
			this.talpyklosLikutis -= kiek;
			kam.ipilti(kiek);
		}

	}

}

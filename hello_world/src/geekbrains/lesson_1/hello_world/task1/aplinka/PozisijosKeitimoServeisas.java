package geekbrains.lesson_1.hello_world.task1.aplinka;

import lt.codeacademy.interfeisai.task1.enums.Kryptis;
import geekbrains.lesson_1.hello_world.task1.interfeses.AtlikitPosuki;
import geekbrains.lesson_1.hello_world.task1.interfeses.PozicijaIrJudejimas;
import geekbrains.lesson_1.hello_world.task1.pagalbiniai.Pozicija;

public class PozisijosKeitimoServeisas {

	public static final int RIBA = 20;
	public static final int RIBA_MINUS = -20;

	public void pirmyn(PozicijaIrJudejimas priemone) {
		
		Pozicija esama = priemone.pozicija();
		Kryptis kryptis = priemone.kryptis();
		int greitis = priemone.greitis();
		
		
		
		if (priemone.kryptis().equals(Kryptis.N)){
			int busimasY = esama.getY() + greitis;
			
			
		}
		
		if (priemone.kryptis().equals(Kryptis.N) 
				&& priemone.pozicija().getX() < RIBA) {
			priemone.pirmyn();
		}else {
			/// TODO:
		}
	}

	public void atgal(PozicijaIrJudejimas priemone) {
		if (priemone.kryptis().equals(Kryptis.S) && priemone.pozicija().getX() < RIBA_MINUS) {
			priemone.pirmyn();
		}else {
			/// TODO:
		}
	}
}

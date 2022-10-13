package geekbrains.lesson_1.hello_world.task1.transportas;

import javax.crypto.IllegalBlockSizeException;

import lt.codeacademy.interfeisai.task1.enums.Kryptis;
import lt.codeacademy.interfeisai.task1.interfeses.*;
import lt.codeacademy.interfeisai.task1.pagalbiniai.Pozicija;

public abstract class TransportoPriemone implements PozicijaIrJudejimas {

	protected Kryptis kryptis = Kryptis.N;
	protected int greitis = 0;
	protected Pozicija pozicija = new Pozicija();

	@Override
	public void nustatytiGreiti(int kiek) {
		this.greitis = kiek;
		try {
			if (this.greitis < 1){
				throw new IllegalAccessException();
			}
			throw new IllegalBlockSizeException();
		} catch (IllegalBlockSizeException | IllegalAccessException e2) {
			// TODO: handle exception
		}
	}

	@Override
	public void pirmyn() {
		this.pozicija.judek(greitis, kryptis);
	}

	@Override
	public int greitis() {
		return this.greitis;
	}

	@Override
	public Pozicija pozicija() {
		return this.pozicija;
	}

	@Override
	public Kryptis kryptis() {
		return this.kryptis;
	}
}

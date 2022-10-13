package geekbrains.lesson_1.hello_world.task1.pagalbiniai;

import lt.codeacademy.interfeisai.task1.enums.Kryptis;

public class Pozicija {
	private int x, y;

	public void judek(int kiek, Kryptis kryptis) {
		switch (kryptis) {
		case N:
			x += kiek;
			break;
		case E:
			y += kiek;
			break;
		case S:
			x -= kiek;
			break;
		default:
			y -= kiek;
			break;
		}
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}

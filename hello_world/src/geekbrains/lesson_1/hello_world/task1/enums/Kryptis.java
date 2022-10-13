package geekbrains.lesson_1.hello_world.task1.enums;

public enum Kryptis {
	N, E, S, W;

	public Kryptis kaire() {
		switch (this) {
		case N:
			return W;
		case E:
			return N;
		case S:
			return E;
		default:
			return S;
		}
	}

	public Kryptis desine() {
		switch (this) {
		case N:
			return E;
		case E:
			return S;
		case S:
			return W;
		default:
			return N;
		}
	}
}

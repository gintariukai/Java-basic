package geekbrains.lesson_1.hello_world.task1;

import lt.codeacademy.interfeisai.task1.aplinka.DegalinesServisas;
import lt.codeacademy.interfeisai.task1.aplinka.PosukiuAtlikimoServisas;
import lt.codeacademy.interfeisai.task1.aplinka.PozisijosKeitimoServeisas;
import lt.codeacademy.interfeisai.task1.transportas.TransportoPriemone;

public class AutoParkasApp {

	private final DegalinesServisas degalinesServisas;
	private final PosukiuAtlikimoServisas posukiuAtlikimoServisas;
	private final PozisijosKeitimoServeisas pozisijosKeitimoServeisas;

	public AutoParkasApp() {
	
		this.degalinesServisas = new DegalinesServisas();
		this.posukiuAtlikimoServisas = new PosukiuAtlikimoServisas();
		this.pozisijosKeitimoServeisas = new PozisijosKeitimoServeisas();
	}

	public void play() {

		TransportoPriemone kalnuDviratis = null;// new

		pozisijosKeitimoServeisas.pirmyn(kalnuDviratis);
	}
}

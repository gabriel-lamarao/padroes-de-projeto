package junho.mediator;

public class Cliente {
	public static void main(String[] args) {
		MensagemMediator mediador = new MensagemMediator();
	
		AndroidColleague android = new AndroidColleague(mediador);
		IOSColleague ios = new IOSColleague(mediador);
		WindowsColleague windows = new WindowsColleague(mediador);
	
		mediador.adicionarColleague(android);
		mediador.adicionarColleague(ios);
		mediador.adicionarColleague(windows);
		
		windows.enviarMensagem("Oi, eu sou um Windows!");
		System.out.println("=========");
		android.enviarMensagem("Oi Windows! Eu sou um Android!");
		System.out.println("=========");
		ios.enviarMensagem("Ola todos, sou um iOs!");
	}
}

package junho.mediator;

public class WindowsColleague extends Colleague {

	public WindowsColleague(Mediator m) {
		super(m);
	}

	@Override
	public void receberMensagem(String mensagem) {
		System.out.println("Windows recebeu: " + mensagem);
	}

}

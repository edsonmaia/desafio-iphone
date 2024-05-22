
public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	private int id;
	private String modelo;
	
	public Iphone(int id, String modelo) {
		super();
		this.id = id;
		this.modelo = modelo;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	// Metodos da interface ReprodutorMusical	
	@Override
	public void tocar() {
		System.out.println("Tocar");
	}

	@Override
	public void pausar() {
		System.out.println("Pausar");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionar música " + musica); 
	}
	
	// Metodos da interface NavegadorInternet
	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibir Página " + url);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionar Nova Aba");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando Página...");
	}

	// Metodos da interface AparelhoTelefonico
	@Override
	public void ligar(String numero) {
		System.out.println("Ligar para o número " + numero);
	}

	@Override
	public void atender() {
		System.out.println("Atender ligação");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciar Correio de Voz");	
	}
	
}

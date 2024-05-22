public class App {
    public static void main(String[] args) throws Exception {
        
        Iphone iphone = new Iphone(1, "iPhone 13");
		System.out.println("iPhone id " + iphone.getId() + " Modelo " + iphone.getModelo());
		
		// Testes dos métodos implementados
		iphone.selecionarMusica("Born to Be Wild");
		iphone.tocar();
		iphone.pausar();

		iphone.ligar("+5596998761234");
		iphone.atender();
		iphone.iniciarCorreioVoz();
		
		iphone.exibirPagina("dio.me");
		iphone.atualizarPagina();
		iphone.adicionarNovaAba();

    }
}

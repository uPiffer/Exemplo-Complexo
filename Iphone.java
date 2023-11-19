package Iphone;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegarWeb {
    private String modelo;
    private String cor;

    public iPhone(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }

    public void ligar() {
        System.out.println("iPhone ligado.");
    }

    public void desligar() {
        System.out.println("iPhone desligado.");
    }

    public void fazerChamada(String numero) {
        System.out.println("Chamando " + numero + " no iPhone.");
    }

    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Enviando mensagem para " + numero + ": " + mensagem);
    }

    public void abrirNavegador(String url) {
        System.out.println("Abrindo navegador web no iPhone para: " + url);
    }

    public void reproduzirMusica() {
        System.out.println("Reproduzindo música no iPhone.");
    }

    public void play() {
        System.out.println("Iniciando a reprodução de música.");
    }

    public void pause() {
        System.out.println("Pausando a reprodução de música.");
    }

    public void next() {
        System.out.println("Próxima faixa de música.");
    }

    public void prev() {
        System.out.println("Faixa anterior de música.");
    }

    public void adicionarNovaAba(String url) {
        System.out.println("Adicionando nova aba no navegador para: " + url);
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a página no navegador.");
    }

	@Override
	public void abrirSite(String url) {
		// TODO Auto-generated method stub
		
	}
}

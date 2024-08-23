public class Main {
    public static void main(String[] args) {

        Veiculo meuCarro = new Carro("Toyota", "Corolla", 2020, "Preto");
        Veiculo minhaMoto = new Moto("Honda", "CB500", 2021, "Vermelha");
        Veiculo meuCaminhao = new Caminhao("Scania", "R450", 2019, "Azul");

        meuCarro.buzinar();
        meuCarro.acelerar();

        minhaMoto.buzinar();
        minhaMoto.acelerar();

        meuCaminhao.buzinar();
        meuCaminhao.acelerar();

        System.out.println("\nCaracterísticas dos veículos:");
        System.out.println("Carro: " + meuCarro.getMarca() + " " + meuCarro.getModelo() + ", Ano: " + meuCarro.getAno() + ", Cor: " + meuCarro.getCor());
        System.out.println("Moto: " + minhaMoto.getMarca() + " " + minhaMoto.getModelo() + ", Ano: " + minhaMoto.getAno() + ", Cor: " + minhaMoto.getCor());
        System.out.println("Caminhão: " + meuCaminhao.getMarca() + " " + meuCaminhao.getModelo() + ", Ano: " + meuCaminhao.getAno() + ", Cor: " + meuCaminhao.getCor());
    }
}

abstract class Veiculo {

    String marca;
    String modelo;
    int ano;
    String cor;

    Veiculo(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    abstract void buzinar();
    abstract void acelerar();
}

class Carro extends Veiculo {

    Carro(String marca, String modelo, int ano, String cor) {
        super(marca, modelo, ano, cor);
    }

    void buzinar() {
        System.out.println("O carro " + marca + " " + modelo + " está buzinando");
    }

    void acelerar() {
        System.out.println("O carro " + marca + " " + modelo + " está acelerando.");
    }
}

class Moto extends Veiculo {

    Moto(String marca, String modelo, int ano, String cor) {
        super(marca, modelo, ano, cor);
    }

    void buzinar() {
        System.out.println("A moto " + marca + " " + modelo + " está buzinando");
    }

    void acelerar() {
        System.out.println("A moto " + marca + " " + modelo + " está acelerando.");
    }
}

class Caminhao extends Veiculo {

    Caminhao(String marca, String modelo, int ano, String cor) {
        super(marca, modelo, ano, cor);
    }

    void buzinar() {
        System.out.println("O caminhão " + marca + " " + modelo + " está buzinando");
    }

    void acelerar() {
        System.out.println("O caminhão " + marca + " " + modelo + " está acelerando.");
    }
}

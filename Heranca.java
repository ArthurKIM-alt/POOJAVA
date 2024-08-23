class Carro extends Veiculo {

    Carro(String marca, String modelo, int ano, String cor) {
        super(marca, modelo, ano, cor);
    }

    void buzinar() {
        System.out.println("O carro " + getMarca() + " " + getModelo() + " está buzinando");
    }

    void acelerar() {
        System.out.println("O carro " + getMarca() + " " + getModelo() + " está acelerando.");
    }
}

class Moto extends Veiculo {

    Moto(String marca, String modelo, int ano, String cor) {
        super(marca, modelo, ano, cor);
    }

    void buzinar() {
        System.out.println("A moto " + getMarca() + " " + getModelo() + " está buzinando");
    }

    void acelerar() {
        System.out.println("A moto " + getMarca() + " " + getModelo() + " está acelerando.");
    }
}

class Caminhao extends Veiculo {

    Caminhao(String marca, String modelo, int ano, String cor) {
        super(marca, modelo, ano, cor);
    }

    void buzinar() {
        System.out.println("O caminhão " + getMarca() + " " + getModelo() + " está buzinando");
    }

    void acelerar() {
        System.out.println("O caminhão " + getMarca() + " " + getModelo() + " está acelerando.");
    }
}

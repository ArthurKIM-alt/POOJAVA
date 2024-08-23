Integrantes: Arthur Kim e Luiz Henrique

Perguntas:

Abstração:
1- Atributos importantes seriam: marca, modelo, ano e cor do veículo. Enquanto os comportamentos importantes seriam: buzinar e acelerar.
2- A classe abstrata neste caso é o Veículo, sendo que implementamos algo que todo veículo possui, neste caso, a classe abstrata serve para englobar tanto carros, motos, caminhões, quadricículos ou qualquer outro meio de transporte que possa ser considerado um veículo.

Herança:
1- O método mover estaria relacionado às subclasses dos veículos, mais precisamente dependente de qual tipo de veículos estamos criando dentro de um código. Por exemplo, uma moto se move diferente de uma charrete, mas a implementação seria praticamente a mesma. Para a implementação do método, usaria um @override para fazer uma classe herdar um comportamente, suponde que a subclasse moto esteja com  modelo e marca, um simples "void mover()" seria o suficiente para simular o movimento do mesmo, enquanto no print colocaria uma frase como: "a moto está se movendo".
2- A vantagem da herança está no tempo ganho, ao criar uma herança, uma subclasse herda os atribútos e métodos de uma classe abstrata e é implementado seus próprios comportamentos para os métodos utilizados, no caso de nosso código, os métodos herdados seriam o buzinar e acelerar.

Encapsulamento:
1- Para a implementação do encapsulamento podemos usar alguns modificadores de acesso dentro do código, como um "private" ou "public", que permitem que seja acessível somente dentro da prórpia classe e acessível para qualquer classe, respectivamente. Enquanto para permitir acesso controlado, podemos utilzar os métodos "setter" e "getter", onde vamos modificar um valor de atributo e retornar o valor de um atributo, respectivamente.
2- O encapsulamento é importante porque evita que atributos sejam alterados diretamente, protegendo a integridade do objeto, permite implementar regras e verificações no acesso e modificação dos atributos, facilita a manutenção e evolução do código, pois mudanças internas na classe não afetam outros códigos que a utilizam e mantém as partes do código bem definidas e separadas, promovendo uma melhor organização.

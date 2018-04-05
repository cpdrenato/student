//Objetos na memória
//Observe o seguinte programa:
class Programa {
	public static void main(String[] args) {
		Documento doc1 = new Documento();
		doc1.nome = "Alfredo";
		Documento doc2 = new Documento();
		doc2.nome = "Juliana";
		System.out.println("doc1: "+doc1.nome);
		System.out.println("doc2: "+doc2.nome);
	}
}
//O resultado da execução deste programa imprime:
//doc1: Alfredo
//doc2: Juliana



//métodos acelerar, frear, ligar e desligar.
//Vamos criar a nossa classe apenas com a definição do estado, inicialmente:
class CarroCorrida {
//Estado
	Integer numeroIdentificacao;
	Double velocidadeAtual;
	Double velocidadeMaxima;
//Comportamento...
}


//Vamos adicionar os primeiros comportamentos, ligar e desligar
void ligar()
{
	System.out.println("VRUUUMmmmmmmmmm");
}
void desligar()
{
	System.out.println("MMMmmmm......");
}

//Agora vamos implementar o método acelerar:
void acelerar()
{
	velocidadeAtual += 10;
	if(velocidadeAtual > velocidadeMaxima)
	{
		velocidadeAtual = velocidadeMaxima;
	}
}


//Vamos implementar o método frear:
void frear(Integer intensidadeFreada)
{
	if(intensidadeFreada > 100)
{
	intensidadeFreada = 100;
}else if(intensidadeFreada < 0)
	{
		intensidadeFreada = 0;
	}
	velocidadeAtual -= intensidadeFreada*0.25;
	if(velocidadeAtual < 0)
	{
		velocidadeAtual = 0.0;
	}
}

//A nossa classe após a adição destes comportamento ficou da seguinte forma:

class CarroCorrida {
//Estado
	Integer numeroIdentificacao;
	Double velocidadeAtual;
	Double velocidadeMaxima;
//Comportamento...
void ligar()
{
	System.out.println("VRUUUMmmmmmmmmm");
}
	void desligar()
{
	System.out.println("MMMmmmm......");
}
	void acelerar()
{
	velocidadeAtual += 10;
	if(velocidadeAtual > velocidadeMaxima)
	{
		velocidadeAtual = velocidadeMaxima;
	}
}
	void frear(Integer intensidadeFreada)
{
	if(intensidadeFreada > 100)
	{
		intensidadeFreada = 100;
	}else if(intensidadeFreada < 0)
	{
		intensidadeFreada = 0;
	}
	velocidadeAtual -= intensidadeFreada*0.25;
	if(velocidadeAtual < 0)
	{
		velocidadeAtual = 0.0;
	}
	}
}

//Podemos melhorar um pouco mais a nossa classe atribuindo valores
//default para alguns atributos.
public class CarroCorrida {
	//Estado
	Integer numeroIdentificacao;
	Double velocidadeAtual = 0.0;
	Double velocidadeMaxima = 100.0;
	//...
	
	
//CarroCorrida.
class CarroCorrida {
	//Estado
	Integer numeroIdentificacao;
	Double velocidadeAtual = 0.0;
	Double velocidadeMaxima = 100.0;
	String nomePiloto;
	Integer idadePiloto;
	Integer habilidadePiloto;
	//...

	
	
class Piloto {
String nome;
Integer habilidade;
Integer idade;
}
class CarroCorrida {
//Estado
Integer numeroIdentificacao;
Double velocidadeAtual = 0.0;
Double velocidadeMaxima = 100.0;
Piloto piloto;
//...


//O novo método acelerar será da seguinte forma:
void acelerar()
{
velocidadeAtual += 10 + piloto.habilidade*0.1;
if(velocidadeAtual > velocidadeMaxima)
{
velocidadeAtual = velocidadeMaxima;
}
}

//Temos o nosso carro de corrida com piloto.

	class Corrida {
public static void main(String[] args) {
	//Criacao dos carros que irao correr
	CarroCorrida carroEquipeVelocidade = new CarroCorrida();
	CarroCorrida carroEquipeTrapaceiros = new CarroCorrida();
	//Criacao dos pilotos de cada equipe
	Piloto pilotoEquipeVelocidade = new Piloto();
	Piloto pilotoEquipeTrapaceiros = new Piloto();
	//Atributos do piloto da equipe Velocidade
	pilotoEquipeVelocidade.nome = "Piloto 1";
	pilotoEquipeVelocidade.idade = 25;
	pilotoEquipeVelocidade.habilidade = 75;
	//Atributos do piloto da equipe Trapaceiros
	pilotoEquipeTrapaceiros.nome = "Piloto 2";
	pilotoEquipeTrapaceiros.idade = 27;
	pilotoEquipeTrapaceiros.habilidade = 65;
	//Os pilotos sao colocados nos seus carros
	carroEquipeVelocidade.piloto = pilotoEquipeVelocidade;
	carroEquipeTrapaceiros.piloto = pilotoEquipeTrapaceiros;
	//Identificao dos carros
	carroEquipeVelocidade.numeroIdentificacao = 1;
	carroEquipeTrapaceiros.numeroIdentificacao = 2;
	//Carros sao ligados
	carroEquipeVelocidade.ligar();
	carroEquipeTrapaceiros.ligar();
	//Inicia a corrida
	carroEquipeVelocidade.acelerar();
	carroEquipeTrapaceiros.acelerar();
	carroEquipeVelocidade.acelerar();
	carroEquipeTrapaceiros.acelerar();
	carroEquipeVelocidade.acelerar();
	carroEquipeTrapaceiros.velocidadeAtual = 200.0;
	}
}






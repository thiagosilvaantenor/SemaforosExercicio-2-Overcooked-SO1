# Exercício 2 de Semaforos - Sistemas Operacionais 1

<div align="center">
  
![image](https://github.com/thiagosilvaantenor/SemaforosExercicio-2-Overcooked-SO1/assets/99970279/1077f98d-be16-4594-a888-1744ca6cd03c)

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

</div>

## Sobre o projeto
Este é o exercício 2, da lista de exercícios de Semaforos, da materia de Sistemas Operacionais 1 do curso de Análise e desenvolvimento de sistemas da FATEC Zona Leste.<br>
Este exercício foi inspirado no jogo [Overcooked](https://store.steampowered.com/app/448510/Overcooked/), desenvolvido pela [Ghost Town Games Ltd](https://ghosttowngames.com)

## Índice
=================
<!--ts-->
* [Título](#exercício-2-de-semaforos---sistemas-operacionais-1)
* [Sobre o Projeto](#sobre-o-projeto)
* [Índice](#índice)
* [Exercício 2](#exercício-2)
* [Status do projeto](#status-do-projeto)
* [Tecnologias](#tecnologias)
* [Agradecimentos](#agradecimentos)
* [Autor](#autor)
<!--te-->

## Exercício 2
Existem diversos jogos de simulação. Um deles simula a participação de cozinheiros em
uma cozinha profissional realizando pratos. Numa das fases, o cozinheiro precisa
realizar o cozimento de 5 pratos simultâneos, onde cada cozimento não depende da
interação do jogador. Pratos de ID ímpar, são chamados de Sopa de Cebola e levam de
0,5 a 0,8 segundos para ficar prontos. Pratos de ID par, são chamados de Lasanha a
Bolonhesa e levam de 0,6 a 1,2 segundos para ficar prontos. Quando um prato inicia, é
necessário comunicar, em console, que se iniciou e, a cada 0,1 segundos, deve-se exibir
o percentual de cozimento (O percentual é definido pelo tempo total dividido por 0,1
segundos). Quando um prato fica pronto, é necessário comunicar em console o final e
fazer a entrega, que leva 0,5 segundos. O jogador só pode entregar um prato por vez e
deve comunicar a entrega. Simular a situação em Java.


## Status do projeto
  🚧Em construção🚧 

* Projeto utiliza o padrão **MVC** *(Model View Controller)*, todos os arquivos estão dentro do diretório **src**
  * Dentro do pacote **view** está a camada de interacao direta com o usuario:
    * Na classe `Cozinheiro`:
      * É criado um `Semaphore`, com o número de permissões 1
      * Dentro de uma iteração `for` de 1 até 5 é criado uma instância da classe `PratosController`, passando o `Semaphore` e o `int i` do `for` como `int id` como parâmetros e é iniciada pelo método `start()`
    
  * Dentro do pacote **controller** está a classe com métodos, que será instanciada na camada **view**:  
    * Na classe `PratosController`:
    
      * Recebe um `int id` começando por 1, além de um `Semaphore` que contera a quantidade de permissões, neste caso 1;
      * O método run chamara o método `verificaPrato`, este que verifica se o id da Thread é par, gerando o tempo, minimo e maximo, além de chamar os métodos de receita: `cozinhaSopaCebola` ou `cozinhaLasanhaBolonhesa`;

## Tecnologias
- [Java](https://www.oracle.com/br/java/)
  - [Thread](https://docs.oracle.com/javase/8/docs/api/java/lang/Thread.html)
  - [Semaphore](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Semaphore.html)

## Agradecimentos
Agradeço ao professor da disciplina de Sistemas Operacionais 1, [Leandro Colevati dos Santos](https://www.leandrocolevati.com.br/index.jsp), por todo o aprendizado passado.

## Autor

<div align="center">
<a href="https://www.linkedin.com/in/thiago-antenor/">
<img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/99970279?v=4" width="100px;" alt="foto do autor"/>
 <br />
 <sub><b>Thiago Silva Antenor</b></sub></a> <a href="https://www.linkedin.com/in/thiago-antenor/" title="Linkedin"> 🧑🏾‍💻</a>


Feito por Thiago Silva Antenor 👨🏾‍💻 Entre em contato!

[![Linkedin Badge](https://img.shields.io/badge/-Thiago-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/thiago-antenor/)](https://www.linkedin.com/in/thiago-antenor/) 
[![Gmail Badge](https://img.shields.io/badge/-thiagoantenor31@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:thiagoantenor31.com)](mailto:thiagoantenor31.com)
</div>

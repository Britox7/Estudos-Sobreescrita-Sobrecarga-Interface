<h1>Sobre o projeto:</h1>
<p>
  Este projeto é voltado para apresentar os conhecimentos adquiridos por mim em meus estudos recentes.
  Irei explicar os conceitos de Interface, Sobrescrita e Sobrecarga.
</p>

<h2>
  SOBRESCRITA:
</h2>
<p>
  O conceito de Sobrescrita consiste na possibilidade de termos diversos métodos com o mesmo nome. 
  Para se configurar uma sobrescrita deve-se ter:
  
  <h5>Mesma Assinatura: O método sobrescrito deve ter a mesma assinatura (nome e lista de parâmetros) do método na superclasse ou interface.</h5>
  
  <h5>Mesma Classe ou Interface: A sobrescrita ocorre em classes relacionadas por herança (subclasse/superclasse) ou implementação de interfaces.</h5>
  
  <h5>Anotação @Override: A anotação @Override é usada para indicar que um método está sobrescrevendo um método da superclasse ou interface. Posso fazer sobrescrita
  sem usar o @Override ? Sim, você pode, mas é recomendado ser feito com o @Override, pois ele acaba ajudando na legibilidade, verificação do compilador e
  na detecção de erros.</h5>
  
  Sendo assim, podemos modificar o comportamento dos métodos de acordo
  com a expecificação da classe em que iremos usar
</p>
<h5>
  Interface com o método:
</h5>

![image](https://github.com/Britox7/Estudos-Sobreescrita-Sobrecarga-Interface/assets/101662003/28ea9fe6-874d-4d56-ae0d-d1d8670d4ca6)

<h5>
  Método sobrescrito dentro da classe:
</h5>

![image](https://github.com/Britox7/Estudos-Sobreescrita-Sobrecarga-Interface/assets/101662003/84403938-f529-4485-918a-1b5ef33db4bd)


<h2>
  SOBRECARGA:
</h2>
<p>
  O conceito de sobrecarga também nos da a possibiliadade de usar métodos com o mesmo nome, mas dessa vez é necessario se ter assinaturas(nome e lista de parâmetros)
  diferentes no seu método. Para se configurar sobrescrita deve-se ter:

  <h5>Assinaturas Diferentes: Os métodos sobrecarregados devem diferir na lista de parâmetros (tipo, número ou ordem).</h5>

  <h5>Mesma Classe: A sobrecarga ocorre dentro da mesma classe.</h5>
  
  <h5>Flexibilidade: Permite diferentes maneiras de chamar um método com o mesmo nome, dependendo do contexto ou dos dados fornecidos.</h5>

  Sendo assim, podemos usar a sobrecarga para criar diversos métodos com o mesmo nome e com funcionalidades similares também
</p>
<h5>
  Método sem sobrecarga:
</h5>

![image](https://github.com/Britox7/Estudos-Sobreescrita-Sobrecarga-Interface/assets/101662003/10c1ab23-34b6-4ff4-bf0c-6b3acc208b44)

<h5>
  Método com sobrecarga:
</h5>

![image](https://github.com/Britox7/Estudos-Sobreescrita-Sobrecarga-Interface/assets/101662003/5dc3fa38-affb-4745-932b-3ef4aeb79aef)

<h2>
  INTERFACE:
</h2>
<p>
  O conceito de interface é uma espécie de contrato para as classes. Cada classe que tiver uma interface implementada, também deve fazer a implementação dos métodos
  presentes na interface, isso poderia ser considerado como as cláusulas desse "contrato", se os métodos não estiverem implementados ocorrerá um erro compilação.
  
  Detalhes de uma interface:

  <h5>Métodos Abstratos: São métodos sem corpo na interface. Qualquer classe que implementa a interface deve fornecer uma implementação concreta para esses métodos.

  Métodos Default: São métodos com implementações padrão dentro da interface. Classes que implementam a interface podem usar a implementação padrão ou sobrescrever esses métodos.

  Métodos Estáticos: São métodos que pertencem à interface e podem ser chamados sem uma instância de classe. Eles são úteis para fornecer funcionalidades relacionadas à interface.

  Métodos Privados: São métodos que só podem ser usados dentro da interface para evitar duplicação de código em métodos default e estáticos.</h5>
</p>
<h5>
  Interface com os métodos criados:
<h5>

![image](https://github.com/Britox7/Estudos-Sobreescrita-Sobrecarga-Interface/assets/101662003/96d993b2-76ae-481b-a483-e8f6355fb8ae)

<p>Link da postagem no linkedin: </p>

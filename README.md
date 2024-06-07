 <h1>Projeto Carro</h1>
        
 <h2>Estrutura do Projeto</h2>
        <pre>
        Carro/
        ├── src/
        │   └── com/
        │       └── projeto/
        │           ├── Carro.java
        │           └── Main.java
        └── pom.xml (opcional, caso esteja usando Maven)
        </pre>
        
 <h2>Descrição</h2>
 <p>O projeto consiste em uma classe <code>Carro</code> que possui os atributos <code>marca</code>, <code>modelo</code>, <code>ano</code> e <code>cor</code>. Utilizamos o padrão de projeto Builder para facilitar a construção de objetos <code>Carro</code>.</p>
        
  <h2>Requisitos</h2>
  <ul>
  <li>Java 8 ou superior</li>
  <li>Maven (opcional, caso queira usar o arquivo <code>pom.xml</code> para gerenciar dependências)</li>
  </ul>
        
 <h2>Instalação e Execução</h2>
 <h3>Passos para Compilar e Executar o Projeto</h3>
   <ol>
   <li>Clone o repositório:
    <pre><code>git clone https://github.com/sucloudflare/Patterns-Build.git
cd Patterns-Build/Carro</code></pre>
    </li>
    <li>Compile os arquivos Java:
     <pre><code>javac -d bin src/com/Carro/*.java</code></pre>
     </li>
     <li>Execute o programa:
     <pre><code>java -cp bin com.Carro.Main</code></pre>
        </li>
     </ol>
        
  <h3>Usando Maven</h3>
    <ol>
   <li>Clone o repositório:
    <pre><code>git clone https://github.com/sucloudflare/Patterns-Build.git
cd Patterns-Build/Carro</code></pre>
    </li>
    <li>Compile e execute usando Maven:
     <pre><code>mvn compile
mvn exec:java -Dexec.mainClass="com.projeto.Main"</code></pre>
     </li>
    </ol>
        
  <h2>Licença</h2>
  <p>Este projeto está licenciado sob os termos da licença MIT. Veja o arquivo <code>LICENSE</code> para mais detalhes.</p>
        
 <h2>Contribuindo</h2>
  <ol>
   <li>Faça um fork do projeto</li>
  <li>Crie uma nova branch (<code>git checkout -b feature/nova-feature</code>)</li>
   <li>Commit suas mudanças (<code>git commit -m 'Adiciona nova feature'</code>)</li>
  <li>Faça um push para a branch (<code>git push origin feature/nova-feature</code>)</li>
  <li>Abra um Pull Request</li>
   </ol>
  </div>

# DSC_Project_EJB

### Requisitos


> Glassfish instalado


> Realizar a troca da variável de localização do Glassfish no "pom.xml"

### Configuração
1. Criar o schema no MySql
2. Iniciar o glassfish
3. Voltando ao NetBeans, clicar na aba serviços e criar uma nova conexão com o banco de dados
4. Seleciona o schema criado no passo 1
5. Criação do recurso JDBC (passo a passo)
  * Novo
  * Outros
  * Glassfish
  * Recurso JDBC, e avança
  * Marca a opção de criar um nova pool de conexões
  * Define o nome do recurso no campo "Nome JNDI" e avança duas vezes
  * No campo "Nome do pool de conexão", deve-se colocar o nome do connection pool
6. Acessar o console do glassfish 
7. Acessar a área de resources do glassfish
8. "Add resource" e seleciona o "glassfish-resources.xml"
9. Logo após adicionar o "glassfish-resources.xml" do projeto, deve-se reiniciar o Glassfish, espere um pouco e reinicie o console do mesmo

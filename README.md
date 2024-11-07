# Projeto JOIN-CRUD

Este projeto é uma aplicação CRUD (Create, Read, Update, Delete) desenvolvida com **Spring Boot** no backend e **Angular** no frontend, projetada para gerenciar categorias.
A aplicação conta com uma interface amigável e funcionalidades para adicionar, editar, remover e listar categorias, integrando-se com um banco de dados relacional.

## Tecnologias Utilizadas

### Backend
- **Java 8** ou **Java 12**
- **Spring Boot** com **Spring MVC**
- **Lombok** para reduzir código boilerplate
- **Banco de dados relacional**: PostgreSQL 
- **Spring Data JPA** para mapeamento objeto-relacional
- **Controllers, Services e Repositories** estruturados em camadas

### Frontend
- **Angular**
- **Angular Material** para componentes visuais

### Ferramentas e Configurações Adicionais
- pgAdmin 4 para gerenciar o banco.

## Funcionalidades

1. **Listagem de Categorias**: Mostra todas as categorias disponíveis, com suporte à paginação e carregamento dinâmico.
2. **Adicionar Nova Categoria**: Permite o cadastro de uma nova categoria com validações.
3. **Editar Categoria Existente**: Permite a edição de uma categoria selecionada.
4. **Remoção de Categoria**: Possibilita a exclusão de uma categoria, com confirmação visual.
5. **Navegação entre Páginas**: Implementação de rotas para páginas de listagem, criação e edição de categorias.
6. **Resolver para Rotas de Edição**: Carrega dados da categoria para edição utilizando o `categoriaResolver`.
7. **Tratamento de Erros**: Diálogos de erro personalizados com `MatDialog`.

## Configuração e Execução

### Pré-requisitos
- **Java** (versão 8 ou 12)
- **Node.js** e **NPM** para execução do Angular
- **PostgreSQL** para banco de dados
- **Angular CLI** instalado globalmente

### Clonar o Repositório
```bash
git clone https://github.com/SEU_USUARIO/NOME_DO_REPOSITORIO.git
cd NOME_DO_REPOSITORIO
```

### Configuração do Backend

1. Configure o banco de dados no arquivo `application.properties` (ou `application.yml`) do Spring Boot:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/seubanco
   spring.datasource.username=seuusuario
   spring.datasource.password=suasenha
   spring.jpa.hibernate.ddl-auto=update
   ```

2. Execute o backend:
   ```bash
   ./mvnw spring-boot:run
   ```
   O backend estará disponível em `http://localhost:8080`.

### Configuração do Frontend

1. Acesse a pasta `frontend`:
   ```bash
   cd frontend
   ```

2. Instale as dependências do Angular:
   ```bash
   npm install
   ```

3. Execute o frontend:
   ```bash
   ng serve
   ```
   O frontend estará disponível em `http://localhost:4200`.


## Exemplos de Uso

1. **Listar Categorias**: Acesse a rota `http://localhost:4200/categoria` para visualizar todas as categorias cadastradas.
2. **Adicionar Nova Categoria**: Clique em "Novo" e preencha o formulário com o nome e descrição da nova categoria.
3. **Editar Categoria**: Clique em "Editar" ao lado de uma categoria na lista para modificar os dados.
4. **Remover Categoria**: Clique em "Remover" e confirme a exclusão.


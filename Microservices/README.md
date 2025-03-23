```markdown
# Revisão Prova

### Linguagem de Alto Nível
- Linguagem de alto nível é a que o humano entende.

### Android
- Android é um sistema operacional.
- Kotlin é a linguagem principal para desenvolver Android.
- O código Kotlin no Java funciona e vice-versa, eles têm interoperabilidade.
- **JetBrains criou o Kotlin.**

### Formas de Desenvolvimento
- **Imperativo**: Desde que nasceu até hoje.
- **Declarativo**: De 2021 pra cá.

#### Imperativo
- Forma antiga de desenvolver. Utiliza 2 arquivos: XML (layout) e arquivo de código (Kotlin).

#### Declarativo
- Não utiliza XML e vem com o **Jetpack Compose**. Todos os objetos ficam diretamente no código, em um único arquivo.

**Jetpack Compose**: Conjunto de ferramentas que facilitou o desenvolvimento Android.

### Gerenciadores de Dependências
- **Gradle**: Gerenciador de dependências. Java eleito como gerenciador padrão de dependências do Android Studio.
- **Maven**: Gerenciador de dependências para Java (Spring Boot).
- **NPM**: Gerenciador de dependências para Node.js.
- **Pip**: Gerenciador de dependências para Python.
- **Composer**: Gerenciador de dependências para PHP.

**Gerenciador de Dependência**: Pacotes de programas que outros desenvolvedores já criaram e você consome (ex: configuração de banco de dados). Também gerencia o **build** da sua aplicação.

### Manifesto
- O Manifesto Android (AndroidManifest.xml) é um arquivo essencial para todas as aplicações Android. Ele descreve informações essenciais sobre a aplicação e suas interações com o sistema. O manifesto define as permissões, atividades, serviços, e outras configurações importantes que o Android precisa para gerenciar a aplicação.
- Estrutura do AndroidManifest.xml
- O arquivo AndroidManifest.xml é estruturado em XML e possui os seguintes componentes principais:
-- Permissões: O que a aplicação pode ou não fazer, como acessar a internet, gravar no armazenamento, etc.
-- Atividades (Activities): Define todas as telas (Activities) da aplicação. Cada Activity é um ponto de interação com o usuário.
-- Serviços (Services): Componentes que podem rodar em segundo plano, como processamento de dados, downloads, etc.
-- Recebedores de Broadcast (Broadcast Receivers): Permite que a aplicação receba notificações do sistema ou de outras aplicações.
-- Provedores de Conteúdo (Content Providers): Definem a forma como a aplicação acessa dados de outras aplicações ou compartilha seus próprios dados.
-- Intenções (Intents): Informações sobre como as atividades se comunicam entre si.

### Building
- **Empacotar**: Preparando o projeto para ser utilizado por outras pessoas.

### Dependência
- Programas ou pacotes já preparados para facilitar um processo (ex: configuração de conexão de banco de dados).

### Arquivos de Código e Layout
- **Nome do arquivo de código**: Deve seguir o modelo **Camel Case** (maiúsculas iniciais sem espaço).
- **Nome do arquivo de layout**: Deve seguir o modelo **Snake Case** (letras minúsculas com underline para espaçamento).
    - Exemplo: `MainActivity` (camel case), `activity_main.xml` (snake case).

### Nomeação de Pacotes em Projetos (Exemplo: `com.github...`)

A convenção de nomeação **"domínio reverso"** é amplamente usada em projetos de software, especialmente em pacotes Java e em repositórios de código. Essa convenção ajuda a garantir que os nomes dos pacotes sejam únicos e bem organizados, evitando conflitos.

#### Estrutura Padrão: **`com.github...`**

1. **Domínio Reverso (Reverse Domain)**:
   - A primeira parte do nome do pacote, como **`com`**, refere-se a um domínio de nível superior (por exemplo, **com** para empresas comerciais, **org** para organizações sem fins lucrativos).
   - **`github`** representa o serviço de hospedagem do código, ou seja, o nome da plataforma onde o repositório está localizado (neste caso, GitHub).

2. **Identificação do Projeto**:
   - Após o domínio reverso, vem o nome do usuário ou da organização do repositório. Em **`com.github.username`**, **`username`** é o nome de usuário do GitHub ou o nome da organização.
   - Em seguida, o nome do projeto ou repositório é incluído. Assim, **`com.github.username.project`** identificaria de forma única um repositório ou pacote de projeto hospedado no GitHub.

#### Exemplo Completo:
```plaintext
com.github.username.project
```
- **`com.github`** - Refere-se à plataforma de hospedagem de código, GitHub.
- **`username`** - Refere-se ao nome de usuário ou organização do GitHub.
- **`project`** - Nome do projeto ou repositório hospedado no GitHub.

### Por que usar esse padrão?

- **Unicidade**: Ao utilizar o domínio reverso, é possível garantir que o nome do pacote será único, minimizando o risco de colisões de nomes entre diferentes projetos.
- **Organização**: A estrutura hierárquica de nomes torna mais fácil para os desenvolvedores organizarem e localizarem pacotes ou repositórios, especialmente em projetos grandes e colaborativos.
- **Facilidade de Uso**: É uma convenção amplamente reconhecida e utilizada, especialmente em repositórios de código aberto hospedados em plataformas como GitHub, GitLab, etc.

Essa abordagem ajuda a manter a integridade dos nomes e facilita a localização de pacotes em um vasto ecossistema de código.

### Android Studio
- **Pasta "res"**: Vem de "resources" e contém recursos como imagens, strings, layouts, etc.

### Bundle
- **Bundle** é uma classe essencial no Android, usada para armazenar e transferir dados entre componentes, como activities, fragments e services. Ele é fundamental na preservação de estado, permitindo que um aplicativo salve e restaure informações quando a atividade é destruída e recriada, como em mudanças de orientação ou baixa de memória. O **Bundle** assegura que os usuários possam retomar de onde pararam, mesmo após eventos que podem causar a destruição temporária do aplicativo.

---

## Programação Orientada a Objetos

- **Paradigma** que engloba os seguintes conceitos:
  - Herança
  - Polimorfismo
  - Abstração
  - Encapsulamento

- **Atributos** = Características
- **Método** = Funções

### Herança em Kotlin
Exemplo:
```kotlin
class MainActivity : ComponentActivity() {
    // Herança de ComponentActivity
}
```
- **Herança explícita** em Kotlin (usando `:`).

### Exemplo de Função Composable (Jetpack Compose)
```kotlin
@Composable
fun Saudacao(nome: String) {
    Text(text = "Olá, $nome!")
}
```

---

## Configuração do Layout (XML)

### XML no Android
O **XML (Extensible Markup Language)** é usado para definir a interface do usuário (layouts) de forma declarativa. Ele permite organizar os componentes visuais sem precisar escrever código Kotlin para a estrutura do layout.

#### Exemplo de Layout XML:
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/textViewHello"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="16dp"
    tools:context=".MainActivity">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Olá, Mundo!"
        android:textSize="20sp" />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Clique Aqui" />
</LinearLayout>
```

#### Explicação dos Atributos:
- **`LinearLayout`**: Organiza os elementos verticalmente ou horizontalmente.
- **`android:id`**: Define um identificador único para o elemento.
- **`android:layout_width`** e **`android:layout_height`**: Define o tamanho do componente.
- **`android:textSize="20sp"`**: Define o tamanho do texto com **sp** (scale-independent pixels) → não ocorre o risco dos objetos ficarem distorcidos conforme o tamanho da tela.
- **`tools:context`**: Define o contexto (referência à Activity).

### Código Kotlin para Configuração do Layout:
```kotlin
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Define o layout XML
    }
}
```

---

## Navegação e Ciclo de Vida de Activities

### Navegação entre Activities
1. **Pilha de Activities**: As Activities são empilhadas à medida que o usuário navega entre elas. A navegação segue a ordem:
    - A1 → A2 → A3 (Navegação inicial)
    - Ao pressionar "voltar", a pilha é desempilhada, e a Activity anterior é restaurada.

2. **CLEAR_TOP**: Usado para limpar Activities anteriores da pilha e voltar diretamente para uma Activity específica.

### Estados da Activity
- **onCreate()**: Chamado quando a Activity é criada.
- **onStart()**: Chamado quando a Activity se torna visível.
- **onResume()**: Chamado quando a Activity está pronta para interação.
- **onPause()**: Chamado quando o usuário sai da Activity, mas ela não é destruída.
- **onStop()**: Chamado quando a Activity não está mais visível.
- **onRestart()**: Chamado quando a activity está sendo trazida de volta para o primeiro plano (após onStop()).
- **onDestroy()**: Chamado antes da Activity ser destruída, liberando recursos.

---

## Imagens

![image](https://github.com/user-attachments/assets/0612ca9c-0773-4860-9d23-60dd0792c4d4)



![image](https://github.com/user-attachments/assets/973f1fb6-0041-4f4d-b349-555fd1446d62)


![image](https://github.com/user-attachments/assets/d526e071-531a-41ff-a8dc-63eb2979063b)





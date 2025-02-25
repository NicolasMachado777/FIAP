
Pilares POO

Herança -> São os atributos da classe que são herdados por extends por outra ":" significa herança
Polimorfismo -> caracteristicas de mesmos metodos herdados com comportamentos diferentes (mesma assinatura com atributos diferentes)
Encapsulamento -> 
Abstração ->

Declarar String no Kotlin 
Nome : String
O mesmo dos outros
INT : Idade

No kt sempre tem fun antes de uma função

Greeting é o que faz aparecer o texto na tela
Greeting("Android")

$ recebe o valor que é
String = nome

text = "Hello $name"
  Aq vai mostrar o nome do usuario
  
Linear Layout -> Um ao lado do outro

<textView
android:layout_width="wrap_content" respeita a largura
        android:layout_height="wrap_content" respeita a altura
        android:id="@+id/textViewHello"
        android:text="Hello World!"
        android:textSize="24sp" >

 android:orientation="vertical"
    android:layout_width="match_parent" Consumir toda a largura do dispositivo
    android:layout_height="match_parent" Consumir toda altura do disp
    android:gravity="center" Text no centro
    tools:context=".MainActivity">

R é o acesso a pasta de recurso, ou seja, res

Bind -> Processo de comunicação entre xml e kotlin

import 'package:aula1103/aula1103.dart' as aula1103;

void main() {}

class Padding {
  double top=0, rig=0, bot=0, left=0;
  Padding(this.top, this.rig, this.bot, this.left) {}
Padding.horizontal(this.left, this.rig){}
Padding.symmetric({double hori=0, double vert=0 }){}

}

//terminar exercicio dele

//   var aluno = Aluno("recebna", 21,0);
//   /*aluno.nome = "Jao";
//   aluno.idade = 21;
//   aluno.nota = 9;*/


//   aluno.exibirInformacoes();
// }

// class Aluno {
//   String nome;
//   int idade;
//   double nota;

//   Aluno(this.nome, this.idade, this.nota){
//   }

//   void exibirInformacoes() {
//     print("Nome do aluno: $nome.");
//     print("Idade do aluno: $idade anos.");
//     print("Nota do aluno: $nota.");
//   } 
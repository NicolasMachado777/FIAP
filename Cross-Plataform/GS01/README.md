import 'package:flutter/material.dart'; // Importa o pacote de widgets do Flutter

void main() => runApp(const MyApp()); // Ponto de entrada: executa o widget MyApp

/// Modelo simples de Abrigo
class Shelter {
  String name;           // Nome do abrigo
  int maxCapacity;       // Capacidade máxima do abrigo
  int currentCount;      // Contagem atual de ocupantes

  Shelter({
    required this.name,        // Nome obrigatório
    required this.maxCapacity, // Capacidade máxima obrigatória
    this.currentCount = 0,      // Inicia a contagem em 0 por padrão
  });

  bool get isFull => currentCount >= maxCapacity; // Retorna true se estiver cheio
}

class MyApp extends StatelessWidget {
  const MyApp({super.key}); // Construtor padrão

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Abrigos',                    // Título do app
      theme: ThemeData(primarySwatch: Colors.blue), // Tema principal
      home: const SheltersPage(),          // Página inicial
    );
  }
}

class SheltersPage extends StatefulWidget {
  const SheltersPage({super.key}); // Construtor padrão

  @override
  State<SheltersPage> createState() => _SheltersPageState(); // Cria o estado
}

class _SheltersPageState extends State<SheltersPage> {
  // Lista de abrigos
  final List<Shelter> shelters = [
    Shelter(name: 'Abrigo Central', maxCapacity: 5),
    Shelter(name: 'Abrigo Leste',   maxCapacity: 3),
    Shelter(name: 'Abrigo Norte',   maxCapacity: 4),
  ];

  void _increment(int index) {
    setState(() { // Notifica Flutter para reconstruir a UI
      if (shelters[index].currentCount < shelters[index].maxCapacity) {
        shelters[index].currentCount++; // Incrementa contagem se não estiver cheio
      }
    });
  }

  void _decrement(int index) {
    setState(() { // Notifica Flutter para reconstruir a UI
      if (shelters[index].currentCount > 0) {
        shelters[index].currentCount--; // Decrementa contagem se maior que zero
      }
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Lista de Abrigos'), // Título na AppBar
      ),
      body: Padding(
        padding: const EdgeInsets.symmetric(vertical: 16), // Espaço vertical
        child: ListView.builder(
          scrollDirection: Axis.horizontal, // Scroll horizontal
          itemCount: shelters.length,       // Número de itens
          itemBuilder: (context, i) {       // Constrói cada item
            final s = shelters[i];          // Abrigo atual

            // Escolhe ícone e cor baseado em isFull
            final iconData = s.isFull
                ? Icons.warning_amber_outlined // Warning se cheio
                : Icons.check_circle_outline; // Check se há vaga
            final iconColor = s.isFull ? Colors.red : Colors.green; // Cor

            return SizedBox(
              width: 260, // Largura fixa de cada card
              child: Card(
                margin: const EdgeInsets.symmetric(horizontal: 12), // Margem
                elevation: 4, // Sombra do card
                child: Padding(
                  padding: const EdgeInsets.all(16), // Espaço interno
                  child: Column(
                    crossAxisAlignment: CrossAxisAlignment.start, // Alinha à esquerda
                    children: [
                      Row(
                        children: [
                          Expanded(
                            child: Text(
                              s.name, // Exibe o nome do abrigo
                              style: const TextStyle(
                                fontSize: 18,        // Tamanho da fonte
                                fontWeight: FontWeight.bold, // Negrito
                              ),
                            ),
                          ),
                          Icon(iconData, color: iconColor, size: 28), // Ícone de status
                        ],
                      ),
                      const SizedBox(height: 8), // Espaço entre widgets
                      Text(
                        'Ocupação: ${s.currentCount} / ${s.maxCapacity}', // Ocupação
                        style: const TextStyle(fontSize: 16),
                      ),
                      const Spacer(), // Empurra botões para baixo
                      Row(
                        mainAxisAlignment: MainAxisAlignment.end, // Alinha à direita
                        children: [
                          IconButton(
                            icon: const Icon(Icons.remove_circle_outline), // Ícone "-"
                            onPressed: () => _decrement(i), // Chama decrement
                          ),
                          IconButton(
                            icon: const Icon(Icons.add_circle_outline), // Ícone "+"
                            onPressed: () => _increment(i), // Chama increment
                          ),
                        ],
                      ),
                    ],
                  ),
                ),
              ),
            );
          },
        ),
      ),
    );
  }
}

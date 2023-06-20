import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MenuInicial {
    public static void main(String[] args) {
        
        //inicializando a scanner que le dados do usuario
        Scanner scanner = new Scanner(System.in);

        List<Pelicula> ParaAssistir = new ArrayList<>();

        int opcao;
        do {
            System.out.println("-Menu inicial-");
            System.out.println("1.adicionar a lista");
            System.out.println("2.visualizar");
            System.out.println("3.visualizar lista por categoria");
            System.out.println("0.sair");
            System.out.println("Digite o número da opção desejada: ");
            opcao = scanner.nextInt();
            //recebe o int do usuario 

            switch (opcao) {
                case 1:
                  System.out.println("Adicionar Filme");
                  scanner.nextLine(); // Limpando o buffer do scanner

                  System.out.println("Titulo:");
                  String titulo = scanner.nextLine();
                  
                  System.out.println("Categoria: "); 
                  String categoria = scanner.nextLine();
                  
                  System.out.println("Ano de lançamento: ");
                  Integer lancamento = scanner.nextInt();
                  
                  System.out.println("Duração: ");
                  Integer duracao = scanner.nextInt();
                  scanner.nextLine(); //limpando buffer do scanner
                  
                  System.out.println("Genero: ");
                  String genero = scanner.nextLine();
                  
                  //logica para adicionar o filme na lista Para Assistir 
                  Pelicula pelicula = new Pelicula(titulo, categoria, lancamento, duracao, genero);
                  ParaAssistir.add(pelicula);
                  System.out.println("Adicionado com sucesso!");
                  break;
                case 2:
                  //vizualizar a lista 
                  if (ParaAssistir.isEmpty()) {
                    System.out.println("A lista está vazia :( )");
                  } else {
                    System.out.println("Lista para assistir: ");
                    for (Pelicula pelicula2 : ParaAssistir) {
                      System.out.println(ParaAssistir);
                    }
                  }
                  break;
                case 3:
                  System.out.println("Visualizar por genero: ");
                  if (ParaAssistir.isEmpty()) {
                    System.out.println("A lista está vazia");
                  } else {
                    //mapeando por genero 
                    Map<String, List<Pelicula>> PeliculasPorGenero = new HashMap<>();
                    for (Pelicula pelicula3 : ParaAssistir) {
                      String generoPelicula = pelicula3.getGenero();
                      List<Pelicula> PeliculasDoGenero = PeliculasPorGenero.getOrDefault(generoPelicula, new ArrayList<>());
                      PeliculasDoGenero.add(pelicula3);
                      PeliculasPorGenero.put(generoPelicula, PeliculasDoGenero);
                    }
                    //exibindo filmes separados por genero
                    for (Map.Entry<String, List<Pelicula>> entry : PeliculasPorGenero.entrySet()) {
                      String genero2 = entry.getKey();
                    List<Pelicula> PeliculasDoGenero = entry.getValue();

                    System.out.println("Genero: " + genero2);
                    for (Pelicula pelicula2 : PeliculasDoGenero) {
                      System.out.println(pelicula2);
                    }
                    System.out.println();
                  } 
                  }
                  break;
                case 0:
                  System.out.println("Saindo do programa...");
                  break;
                default:
                  System.out.println("Opção inválida!");
                  break;
            }

            System.out.println();
        } while (opcao != 0);

        scanner.close();

    }
}


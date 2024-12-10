package EX46;
import java.util.ArrayList;
import java.util.List;

public class Blibioteca {
    private  List<Livros> livros;

    public void Biblioteca() {
        livros = new ArrayList<>();
   }

   public void adicionarLivro(){
        livros.add(livro);
   }

   public void listaDeLivros(){
        for(Livros livro: livros){
            System.out.println("Livro" + livro.getTitulo());
        } 
   }
}
    
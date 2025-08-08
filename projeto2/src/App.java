import java.util.Scanner;

public class App {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Indique o nome do professor: "); //alteracao pro exercicio de branches
        String nome = s.nextLine();
        System.out.print("Indique quantos anos de experiencia ele tem: ");  //comentario da branch alteracao
        int experiencia = s.nextInt();
        Professor p = new Professor(nome, experiencia);
        System.out.println(p.toString());
        System.out.println("Categoria: " + p.classifica());
        s.close();
    }
}
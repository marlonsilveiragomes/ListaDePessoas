import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa pessoaUm = new Pessoa("Marcelo Duncam", 40);
        Pessoa pessoaDois = new Pessoa("Mirosmar Quaresma", 16);
        Pessoa pessoaTres = new Pessoa("Jaqueline Bukoviski", 21);
        Pessoa pessoaQuatro = new Pessoa("Natalina Belismina0",15);
        Pessoa pessoaCinco = new Pessoa("Serafim Abaquatro", 42);


        listaDePessoas.add(pessoaDois);
        listaDePessoas.add(pessoaUm);
        listaDePessoas.add(pessoaTres);
        listaDePessoas.add(pessoaQuatro);
        listaDePessoas.add(pessoaCinco);


        System.out.println("O tamanho da lista é: " + listaDePessoas.size());
        System.out.println(" A primeira pessoa da lista é: " + listaDePessoas.get(0));
        System.out.println("Aqui esta a lista completa de Pessoas: ");
                for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }

    }
}

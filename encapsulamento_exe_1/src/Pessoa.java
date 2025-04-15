public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;

    //guarda as informações da pessoa
    public Pessoa(String nome, String sobrenome, int idade){
        this.nome = nome;
        this.sobrenome = sobrenome;

        if (idade < 0) {
            System.out.println("Idade não reconhecida");
            this.idade = 0; //valor caso não for uma idade valida
        } else {
            this.idade = idade;
        }
    }
    //metodo que vai exibir as informações da pessoa
    public void exibirInformacoes(){
        System.out.println("Nome completo : "+ nome + " " + sobrenome);
        System.out.println("Idade : " + idade);
    }
}

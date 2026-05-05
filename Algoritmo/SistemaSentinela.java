import java.util.Scanner;

public class SistemaSentinela {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    String nome, cargo;
    int nivelAcesso, nivelSigilo;

    System.out.println("----------- Sistema Sentinela -----------");


    System.out.println("Digite o nome do profissional: ");
    nome = sc.nextLine();
    
    System.out.println("Digite o cargo do profissional (Cientista, Engenheiro, Zelador, Administrativo): ");
    cargo = sc.nextLine().toLowerCase();
    
    System.out.println("Digite o seu nível de acesso (de 1 a 10): ");
    nivelAcesso = sc.nextInt();
    
    while (nivelAcesso < 1 || nivelAcesso > 10) {
        System.out.println("Erro: Nível de acesso inválido. Digite novamente: ");
        nivelAcesso = sc.nextInt();    
    }

    System.out.println("Digite nível de sigilo da área que ele deseja acessar (de 1 a 10): ");
    nivelSigilo = sc.nextInt();

    while (nivelSigilo < 1 || nivelSigilo > 10) {
        System.out.println("Erro: Nível de sigilo inválido. Digite novamente: ");
        nivelSigilo = sc.nextInt();    
    }

    if (nivelAcesso >= nivelSigilo) {
        System.out.println(nome + "(" + cargo + ")" + " - ACESSO PERMITIDO. Saldo de autoridade: " + (nivelAcesso-nivelSigilo) + "." );
    
    }else if(nivelAcesso < 3 && nivelSigilo > 7){
        System.out.println(nome + "(" + cargo + ")" + "- ACESSO NEGADO." + "\nALERTA: Tentativa de acesso indevida detectada!");

    }else{
        System.out.println("ACESSO NEGADO. Nível de acesso insuficiente!");

    }
    

    sc.close();
}
}

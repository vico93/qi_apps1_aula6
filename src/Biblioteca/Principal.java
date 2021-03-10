package Biblioteca;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        // Entrada
        Scanner stdin = new Scanner(System.in);
        
        // Variáveis auxiliares
        byte opcaoToString;
        
        // Classes
        Cliente c1 = new Cliente();
        Livro l1 = new Livro();
        
        System.out.print("---------SISTEMA DE BILBIOTECA---------\nDigite o nome do cliente: ");
        c1.nome = stdin.nextLine();
        
        System.out.print("Digite o CPF do cliente: ");
        c1.setCpf(stdin.nextLine());
        
        System.out.print("Digite a data de nascimento (DD/MM/YYYY): ");
        c1.setDataNascimento(stdin.nextLine());
        
        if (c1.estaAniversariando())
        {
            System.out.println("Feliz aniversario! Temos ofertas para você!");
        }
        
        System.out.println("------------------------------------------");
        
        System.out.println("Informe o título do livro: ");
        l1.titulo = stdin.nextLine();
        System.out.println("Informe o autor do livro: ");
        l1.autor = stdin.nextLine();
        System.out.println("Informe o gênero do livro: ");
        l1.setGenero(stdin.nextLine());
        System.out.println("Informe o ano do livro: ");
        l1.setAno(stdin.nextInt());
        System.out.println("Informe o preço do livro: ");
        l1.setPreco(stdin.nextDouble());
        
        if (c1.estaAniversariando() || l1.temDesconto())
        {
            System.out.println("Valor à pagar: " + l1.calcularDesconto(10));
        }
        
        System.out.print("Gostaria de ver os dados do livro e do cliente? 1-Livro 2-Cliente 3-nada\n");
        opcaoToString = stdin.nextByte();
        
        switch (opcaoToString)
        {
            case 1:
                System.out.println(l1);
                break;
            case 2:
                System.out.println(c1);
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
    
}

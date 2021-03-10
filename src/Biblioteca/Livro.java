package Biblioteca;

public class Livro
{
    public String titulo;
    public String autor;
    private String genero;
    private int ano;
    private double preco;

    public String getGenero()
    {
        return genero;
    }

    public void setGenero(String genero)
    {
        this.genero = genero;
    }

    public int getAno()
    {
        return ano;
    }

    public void setAno(int ano)
    {
        this.ano = ano;
    }

    public double getPreco()
    {
        return preco;
    }

    public void setPreco(double preco)
    {
        this.preco = preco;
    }

    // Construtor
    public Livro()
    {
    }   
    
    // Retorna se tem desconto se for maior de 80 reais
    public boolean temDesconto()
    {
        if (this.preco > 80.00)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    // Calcular o valor com desconto
    public double calcularDesconto(double porcentagem)
    {
        return this.preco - (this.preco * (porcentagem / 100));
    }

    @Override
    public String toString()
    {
        return "Livro:" + "\nTítulo: " + titulo + "\nAutor: " + autor + "\nGênero: " + genero + "\nAno: " + ano + "\nPreço original: R$ " + preco;
    }
    
    
}

package Biblioteca;

import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Calendar;

public class Cliente
{
    public String nome;
    private String cpf;
    private String dataNascimento;

    public String getCpf()
    {
        return cpf;
    }

    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }

    public String getDataNascimento()
    {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento)
    {
        this.dataNascimento = dataNascimento;
    }

    // Construtor
    public Cliente()
    {
    }
    
    public boolean estaAniversariando()
    {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String dataHoje = df.format(Calendar.getInstance().getTime());
        
        if (this.dataNascimento.equals(dataHoje))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public String toString()
    {
        return "Cliente: " + "\nNome: " + nome + "\nCPF: " + cpf + "\nData de Nascimento: " + dataNascimento;
    }    
}

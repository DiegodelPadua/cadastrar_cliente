package br.com.diegodepadua.cadastro.repository;

import br.com.diegodepadua.cadastro.model.Cliente;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class ClienteRepository {

    private Cliente cliente;

    public void cadastrar(){

        //Obter o caminho para o arquivo
        Path arquivo = Path.of("C:\\Users\\sn1094808\\Ds1M\\Clientes\\clientes.csv");
        try {
            Files.writeString(arquivo, "Senai Jandira\n",StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public void excluir(){


    }
    public void listar(){


    }
    public void exibirPorId(){


    }
    public void atualizar(){


    }
}

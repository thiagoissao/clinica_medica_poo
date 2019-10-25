package models;

import utils.Cargo;

public class Doctor extends PessoaClinica{
    public Doctor(String nome, int cpf, String telefone){
        super(nome, cpf, telefone, Cargo.setIsDoctor());
    }
    
}

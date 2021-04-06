package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Aluno {
    private  String cpf, nome;
    ArrayList<Float> ListaNota = new ArrayList<Float>();

    public Aluno (){

    }
    public Aluno(String nome) {
        this.nome = nome;
    }
    public void Aluno(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public float calcularNotas(String cpf){

        float total = 0;
        Sala sala = new Sala();

        for (Float notas : ListaNota) {
            if (cpf.equals(this.cpf)) {
                System.out.println("nota : " + notas );
                total += notas;
            }
        }
        System.out.println("Total: " + total);
        return total;
    }
    public void listar(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Cpf: " + this.cpf);

    }
    public void insereNota(){
        Scanner teclado = new Scanner(System.in);
        float nota;
        System.out.println("Nota: ");
        nota = teclado.nextFloat();
        ListaNota.add(nota);
    }
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

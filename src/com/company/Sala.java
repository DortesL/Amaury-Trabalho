package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Sala {
    ArrayList<Aluno> ListaAlunos = new ArrayList<Aluno>();
    private  String nome, cpf;
    Aluno aluno = new Aluno();

    public  void insereAluno(){
        String nome, cpf;
        float nota;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Nome: ");
        nome = teclado.nextLine();
        System.out.println("CPF: ");
        cpf = teclado.nextLine();

        aluno.Aluno(nome, cpf);
        aluno.insereNota();
        ListaAlunos.add(aluno);
    }

    public void Situacoes(){
        float nota_total ;
        for (int i=0; i<ListaAlunos.size(); i++) {

            System.out.println("Aluno: " + ListaAlunos.get(i).getNome());
            nota_total = ListaAlunos.get(i).calcularNotas(ListaAlunos.get(i).getCpf());
            System.out.println("Nota: " + nota_total);

            if (nota_total >= 70) {
                System.out.println("Aprovado");
            }else
                System.out.println("Reprovado");

        }
    }
    public void listaTodos(){
        for (Aluno listaAluno : ListaAlunos) {
            listaAluno.listar();
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
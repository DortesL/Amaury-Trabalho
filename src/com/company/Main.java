
package com.company;

import java.util.ArrayList;
import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            ArrayList<Sala> ListaSala = new ArrayList<Sala>();
            Aluno  al = new Aluno();
            Sala sal = new Sala();
            Scanner teclado = new Scanner(System.in);
            int opc;
            String cpf;

            do {

                System.out.println("===MENU===");
                System.out.println("1. Inserir");
                System.out.println("2. Listar;");
                System.out.println("3. Situações;");
                System.out.println("0. Sair.");
                opc = teclado.nextInt();
                switch(opc){
                    case 1:
                        sal.insereAluno();
                        ListaSala.add(sal);
                        break;

                    case 2:
                        sal.listaTodos();
                        break;

                    case 3:
                        sal.Situacoes();
                        break;

                }
            }while (opc != 0);

        }
    }


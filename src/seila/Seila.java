/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seila;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Seila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        ArrayList<String> itens = new ArrayList<>();
        ArrayList<Boolean> fez = new ArrayList<>();
        int coisao = 0;
        int max = 10;
        while (coisao == 0){
            System.out.println("");
            System.out.println("Lista de tarefas");
            System.out.println("1 Adicionar");
            System.out.println("2 Listar");
            System.out.println("3 completar");
            System.out.println("4 deletar");
            System.out.println("5 encerrar");
            int atual = scan.nextInt();
            if (atual == 1){
                System.out.println("Qual item quer adicionar?");
                scan.nextLine(); 
                String add = scan.nextLine();
                if (itens.size() >= max){
                    System.out.println("Item " + add + " nao pode ser adicionado!");
                    System.out.println("Limite maximo alcancado de 10 itens");
                }else{
                    itens.add(add);
                    fez.add(Boolean.FALSE); 
                }

                System.out.println("Item adicionado com sucesso!");
            }else if (atual == 2){
                System.out.println("");
                for (int i = 0; i < itens.size(); i++) {
                    System.out.print((i + 1) + "-[");
                    if (fez.get(i) == Boolean.FALSE){
                        System.out.print(" ");
                    }else{
                        System.out.print("X");
                    }
                    System.out.print("] " + itens.get(i));
                    System.out.println("");
                    
                }
            }else if (atual == 3){
                System.out.println("Qual item quer completar?");
                int dex = scan.nextInt();
                dex -= 1;
                fez.set(dex, Boolean.TRUE);
                System.out.println("Item " + itens.get(dex) + " completado com sucesso!");
            }else if (atual == 4){
                System.out.println("Qual item quer deletar?");
                int dex = scan.nextInt();
                dex -= 1;
                itens.remove(dex);
                fez.remove(dex);
                System.out.println("Item deletado com sucesso!");
            }else if (atual == 5){
                System.out.println("Programa encerrado");
                coisao = 1;
                
            
            }
        }
            
        
    }
    
}

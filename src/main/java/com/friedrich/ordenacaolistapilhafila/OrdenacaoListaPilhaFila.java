package com.friedrich.ordenacaolistapilhafila;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.*;

/**
 *
 * @author Lucas Friedrich <ntc.lucassilva@gmail.com>
 *
 */

public class OrdenacaoListaPilhaFila {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Stack<Integer> pilha = new Stack<>();
        Queue<Integer> fila = new LinkedList<>();

        // Passo 2: Remover da lista e adicionar na pilha
        while (!lista.isEmpty()) {
            pilha.push(lista.remove(0));
        }

        // Passo 3: Remover da pilha e adicionar na fila
        while (!pilha.isEmpty()) {
            fila.add(pilha.pop());
        }

        // Passo 4: Adicionar os números na lista
        lista.addAll(Arrays.asList(6, 7, 8, 9, 10));

        // Passo 5: Repetir os passos 2 e 3
        while (!lista.isEmpty()) {
            while (!lista.isEmpty()) {
                pilha.push(lista.remove(0));
            }
            while (!pilha.isEmpty()) {
                fila.add(pilha.pop());
            }
        }

        // Passo 6: Exibir os números da fila
        System.out.println("Números inseridos na fila:");
        while (!fila.isEmpty()) {
            System.out.println(fila.remove());
        }
    }
}

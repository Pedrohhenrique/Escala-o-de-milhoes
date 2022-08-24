package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("Digite o nome do seu time:");
        Scanner nome = new Scanner(System.in);
        String time = nome.nextLine();
        List jogadores = new ArrayList<>();
        List jogadoresPosicao = new ArrayList<>();
        jogadoresPosicao.add("Gol");
        jogadoresPosicao.add("Zag");
        jogadoresPosicao.add("Zag2");
        jogadoresPosicao.add("Ld");
        jogadoresPosicao.add("Le");
        jogadoresPosicao.add("Mc");
        jogadoresPosicao.add("MD");
        jogadoresPosicao.add("Me");
        jogadoresPosicao.add("At");
        jogadoresPosicao.add("Pe");
        jogadoresPosicao.add("Pd");

        for (i = 0; i <= 10; i++) {
            int i1 = i;
            System.out.println("Insira o nome do jogador do seu time, para a seguinte posição:" + jogadoresPosicao.get(i));
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            jogadores.add(str);

        }
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("-------------------------------------------" + jogadores.get(0) + "---------------------------------------");
        System.out.println("---------" + jogadores.get(4) + "--------------------" + jogadores.get(1) + "------------------------" + jogadores.get(2) + "--------------------" + jogadores.get(3) + "------");
        System.out.println("---------" + jogadores.get(7) + "---------------------------------" + jogadores.get(5) + "-------------------------------" + jogadores.get(6) + "------");
        System.out.println("---------" + jogadores.get(7) + "---------------------------------" + jogadores.get(5) + "-------------------------------" + jogadores.get(6) + "------");


    }
}
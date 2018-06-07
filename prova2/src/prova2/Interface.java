package prova2;

import console.Console;

public class Interface {
    public void montaMenu(){
        Console.writeLn("***************************************************************");
        Console.writeLn("Bem vindo ao sistema de controle de caixa da lanchonete QWERTY!");
        Console.writeLn("***************************************************************");
        Console.writeLn("");
        Console.writeLn("Selecione uma opção abaixo: ");
        Console.writeLn("");
        Console.writeLn("01   -   Cardápio");
        Console.writeLn("02   -   Vender");
        Console.writeLn("03   -   Total vendido");
        Console.writeLn("04   -   Sair");
        Console.writeLn("");
    }
    
    public void montaCardapio(){
        Console.writeLn("   ***   Cardápio   ***");
        Console.writeLn("");
        Console.writeLn("   Pratos Peincipais");
        Console.writeLn("01   Sopa          - R$22,00");
        Console.writeLn("02   Macarronada   - R$30,00");
        Console.writeLn("03   Bife a cavalo - R$25,00");
        Console.writeLn("");
        Console.writeLn("   Sobremesas");
        Console.writeLn("04   Sorvete       - R$8,00");
        Console.writeLn("05   Petit gateau  - R$11,00");
        Console.writeLn("");
        Console.writeLn("   Bebidas");
        Console.writeLn("06   Refrigerante  - R$6,00");
        Console.writeLn("07   Água          - R$4,00");
        Console.writeLn("08   Vinho         - R$10,00");
        Console.writeLn("");
    }
    
    public int[][] escolherItens(){
        int[][] itensCardapio = new int[8][3];
        int item = 0;
        int quantidade = 0;
        int valorTotal = 0;
        Console.writeLn("Informe um item do cardápio (1 a 8) e 0 para terminar: ");
          
        for (int linha = 0; linha < 7; linha++) { 
            Console.writeLn("Item: ");
            item = Console.readInt();
            if (item == 0){
                break;
            }
            else{
                itensCardapio[linha][0] = item;
            }
            Console.writeLn("Quantidade: ");
            quantidade = Console.readInt();
            if (quantidade == 0) {
                break;
            } 
            itensCardapio[linha][1] = quantidade; 
            itensCardapio[linha][2] = buscaPrecoItem(item)*itensCardapio[linha][1];
            valorTotal += itensCardapio[linha][2];
            Console.writeLn("Total: R$" + valorTotal);
        }
        return itensCardapio;
    }
    
    public int buscaPrecoItem(int item){
        int preco = 0;
        switch (item){
            case 1:
                preco = 22;
                break;
            case 2:
                preco = 30;
                break;
            case 3:
                preco = 25;
                break;
            case 4:
                preco = 8;
                break;
            case 5:
                preco = 11;
                break;
            case 6:
                preco = 6;
                break;
            case 7:
                preco = 4;
                break;
            case 8:
                preco = 10;
                break;
        }
        return preco;
    }
}

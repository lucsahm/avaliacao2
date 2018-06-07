package prova2;
import console.Console;
public class Prova2 {
    
    public static void main(String[] args) {
        
        Interface menu = new Interface();
        int opcaoMenu = 0;
        int opcaoCardapio = 0;
        int[][] totalItensEscolhidos = new int[7][3];
        
        do{ 
            menu.montaMenu();
            Console.write("Opção: ");
            opcaoMenu = Console.readInt();
            
            switch (opcaoMenu){
                case 1:
                    menu.montaCardapio();     
                    break;
                case 2:
                    menu.escolherItens();                   
                    break;
                case 3:
                    Console.writeLn("Total vendido ...");
                    
                    break;
                case 4:
                    Console.writeLn("Até a próxima!");
                    break;
            }
        }while (opcaoMenu != 4);        
        Console.writeLn("Fim do Programa!");         
    }
}
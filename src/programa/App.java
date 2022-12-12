package programa;

import java.util.Scanner;

public class App {    
    public static void main(String[] args) throws Exception {
        Scanner pegar_input = new Scanner(System.in);
        String menu = "1- celsius para farenheit\n2- celsius para kelvin\n3- farenheit para kelvin\n4- kelvin para farenheit\n5- sair do programa: ";
        int escolha = 0;
        double temperatura_entrada = 0;
        String aviso_erro = "Erro, digite apenas números entre 1 e 5";
        System.out.println("bem vindo ao programa de converter unidades de medida de temperatura");
        while(escolha != 5){
            System.out.println(menu);
            escolha = pegar_input.nextInt();
            switch (escolha) {
                case 1:
                    System.out.printf("Digite o valor da temperatura em Celsius: ");
                    temperatura_entrada = pegar_input.nextDouble();
                    System.out.printf("%.2fC correspondem a %.2fF\n", temperatura_entrada, ConversorTemperatura.celsius_para_farenheit(temperatura_entrada));
                    break;
                case 2:
                    System.out.printf("Digite o valor da temperatura em Celsius: ");
                    temperatura_entrada = pegar_input.nextDouble();
                    System.out.printf("%.2fC correspondem a %.2fK\n", temperatura_entrada, ConversorTemperatura.celsius_para_kelvin(temperatura_entrada));
                    break;
                case 3:
                    System.out.printf("Digite o valor da temperatura em Farenheit: ");
                    temperatura_entrada = pegar_input.nextDouble();
                    System.out.printf("%.2fF correspondem a %.2fK\n", temperatura_entrada, ConversorTemperatura.farenheit_para_kelvin(temperatura_entrada));
                    break;
                case 4:
                    System.out.printf("Digite o valor da temperatura em Kelvin: ");
                    temperatura_entrada = pegar_input.nextDouble();
                    System.out.printf("%.2fK correspondem a %.2fF\n", temperatura_entrada, ConversorTemperatura.kelvin_para_farenheit(temperatura_entrada));
                    break;
                case 5:
                    System.out.println("Obrigado por utilizar o programa, bons estudos :)");
                    break;
                default:
                    System.out.println(aviso_erro);
                    break;
            }
        }
        pegar_input.close(); // fechando processo do objeto Scanner
    }
}

package aplicacao;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
public class PagamentoContaEntregaFinal {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n = 0, i = 0, resp1 = 1;
		
		System.out.println("------------------ MENU 1 -------------------");
		System.out.println("1 - Realizar cadastro e gerar relatório.");
		System.out.println("2 - Sair do menu.");
		System.out.println("---------------------------------------------");
		
		do {
		System.out.print("# Digite a opção desejada no Menu 1: ");
		int menu1 = sc.nextInt();
		
	    if (menu1 == 1) {	
		System.out.print("# Digite o número de usuários a cadastrar? ");
		n = sc.nextInt();
	    }
		
		switch (menu1) {
		
		case (1):
			
		String nome [] = new String [n];
		String cpf [] = new String [n];
		Integer conta [] = new Integer [n];
		Double deposito [] = new Double [n];
		
		for (i = 0; i < n; i++) {
		System.out.println("---------------------------------------------");
		System.out.println("Digite as informações dos Usuários: ");
		System.out.print("# Nome: ");
		nome [i] = sc.next();
		System.out.print("# CPF: ");
		cpf [i] = sc.next();
		System.out.print("# Número da conta: ");
		conta [i] = sc.nextInt();
		sc.nextLine();	
		
		System.out.print("# Deseja realizar um depósito (S ou N)? ");
		char resp = sc.next().charAt(0);
		if (resp == 'S' || resp == 's') {
			System.out.print("# Valor (R$): ");
			deposito [i] = sc.nextDouble();
		} else {
			deposito [i] = 0.0;
	    }
		
		System.out.println("---------------------------------------------");
		System.out.print("# Deseja realizar pagamento para o " + (i+1) + 
				           "° pessoa cadastrada (SIM ou NAO)? ");
		String pagamento = sc.next();
		
		if (pagamento.equals("SIM")) {
			
		System.out.println("------------------ MENU 2 -------------------");
		System.out.println(" 1 - R$ 1500.00");
		System.out.println(" 2 - R$ 2500.00");
		System.out.println(" 3 - R$ 4500.00");
		System.out.println(" 4 - R$ 5500.00");
		System.out.print("# Escolha um opção: ");
		int menu2 = sc.nextInt();
	
			switch (menu2) {
			
			case (1):
				
				if (menu2 == 1 && deposito[i] >= 1500) {
					System.out.println("Pagamento realizado com sucesso!!");
				    System.out.println("Seu saldo de R$ " + deposito [i] + " é suficiente.");
				    deposito [i] -= 1500;
				} else {
					System.out.println("Saldo de R$ " + deposito [i] + " é insuficiente!");
				}
				break;
			
            case (2):
				
				if (menu2 == 2 && deposito[i] >= 2500) {
					System.out.println("Pagamento realizado com sucesso!!");
				    System.out.println("Seu saldo de R$ " + deposito [i] + " é suficiente.");
				    deposito [i] -= 2500;
				} else {
					System.out.println("Saldo de R$ " + deposito [i] + " é insuficiente!");
				}
				break;
				
            case (3):
				
				if (menu2 == 3 && deposito[i] >= 4500) {
					System.out.println("Pagamento realizado com sucesso!!");
				    System.out.println("Seu saldo de R$ " + deposito [i] + " é suficiente.");
				    deposito [i] -= 4500;
				} else {
					System.out.println("Saldo de R$ " + deposito [i] + " é insuficiente!");
				}
				break;
				
            case (4):
				
				if (menu2 == 4 && deposito[i] >= 5500) {
					System.out.println("Pagamento realizado com sucesso!!");
				    System.out.println("Seu saldo de R$ " + deposito [i] + " é suficiente.");
				    deposito [i] -= 5500;
				} else {
					System.out.println("Saldo de R$ " + deposito [i] + " é insuficiente!");
				}
				break;
		    }
	      }
		}
		
		for (i = 0; i < n; i++) {
			System.out.println();
			System.out.println("------------------- RELATÓRIO --------------------");
	    	System.out.println("A " + (i+1) + "° Pessoa cadastrada com Nome: " + nome[i] + 
	    			", CPF: " + cpf[i] + ", Número da conta: " + conta[i] 
	    			+ " e Saldo: R$ " + deposito[i]);
		}	
		    break;
		
		default: 
			System.out.println("Você saiu do MENU!!");
			break;
		   
		}
		
		System.out.println("--------------------------------------------------");
	    System.out.print("Deseja voltar para o Menu (1 - SIM ou 2 - NÃO): ");
	    resp1 = sc.nextInt();
	    System.out.println("--------------------------------------------------");
		
		} while (resp1 == 1);
		
		sc.close();
	}
}

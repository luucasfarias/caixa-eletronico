/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixaeletronico1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Farias
 */
public class CaixaEletronico1 {
   /* Contas do sistemas. Em atividade operacional apenas info e info2.
    **
    */
    Caixa2 info = new Caixa2();
    Caixa2 info2 = new Caixa2();
    Caixa2 info3 = new Caixa2();
    Caixa2 info4 = new Caixa2();
    Caixa2 info5 = new Caixa2();
    public static void main(String[] args){
       
        CaixaEletronico1 dados = new CaixaEletronico1();
        Scanner input = new Scanner(System.in);
        int op = 0;
        String operacao;
        for(int i=0; i<2; i++){
            System.out.println("\n");
        }
        while(op!=7){  
            System.out.println("\n");
            System.out.println("||==============================================||");
            System.out.println("||==============================================||");
            System.out.println("||========= CAIXA ECONÔMICA FEDERATIVA =========||");
            System.out.println("||==============================================||");
            System.out.println("||==============================================||");
            System.out.println("||============ >>SEJA BEM VINDO<< ==============||");
            System.out.println("||==============================================||");
            System.out.println("||==============================================||");
            System.out.println("||============== MENU DE OPÇÕES ================||");
            System.out.println("||==============================================||");
            System.out.println("||==============================================||");
            System.out.println("\n");
            System.out.println("||==============================================||");
            System.out.println("||- Por favor, escolha a opção desejada.        ||");
            System.out.println("||==============================================||");
            System.out.println("||==============================================||");
            System.out.println("||- 1 ->> Cadastrar Cliente <<-:                ||");
            System.out.println("||- 2->> Extrato <<-:                           ||");
            System.out.println("||- 3->> Sacar <<-:                             ||");
            System.out.println("||- 4->> Depositar <<-:                         ||");
            System.out.println("||- 5->> Transferencia <<-:                     ||");
            System.out.println("||- 6->> pagamento de conta <<-:                ||");
            System.out.println("||- 7->> Sair <<-:                              ||");
            System.out.println("||==============================================||");
            op=input.nextInt();
            
            switch(op){
                case 1:
                    dados.execCadastrar();
                    break;
                case 2:
                    dados.execExtrato();
                    break;
                case 3:
                    dados.execSacar();
                    break;
                case 4:
                    dados.execDepositar();
                    break;
                case 5:
                    dados.execTransferir();
                    break;   
                case 6:
                    dados.execContaValor();
                    break;
            }        
        }
    }
    private double saldo;
    private void execExtrato() {
        double valor = 0;
        for(int i=0; i<5; i++){
            System.out.println("\n");
        }
        this.info.extrato();
        
        //this.info2.extrato();
    }
    private void execSacar() {
        for(int i=0; i<5; i++){
            System.out.println("\n");
        }
        String opcao = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Valor do saque:");
        double valor = input.nextDouble();
        int x = this.info.sacar(valor);
        if(x == 1){
            System.out.println("SAQUE REALIZADO COM SUCESSO.");
        }else{
            System.out.println("Saque NÃO pode ser realizado.");
        }
        for(int i=0; i<5; i++){
            System.out.println("\n");
        } 
    }
    private void execDepositar() {
        for(int i=0; i<5; i++){
            System.out.println("\n");
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Deposite o valor desejado:");
        double valor = input.nextDouble();
        this.info.depositar(valor);
        System.out.println("Deposito realizado com sucesso!");
        System.out.println("...Volte sempre...");  
        for(int i=0; i<5; i++){
            System.out.println("\n");
        }
    }    
    private void execCadastrar() { 
        Scanner input = new Scanner(System.in);
        for(int i=0; i<5; i++){
            System.out.println("\n");
        }
        System.out.println("||======================================||");
        System.out.println("||========= CADASTRO DE CLIENTE ========||");
        System.out.println("||======================================||");
        System.out.println("\n");
        System.out.println("Cliente:");
        this.info.nome = input.nextLine();
        System.out.println("N° Conta:");
        this.info.numConta = input.nextInt();
        System.out.println("Agência:");
        this.info.agencia = input.nextInt();
        System.out.println("Saldo:");
        this.info.saldo = input.nextDouble();
        System.out.println("Saldo atual:" +this.info.saldo);
        System.out.println("\n");
        System.out.println("||======================================||");
        System.out.println("||========= CADASTRO DE CLIENTE ========||");
        System.out.println("||======================================||");
        System.out.println("\n");
        System.out.println("Cliente:");
        this.info2.nome = input.next();
        System.out.println("N° Conta:");
        this.info2.numConta = input.nextInt();
        System.out.println("Agência:");
        this.info2.agencia = input.nextInt();
        System.out.println("Saldo:");
        this.info2.saldo = input.nextDouble();
        System.out.println("Saldo atual:" +this.info2.saldo);
        //alteração para caso desejar aumentar o n° de contas.
        for(int i=0; i<5; i++){
            System.out.println("\n");
        } 
    }
    private void execTransferir(){   
        for(int i=0; i<5; i++){
            System.out.println("\n");
        }
        Scanner input = new Scanner(System.in);
        double valor = 0;
        System.out.println("||-------------------------------------||");
        System.out.println("||=====================================||");
        System.out.println("||======= TRANSFERÊNCIA BANCÁRIA ======||");
        System.out.println("||=====================================||");
        System.out.println("||-------------------------------------||");
        System.out.println("Quanto deseja transferir?");
        this.info.transferir(info2, valor);
        valor = input.nextDouble(); 
        System.out.println("\n");
            System.out.println("||=============================================================================================================||");
        if(valor >= this.info.saldo){
            System.out.println("|| A OPERAÇÃO NÃO PODE SER REALIZADA, O VALOR DA TRANSFERÊNCIA É MAIOR OU IGUAL AO SEU SALDO DISPONÍVEL.       ||");
            System.out.println("||=============================================================================================================||");
        }else if(valor < this.info.saldo){
            System.out.println("|| A OPERAÇÃO FOI REALIZADA COM SUCESSO.                                                                       ||");
            System.out.println("||=============================================================================================================||");
            this.info.saldo -= valor;
            this.info2.saldo += valor;
        }
        //this.info.saldo-=valor;
        System.out.println("||=====================================||");
        System.out.println(">>EXTRATO AUTOMATICO APÓS TRANSFERÊNCIA<<");
        System.out.println("||=====================================||");
        System.out.println("||============ 1º CONTA ===============||");
        System.out.println("||=====================================||");
        System.out.println("\n");
        this.info.extrato();        
        System.out.println("||-------------------------------------||");
        System.out.println("||-------------------------------------||");        
        System.out.println("\n");
        //this.info2.saldo+=valor;
        System.out.println("||=====================================||");
        System.out.println(">>EXTRATO AUTOMATICO APÓS TRANSFERÊNCIA<<");
        System.out.println("||=====================================||");
        System.out.println("||============ 2º CONTA ===============||");
        System.out.println("||=====================================||");
        System.out.println("\n");
        this.info2.extrato(); 
      
        for(int i=0; i<5; i++){
            System.out.println("\n");
        }
    }

    private void execContaValor(){
        Scanner input = new Scanner(System.in);       
        double contaValor = 0 ;
        int diaPagamento=0;
        this.info.pagarConta(5, diaPagamento, saldo, saldo, contaValor, saldo, saldo, saldo);
        System.out.println("Saldo posterior ao pagamento:");
        System.out.println("\n");
        this.info.extrato();
    }
}


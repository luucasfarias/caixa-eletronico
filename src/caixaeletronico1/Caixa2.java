/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixaeletronico1;

import java.util.Scanner;

/**
 *
 * @author Lucas Farias
 */
public class Caixa2 {    
    private double contaDestino;
    String nome;
    double saldo, trans;
    int numConta, agencia;
    private double limite = 100;
   
    public void conta(String nome,boolean retirou, String trans,int agencia,double limite, double saldo_inicial, int numConta, double contaDestino){
        this.contaDestino = contaDestino;
        this.nome = nome;
        this.agencia = agencia;
        this.saldo = saldo_inicial;
        this.numConta = numConta;
        this.limite = limite;
    }
    public void extrato(){        
        System.out.println("||======= EXTRATO BANCÁRIO ========||");
        System.out.println("||-> Cliente: " +this.nome);
        System.out.println("||-> N° Conta: " +this.numConta);
        System.out.println("||-> Agência: " +this.agencia);
        System.out.println("||-> Saldo: R$ " +this.saldo);
        System.out.println("||======= ***************** =======||");
        System.out.println("\n");
    }
    public int sacar(double valor){        
       if(valor >= this.saldo+this.limite){
           System.out.println("Não é possivel realizar o saque.");
       }else {
            this.saldo -= valor;
        }             
        return 0;    
    }
    public void depositar(double valor){
        this.saldo = this.saldo + valor;     
    }    
    public boolean transferir( Caixa2 destino, double valor){
        this.saldo = this.saldo - valor;
        destino.saldo = destino.saldo + valor;
        return false;
    }   
    void pagarConta(int vencimento,int diaPagamento, double desconto,double resDesconto, double contaValor,double multa, double saldo,double juros) {
        juros = 1.00;
        multa = 5.96;
        desconto = 23.00;
        vencimento = 5;
        resDesconto = (contaValor - desconto);
        Scanner input = new Scanner(System.in);
        System.out.println("CARTÃO DE CREDITO *BRASCONT* :");
        System.out.println("Valor da fatura:");
        contaValor = input.nextDouble();
        System.out.println("dia do pagamento:");
        diaPagamento = input.nextInt();
        System.out.println("\n");
        System.out.println("||=====================================================================================||");
        System.out.println("||CARTÃO DE CRÉDITO->> *BRASCONT*                                                      ||");
        System.out.println("||=====================================================================================||");
        System.out.println("||-------------------------------------------------------------------------------------||");
        System.out.println("||->> LOCAL DE PAGAMENTO:                                                              ||");
        System.out.println("||->> PAGAVEL EM QUALQUER BANCO ATÉ O VENCIMENTO, "
                + "OU DEBITANDO DIRETO DE SUA CONTA BANCÁRIA.                                                      ||");
        System.out.println("||-------------------------------------------------------------------------------------||");
        System.out.println("||->> CEDENTE: *BRASCONT*                                                              ||");
        System.out.println("||-------------------------------------------------------------------------------------||");
        System.out.println("||->> CLIENTE: " + this.nome);
        System.out.println("||->> DATA DO VENCIMENTO: " + vencimento);
        System.out.println("||->> DATA DO PAGAMENTO: " + diaPagamento);
        System.out.println("||->> N° DA CONTA: " + this.numConta);
        System.out.println("||->> AGENCIA DO CLIENTE: " + this.agencia);
        System.out.println("||->> VALOR DO DOCUMENTO: R$ " + contaValor);
        System.out.println("||-------------------------------------------------------------------------------------||");
        System.out.println("||->> INSTRUÇÕES (TEXTO DE RESPONSABILIDADE DO CEDENTE).                               ||");
        System.out.println("||-------------------------------------------------------------------------------------||");
        System.out.println("|| -> Após o vencimento, cobrar multa de R$ 5,96 e juros de R$ 1,00 ao dia.            ||");
        System.out.println("|| -> Até o dia do vencimento obter desconto de R$ 23,00 .                             ||");
        System.out.println("||=====================================================================================||");
        System.out.println("|| ***************************** CODIGO DE BARRAAS ************************************||");
        System.out.println("||=====================================================================================||");
        System.out.println("||               |!|!|!|!|!|!|!|!!|!|!|!|!|!|!|!|!|!|!|!|!!|!|!|!|!|!|!!               ||");
        System.out.println("||               |!|!|!|!|!|!|!|!|!|!|!|!|!|!|!|!|!|!|!!!|!|!|!|!|!|!|!|               ||");
        System.out.println("||               |!|!|!|!|!|!|!|!|!|!|!|!|!|!|!|!|!|!!|!|!!|!|!!|!|!|!!!               ||");
        System.out.println("||               |!|!|!|!|!||!!!|!|!|!!!|!|!|!|!|!|!|!|!|!|!|!|!!|!|!|!|               ||");
        System.out.println("||=====================================================================================||");
        if(diaPagamento <= vencimento){
            this.saldo -= contaValor - desconto;
            System.out.println("O pagamento foi efetuado com sucesso.");
        }else if(diaPagamento > vencimento){
            this.saldo -= contaValor + (multa + juros);
            
            System.out.println("O pagamento foi efetuado, com multa e juros.");
        }
    }
} 
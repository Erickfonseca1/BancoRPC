package com.gugawag.rpc.banco;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BancoServiceIF extends Remote {

    double saldo(String conta) throws RemoteException;
    int quantidadeContas() throws RemoteException;

    //cadastrar Conta
    void cadastrarConta(String conta, double saldo) throws RemoteException;

    //remover Conta
    void removerConta(String conta) throws RemoteException;

    //pesquisa Conta
    double pesquisarConta(String conta) throws RemoteException;
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author gabri
 */
public class Usuario extends Pessoa {
    private String login;
    private int totalAssistido;

    public Usuario(String nome, int idade, String login) {
        super(nome, idade);
        this.login = login;
        this.totalAssistido=0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

    @Override
    public String toString() {
        return "Usuario{"+super.toString() + "\nlogin=" + login + ", totalAssistido=" + totalAssistido + '}';
    }
    
    
}

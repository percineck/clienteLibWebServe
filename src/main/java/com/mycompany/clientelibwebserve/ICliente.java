/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clientelibwebserve;

/**
 *
 * @author usuario
 */
public interface ICliente {
    int getCodigo();
    int getCodigoCidade();
    String getNome();
    String getCidade();
    void setCodigo(int codigo);
    void setCodigoCidade(int codigoCidade);
    void setNome(String nome);
    void setCidade(String cidade);
}


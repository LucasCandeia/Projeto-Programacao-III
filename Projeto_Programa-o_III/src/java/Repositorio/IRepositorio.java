/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorio;

import java.util.ArrayList;
import java.util.List;
import negocio.Mulher;

/**
 *
 * @author EAD
 */
public interface IRepositorio {

    public void cadastrar(Mulher m);
    public ArrayList<Mulher> listar();

}

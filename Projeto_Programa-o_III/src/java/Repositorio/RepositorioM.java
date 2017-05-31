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
public class RepositorioM implements IRepositorio {

    private ArrayList<Mulher> nulheres = new ArrayList<>();

    @Override
    public void cadastrar(Mulher m) {
        nulheres.add(m);
    }

    @Override
    public ArrayList<Mulher> listar() {
        return this.nulheres;
    }

}

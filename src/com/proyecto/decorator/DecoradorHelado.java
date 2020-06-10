/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.decorator;

/**
 *
 * @author Javier
 */
public abstract class DecoradorHelado implements IHelado {

    private IHelado helado;

    @Override
    public abstract double precio();

    public void setHelado(IHelado helado) {
        this.helado = helado;
    }

    public IHelado getHelado() {
        return helado;
    }

}

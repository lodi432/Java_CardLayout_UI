/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.util.List;
import helpers.CustomeException;

import java.util.List;
public interface ObradaInterface<T> {
     public List<T> getEntiteti();
     public T dodaj(T e) throws CustomeException;
     public T promjena(T e) throws CustomeException;
}


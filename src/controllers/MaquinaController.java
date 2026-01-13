package controllers;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import models.Maquina;

public class MaquinaController {
    //Metodo que ordene un listado de maquinas
    //Por su subRed y luego por el nombre
    //Si ambas son iguales se consideren maquinas iguales
    public Set<Maquina> ordenarPorSubRed(List<Maquina> maquinas){
        Set<Maquina> treeSetMaquinas = new TreeSet<>();
        for (Maquina maquina : maquinas) {
            treeSetMaquinas.add(maquina);
        }
        return treeSetMaquinas;
    }
}

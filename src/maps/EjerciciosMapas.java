package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EjerciciosMapas {

    public Map<Integer, Integer> contarDuplicados(List<Integer> list) {
        Map<Integer, Integer> conteo = new HashMap<>();
        for (Integer num : list) {
            conteo.put(num, conteo.getOrDefault(num, 0) + 1);
        }
        return conteo;
    }


public Integer noRepetido(List<Integer> lista){
        Map<Integer,Integer> conteo = new HashMap<>();
        for (Integer numero : lista) {
            conteo.put(numero, conteo.getOrDefault(numero, 0) + 1);
        }
        for (Integer key : conteo.keySet()) {
            if(conteo.get(key) == 1){
                return key;
            }
        }

        return null;

    }

    public void RankingPuntajes(List<String[]> entradas){
        Map<String,Integer> puntajes = new HashMap<>();
        for (String[] entrada : entradas) {
            String nombre = entrada[0];
            int puntaje = Integer.parseInt(entrada[1]);

            puntajes.put(nombre, Math.max(puntajes.getOrDefault(nombre, 0), puntaje));
        }

        for (String key: puntajes.keySet()) {
            System.out.println(key + " -> " + puntajes.get(key));
        }
    }
}

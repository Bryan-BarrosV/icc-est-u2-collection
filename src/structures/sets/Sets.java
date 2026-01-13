package structures.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import models.Person;


public class Sets {

    public Set<String> construirHashSet(){
        Set <String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("A");
        hashSet.add("D");
        return hashSet;
    }

    public Set<String> construirLinkedSet(){
        Set <String> linkSet = new LinkedHashSet<>();
        linkSet.add("A");
        linkSet.add("B");
        linkSet.add("C");
        linkSet.add("A");
        linkSet.add("D");
        linkSet.add("7GGG98987987");
        linkSet.add("123465G");
        linkSet.add("8HFDKLGKDF");
        return linkSet;
        
    }

    public Set<String> construirTreeSet(){
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("D");
        treeSet.add("A");
        treeSet.add("E");
        treeSet.add("I");
        treeSet.add("O");
        treeSet.add("B");
        treeSet.add("a");
        return treeSet;

    }

    public  Set<String> construitTreSetConComparador(){
        Set<String> treeSet = new TreeSet<>((pal1,pal2)->pal1.compareToIgnoreCase(pal2));
        treeSet.add("D");
        treeSet.add("A");
        treeSet.add("E");
        treeSet.add("I");
        treeSet.add("O");
        treeSet.add("B");
        treeSet.add("a");
        return treeSet;
    }

    public Set<Person> personsTreeSet(){
        Set<Person> treePersons= new TreeSet<>((p1,p2)->{
            // int com =Integer.compare(p1.getEdad(), p2.getEdad());
            // return com;
            // return p2.getNombre().compareTo(p1.getNombre());
            int compararN = p2.getNombre().compareTo(p1.getNombre());
            if (compararN !=0) return compararN;
            int comE = Integer.compare(p2.getEdad(), p1.getEdad());
            return comE; 
            
        });
        
        treePersons.add(new Person("Carlos", 23));
        treePersons.add(new Person("Ana", 30));
        treePersons.add(new Person("Luis", 18));
        treePersons.add(new Person("Ana", 20));
        treePersons.add(new Person("Andres", 23));
        treePersons.add(new Person("Luis", 18));
        return treePersons;
    }

}

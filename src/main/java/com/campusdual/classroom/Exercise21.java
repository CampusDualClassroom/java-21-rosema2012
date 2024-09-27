package com.campusdual.classroom;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise21 {


    public static Set<String> createHashSet() {
        Set<String>coleccion = new HashSet<>();
        addElementToSet(coleccion, "ELEMENT KPRBC");
        addElementToSet(coleccion, "ELEMENT YPBTM");
        addElementToSet(coleccion, "ELEMENT AADXU");
        addElementToSet(coleccion, "ELEMENT RXCGJ");
        addElementToSet(coleccion, "ELEMENT WYMVD");
        addElementToSet(coleccion, "ELEMENT WFGEJ");
        addElementToSet(coleccion, "ELEMENT TYGBS");
        addElementToSet(coleccion, "ELEMENT MAPTK");
        addElementToSet(coleccion, "ELEMENT GJXVE");
        addElementToSet(coleccion, "ELEMENT BAFGL");

        return coleccion;

    }

    public static Set<String> createTreeSet() {
        TreeSet<String>coleccionTree = new TreeSet<>();
        addElementToSet(coleccionTree, "ELEMENT KPRBC");
        addElementToSet(coleccionTree, "ELEMENT YPBTM");
        addElementToSet(coleccionTree, "ELEMENT AADXU");
        addElementToSet(coleccionTree, "ELEMENT RXCGJ");
        addElementToSet(coleccionTree, "ELEMENT WYMVD");
        addElementToSet(coleccionTree, "ELEMENT WFGEJ");
        addElementToSet(coleccionTree, "ELEMENT TYGBS");
        addElementToSet(coleccionTree, "ELEMENT MAPTK");
        addElementToSet(coleccionTree, "ELEMENT GJXVE");
        addElementToSet(coleccionTree, "ELEMENT BAFGL");
        return coleccionTree;
    }

    private static void printSet(Set<String> customSet) {
            System.out.println(customSet);
    }

    public static boolean addElementToSet(Set<String> set, String elementToAdd) {
        int tamAntiguo = set.size();
        set.add(elementToAdd);
        int tamNuevo = set.size();

        if(tamAntiguo<tamNuevo){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        Set<String> colecion = createHashSet();
        Set<String> treeColeccion = createTreeSet();

        printSet(colecion);
        printSet(treeColeccion);

        colecion.add("ELEMENT AAA");
        treeColeccion.add("ELEMENT AAA");
    }

}

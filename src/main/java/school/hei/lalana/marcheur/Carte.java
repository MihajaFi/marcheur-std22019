package school.hei.lalana.marcheur;

import java.util.ArrayList;
import java.util.List;

public class Carte {

    private String[][] edges;

    public Carte(String[][] edges) {
        this.edges = edges;
    }

    public List<String> getLieuxAccessibles(String lieu, List<String> chemin) {
        List<String> lieuxAccessibles = new ArrayList<>();
        for (String[] edge : edges) {
            if (edge[0].equals(lieu) && !chemin.contains(edge[1])) {
                lieuxAccessibles.add(edge[1]);
            }
        }
        return lieuxAccessibles;
    }
}
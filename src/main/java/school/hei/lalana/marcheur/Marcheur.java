package school.hei.lalana.marcheur;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Marcheur {

    private String lieuActuel;
    private List<String> chemin;

    public Marcheur(String lieuDepart) {
        this.lieuActuel = lieuDepart;
        this.chemin = new ArrayList<>();
        chemin.add(lieuDepart);
    }

    public boolean seDeplacer(String destination, Carte carte) {
        // Trouver le prochain lieu accessible au hasard
        List<String> lieuxAccessibles = carte.getLieuxAccessibles(lieuActuel, chemin);
        if (!lieuxAccessibles.isEmpty()) {
            String prochainLieu = lieuxAccessibles.get(new Random().nextInt(lieuxAccessibles.size()));
            lieuActuel = prochainLieu;
            chemin.add(prochainLieu);
            System.out.println("Se déplace de " + chemin.get(chemin.size() - 2) + " à " + chemin.get(chemin.size() - 1));
            return true;
        } else {
            System.out.println("Aucune rue accessible depuis " + lieuActuel);
            return false;
        }
    }

    public boolean estArrive(String destination) {
        return lieuActuel.equals(destination);
    }

    public List<String> getChemin() {
        return chemin;
    }
}
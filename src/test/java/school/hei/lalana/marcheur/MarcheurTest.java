package school.hei.lalana.marcheur;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarcheurTest {
    @Test
    void testSeDeplacer() { Carte carte = new Carte(new String[][]{
            {"Marais", "Sekolintsika"},
            {"Sekolintsika", "Marais"},
            {"Sekolintsika", "HEI"},
            {"HEI", "Sekolintsika"},
            {"HEI", "Pullman"},
            {"HEI", "Balançoire"},
            {"Pullman", "HEI"},
            {"Pullman", "Boulevard de l'Europe"},
            {"Pullman", "Nexta"},
            {"Balançoire", "HEI"},
            {"Balançoire", "Boulevard de l'Europe"},
            {"Boulevard de l'Europe", "Pullman"},
            {"Boulevard de l'Europe", "Balançoire"},
            {"Boulevard de l'Europe", "ESTI"},
            {"ESTI", "Boulevard de l'Europe"},
            {"Nexta", "Pullman"}
    });

        Marcheur bjarni = new Marcheur("HEI");
        assertTrue(bjarni.seDeplacer("ESTI", carte));

    }
}
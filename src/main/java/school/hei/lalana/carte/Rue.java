package school.hei.lalana.carte;

import lombok.AllArgsConstructor;
import lombok.Getter;
import school.hei.lalana.carte.Lieu;

@Getter
@AllArgsConstructor
public class Rue {
    private Lieu origine;
    private Lieu destination;
}

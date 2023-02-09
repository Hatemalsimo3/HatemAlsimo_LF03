import java.util.HashMap;
import java.util.Map;

public class RegalDao {
    private Map<Integer, Regal> regalMap = new HashMap<>();

    public void insert(Regal regal)  {
        if (regalMap.containsKey(regal.lagerhalle())) {
            throw new GastVorhandenExeption(gast.getGastNr());
        }
        gastMap.put(gast.getGastNr(),gast);
    }
}

package Final_APP.METIER;
import Final_APP.DAO.Dao;

public class MetierImpl implements Metier {

    Dao dao=null;

    public MetierImpl() {
    }

    public MetierImpl(Dao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        return 0;
    }

    public void setDao(Dao dao) {
        this.dao = dao;
    }
}
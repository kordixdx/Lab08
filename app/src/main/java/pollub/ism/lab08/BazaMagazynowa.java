package pollub.ism.lab08;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {PozycjaMagazynowa.class, RejestrZdarzen.class}, version = 2 , exportSchema = false)
public abstract class BazaMagazynowa extends RoomDatabase {

    public static final String NAZWA_BAZY = "Stoisko z warzywami";

    public abstract PozycjaMagazynowaDAO pozycjaMagazynowaDAO();
    public abstract RejestrZdarzenDAO rejestrZdarzenDAO();
}
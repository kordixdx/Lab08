package pollub.ism.lab08;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "ZDARZENIA")
public class RejestrZdarzen {

    @PrimaryKey(autoGenerate = true)
    public int zdarzenie_id;
    public String nazwa_produktu;
    public String data_zmiany;
    public int stara_ilosc;
    public int nowa_ilosc;

    public RejestrZdarzen(String data_zmiany, String nazwa_produktu, int stara_ilosc, int nowa_ilosc) {
        this.data_zmiany = data_zmiany;
        this.nazwa_produktu = nazwa_produktu;
        this.stara_ilosc = stara_ilosc;
        this.nowa_ilosc = nowa_ilosc;
    }
}


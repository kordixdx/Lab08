package pollub.ism.lab08;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface RejestrZdarzenDAO {

    @Insert
    public void insert(pollub.ism.lab08.RejestrZdarzen zdarzenie);

    @Update
    void update(pollub.ism.lab08.RejestrZdarzen zdarzenie);

    @Query("SELECT zdarzenie_id,nazwa_produktu,data_zmiany, stara_ilosc,nowa_ilosc FROM ZDARZENIA WHERE nazwa_produktu= :wybranyProdukt")
    List<RejestrZdarzen>listAllUpdates(String wybranyProdukt);

    @Query("SELECT COUNT(*) FROM ZDARZENIA")
    int size();
}

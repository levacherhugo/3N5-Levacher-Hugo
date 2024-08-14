package org.depinfo.testsexercice1.bd;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import org.depinfo.testsexercice1.modele.Personne;


@Database(entities = {Personne.class}, version = 1)
public abstract class BD extends RoomDatabase {
    public abstract MonDao monDao();
}

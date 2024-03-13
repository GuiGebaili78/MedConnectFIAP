/*
package br.com.fiap.medconnectfiap.database.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.com.fiap.medconnectfiap.model.PacienteModel






@Database(entities = [PacienteModel::class], version = 1)
abstract class PacienteDb : RoomDatabase(), PacienteDao {

    abstract fun pacienteDao(): PacienteDao

    companion object {

        private lateinit var instance: PacienteDao

        fun getDatabase(context: Context): PacienteDao {
            if (!::instance.isInitialized) {
                instance = Room
                    .databaseBuilder(
                        context,
                        PacienteDb::class.java,
                        "paciente_db"
                    )
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build()
            }
            return instance
        }
    }
}*/

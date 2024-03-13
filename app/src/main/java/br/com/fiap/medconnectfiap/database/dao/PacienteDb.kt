package br.com.fiap.medconnectfiap.database.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.com.fiap.medconnectfiap.database.dao.PacienteDao
import br.com.fiap.medconnectfiap.model.PacienteModel

@Database(entities = [PacienteModel::class], version = 1)
abstract class PacienteDb : RoomDatabase() {

    abstract fun pacienteDao(): PacienteDao

    companion object {

        private lateinit var instance: PacienteDb

        fun getDatabase(context: Context): PacienteDb {
            if (!::instance.isInitialized) {
                instance = Room
                    .databaseBuilder(
                        context,
                        PacienteDb::class.java,
                        "contato_db"
                    )
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build()
            }
            return instance
        }
    }
}
package br.com.fiap.medconnectfiap.database.dao


import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.com.fiap.medconnectfiap.database.dao.PacienteDao
import br.com.fiap.medconnectfiap.model.MedicoModel

@Database(entities = [MedicoModel::class], version = 1)
abstract class MedicoDb : RoomDatabase() {

    abstract fun medicoDao(): MedicoDao

    companion object {

        private lateinit var instance: MedicoDb

        fun getDatabase(context: Context): MedicoDb {
            if (!::instance.isInitialized) {
                instance = Room
                    .databaseBuilder(
                        context,
                        MedicoDb::class.java,
                        "medico_db"
                    )
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build()
            }
            return instance
        }
    }
}
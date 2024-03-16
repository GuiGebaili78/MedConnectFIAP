package br.com.fiap.medconnectfiap.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import br.com.fiap.medconnectfiap.model.MedicoModel
import br.com.fiap.medconnectfiap.model.PacienteModel


@Dao
interface MedicoDao {

    @Insert
    fun salvar(medicoModel: MedicoModel): Long

    @Update
    fun atualizar(medicoModel: MedicoModel): Int

    @Delete
    fun excluir(medicoModel: MedicoModel): Int

    @Query("SELECT * FROM tbl_medico WHERE id = :id")
    fun buscarMedicoModelPeloId(id: Int): MedicoModel // Updated data type to Long

    @Query("SELECT * FROM tbl_medico ORDER BY nome ASC")
    fun listarMedicoModel(): List<MedicoModel>
}








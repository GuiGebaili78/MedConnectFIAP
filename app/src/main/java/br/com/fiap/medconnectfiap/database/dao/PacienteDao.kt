package br.com.fiap.medconnectfiap.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import br.com.fiap.medconnectfiap.model.PacienteModel

@Dao
interface PacienteDao {

    @Insert
    fun salvar(pacienteModel: PacienteModel): Long

    @Update
    fun atualizar(pacienteModel: PacienteModel): Int

    @Delete
    fun excluir(pacienteModel: PacienteModel): Int

    @Query("SELECT * FROM tbl_paciente WHERE id = :id")
    fun buscarPacienteModelPeloId(id: Int): PacienteModel // Updated data type to Long

    @Query("SELECT * FROM tbl_paciente ORDER BY nome ASC")
    fun listarPacienteModel(): List<PacienteModel>


}

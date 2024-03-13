package br.com.fiap.medconnectfiap.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate

@Entity(tableName = "tbl_paciente")
data class PacienteModel(
    @PrimaryKey(autoGenerate = true) var id: Long = 0,
    var nome: String = "",
    var cpf: String = "",
    @ColumnInfo(name = "dt_nascimento") var dtNascimento: String = "1980-01-01",
    var telefone: String = "",
    var endereco: String = ""
) {
    fun setDtNascimento(date: LocalDate) {
        dtNascimento = date.toString()
    }


}

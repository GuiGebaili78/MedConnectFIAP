package br.com.fiap.medconnectfiap.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate

@Entity(tableName = "tbl_paciente")
data class PacienteModel(
    @PrimaryKey(autoGenerate = true) var id: Long = 0,
    var nome: String = "",
    var cpf: Int = 0,
    @ColumnInfo(name = "dt_nascimento") var dtNascimento: String = "1980-01-01",
    var telefone: Int = 0,
    var endereco: String = ""
) {
    fun setDtNascimento(date: LocalDate) {
        dtNascimento = date.toString()
    }


}

package br.com.fiap.medconnectfiap.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate
import java.time.format.DateTimeFormatter

@Entity(tableName = "tbl_paciente")
data class PacienteModel(
    @PrimaryKey(autoGenerate = true) var id: Long = 0,
    var nome: String = "",
    var cpf: String = "",
    @ColumnInfo(name = "dt_nascimento") var dtNascimento: String = "01/01/1980",
    var telefone: String = "",
    var endereco: String = ""
) {
    // Construtor secundário para aceitar LocalDate
    constructor(
        id: Long = 0,
        nome: String = "",
        cpf: String = "",
        dtNascimento: LocalDate = LocalDate.of(1980, 1, 1),
        telefone: String = "",
        endereco: String = ""
    ) : this(id, nome, cpf, dtNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")), telefone, endereco)
}

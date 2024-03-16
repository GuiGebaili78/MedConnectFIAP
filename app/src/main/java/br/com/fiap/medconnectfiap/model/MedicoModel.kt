package br.com.fiap.medconnectfiap.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate
import java.time.format.DateTimeFormatter

@Entity(tableName = "tbl_medico")
data class MedicoModel(
    @PrimaryKey(autoGenerate = true) var id: Long = 0,
    var nome: String = "",
    var crm: String = "",
    var especialidade: String = "",
    var contato: String = ""
)








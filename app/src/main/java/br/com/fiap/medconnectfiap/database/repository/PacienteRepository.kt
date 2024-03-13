package br.com.fiap.medconnectfiap.database.repository


import android.content.Context
import br.com.fiap.medconnectfiap.database.dao.PacienteDb

import br.com.fiap.medconnectfiap.model.PacienteModel



class PacienteRepository(context: Context) {

    private val db = PacienteDb.getDatabase(context).pacienteDao()

    fun salvar(pacienteModel: PacienteModel): Long {
        return db.salvar(pacienteModel)
    }

    fun atualizar(pacienteModel: PacienteModel): Int {
        return db.atualizar(pacienteModel)
    }

    fun excluir(pacienteModel: PacienteModel): Int {
        return db.excluir(pacienteModel)
    }

    fun listarPacienteModel(): List<PacienteModel> {
        return db.listarPacienteModel()
    }

    fun buscarpacienteModelPeloId(id: Int): PacienteModel {
        return db.buscarPacienteModelPeloId(id)
    }

}

package br.com.fiap.medconnectfiap.database.repository


import android.content.Context
import br.com.fiap.medconnectfiap.database.dao.MedicoDb
import br.com.fiap.medconnectfiap.model.MedicoModel


class MedicoRepository(context: Context) {

    private val db = MedicoDb.getDatabase(context).medicoDao()

    fun salvar(medicoModel: MedicoModel): Long {
        return db.salvar(medicoModel)
    }

    fun atualizar(medicoModel: MedicoModel): Int {
        return db.atualizar(medicoModel)
    }

    fun excluir(medicoModel: MedicoModel): Int {
        return db.excluir(medicoModel)
    }

    fun listarmMdicoModel(): List<MedicoModel> {
        return db.listarMedicoModel()
    }

    fun buscarMedicoModelPeloId(id: Int): MedicoModel {
        return db.buscarMedicoModelPeloId(id)
    }

}











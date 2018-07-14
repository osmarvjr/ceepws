package br.com.projeto.ws.ceepws.repository

import br.com.projeto.ws.ceepws.model.Note
import org.springframework.data.repository.CrudRepository

interface NoteRepository : CrudRepository<Note, Long>
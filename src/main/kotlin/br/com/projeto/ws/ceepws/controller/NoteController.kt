package br.com.projeto.ws.ceepws.controller

import br.com.projeto.ws.ceepws.model.Note
import br.com.projeto.ws.ceepws.repository.NoteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("notes")
class NoteController{


    @Autowired
    lateinit var noteRepository: NoteRepository

    @GetMapping
    fun list(): List<Note>{
        return noteRepository.findAll().toList()
    }

    @PostMapping
    fun add(@RequestBody note : Note) : Note{
        return noteRepository.save(note)
    }
}
package com.springboot.jpa.controller;

import com.springboot.jpa.dto.DisciplinaSerieDTO;
import com.springboot.jpa.service.DisciplinaSerieService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/disciplinasSerie")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class DisciplinaSerieController {

    private final DisciplinaSerieService disciplinaSerieService;

    @GetMapping
    public ResponseEntity<List<DisciplinaSerieDTO>> findAll() {
        return ResponseEntity.ok().body(disciplinaSerieService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DisciplinaSerieDTO> findById(@PathVariable UUID id) {
        return ResponseEntity.ok().body(disciplinaSerieService.findById(id));
    }

    @PostMapping
    public ResponseEntity<DisciplinaSerieDTO> insert(@RequestBody @Valid DisciplinaSerieDTO disciplinaSerieDTO) {
        return ResponseEntity.ok().body(disciplinaSerieService.insert(disciplinaSerieDTO));
    }

}

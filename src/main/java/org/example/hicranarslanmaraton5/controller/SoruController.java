package org.example.hicranarslanmaraton5.controller;

import lombok.RequiredArgsConstructor;
import org.example.hicranarslanmaraton5.entity.SoruEntity;
import org.example.hicranarslanmaraton5.service.SoruService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/soruentity")
@RequiredArgsConstructor
public class SoruController {

    private final SoruService soruService;


    @PostMapping("/saveRequestBody")
    public ResponseEntity<SoruEntity> saveRequestBody(@RequestBody SoruEntity soruentity){
        return ResponseEntity.ok(soruService.save(soruentity));
    }



    @GetMapping("/sorular")
    public List<SoruEntity> getSorular() {
        return soruService.getSorular();
    }
}

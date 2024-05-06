package org.example.hicranarslanmaraton5.controller;

import lombok.RequiredArgsConstructor;
import org.example.hicranarslanmaraton5.entity.CevapEntity;
import org.example.hicranarslanmaraton5.entity.SoruEntity;
import org.example.hicranarslanmaraton5.service.CevapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cevapentity")
@RequiredArgsConstructor
public class CevapController {

    private CevapService cevapService;

    @PostMapping("/saveRequestBody")
    public ResponseEntity<CevapEntity> saveRequestBody(@RequestBody CevapEntity cevapEntity){
        return ResponseEntity.ok(cevapService.save(cevapEntity));
    }


    @GetMapping("/sorular/{soruId}/cevaplar")
    public List<CevapEntity> getCevaplarBySoruId(@PathVariable Long soruId) {
        return cevapService.getCevaplarBySoruId(soruId);
    }
}

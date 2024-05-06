package org.example.hicranarslanmaraton5.service;

import org.example.hicranarslanmaraton5.entity.SoruEntity;
import org.example.hicranarslanmaraton5.repository.SoruRepository;
import org.example.hicranarslanmaraton5.utility.ServiceManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoruService extends ServiceManager<SoruEntity,Long> {


    private final SoruRepository soruRepository;

    public SoruService(SoruRepository soruRepository) {
        super(soruRepository);
        this.soruRepository = soruRepository;
    }


    public SoruEntity save(String soruMetni) {
        SoruEntity eklenecekSoru = SoruEntity.builder().soruMetni(soruMetni).build();
        return soruRepository.save(eklenecekSoru);
    }

    public List<SoruEntity> getSorular() {
        return soruRepository.findAll();
    }
}

package org.example.hicranarslanmaraton5.service;

import org.example.hicranarslanmaraton5.entity.CevapEntity;
import org.example.hicranarslanmaraton5.entity.SoruEntity;
import org.example.hicranarslanmaraton5.repository.CevapRepository;
import org.example.hicranarslanmaraton5.utility.ServiceManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CevapService extends ServiceManager<CevapEntity,Long> {

    private final CevapRepository cevapRepository;

    public CevapService(CevapRepository cevapRepository) {
        super(cevapRepository);
        this.cevapRepository = cevapRepository;
    }

    public CevapEntity save(String cevapMetni) {
        CevapEntity eklenecekCevap = CevapEntity.builder().cevapMetni(cevapMetni).build();
        return cevapRepository.save(eklenecekCevap);
    }


    public List<CevapEntity> getCevaplarBySoruId(Long soruId) {
        // Burada soruId'ye göre cevapları getiren bir metot yazılabilir.
        return null;
    }


}

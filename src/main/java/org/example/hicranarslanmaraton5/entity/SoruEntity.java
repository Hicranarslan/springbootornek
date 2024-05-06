package org.example.hicranarslanmaraton5.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "tbl_soru")
public class SoruEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String soruMetni;

    @OneToOne(mappedBy = "soru", cascade = CascadeType.ALL)
    private CevapEntity cevap;

    private String dogruCevapMetni;



}

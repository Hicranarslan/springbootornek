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
@Table(name = "tbl_cevap")
public class CevapEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cevapMetni;
    @OneToOne
    @JoinColumn(name = "tbl_soru")
    private SoruEntity soru;

}

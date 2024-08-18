package io.camp.campsite.model.entity;

import io.camp.review.model.Review;
import jakarta.persistence.*;
import lombok.*;


import java.util.List;

@Entity
@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Campsite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long seq;

    private int contentId;

    private String facltNm;

    private String lineIntro;

    @Column(columnDefinition = "TEXT")
    private String intro;

    private int allar;

    private String trsagntNo;

    private String bizrno;

    @Column(columnDefinition = "TEXT")
    private String featureNm;

    private String induty;

    private String lctCl;

    private String doNm;

    private String sigunguNm;

    private String zipcode;

    private String addr1;

    private String addr2;

    private String mapX;

    private String mapY;

    private String direction;

    private String tel;

    private String homepage;

    private String resveUrl;

    private int glampSiteCo;

    private int caravSiteCo;

    private String siteBottomCl1;

    private String siteBottomCl2;

    private String siteBottomCl3;

    private String siteBottomCl4;

    private String siteBottomCl5;

    private String tooltip;

    private String glampInnerFclty;

    private String caravInnerFclty;

    private String operPdCl;

    private String operDeCl;

    private int toiletCo;

    private int swrmCo;

    private int wtrplCo;

    private String brazierCl;

    private String sbrsCl;

    private String sbrsEtc;

    private String posblFcltyCl;

    private String posblFcltyEtc;

    private String themaEnyrnCl;

    private String animalCmgCl;

    private String firstImageUrl;

    private String createdtime;

    private String modifiedtime;

    @OneToMany(mappedBy = "campsite" , fetch = FetchType.EAGER )
    private List<Zone> zones;

    @OneToMany(mappedBy = "campsite")
    private List<Review> reviews;
}

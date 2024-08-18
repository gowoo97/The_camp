package io.camp.campsite.repository;

import io.camp.campsite.model.entity.Campsite;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CampSiteRepositoryCustom {

    Campsite findCampsiteWithAllInfo(long id);

    Page<Campsite> searchWithPaging(String query, Pageable pageable , String type);
}

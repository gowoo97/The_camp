package io.camp.image.model;

import io.camp.audit.BaseEntity;
import io.camp.review.model.Review;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@ToString(exclude = {"review"})
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Image extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id", updatable = false)
    private Long id;

    @Column(name = "url", nullable = false)
    private String url;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "review_id",  nullable = false)
    private Review review;
}
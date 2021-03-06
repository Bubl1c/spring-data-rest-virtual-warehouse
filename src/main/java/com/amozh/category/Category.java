package com.amozh.category;

import com.amozh.item.model.Item;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Developer on 18.09.2015.
 */

@Entity
@Table(name="mb_Category")
@Data
@NoArgsConstructor
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class Category {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    private String description;

    @Column(length = 5)
    @Enumerated(EnumType.STRING)
    private CategoryContentType contentType;

    @Column(columnDefinition = "bit default 0", nullable = false)
    private boolean timing;

    @Temporal(TemporalType.TIME)
    private Date timeFrom;

    @Temporal(TemporalType.TIME)
    private Date timeTo;

    private int position;

    @Column(columnDefinition = "bit default 0", nullable = false)
    private boolean deleted;

    @OneToOne
    @JoinColumn(name = "parent_category_id")
    private Category parent;

    @OneToMany(mappedBy = "category")
    @OrderBy(value = "position DESC")
    @Where(clause = "deleted = 0")
    private List<Item> items;

}

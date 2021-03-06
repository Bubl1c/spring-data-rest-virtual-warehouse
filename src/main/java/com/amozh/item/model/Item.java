package com.amozh.item.model;

import com.amozh.operation.model.StockOperationType;
import com.amozh.operation.model.impl.HoldOperation;
import com.amozh.operation.model.impl.InOperation;
import com.amozh.storage.StorageItem;
import com.amozh.category.Category;
import com.fasterxml.jackson.annotation.*;
import lombok.Data;
import org.hibernate.annotations.DiscriminatorOptions;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Andrii Mozharovskyi on 06.04.2016.
 */
@Entity
@Table(name="mb_Product")
@Data
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type", discriminatorType = DiscriminatorType.INTEGER)
@DiscriminatorOptions(force = true)
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public abstract class Item {
    @Id
    @GeneratedValue
    private long id;

    @Size(max = 255)
    protected String name;

    @Size(max = 255)
    protected String description;

    @Min(0)
    protected BigDecimal price = new BigDecimal(0);

    @Column(columnDefinition = "bit default 0", nullable = false)
    protected boolean deleted;

    @NotNull
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    public interface TestJsonView {}
}

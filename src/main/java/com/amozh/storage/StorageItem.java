package com.amozh.storage;

import com.amozh.item.Item;
import com.amozh.storage.Storage;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Andrii Mozharovskyi on 05.04.2016.
 */
@Entity
@Table(name="mb_StorageItem")
@Data
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
public class StorageItem {
    @Id
    @GeneratedValue
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Storage storage;

    @ManyToOne
    private Item item;

    private BigDecimal amount = BigDecimal.ZERO;

    private BigDecimal hold = BigDecimal.ZERO;
}

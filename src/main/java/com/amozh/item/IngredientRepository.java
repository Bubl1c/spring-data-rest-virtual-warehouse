package com.amozh.item;

import com.amozh.item.model.Ingredient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Andrii Mozharovskyi on 08.04.2016.
 */
@RepositoryRestResource
public interface IngredientRepository extends CrudRepository<Ingredient, Long> {
}

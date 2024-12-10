package org.server.sweetnova.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class MagicIngredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long magicIngredientNo;

    private String name;

}

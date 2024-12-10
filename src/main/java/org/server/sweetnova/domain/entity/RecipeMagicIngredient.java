package org.server.sweetnova.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class RecipeMagicIngredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recipeMagicIngredientNo;

    @ManyToOne
    @JoinColumn(name = "recipe_no")
    private Recipe recipe;

    @ManyToOne
    @JoinColumn(name = "magicIngredient_no")
    private MagicIngredient magicIngredient;
}

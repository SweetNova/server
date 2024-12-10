package org.server.sweetnova.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class RecipeCacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recipeCacaoNo;

    @ManyToOne
    @JoinColumn(name = "recipe_no")
    private Recipe recipe;

    @ManyToOne
    @JoinColumn(name = "cacao_no")
    private Cacao cacao;

}

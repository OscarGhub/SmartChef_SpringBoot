package com.oscar.proyecto.modelos;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class RecetaIngredienteId implements Serializable {
    private Integer idReceta;
    private Integer idIngrediente;

    public RecetaIngredienteId() {}
    public RecetaIngredienteId(Integer idReceta, Integer idIngrediente) {
        this.idReceta = idReceta;
        this.idIngrediente = idIngrediente;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        RecetaIngredienteId that = (RecetaIngredienteId) o;
        return Objects.equals(idReceta, that.idReceta) && Objects.equals(idIngrediente, that.idIngrediente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idReceta, idIngrediente);
    }
}

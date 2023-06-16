package com.iesam.openbank.domain.useCase;

import com.iesam.openbank.domain.models.Hipoteca;

public interface HipotecaRepository {
    public void saveHipoteca(Hipoteca hipoteca);
    public Hipoteca findById(Integer id);
    
}

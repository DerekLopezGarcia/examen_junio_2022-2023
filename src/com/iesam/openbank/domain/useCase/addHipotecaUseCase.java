package com.iesam.openbank.domain.useCase;

import com.iesam.openbank.domain.models.Hipoteca;

public class addHipotecaUseCase {
    private HipotecaRepository hipotecaRepository;

    public addHipotecaUseCase(HipotecaRepository hipotecaRepository) {
        this.hipotecaRepository = hipotecaRepository;
    }

    public void execute(Hipoteca hipoteca) {
        hipotecaRepository.saveHipoteca(hipoteca);
    }
}

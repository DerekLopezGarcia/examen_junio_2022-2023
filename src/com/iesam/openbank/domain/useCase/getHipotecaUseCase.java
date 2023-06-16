package com.iesam.openbank.domain.useCase;

import com.iesam.openbank.domain.models.Hipoteca;

public class getHipotecaUseCase {
   private HipotecaRepository hipotecaRepository;
   public getHipotecaUseCase(HipotecaRepository hipotecaRepository) {
      this.hipotecaRepository = hipotecaRepository;
   }
    public Hipoteca execute(Integer id) {
        return hipotecaRepository.findById(id);
    }
}

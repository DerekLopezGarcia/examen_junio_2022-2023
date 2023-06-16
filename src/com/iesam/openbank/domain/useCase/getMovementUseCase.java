package com.iesam.openbank.domain.useCase;

import com.iesam.openbank.domain.models.Movement;

public class getMovementUseCase {
    private MovementRepository movementRepository;
    public getMovementUseCase(MovementRepository movementRepository) {
       this.movementRepository = movementRepository;
    }
     public Movement execute(Integer id) {
         return movementRepository.findById(id);
     }
}

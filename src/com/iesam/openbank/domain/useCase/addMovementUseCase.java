package com.iesam.openbank.domain.useCase;

import com.iesam.openbank.domain.models.Movement;

public class addMovementUseCase {
    private MovementRepository movementRepository;

    public addMovementUseCase(MovementRepository movementRepository) {
        this.movementRepository = movementRepository;
    }

    public void execute(Movement movement) {
        movementRepository.saveMovement(movement);
    }
}

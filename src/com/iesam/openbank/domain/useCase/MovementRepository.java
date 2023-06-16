package com.iesam.openbank.domain.useCase;

import com.iesam.openbank.domain.models.Movement;

public interface MovementRepository {
    public void saveMovement(Movement movement);
    public Movement findById(Integer id);

}

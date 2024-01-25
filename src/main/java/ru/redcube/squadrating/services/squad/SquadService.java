package ru.redcube.squadrating.services.squad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.redcube.squadrating.entity.squad.SquadImpl;
import ru.redcube.squadrating.repositories.squad.SquadRepository;

import java.util.List;
import java.util.Optional;

@Service
public class SquadService {

    private final SquadRepository squadRepository;

    @Autowired
    public SquadService(SquadRepository squadRepository) {
        this.squadRepository = squadRepository;
    }

    public List<SquadImpl> getSquads() {
        return squadRepository.findAll();
    }

    public Optional<SquadImpl> getSquadById(Long id) {
        return squadRepository.findById(id);
    }
}

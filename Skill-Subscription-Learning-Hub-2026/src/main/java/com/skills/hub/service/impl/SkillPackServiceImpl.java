package com.skills.hub.service.impl;

import com.skills.hub.model.SkillPack;
import com.skills.hub.repository.SkillPackRepository;
import com.skills.hub.service.SkillPackService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SkillPackServiceImpl implements SkillPackService {

    private final SkillPackRepository packRepo;

    public SkillPackServiceImpl(SkillPackRepository packRepo) {
        this.packRepo = packRepo;
    }

    @Override
    public SkillPack addSkillPack(SkillPack pack) {
        if (pack == null || pack.getTitle().isEmpty()) {
            return null;
        }
        return packRepo.save(pack);
    }

    @Override
    public List<SkillPack> getAllPacks() {
        return packRepo.findAll();
    }

    @Override
    public SkillPack updateSkillPack(SkillPack pack) {
        Optional<SkillPack> existing = packRepo.findById(pack.getId());
        if (!existing.isPresent()) {
            return null;
        }
        SkillPack toUpdate = existing.get();
        toUpdate.setTitle(pack.getTitle());
        toUpdate.setDescription(pack.getDescription());
        toUpdate.setPrice(pack.getPrice());
        return packRepo.save(toUpdate);
    }

    @Override
    public void deleteSkillPack(Long id) {
        packRepo.deleteById(id);
    }

    public SkillPackRepository getPackRepo() {
        return packRepo;
    }
}
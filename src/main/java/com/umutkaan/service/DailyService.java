package com.umutkaan.service;

import com.umutkaan.dto.GazeteBulteniResponse;
import com.umutkaan.entity.Newspaper;
import com.umutkaan.entity.Sport;
import com.umutkaan.repository.NewspaperRepository;
import com.umutkaan.repository.SportRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

@Service
public class DailyService {

    private final NewspaperRepository newspaperRepository;
    private final SportRepository sportRepository;

    public DailyService(NewspaperRepository newspaperRepository,
                        SportRepository sportRepository) {
        this.newspaperRepository = newspaperRepository;
        this.sportRepository = sportRepository;
    }

    public GazeteBulteniResponse getDailyData() {

        List<Newspaper> newspapers = newspaperRepository.findAll();
        List<Sport> sports = sportRepository.findAll();

        List<String> newspaperNames = new ArrayList<>();
        List<String> sportNames = new ArrayList<>();

        for (Newspaper newspaper : newspapers) {
            newspaperNames.add(newspaper.getName());
        }

        for (Sport sport : sports) {
            sportNames.add(sport.getName());
        }

        return new GazeteBulteniResponse(
                LocalDate.now(),
                newspaperNames,
                sportNames
        );
    }
    public Newspaper addNewspaper(Newspaper newspaper) {
        return newspaperRepository.save(newspaper);
    }
}
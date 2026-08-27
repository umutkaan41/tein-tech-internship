package com.umutkaan.controller;

import com.umutkaan.entity.Newspaper;
import com.umutkaan.repository.NewspaperRepository;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;

@RestController //
@RequestMapping("/daily")
public class DailyController {

    private final NewspaperRepository newspaperRepository;

    public DailyController(NewspaperRepository newspaperRepository) {
        this.newspaperRepository = newspaperRepository;
    }


    @GetMapping
    public List<Newspaper> getNewspapers() {
        return newspaperRepository.findAll();
    }

    @GetMapping("/{id}")
    public Newspaper getNewspaper(@PathVariable Long id) {
        return newspaperRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public String deleteNewspaper(@PathVariable Long id) {

        if (!newspaperRepository.existsById(id)) {
            return "Gazete bulunamadı";
        }

        newspaperRepository.deleteById(id);

        return "Gazete silindi";
    }
    @PostMapping("/{id}")
    public Newspaper addNewspaper(@RequestBody Newspaper newspaper) {

        newspaper.setDate(LocalDate.now());

        return newspaperRepository.save(newspaper);
    }
}
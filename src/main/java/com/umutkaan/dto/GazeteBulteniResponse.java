package com.umutkaan.dto;
import com.umutkaan.entity.Newspaper;
import com.umutkaan.entity.Sport;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDate;
import com.umutkaan.dto.GazeteBulteniResponse;
import java.util.List;
import java.util.Scanner;

@Data
@AllArgsConstructor
public class GazeteBulteniResponse {

    private LocalDate date;
    private List<String> newspapers;
    private List <String> sports;

    public GazeteBulteniResponse getTodayBulletin(){
        LocalDate today = LocalDate.now();




        return null;
    }
}

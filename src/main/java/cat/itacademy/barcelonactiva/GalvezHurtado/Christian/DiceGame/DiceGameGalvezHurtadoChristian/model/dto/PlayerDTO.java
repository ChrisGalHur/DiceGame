package cat.itacademy.barcelonactiva.GalvezHurtado.Christian.DiceGame.DiceGameGalvezHurtadoChristian.model.dto;

import cat.itacademy.barcelonactiva.GalvezHurtado.Christian.DiceGame.DiceGameGalvezHurtadoChristian.model.domain.DataPlayerEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerDTO {

    private String id;
    private String name;
    private String registration = dateTime();
    private String password;
    private List<DataPlayerEntity> dataPlayer = new ArrayList<>();
    private double percentage;

    public PlayerDTO(String name, double percent) {
        this.name = name;
        this.percentage = percent;
    }

    private String dateTime(){
        ZoneId barcelonaZone = ZoneId.of("Europe/Madrid");
        ZonedDateTime now = ZonedDateTime.now(barcelonaZone);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss");
        String formattedDate = formatter.format(now);
        return formattedDate;
    }
}

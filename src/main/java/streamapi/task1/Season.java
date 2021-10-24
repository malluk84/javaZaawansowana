package streamapi.task1;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Season {
    public String seasonName;
    public int seasonNumber;
    List<Episode> episodes;



}

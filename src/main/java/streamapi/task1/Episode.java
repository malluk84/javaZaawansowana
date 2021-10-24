package streamapi.task1;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Episode {
    public String episodeName;
    public int episodeNumber;
    List<Video> videos;


}

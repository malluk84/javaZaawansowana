package streamapi.task1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Video {
    public String titlel;
    public String url;
    public VideoType videoType;
}

package streamapi.task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VideoService {

    Video video1 = new Video("GOT1", "www.got1_1_1.com", VideoType.CLIP);
    Video video2 = new Video("GOT2", "www.got1_1_2.com", VideoType.PREVIEW);
    Video video3 = new Video("GOT3", "www.got1_1_3.com", VideoType.EPISODE);
    Video video21 = new Video("GOT4", "www.got1_1_4.com", VideoType.CLIP);
    Video video22 = new Video("GOT5", "www.got1_2_1.com", VideoType.CLIP);
    Video video23 = new Video("GOT6", "www.got1_2_2.com", VideoType.PREVIEW);
    Video video31 = new Video("GOT7", "www.got1_2_3.com", VideoType.EPISODE);


    Episode episode11 = new Episode("GOT1", 1, Arrays.asList(video1, video2, video3));
    Episode episode12 = new Episode("GOT2", 2, Arrays.asList(video21, video22, video23));
    Episode episode13 = new Episode("GOT3", 3, Arrays.asList(video31));


    Season season = new Season("GOT1", 1, Arrays.asList(episode11, episode12));
    Season season1 = new Season("GOT2", 2, Arrays.asList(episode13));


    public List<Season> seasons = Arrays.asList(season, season1);


    public List<Episode> episodes = seasons.stream()
            .flatMap(s -> season.episodes.stream())
            .collect(Collectors.toList());

    public List<Video> videos = seasons.stream()
            .flatMap(s -> season.episodes.stream())
            .flatMap(e -> e.videos.stream())
            .collect(Collectors.toList());

    public List<String> seasonsNames = seasons.stream()
            .map(s -> s.seasonName)
            .collect(Collectors.toList());

    public List<Integer> seasonNumbers = seasons.stream()
            .map(s -> s.seasonNumber)
            .collect(Collectors.toList());

    public List<String> videoNames = seasons.stream()
            .flatMap(s -> season.episodes.stream())
            .flatMap(e -> e.videos.stream())
            .map(v -> v.titlel)
            .collect(Collectors.toList());

    public List<String> episodeNames = seasons.stream()
            .flatMap(e -> e.episodes.stream())
            .map(e -> e.episodeName)
            .collect(Collectors.toList());

    public List<Integer> episodeNumbers = seasons.stream()
            .flatMap(e -> e.episodes.stream())
            .map(e -> e.episodeNumber)
            .collect(Collectors.toList());

    public List<String> videoUrls = seasons.stream()
            .flatMap(s -> season.episodes.stream())
            .flatMap(e -> e.videos.stream())
            .map(v -> v.url)
            .collect(Collectors.toList());

    public List<Episode> episodesFromEvenSeasons = seasons.stream()
            .filter(s -> s.seasonNumber % 2 == 0)
            .flatMap(s -> season.episodes.stream())
            .collect(Collectors.toList());

    /*public List<Video> videoFromEvenSeasons = seasons.stream()
            .filter(s -> s.seasonNumber % 2 == 0)
            .flatMap(s -> season.episodes.stream())
            .map(v -> videoNames)
            .collect(Collectors.toList());*/

    public List<Episode> evenEpisodesFromEvenSeasons = seasons.stream()
            .filter(s -> s.seasonNumber % 2 == 0)
            .flatMap(s -> season.episodes.stream())
            .filter(e -> e.episodeNumber % 2 == 0)
            .collect(Collectors.toList());

    public List<Video> clipVideoFormEvenEpisodeFromOddSeasons = seasons.stream()
            .filter(s -> s.seasonNumber % 2 != 0)
            .flatMap(s -> season.episodes.stream())
            .filter(e -> e.episodeNumber % 2 == 0)
            .flatMap(e -> e.videos.stream())
            .filter(v -> v.videoType == VideoType.CLIP)
            .collect(Collectors.toList());

    public List<Video> previewVideoFromOddEpisodesFromEvenSeasoons = seasons.stream()
            .filter(s -> s.seasonNumber % 2 != 0)
            .flatMap(s -> season.episodes.stream())
            .filter(e -> e.episodeNumber % 2 == 0)
            .flatMap(e -> e.videos.stream())
            .filter(v -> v.videoType == VideoType.PREVIEW)
            .collect(Collectors.toList());


}

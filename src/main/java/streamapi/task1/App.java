package streamapi.task1;

public class App {
    public static void main(String[] args) {

        VideoService videoService = new VideoService();

        System.out.println("Lista wszystkich epizodów: " + videoService.episodes);

        System.out.println("Lista wszystkich filmów: " + videoService.videos);

        System.out.println("Lista wszystkich nazw sezonów: " + videoService.seasonsNames);

        System.out.println("Lista wszystkich liczb sezonów: " + videoService.seasonNumbers);

        System.out.println("Lista wszystkich nazw video: " + videoService.videoNames);

        System.out.println("Lista wszystkich nazw epizodów: " + videoService.episodeNames);

        System.out.println("Lista wszystkich liczb epizodów: " + videoService.episodeNumbers);

        System.out.println("Lista wszystkich adresów url dla każdego video: " + videoService.videoUrls);

        System.out.println("Tylko epizody z przystych sezonów: " + videoService.evenEpisodesFromEvenSeasons);

        System.out.println("Tylko epizody z parzystych sezonów: " + videoService.episodesFromEvenSeasons);

/*
        System.out.println("Tylko video z przystych sezonów: " + videoService.evenSeasons);
*/

        System.out.println("Clip z parzystych epizodów i nieparzystych sezonów: " + videoService.clipVideoFormEvenEpisodeFromOddSeasons);

        System.out.println("Preview z nieparzystych epizodów i parzystych sezonów: " + videoService.previewVideoFromOddEpisodesFromEvenSeasoons);

    }
}

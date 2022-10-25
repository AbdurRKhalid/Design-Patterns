public interface ThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();
    Video getVideo(String videoId);
}

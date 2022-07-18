package dp._3_structuralPatterns._3_facade.code;

import java.io.File;

public class Facade {

    public Video playVideo(String fileName) {
        VideoPlayer player = new VideoPlayer();
        player.showDuration();
        player.showSubtitles();

        return player.play(fileName, getDecodeStream(fileName));
    }

    public Video playVideoWithoutOverlay(String fileName) {
        VideoPlayer player = new VideoPlayer();
        player.hideDuration();
        player.hideSubtitles();

        return player.play(fileName, getDecodeStream(fileName));
    }

    private byte[] getDecodeStream(String fileName) {
        FileReader fileReader = new FileReader();
        File file = fileReader.readFile(fileName);
        MediaCodec mediaCodec = new MediaCodec();
        return mediaCodec.decodeFile(file);
    }

}

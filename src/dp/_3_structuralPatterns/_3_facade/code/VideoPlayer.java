package dp._3_structuralPatterns._3_facade.code;

public class VideoPlayer {

	private Sound sound;
	private Picture picture;
	private Video result;
	
	public VideoPlayer() {
		sound = new Sound();
		picture = new Picture();
		result = new Video();
	}
	
	public VideoPlayer(Video video) {
		sound = new Sound();
		picture = new Picture();
		this.result = video;
	}
	
	public void showSubtitles() {
		result.setSubsShown(true);
	}
	
	public void showDuration() {
		result.setDurationShown(true);
	}
	
	public void hideSubtitles() {
		result.setSubsShown(false);
	}
	
	public void hideDuration() {
		result.setDurationShown(false);
	}
	
	public Video play(String name, byte[] decodedVideo) {
		if (decodedVideo.length > 0) {
			result.setTitle(name);
			return result;
		}
		else {
			return null;
		}
	}
}
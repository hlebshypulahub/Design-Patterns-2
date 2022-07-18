package dp._3_structuralPatterns._3_facade.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import dp._3_structuralPatterns._3_facade.code.*;
import org.junit.Test;

/**
 * TASK 3.3 - This is a client for VideoPlayer functionality. 
 * Both tests are calling exact the same functionality in the same order. 
 * Introduce Facade pattern to simplify this code and to unify the interfaces.
 * 
 * @author mibejm
 *
 */
public class VideoPlayerClientTest {

	Facade facade = new Facade();

	@Test
	public void shouldPlayVideo() {
		// given
		String fileName = "movie.avi";
		
		// when
//		FileReader fileReader = new FileReader();
//		File file = fileReader.readFile(fileName);
//
//		MediaCodec mediaCodec = new MediaCodec();
//		byte[] decodedStream = mediaCodec.decodeFile(file);
//
//		VideoPlayer player = new VideoPlayer();
//		player.showDuration();
//		player.showSubtitles();
//		Video video = player.play(fileName, decodedStream);

		Video video = facade.playVideo(fileName);

		// then
		assertEquals(fileName, video.getTitle());
		assertTrue(video.isDurationShown());
		assertTrue(video.isSubsShown());
	}
	
	@Test
	public void shouldNotPlayVideoInUnknownFormat() {
		// given
		String fileName = "film.flv";
		
		// when
//		FileReader fileReader = new FileReader();
//		File file = fileReader.readFile(fileName);
//
//		MediaCodec mediaCodec = new MediaCodec();
//		byte[] decodedStream = mediaCodec.decodeFile(file);
//
//		VideoPlayer player = new VideoPlayer();
//		player.showDuration();
//		player.showSubtitles();
//		Video video = player.play(fileName, decodedStream);

		Video video = facade.playVideo(fileName);

		// then
		assertNull(video);
	}
	
	@Test
	public void shouldStopVideo() {
		// given
		String fileName = "movie.avi";
//		Video video = new Video();
//		video.setDurationShown(true);
//		video.setSubsShown(true);
//		video.setTitle(fileName);
//
//		// when
//		VideoPlayer player = new VideoPlayer(video);
//		player.hideDuration();
//		player.hideSubtitles();

		Video video = facade.playVideoWithoutOverlay(fileName);

		// then
		assertEquals(fileName, video.getTitle());
		assertFalse(video.isDurationShown());
		assertFalse(video.isSubsShown());
	}
}

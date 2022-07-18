package dp._3_structuralPatterns._3_facade.code;

public class Video {

	private String title;
	private boolean subsShown;
	private boolean durationShown;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isSubsShown() {
		return subsShown;
	}
	public void setSubsShown(boolean subsShown) {
		this.subsShown = subsShown;
	}
	public boolean isDurationShown() {
		return durationShown;
	}
	public void setDurationShown(boolean durationShown) {
		this.durationShown = durationShown;
	}
}

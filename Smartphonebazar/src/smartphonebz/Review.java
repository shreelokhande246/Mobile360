package smartphonebz;

public class Review {
	private String content;

    public Review(String content) {
        this.setContent(content);
}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
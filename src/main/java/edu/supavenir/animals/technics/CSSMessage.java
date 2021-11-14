package edu.supavenir.animals.technics;

public class CSSMessage {
	private String content;
	private String type;
	private String icon;

	public CSSMessage(String content, String type, String icon) {
		this.content = content;
		this.type = type;
		this.icon = icon;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public static CSSMessage SuccessMessage(String content) {
		return new CSSMessage(content, "success", "check");
	}

	public static CSSMessage ErrorMessage(String content) {
		return new CSSMessage(content, "error", "exclamation circle");
	}
}


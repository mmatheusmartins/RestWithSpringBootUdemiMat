package br.com.erudio;

public class Greeting {

	private final long id;
	private final String content;

	public Greeting(long id, String content) {
	//	super();  remover isso
		this.id = id;
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public long getId() {
		return id;
	}

	// alt + shift + s para adicionar getters and setters

}

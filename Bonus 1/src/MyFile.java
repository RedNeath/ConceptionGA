public class MyFile {
	SaveStrategy saveStrategy;
	String content;

	/**
	 * @param content Le contenu du fichier !
	 */
	public MyFile(String content) {
		this.content = content;

		this.saveStrategy = new JsonSaveStrategy();
	}

	public void setSaveStrategy(SaveStrategy strategy) {
		this.saveStrategy = strategy;
	}

	public String getContent() {
		return this.content;
	}

	public void saveContent() {
		this.saveStrategy.save(this);
	}

	public static void main(String[] args) {
		MyFile myFile = new MyFile("something");

		myFile.saveContent();
		myFile.setSaveStrategy(new XmlSaveStrategy());
		myFile.saveContent();
	}

}

package webdeveloper_one.todayq;

public class BoardBean {
	private String title;
	private String id;
	private String name;
	private String date;
	private String email;
	private int hits;

	public BoardBean(String title, String id, String name, String date, String email, int hits) {
		this.title = title;
		this.id = id;
		this.name = name;
		this.date = date;
		this.email = email;
		this.hits = hits;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return title +"\t\t" +id + "\t\t" + name + "\t\t" + date + "\t\t" + email + "\t\t\t" + hits;
	}

}

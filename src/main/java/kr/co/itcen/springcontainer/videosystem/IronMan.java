package kr.co.itcen.springcontainer.videosystem;

public class IronMan implements DisitalVideoDisc {
	private String title = "IronMan";
	private String studio = "MARVEL";
	
	@Override
	public void play() {
		System.out.println("Playing Movie " + studio + "'s " + title);
	}

	@Override
	public String toString() {
		return "Avengers [title=" + title + ", studio=" + studio + "]";
	}

}

package kr.co.itcen.springcontainer.videosystem;

public class Avengers implements DisitalVideoDisc{
	private String title = "Avengers";
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

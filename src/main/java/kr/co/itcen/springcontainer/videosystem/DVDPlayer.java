package kr.co.itcen.springcontainer.videosystem;

public class DVDPlayer {
	private DisitalVideoDisc dvd;
	
	public DVDPlayer() {
	}
	public DVDPlayer(DisitalVideoDisc dvd) {
		this.dvd = dvd;
	}
	
	public DisitalVideoDisc getDvd() {
		return dvd;
	}

	public void setDvd(DisitalVideoDisc dvd) {
		this.dvd = dvd;
	}

	public void play() {
		dvd.play();
	}
}

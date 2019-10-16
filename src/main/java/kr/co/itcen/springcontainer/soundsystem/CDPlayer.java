package kr.co.itcen.springcontainer.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {
	
	// wiring 1 : @Autowired + 필드
	@Autowired
	@Qualifier("highSchoolRapper3Final")	// bean Id 설정
	private CompactDisc compactDisc;
	
	// wiring 2 : @Autowired + 생성자
	//@Inject		// -> 스프링 기반의 와이어링 어노테이션을 사용할 수 없는 경우,
					// -> @Autowired 와 별 차이는 없다. 선호하는 것을 일관성 있게 사용하면 된다.
	//@Autowired
	public CDPlayer(CompactDisc compactDisc) {
		this.compactDisc = compactDisc;
	}
	
	public CDPlayer() {
		System.out.println("CDPlayer() 기본 생성자 호출");
	}
	
	// wiring 3 : @Autowired + setter
	//@Autowired
	public void setCompactDisc(CompactDisc compactDisc) {
		this.compactDisc = compactDisc;
	}
	
	// wiring 4 : @Autowired + 보통메소드
	//@Autowired
	public void insertCompactDisc(CompactDisc compactDisc) {
		this.compactDisc = compactDisc;
	}
	
	public void play() {
		compactDisc.play();
	}
}

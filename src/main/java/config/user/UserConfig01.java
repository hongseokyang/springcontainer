package config.user;

import org.springframework.context.annotation.Bean;

import kr.co.itcen.springcontainer.user.Friend;
import kr.co.itcen.springcontainer.user.User;

public class UserConfig01 {
	
	@Bean
	public User user() {
		User user = new User();
		user.setNo(5L);
		user.setName("도우넛");
		user.setFriend(friend());
		
		return user;
	}
	
	@Bean
	public Friend friend() {
		return new Friend("또치");
	}
}

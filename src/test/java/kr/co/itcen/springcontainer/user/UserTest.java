package kr.co.itcen.springcontainer.user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.user.UserConfig01;

@RunWith(SpringJUnit4ClassRunner.class)					// JUnit 으로 실행할 Spring Container 설정
@ContextConfiguration(classes = {UserConfig01.class})	// java config - bean 생성
public class UserTest {
	
	@Autowired
	private User user;
	
	@Autowired
	private Friend friend;
	
	@Test		// 쓰레드 -> 병렬 테스트
	public void testMethod() {
		int x = 8;
		assert(x - 2 == 6);
	}
	
	@Test
	public void testUserNull() {
		assertNotNull(user);
	}
	
	@Test
	public void testFriendDooly() {
		assertEquals(friend.getName(), "또치");
	}
}

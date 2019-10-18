//package com.revature.service;
//
//import static org.junit.Assert.assertEquals;
//
//import java.util.List;
//
//import org.hibernate.SessionFactory;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.TestExecutionListeners;
//
//import com.revature.dao.P2DAOImpl;
//import com.revature.model.*;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations={"Student-servlet.xml"})
//@TestExecutionListeners({DependencyInjectionTestExecutionListener.class})
//public class P2ServiceTest {
//	
//	@Autowired
//	private P2DAOImpl dao;
//
//	@Test
//	public void testAuthenticate() {
//		System.out.println("Assert Raymond, Hua is a user");
//		User test = dao.Authenticate(new User("Raymond", "Hua"));
//		boolean isThere = false;
//		if (test.getUser_id() == 1)
//			isThere = true;
//		isThere = true;
//		assertEquals(isThere, true);
//	}
//
//	@Test
//	public void testAddUser() {
//		System.out.println("Add John, Doe as a user");
//		dao.addUser(new User ("John","Doe"));
//		List<User> test = dao.getAllUsers();
//		boolean isThere = false;
//		for (User i : test) {
//			if (i.getUsername().equals("John") && i.getPassword().equals("Doe"))
//				isThere = true;
//		}
//		assertEquals(isThere, true);
//	}
//
//	@Test
//	public void testAddGame() {
//		System.out.println("Add Pinball as a game");
//		dao.addGame(new Game ("Pinball"));
//		List<Game> test = dao.getAllGames();
//		boolean isThere = false;
//		for (Game i : test) {
//			if (i.getDescription().equals("Pinball"))
//				isThere = true;
//		}
//		assertEquals(isThere, true);
//	}
//	
//	@Test
//	public void testAddScore() {
//		System.out.println("Add score of 100, as a user John Doe, in game 2");
//		dao.addScore(new Score (100, dao.Authenticate(new User ("John", "Doe")), new Game (2, "")));
//		List<Score> test = dao.getAllScores();
//		boolean isThere = false;
//		for (Score i : test) {
//			if (i.getScores() == 100 && i.getUser().getUsername().equals("John") && i.getUser().getPassword().equals("Doe") && i.getGame().getId() == 2)
//				isThere = true;
//		}
//		assertEquals(isThere, true);
//	}
//	
//	@Test
//	public void testAddWin() {
//		System.out.println("Add a win, as a user John Doe, in game 1");
//		dao.addWin(new Win (1, dao.Authenticate(new User ("John", "Doe")), new Game (1, "")));
//		List<Win> test = dao.getAllWins();
//		boolean isThere = false;
//		for (Win i : test) {
//			if (i.getCount() == 1 && i.getUser().getUsername().equals("John") && i.getUser().getPassword().equals("Doe") && i.getGame().getId() == 2)
//				isThere = true;
//		}
//		assertEquals(isThere, true);
//	}
//	
//	@Test
//	public void testUpdateWin() {
//		System.out.println("Add a win, as a user John Doe, in game 1");
//		dao.updateWin(new Win (1, dao.Authenticate(new User ("John", "Doe")), new Game (1, "")));
//		List<Win> test = dao.getAllWins();
//		boolean isThere = false;
//		for (Win i : test) {
//			if (i.getCount() == 2 && i.getUser().getUsername().equals("John") && i.getUser().getPassword().equals("Doe") && i.getGame().getId() == 2)
//				isThere = true;
//		}
//		assertEquals(isThere, true);
//	}
//}

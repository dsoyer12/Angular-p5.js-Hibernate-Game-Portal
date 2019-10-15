package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Game;
import com.revature.model.Win;
import com.revature.service.P2Services;

@Controller
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/win")
public class WinController {

	private P2Services p2s;

	@Autowired // setter injection
	public void setP2Services(P2Services p2s) {
		this.p2s = p2s;
	}

	@ResponseBody // tells Spring to skip ViewResolver
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public ResponseEntity<List<Win>> getAll() {
		return new ResponseEntity<>(this.p2s.getAllWins(), HttpStatus.OK);
	}
	
	@ResponseBody 
	@RequestMapping(value = "/top10", method = RequestMethod.GET)
	public ResponseEntity<List<Win>> getTop10(@RequestBody Game game) {
		return new ResponseEntity<>(this.p2s.top10Wins(game), HttpStatus.OK);
	}

	@ResponseBody
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<String> addWin(@RequestBody Win win) {
		ResponseEntity<String> resp = null;
			try {
				this.p2s.addWin(win);
				resp = new ResponseEntity<>("WIN CREATED SUCCESSFULLY", HttpStatus.OK);
			} catch(Exception e) {
				e.printStackTrace();
				resp = new ResponseEntity<>("FAILED TO CREATE WIN", HttpStatus.BAD_REQUEST);
			}
		return resp;
	}
	
	@ResponseBody
	@RequestMapping(method=RequestMethod.PUT)
	public ResponseEntity<String> updateWin(@RequestBody Win win) {
		ResponseEntity<String> resp = null;
			try {
				this.p2s.updateWin(win);
				resp = new ResponseEntity<>("WIN UPDATED SUCCESSFULLY", HttpStatus.OK);
			} catch(Exception e) {
				e.printStackTrace();
				resp = new ResponseEntity<>("FAILED TO UPDATE WIN", HttpStatus.BAD_REQUEST);
			}
		return resp;
	}

}
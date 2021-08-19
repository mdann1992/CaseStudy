package de.maurice.casestudy.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.maurice.casestudy.model.Betriebsstellen;
import de.maurice.casestudy.repository.BetriebsstellenRepository;


@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/betriebsstelle")
public class BetriebsstellenController {
	
	@GetMapping("/hallo")
	public String test() {
		return "<body style='background: #cafcfa; width: 100%; height: 100%;'><div style='position: absolute; top: 45%; width:100%; font-size: 160px; text-align: center;'>Hello World!</div></body>";
	}
	
	@Autowired
	BetriebsstellenRepository betriebsstellenRepository;
	

	@GetMapping(value = "/all")
	public List<Betriebsstellen> getAll(){
		return betriebsstellenRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Betriebsstellen> getTutorialById(@PathVariable("id") String kurzname) {
		Optional<Betriebsstellen> stellenData = betriebsstellenRepository.findById(kurzname);
		if (stellenData.isPresent()) {
			return new ResponseEntity<>(stellenData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}

package com.japharr.guestbook.web.controller;

import com.japharr.guestbook.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/players")
public class PlayerController {
    private static Logger logger = LoggerFactory.getLogger(PlayerController.class);

    @Autowired
    PersonRepository personRepository;

    /*
    @Autowired
    PlayerRepository playerRepository;

    //@Autowired
    //CustomRepository<Player, String> playerRepository;

    //@Autowired
    //CustomRepository<Parent, String> parentRepository;

    @Autowired
    ParentRepository parentRepository;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Player getPlayer(@PathVariable("id") Long id) {
        return playerRepository.findOne(id);
    }

    public Parent getParent() {
        Parent parent;
        List<Parent> parents = parentRepository.findAll();
        if (parents == null || parents.size() == 0) {
            parent = new Parent();
            parentRepository.save(parent);
        } else {
            parent = parents.get(0);
        }

        return parent;
    }

    @RequestMapping(value = "/initDB", method = RequestMethod.GET)
    @Transactional(readOnly = false, isolation = Isolation.READ_COMMITTED)
    public ResponseEntity<String> initDB() {
        // get entity group parent
        Parent p = getParent();

        // insert testing player data
        List<Player> players = new ArrayList<Player>();
        players.add(new Player("Snoopy", "9p", p));
        players.add(new Player("Wookstock", "9p", p));
        players.add(new Player("Charlie", "1d", p));
        players.add(new Player("Lucy", "4d", p));
        players.add(new Player("Sally", "5d", p));
        playerRepository.save(players);
        return new ResponseEntity<String>("5 players inserted into database", HttpStatus.OK);
    }
    */
}

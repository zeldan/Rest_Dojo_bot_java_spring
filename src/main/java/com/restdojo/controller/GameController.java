package com.restdojo.controller;

import static com.restdojo.model.type.Location.BilliardRoom;
import static com.restdojo.model.type.QuestionType.Accusation;
import static com.restdojo.model.type.Suspect.ColMustard;
import static com.restdojo.model.type.Weapon.LeadPipe;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.restdojo.model.GiveAnswerPayload;
import com.restdojo.model.InformPayload;
import com.restdojo.model.Question;
import com.restdojo.model.StartGamePayload;

@Controller
@ResponseBody
public class GameController {

    @RequestMapping(method = GET, value = "/name")
    public String name() {
        // TODO: introduce yourself
        return "Team alpha";
    }

    @RequestMapping(method = POST, value = "/startGame")
    public String startGame(@RequestParam final String gameId, @RequestBody final StartGamePayload payload) {
        // TODO Don't cheat
        // System.out.println("Start game " + gameId);
        // System.out.println(payload.getCountOfPlayers() + "\t" + payload.getPlayerId());
        // payload.getWeapons().forEach(System.out::println);
        // payload.getLocations().forEach(System.out::println);
        // payload.getSuspects().forEach(System.out::println);
        return "OK";
    }

    @RequestMapping(method = POST, value = "/giveAnswer")
    public String giveAnswer(@RequestParam final String gameId, @RequestBody final GiveAnswerPayload payload) {
        // TODO Don't cheat
        // System.out.println("Give answer " + gameId);
        // System.out.print(payload.getAskedBy() + "\t" + payload.getQuestion());
        return "";
    }

    @RequestMapping(method = POST, value = "/askQuestion")
    public Question askQuestion(@RequestParam final String gameId) {
        // TODO Play in 3; Play in 6
        // System.out.println("Ask question " + gameId);
        return new Question(Accusation, BilliardRoom, ColMustard, LeadPipe);
    }

    @RequestMapping(method = POST, value = "/observe")
    public String observe(@RequestParam final String gameId, @RequestBody final InformPayload payload) {
        // TODO Play in 3; Play in 6
        // System.out.println("Observe " + gameId);
        // System.out.println(payload.getAskedBy() + "\t" + payload.getQuestion() + " \t" + payload.getAnsweredBy()); // + "\t" + payload.getAnswer());
        return "OK";
    }

}

package com.cricket.controller;

import com.cricket.api.CricketApi;
import com.cricket.model.TeamDetails;
import com.cricket.repository.ITeamDetailsRepository;
import com.cricket.repository.TeamDetailsRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Controller
public class TeamDetailsController implements CricketApi {

    private static final Logger log = LoggerFactory.getLogger(TeamDetailsController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    public TeamDetailsController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    @Autowired
    ITeamDetailsRepository teamDetailsRepository;

    public ResponseEntity<TeamDetails> getTeamDetails(@ApiParam(value = "Team ID", required = true) @PathVariable("teamId") String teamId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {

                //return new ResponseEntity<TeamDetails>(objectMapper.readValue("{  \"teamName\" : \"teamName\",  \"score\" : 0,  \"teamId\" : \"teamId\",  \"dateOfMatch\" : \"2000-01-23T04:56:07.000+00:00\",  \"playedAgainstTeam\" : {    \"teamName\" : \"teamName\",    \"teamId\" : \"teamId\"  }}", TeamDetails.class), HttpStatus.NOT_IMPLEMENTED);
                return new ResponseEntity<TeamDetails>(teamDetailsRepository.getTeamDetailsByTeamId(teamId), HttpStatus.OK);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TeamDetails>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TeamDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

    @RequestMapping(value = "/")
    public String index() {
        System.out.println("swagger-ui.html");
        return "redirect:swagger-ui.html";
    }
}
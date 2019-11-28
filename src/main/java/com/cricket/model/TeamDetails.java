package com.cricket.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * TeamDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-28T15:13:11.741Z")

@Entity
@Table(schema = "CricketDB", name= "CRICKET_TEAM")
public class TeamDetails   {

  @Id
  @JsonProperty("teamId")
  @Column(name = "team_id")
  private String teamId = null;

  @JsonProperty("teamName")
  @Column(name = "team_name")
  private String teamName = null;

  @JsonProperty("score")
  @Column(name = "score")
  private Integer score = null;

  @JsonProperty("dateOfMatch")
  @Column(name = "date_of_match")
  private String dateOfMatch = null;

  @JsonProperty("teamIdPlayed")
  @Column(name = "team_id_played")
  private String playedAgainstTeam = null;

  public TeamDetails teamId(String teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * Get teamId
   * @return teamId
  **/
  @ApiModelProperty(value = "")


  public String getTeamId() {
    return teamId;
  }

  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }

  public TeamDetails teamName(String teamName) {
    this.teamName = teamName;
    return this;
  }

  /**
   * Get teamName
   * @return teamName
  **/
  @ApiModelProperty(value = "")


  public String getTeamName() {
    return teamName;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }

  public TeamDetails score(Integer score) {
    this.score = score;
    return this;
  }

  /**
   * Get score
   * @return score
  **/
  @ApiModelProperty(value = "")


  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }

  public TeamDetails dateOfMatch(String dateOfMatch) {
    this.dateOfMatch = dateOfMatch;
    return this;
  }

  /**
   * Get dateOfMatch
   * @return dateOfMatch
  **/
  @ApiModelProperty(value = "")

  @Valid

  public String getDateOfMatch() {
    return dateOfMatch;
  }

  public void setDateOfMatch(String dateOfMatch) {
    this.dateOfMatch = dateOfMatch;
  }

  public TeamDetails playedAgainstTeam(String playedAgainstTeam) {
    this.playedAgainstTeam = playedAgainstTeam;
    return this;
  }

  /**
   * Get playedAgainstTeam
   * @return playedAgainstTeam
  **/
  @ApiModelProperty(value = "")

  @Valid

  public String getPlayedAgainstTeam() {
    return playedAgainstTeam;
  }

  public void setPlayedAgainstTeam(String playedAgainstTeam) {
    this.playedAgainstTeam = playedAgainstTeam;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamDetails teamDetails = (TeamDetails) o;
    return Objects.equals(this.teamId, teamDetails.teamId) &&
        Objects.equals(this.teamName, teamDetails.teamName) &&
        Objects.equals(this.score, teamDetails.score) &&
        Objects.equals(this.dateOfMatch, teamDetails.dateOfMatch) &&
        Objects.equals(this.playedAgainstTeam, teamDetails.playedAgainstTeam);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teamId, teamName, score, dateOfMatch, playedAgainstTeam);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamDetails {\n");
    
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    teamName: ").append(toIndentedString(teamName)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    dateOfMatch: ").append(toIndentedString(dateOfMatch)).append("\n");
    sb.append("    playedAgainstTeam: ").append(toIndentedString(playedAgainstTeam)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


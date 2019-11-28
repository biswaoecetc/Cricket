package com.cricket.repository;

import com.cricket.model.TeamDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITeamDetailsRepository extends CrudRepository<TeamDetails, String> {

    public TeamDetails getTeamDetailsByTeamId(String teamId);
}

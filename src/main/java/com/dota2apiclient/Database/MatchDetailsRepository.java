package com.dota2apiclient.Database;

import com.dota2apiclient.Database.Models.MatchDetailsDAO;
import org.springframework.data.repository.*;

public interface MatchDetailsRepository extends Repository<MatchDetailsDAO, Long> {
}

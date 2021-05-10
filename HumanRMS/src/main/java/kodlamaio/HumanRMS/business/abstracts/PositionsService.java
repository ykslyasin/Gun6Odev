package kodlamaio.HumanRMS.business.abstracts;

import java.util.List;

import kodlamaio.HumanRMS.entities.concrete.Positions;

public interface PositionsService {
	List<Positions> getAll();
}

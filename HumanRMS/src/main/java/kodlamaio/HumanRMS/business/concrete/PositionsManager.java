package kodlamaio.HumanRMS.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HumanRMS.business.abstracts.PositionsService;
import kodlamaio.HumanRMS.dataAccess.abstracts.PositionsDao;
import kodlamaio.HumanRMS.entities.concrete.Positions;

@Service
public class PositionsManager implements PositionsService{
	
	private PositionsDao positionsDao;

	@Autowired
	public PositionsManager(PositionsDao positionsDao) {
		super();
		this.positionsDao = positionsDao;
	}

	@Override
	public List<Positions> getAll() {
		return positionsDao.findAll();
	}

}

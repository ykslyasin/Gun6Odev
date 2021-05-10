package kodlamaio.HumanRMS.entities.concrete;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="positions")
public class Positions {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="positions")
	private String positions;
	
	public Positions() {
		
	}

	public Positions(int id, String positions) {
		super();
		this.id = id;
		this.positions = positions;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPositions() {
		return positions;
	}

	public void setPositions(String positions) {
		this.positions = positions;
	}
}

package joeys_hamburger_barn.models.superclass;

import java.sql.Timestamp;
import java.util.UUID;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Object {

	@Id
	private String id = UUID.randomUUID().toString();
	private Timestamp timestamp = new Timestamp(System.currentTimeMillis());

	public Object() {

	}

	public String getId() {
		return this.id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public Timestamp getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(final Timestamp timestamp) {
		this.timestamp = timestamp;
	}

}

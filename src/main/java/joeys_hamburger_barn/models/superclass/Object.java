package joeys_hamburger_barn.models.superclass;

import java.sql.Timestamp;
import java.util.UUID;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Object {

	@Id
	private String id = UUID.randomUUID().toString();
	private Timestamp created_at = new Timestamp(System.currentTimeMillis());

	public Object() {

	}

	public String getId() {
		return this.id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public Timestamp getCreated_at() {
		return this.created_at;
	}

	public void setCreated_at(final Timestamp created_at) {
		this.created_at = created_at;
	}

}

/**
 *
 */
package joeys_hamburger_barn.models;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import joeys_hamburger_barn.models.superclass.Item;

/**
 * @author Spit Ice
 *
 */

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Drink extends Item {

	public Drink() {
		
	}
	
	public Drink(final String name, final long price) {
		super(name, price);
	}

}

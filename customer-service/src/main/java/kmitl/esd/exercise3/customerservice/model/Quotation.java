package kmitl.esd.exercise3.customerservice.model;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * Quote entity for persistence
 */
@Entity
@Table //class name is table name
@NamedQuery(name="Q")
public class Quotation {
}

package models;

import java.util.*;

import play.data.validation.Constraints.*;
import play.db.ebean.*;

import javax.persistence.*;

@Entity
public class Task extends Model {

	@Id
	private Long id;
	
	@Required
	public String label;
	
	private static final long serialVersionUID = 1L;

	public static Finder<Long, Task> find = new Finder<Long, Task>(Long.class, Task.class);

	public static List<Task> all() {
		return find.all();
	}
	
	public static void create(Task task) {
		task.save();
	}
	
	public static void delete(Long id) {
		find.ref(id).delete();
	}
	
	public Long getId() {
		return id;
	}
	
}

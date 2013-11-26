package models;

import java.util.*;

import play.data.validation.Constraints.*;
import play.db.ebean.Model.Finder;

public class Task {

	public Long id;
	
	@Required
	public String label;
	
	public static List<Task> all() {
		return new ArrayList<Task>();
	}
	
	public static void create(Task task) {
		//TODO
	}
	
	public static void delete(Long id) {
		//TODO
	}
	
}

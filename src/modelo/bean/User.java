package modelo.bean;

import java.util.ArrayList;
import java.util.Date;

public class User {
	
	private int id;
	private String name;
	private String zipcode;
	private String email;
	private String username;
	private String password;
	private Date registerDate;
	
	private ArrayList<Post> posts;
	private ArrayList<Categorie> categories;

}

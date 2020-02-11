package modelo.bean;

import java.util.ArrayList;
import java.util.Date;

public class Post {
	
	private int id;
	private String title;
	private String slug;
	private String body;
	private String postImage;
	private Date createdAt;
	
	private Categorie categorie;
	private User user;
	private ArrayList<Comment> comments;
}

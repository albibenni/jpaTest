
	
	/**
	 * public Utenti mapRow(ResultSet rs, int rowNum) throws SQLException {
		Utenti customer = new Utenti();
		customer.setId(rs.getInt("id"));
		customer.setNome(rs.getString("nome"));
		customer.setCognome(rs.getString("cognome"));
		return customer;
	}
	
	
	
	
	@Id
	@GeneratedValue
	
	
	@Size(min=2, message = "Name should have atleast 2 characters")
	@JsonProperty("user_name")
	
	
	@Past(message = "Birth Date should be in the past")
	
	@ManyToOne(fetch = FetchType.LAZY)
	private User user;
	
	@OneToMany(mappedBy = "user")
	@JsonIgnore
	private List<Post> posts;
	
	
	
	
	
	@GetMapping("/users/role")
	public List<Ruoli> retrieveAllRole() {
		return roleRepository.findAll();

	}

	@GetMapping("/user/partner")
	public List<Partner> retrieveAllPartner() {
		return partnerRepository.findAll();

	}

	@GetMapping("/user/skills")
	public List<Skills> retrieveAllSkills() {
		return skillRepository.findAll();

	}

	@GetMapping("/user-skills")
	public List<UserSkills> retrieveUserSkills() {
		return userskillRepository.findAll();

	}

}

*/

package ar.edu.unlam.tallerweb1.modelo;

public class Viajero{
	 
	private Long id;
	private String usuario;
	private String password;
	private String nombre;
	private String apellido;
	private String email;
	private String sexo;
	private String fechaNac;
	private String descripcion;
	private String idUsuarioInvitado;
	
	//Constructor
	public Viajero(){
	}

	//Getters y Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getIdUsuarioInvitado() {
		return idUsuarioInvitado;
	}

	public void setIdUsuarioInvitado(String idUsuarioInvitado) {
		this.idUsuarioInvitado = idUsuarioInvitado;
	}
	
}

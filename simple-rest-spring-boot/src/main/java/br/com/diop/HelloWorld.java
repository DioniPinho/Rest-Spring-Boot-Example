package br.com.diop;

public class HelloWorld {
	private Long id;
	private String msg;
	
	public HelloWorld(Long id, String msg) {
		this.id = id;
		this.msg = msg;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	
	public Long getId(){
		return id;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String getMsg() {
		return msg;
	}

}

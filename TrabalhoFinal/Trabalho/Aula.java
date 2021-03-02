package trabalhomds;

public class Aula {
	
	String data;
	String hora;
	
		public Aula(String data, String hora) {
			
			this.data = data;
			this.hora = hora;
			
		}

		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public String getHora() {
			return hora;
		}

		public void setHora(String hora) {
			this.hora = hora;
		}

}

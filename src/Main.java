import com.leo.dio.oop.Curso;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		
		curso1.setTitle("Java Course");
		curso1.setDescricao("DIO curso Sping Boot");
		curso1.setCargaHoraria(25);
		
		System.out.println(curso1);

	}

}

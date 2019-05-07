import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

public class GerarJsonCerveja {
		
		public static void main(String[]args) {
			
			Cerveja skol = new Cerveja();
			
			skol.setNome("Skol Beats");
			skol.setAno("2019");
			skol.setMalte("Puro");
			skol.setMarca("Skol");
			
			Gson gs = new Gson();
			String CervejaJson = gs.toJson(skol);
			
			FileWriter f;
			try {
				f = new FileWriter("\\Users\\aluno\\Documents\\cerveja.json");
				f.write(CervejaJson);
				f.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
				System.out.println(CervejaJson);
			
		}
	}

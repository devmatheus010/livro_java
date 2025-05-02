package exercicios_deittel;

public class MainCarro {
	public static void main(String[] args) {
		
		//ISTANCIA DO OBJETO
		CarroHibrido carro1 = new CarroHibrido("GWM HAVAL H6", "19kwh", 11.7, 10.4);
		System.out.printf("\nCarro: %s\nBateria: %s\nConsumo Urbano: %.2f\nConsumo Estrada: %.2f",
		carro1.getNome(), carro1.getTipoBateria(), carro1.getConsumoUrbano(), carro1.getConsumoEstrada());
		System.out.println();
		
		CarroHibrido carro2 = new CarroHibrido("Byd Song Plus", "18kwh", 15.1, 27.2);
		System.out.printf("\nCarro: %s\nBateria: %s\nConsumo Urbano: %.2f\nConsumo Estrada: %.2f",
		carro2.getNome(), carro2.getTipoBateria(), carro2.getConsumoUrbano(), carro2.getConsumoEstrada());
		System.out.println();
		
		CarroHibrido carro3 = new CarroHibrido("Toyota Corolla Cross", "Heliar 45ah", 17.7, 14.6);
		System.out.printf("\nCarro: %s\nBateria: %s\nConsumo Urbano: %.2f\nConsumo Estrada: %.2f",
		carro3.getNome(), carro3.getTipoBateria(), carro3.getConsumoUrbano(), carro3.getConsumoEstrada());
		System.out.println();
		
		
	}
}

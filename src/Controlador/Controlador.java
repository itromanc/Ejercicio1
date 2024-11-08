package Controlador;

public class Controlador {
private int miNumero;
public Controlador() {
	miNumero=Vista.Vista.LeerNumero();
	Resultado();
}
public void Resultado() {
	if(miNumero%2==0) {
		Vista.Vista.mostrar(miNumero, "PAR", 0);
	}else {
		Vista.Vista.mostrar(miNumero, "IMPAR", 1);
	}
}
}

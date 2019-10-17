package catalogopersonajes;

public class Principal {

	public static void main(String[] args) {
		Sprite animacion=new Sprite();
		Sprite animacionClonada=(Sprite)animacion.clonar();
		animacionClonada.arrancarHilo();

		animacion.setVisible(true);
		animacionClonada.setVisible(true);
		
		
		
	}

}

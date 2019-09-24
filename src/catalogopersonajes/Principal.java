package catalogopersonajes;

public class Principal {

	public static void main(String[] args) {
		Sprite animacion=new Sprite();
		Sprite animacionClonada=(Sprite)animacion.clonar();
		Sprite animacionClonada2=(Sprite)animacion.clonar();
		Sprite animacionClonada3=(Sprite)animacion.clonar();

		animacion.setVisible(true);
		animacionClonada.setVisible(true);
		animacionClonada2.setVisible(true);
		animacionClonada3.setVisible(true);
		
		
	}

}

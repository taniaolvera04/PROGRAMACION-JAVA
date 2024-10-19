import javax.swing.JOptionPane;
public class Proyecto2 {
	public static void main(String[] args) {
	String nombre, menu, genero, localidad, correo, gen=null;
    String contra="";
	String contraseña="cecytem";
	String gen1="Hombre";
	String gen2="Mujer";
	String gen3="Otro";
	int intentos=0;
	int contador=3;
	int edad, op;
	boolean arroba=false;
	boolean punto=false;
	JOptionPane.showMessageDialog(null, "Programador, ya te la sabes.");
	while (contraseña.equals(contra)==false && intentos<4) {
        contra=JOptionPane.showInputDialog("Introduce la contraseña de acceso.");
        if (contraseña.equals(contra)==false) {
        JOptionPane.showMessageDialog(null, " El número de intentos que te quedan es de: " + (contador--));
        intentos++;
        }
        if (intentos==4 && contraseña.equals(contra)==false) {
        	JOptionPane.showMessageDialog(null, "Has excedido el número de intentos. Inténtalo más tarde.");
        }
        if (contraseña.equals(contra)==true) {
        	JOptionPane.showMessageDialog(null, "Acceso permitido.");
    JOptionPane.showMessageDialog(null, "¡Bienvenido al programa Una Institución a Tu Medida!");
	nombre=JOptionPane.showInputDialog("¿Cómo te gusta que te llamen?");
	edad=Integer.parseInt(JOptionPane.showInputDialog("Mucho gusto, "+nombre+". ¿Cuántos años tienes?"));
	for(int i=0; i<3; i++) {
	if(edad<14) {
	JOptionPane.showMessageDialog(null, "Esta aplicación está hecha únicamente para adolescentes de 14 a 19 años.");
	edad=Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos años tienes?"));
	i++;
	}
	if(edad>19) {
	JOptionPane.showMessageDialog(null, "Esta aplicación está hecha únicamente para adolescentes de 14 a 19 años.");
	edad=Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos años tienes?"));
	i++;
	}
	if(i==3) {
		JOptionPane.showMessageDialog(null, "Has excedido el número de intentos. Inténtalo más tarde.");
	}
	}
	if (edad>=14 & edad<=19){
	gen=JOptionPane.showInputDialog("¿Cómo te identificas? (Hombre/Mujer/Otro)");
	if(gen.equalsIgnoreCase(gen1)==false & gen.equalsIgnoreCase(gen2)==false & gen.equalsIgnoreCase(gen3)==false) {
	gen=JOptionPane.showInputDialog("Especifica tu género.\n¿Cómo te identificas? (Hombre/Mujer/Otro).\n\nRespeta las mayúsculas y minúsculas.");
	}
    else {
	JOptionPane.showMessageDialog(null, "Género guardado.");
	}
	correo=JOptionPane.showInputDialog("Introduce tu correo electrónico con minúsculas, por favor.");
	for(int i=0; i<correo.length(); i++) {
	if( correo.charAt(i)=='@') {
	arroba=true;
	}
	}
	if(arroba==false) {
	JOptionPane.showMessageDialog(null, "Correo electrónico inválido, falta '@'");
	correo=JOptionPane.showInputDialog("Introduce tu correo electrónico con minúsculas, por favor.");
	}
	for(int i=0; i<correo.length(); i++) {
	if( correo.charAt(i)=='.') {
	punto=true;
	}
	}
	if(punto==false) {
	JOptionPane.showMessageDialog(null, "Correo electrónico inválido, falta '.'");
	correo=JOptionPane.showInputDialog("Introduce tu correo electrónico con minúsculas, por favor.");
	}
	if(punto==true & arroba==true) {
	JOptionPane.showMessageDialog(null, "Correo electrónico válido.");
    localidad=JOptionPane.showInputDialog("Introduce tu localidad o municipio.");
    JOptionPane.showMessageDialog(null, "Tus datos de identificación son: "
	+ "\nUsuario: "+ nombre+ "\n"
	+ "Género: "+ gen+ "\n"
    + "Edad: "+ edad+ "\n"
    + "Localidad: "+ localidad+ "\n"
	+ "Correo: " + correo+ "\n");
	menu=JOptionPane.showInputDialog("Perfecto, ya casi terminamos.\n\n¿De qué tema quieres hablar el día de hoy?\n\n(Ingresa el número del tema de tu elección)\n\n1.Estrés.\n2.Ansiedad.\n3.Depresión.\n4.Violencia.\n5.Adicciones.\n6.Apoyo psicológico.\n7.Apoyo Médico.\n8.Apoyo Emocional.\n9.Suicidio.\n10.Pérdida de un familiar.");
	op=Integer.parseInt(menu);
	switch (op) {
	case 1:
	JOptionPane.showMessageDialog(null, "El Consejo Ciudadano para la Seguridad y Justicia Ciudad de México te ayudará a controlar problemas emocionales como:\n"
	+ "\n"
	+ "1.Ansiedad.\n"
	+ "2.Depresión.\n"
	+ "3.Estrés.\n"
	+ "4.Pérdida de un familiar.\n"
	+ "\n"
	+ "Sus números telefónicos son (55)55335533 y 8000005428.\n"
	+ "\n"
	+ "Te atienden las 24 horas de los 365 días del año.\n");
	JOptionPane.showMessageDialog(null, "¡Gracias por utilizar nuestro programa!\nEsperamos que te haya sido de ayuda.\nRecuerda que no estás solo y por más difícil que se vea el camino, podrás salir de ésto.");
	break;
	case 2:
	JOptionPane.showMessageDialog(null, "La Contención Emocional(ENEO) te será de ayuda para controlar tus problemas emocionales\n"
	+ "Al llamar te pedirán tu nombre y tu edad para hacerte 3 propuestas\n"
	+ "\n"
	+ "1.Depresión.\n"
	+ "2.Ansiedad.\n"
	+ "3.Adicciones.\n"
	+ "4.Suicidio.\n"
	+ "\n"
	+ "Los números de atención son 5553507218 y 8004610098\n"
	+ "\n"
	+ "Están disponibles las 24 horas del día, los 365 días del año.");
	JOptionPane.showMessageDialog(null, "El Consejo Ciudadano para la Seguridad y Justicia Ciudad de México te ayudará a controlar problemas emocionales como:\n"
			+ "\n"
			+ "1.Ansiedad.\n"
			+ "2.Depresión.\n"
			+ "3.Estrés.\n"
			+ "4.Pérdida de un familiar.\n"
			+ "\n"
			+ "Sus números telefónicos son (55)55335533 y 8000005428.\n"
			+ "\n"
			+ "Te atienden las 24 horas de los 365 días del año.\n");
	JOptionPane.showMessageDialog(null,"El Centro Nacional de Diagnóstico para las Enfermedades Emocionales ó CNDEE procurará tu estado anímico.\n"
	+ "\n"
	+ "Una contestadora te dará indicaciones para poder comunicarte a una persona que se encargará de ayudarte.\n"
	+ "\n"
	+ "Proporcionará apoyo para situaciones como:\n"
	+ "\n"
	+ "1.Ansiedad\n"
	+ "2.Depresión.\n"
	+ "3.Suicidio\n"
	+ "4.Violencia\n"
	+ "\n"
	+ "Comunícate al 800 911 6666\n"
	+ "\n"
	+ "ésta institución está disponible las 24 horas del día, los 7 días de la semana.");
	JOptionPane.showMessageDialog(null,"La Facultad de Psicología (FP) de la Universidad Autonóma de México (UNAM) podrá ayudarte en diversos temas como:\n"
	+ "No tienes de qué preocuparte, ya que, éste servicio es anónimo."
	+ "\n"
	+ "Al momento te atenderá una contestadora, la cual te dará instrucciones a seguir dependiendo de la situación que tengas.\n"
	+ "\n"
	+ "1.Ansiedad.\n"
	+ "2.Depresión\n"
	+ "3.Suicidio.\n"
	+ "4.Violencia.\n"
	+ "5.Agresión.\n"
	+ "6.Adicciones.\n"
	+ "7.Pérdida de un familiar.\n"
	+ "\n"
	+ "Te podrás comunicar con ellos mediante vía telefónica al 5550250855.\n"
	+ "\n"
	+ "Tienen un horario de atención de Lunes a Viernes en un horario de 9:00 a.m. a 5:00 p.m.");
	JOptionPane.showMessageDialog(null, "¡Gracias por utilizar nuestro programa!\nEsperamos que te haya sido de ayuda.\nRecuerda que no estás solo y por más difícil que se vea el camino, podrás salir de ésto.");
	break;
	case 3:
		JOptionPane.showMessageDialog(null,"La Facultad de Psicología (FP) de la Universidad Autonóma de México (UNAM) podrá ayudarte en diversos temas como:\n"
				+ "No tienes de qué preocuparte, ya que, éste servicio es anónimo."
				+ "\n"
				+ "Al momento te atenderá una contestadora, la cual te dará instrucciones a seguir dependiendo de la situación que tengas.\n"
				+ "\n"
				+ "1.Ansiedad.\n"
				+ "2.Depresión\n"
				+ "3.Suicidio.\n"
				+ "4.Violencia.\n"
				+ "5.Agresión.\n"
				+ "6.Adicciones.\n"
				+ "7.Pérdida de un familiar.\n"
				+ "\n"
				+ "Te podrás comunicar con ellos mediante vía telefónica al 5550250855.\n"
				+ "\n"
				+ "Tienen un horario de atención de Lunes a Viernes en un horario de 9:00 a.m. a 5:00 p.m.");
	JOptionPane.showMessageDialog(null,"El Centro Nacional de Diagnóstico para las Enfermedades Emocionales ó CNDEE procurará tu estado anímico.\n"
			+ "\n"
			+ "Una contestadora te dará indicaciones para poder comunicarte a una persona que se encargará de ayudarte.\n"
			+ "\n"
			+ "Proporcionará apoyo para situaciones como:\n"
			+ "\n"
			+ "1.Ansiedad\n"
			+ "2.Depresión.\n"
			+ "3.Suicidio\n"
			+ "4.Violencia\n"
			+ "\n"
			+ "Comunícate al 800 911 6666\n"
			+ "\n"
			+ "ésta institución está disponible las 24 horas del día, los 7 días de la semana.");
	JOptionPane.showMessageDialog(null, "El Consejo Ciudadano para la Seguridad y Justicia Ciudad de México te ayudará a controlar problemas emocionales como:\n"
			+ "\n"
			+ "1.Ansiedad.\n"
			+ "2.Depresión.\n"
			+ "3.Estrés.\n"
			+ "4.Pérdida de un familiar.\n"
			+ "\n"
			+ "Sus números telefónicos son (55)55335533 y 8000005428.\n"
			+ "\n"
			+ "Te atienden las 24 horas de los 365 días del año.\n");
	JOptionPane.showMessageDialog(null, "La Contención Emocional(ENEO) te será de ayuda para controlar tus problemas emocionales\n"
			+ "Al llamar te pedirán tu nombre y tu edad para hacerte 3 propuestas\n"
			+ "\n"
			+ "1.Depresión.\n"
			+ "2.Ansiedad.\n"
			+ "3.Adicciones.\n"
			+ "4.Suicidio.\n"
			+ "\n"
			+ "Los números de atención son 5553507218 y 8004610098\n"
			+ "\n"
			+ "Están disponibles las 24 horas del día, los 365 días del año.");
	JOptionPane.showMessageDialog(null, "¡Gracias por utilizar nuestro programa!\nEsperamos que te haya sido de ayuda.\nRecuerda que no estás solo y por más difícil que se vea el camino, podrás salir de ésto.");
	break;
	case 4:
		JOptionPane.showMessageDialog(null,"La Facultad de Psicología (FP) de la Universidad Autonóma de México (UNAM) podrá ayudarte en diversos temas como:\n"
				+ "No tienes de qué preocuparte, ya que, éste servicio es anónimo."
				+ "\n"
				+ "Al momento te atenderá una contestadora, la cual te dará instrucciones a seguir dependiendo de la situación que tengas.\n"
				+ "\n"
				+ "1.Ansiedad.\n"
				+ "2.Depresión\n"
				+ "3.Suicidio.\n"
				+ "4.Violencia.\n"
				+ "5.Agresión.\n"
				+ "6.Adicciones.\n"
				+ "7.Pérdida de un familiar.\n"
				+ "\n"
				+ "Te podrás comunicar con ellos mediante vía telefónica al 5550250855.\n"
				+ "\n"
				+ "Tienen un horario de atención de Lunes a Viernes en un horario de 9:00 a.m. a 5:00 p.m.");
	JOptionPane.showMessageDialog(null,"El Centro Nacional de Diagnóstico para las Enfermedades Emocionales ó CNDEE procurará tu estado anímico.\n"
			+ "\n"
			+ "Una contestadora te dará indicaciones para poder comunicarte a una persona que se encargará de ayudarte.\n"
			+ "\n"
			+ "Proporcionará apoyo para situaciones como:\n"
			+ "\n"
			+ "1.Ansiedad\n"
			+ "2.Depresión.\n"
			+ "3.Suicidio\n"
			+ "4.Violencia\n"
			+ "\n"
			+ "Comunícate al 800 911 6666\n"
			+ "\n"
			+ "ésta institución está disponible las 24 horas del día, los 7 días de la semana.");
	JOptionPane.showMessageDialog(null,"El Centro Dinámica-Mente es una institución creada para brindar y promover servicios en materia de la salud mental\n"
	+ "\n"
	+ "Su comportamiento es el adecuado a la hora de atenderte.\n"
	+ "\n"
	+ "Te ayudarán a superar las siguientes situaciones:\n"
	+ "\n"
	+ "1.Adicciones.\n"
	+ "2.Violencia.\n"
	+ "3.Prevención del Suicidio.\n"
	+ "4.Contención Emocional.\n"
	+ "\n"
	+ "Su número telefónico es 8002900024\n"
	+ "\n"
	+ "Están disponibles las 24 horas del día, los 365 días del año.");
	JOptionPane.showMessageDialog(null, "¡Gracias por utilizar nuestro programa!\nEsperamos que te haya sido de ayuda.\nRecuerda que no estás solo y por más difícil que se vea el camino, podrás salir de ésto.");
	break;
	case 5:
		JOptionPane.showMessageDialog(null,"La Facultad de Psicología (FP) de la Universidad Autonóma de México (UNAM) podrá ayudarte en diversos temas como:\n"
				+ "No tienes de qué preocuparte, ya que, éste servicio es anónimo."
				+ "\n"
				+ "Al momento te atenderá una contestadora, la cual te dará instrucciones a seguir dependiendo de la situación que tengas.\n"
				+ "\n"
				+ "1.Ansiedad.\n"
				+ "2.Depresión\n"
				+ "3.Suicidio.\n"
				+ "4.Violencia.\n"
				+ "5.Agresión.\n"
				+ "6.Adicciones.\n"
				+ "7.Pérdida de un familiar.\n"
				+ "\n"
				+ "Te podrás comunicar con ellos mediante vía telefónica al 5550250855.\n"
				+ "\n"
				+ "Tienen un horario de atención de Lunes a Viernes en un horario de 9:00 a.m. a 5:00 p.m.");
	JOptionPane.showMessageDialog(null, "La Contención Emocional(ENEO) te será de ayuda para controlar tus problemas emocionales\n"
			+ "Al llamar te pedirán tu nombre y tu edad para hacerte 3 propuestas\n"
			+ "\n"
			+ "1.Depresión.\n"
			+ "2.Ansiedad.\n"
			+ "3.Adicciones.\n"
			+ "4.Suicidio.\n"
			+ "\n"
			+ "Los números de atención son 5553507218 y 8004610098\n"
			+ "\n"
			+ "Están disponibles las 24 horas del día, los 365 días del año.");
	JOptionPane.showMessageDialog(null,"El Centro Dinámica-Mente es una institución creada para brindar y promover servicios en materia de la salud mental\n"
			+ "\n"
			+ "Su comportamiento es el adecuado a la hora de atenderte.\n"
			+ "\n"
			+ "Te ayudarán a superar las siguientes situaciones:\n"
			+ "\n"
			+ "1.Adicciones.\n"
			+ "2.Violencia.\n"
			+ "3.Prevención del Suicidio.\n"
			+ "4.Contención Emocional.\n"
			+ "\n"
			+ "Su número telefónico es 8002900024\n"
			+ "\n"
			+ "Están disponibles las 24 horas del día, los 365 días del año."); 
	JOptionPane.showMessageDialog(null,"El Centro de Integración Juvenil (CIJ) te ayudará a volver a tener un estilo de vida saludable.\n"
	+ "\n"
	+ "Sólo tendrás que dar tu nombre para continuar con el procedimiento. La atención es segura y rápida.\n"
	+ "\n"
	+ "Te brindará apoyo para:\n"
	+ "1.Prevención de de adicciones.\n"
	+ "2.Tratamiento de adicciones.\n"
	+ "\n"
	+ "Te podrás contactar con ellos a través de los siguientes números: 5552121212 y 5559994949.\n"
	+ "\n"
	+ "Dan atención las 24 horas y todos los días del año.");
	JOptionPane.showMessageDialog(null, "¡Gracias por utilizar nuestro programa!\nEsperamos que te haya sido de ayuda.\nRecuerda que no estás solo y por más difícil que se vea el camino, podrás salir de ésto.");
	break;
	case 6:
	JOptionPane.showMessageDialog(null,"LOCATEL es una institución que te proporcionará apoyo para distintas situaciones.\n"
	+ "\n"
	+ "Te responderá una contestadora, la cual te dirá a qué número deberás presionar dependiendo de tu situación.\n"
	+ "\n"
	+ "A través de la línea mujeres ofrece:\n"
	+ "\n"
	+ "1.Apoyo Médico\n"
	+ "2.Apoyo Psicológico.\n"
	+ "3.Apoyo Jurídico.\n"
	+ "\n"
	+ "Puedes comunicarte con ellos a través del siguiente número 56581111 o su marcación abreviada *1111\n"
	+ "Está disponible las 24 horas, los 365 días del año.");
	JOptionPane.showMessageDialog(null, "¡Gracias por utilizar nuestro programa!\nEsperamos que te haya sido de ayuda.\nRecuerda que no estás solo y por más difícil que se vea el camino, podrás salir de ésto.");
	break;
	case 7:
		JOptionPane.showMessageDialog(null,"El Centro Dinámica-Mente es una institución creada para brindar y promover servicios en materia de la salud mental\n"
				+ "\n"
				+ "Su comportamiento es el adecuado a la hora de atenderte.\n"
				+ "\n"
				+ "Te ayudarán a superar las siguientes situaciones:\n"
				+ "\n"
				+ "1.Adicciones.\n"
				+ "2.Violencia.\n"
				+ "3.Prevención del Suicidio.\n"
				+ "4.Contención Emocional.\n"
				+ "\n"
				+ "Su número telefónico es 8002900024\n"
				+ "\n"
				+ "Están disponibles las 24 horas del día, los 365 días del año.");
		JOptionPane.showMessageDialog(null,"Medicina a Distancia de la Secretaria de Salud estará al pendiente de tu salud a través del servicio telefónico.\n"
				+ "Al igual que las instituciones anteriores, te responderá un contestadora, para después contactarte con un profesional.\n"
				+ "\n"
				+ "Te brindará:\n"
				+ "\n"
				+ "1.Consulta psicológica gratuita.\n"
				+ "2.Apoyo Médico.\n"
				+ "\n"
				+ "El número telefónico es: 5551321250\n"
				+ "Están disponibles las 24 horas del día, los 7 días de la semana.");
	JOptionPane.showMessageDialog(null, "¡Gracias por utilizar nuestro programa!\nEsperamos que te haya sido de ayuda.\nRecuerda que no estás solo y por más difícil que se vea el camino, podrás salir de ésto.");
	break;
	case 8:
		JOptionPane.showMessageDialog(null,"LOCATEL es una institución que te proporcionará apoyo para distintas situaciones.\n"
				+ "\n"
				+ "Te responderá una contestadora, la cual te dirá a qué número deberás presionar dependiendo de tu situación.\n"
				+ "\n"
				+ "A través de la línea mujeres ofrece:\n"
				+ "\n"
				+ "1.Apoyo Médico\n"
				+ "2.Apoyo Psicológico.\n"
				+ "3.Apoyo Jurídico.\n"
				+ "\n"
				+ "Puedes comunicarte con ellos a través del siguiente número 56581111 o su marcación abreviada *1111\n"
				+ "Está disponible las 24 horas, los 365 días del año.");
	JOptionPane.showMessageDialog(null,"Medicina a Distancia de la Secretaria de Salud estará al pendiente de tu salud a través del servicio telefónico.\n"
	+ "Al igual que las instituciones anteriores, te responderá un contestadora, para después contactarte con un profesional.\n"
	+ "\n"
	+ "Te brindará:\n"
	+ "\n"
	+ "1.Consulta psicológica gratuita.\n"
	+ "2.Apoyo Médico.\n"
	+ "\n"
	+ "El número telefónico es: 5551321250\n"
	+ "Están disponibles las 24 horas del día, los 7 días de la semana.");
	JOptionPane.showMessageDialog(null, "¡Gracias por utilizar nuestro programa!\nEsperamos que te haya sido de ayuda.\nRecuerda que no estás solo y por más difícil que se vea el camino, podrás salir de ésto.");
	break;
	case 9:
		JOptionPane.showMessageDialog(null,"La Facultad de Psicología (FP) de la Universidad Autonóma de México (UNAM) podrá ayudarte en diversos temas como:\n"
				+ "No tienes de qué preocuparte, ya que, éste servicio es anónimo."
				+ "\n"
				+ "Al momento te atenderá una contestadora, la cual te dará instrucciones a seguir dependiendo de la situación que tengas.\n"
				+ "\n"
				+ "1.Ansiedad.\n"
				+ "2.Depresión\n"
				+ "3.Suicidio.\n"
				+ "4.Violencia.\n"
				+ "5.Agresión.\n"
				+ "6.Adicciones.\n"
				+ "7.Pérdida de un familiar.\n"
				+ "\n"
				+ "Te podrás comunicar con ellos mediante vía telefónica al 5550250855.\n"
				+ "\n"
				+ "Tienen un horario de atención de Lunes a Viernes en un horario de 9:00 a.m. a 5:00 p.m.");
		JOptionPane.showMessageDialog(null,"El Centro Nacional de Diagnóstico para las Enfermedades Emocionales ó CNDEE procurará tu estado anímico.\n"
				+ "\n"
				+ "Una contestadora te dará indicaciones para poder comunicarte a una persona que se encargará de ayudarte.\n"
				+ "\n"
				+ "Proporcionará apoyo para situaciones como:\n"
				+ "\n"
				+ "1.Ansiedad\n"
				+ "2.Depresión.\n"
				+ "3.Suicidio\n"
				+ "4.Violencia\n"
				+ "\n"
				+ "Comunícate al 800 911 6666\n"
				+ "\n"
				+ "ésta institución está disponible las 24 horas del día, los 7 días de la semana.");
	JOptionPane.showMessageDialog(null, "La Contención Emocional(ENEO) te será de ayuda para controlar tus problemas emocionales\n"
			+ "Al llamar te pedirán tu nombre y tu edad para hacerte 3 propuestas\n"
			+ "\n"
			+ "1.Depresión.\n"
			+ "2.Ansiedad.\n"
			+ "3.Adicciones.\n"
			+ "4.Suicidio.\n"
			+ "\n"
			+ "Los números de atención son 5553507218 y 8004610098\n"
			+ "\n"
			+ "Están disponibles las 24 horas del día, los 365 días del año.");
	JOptionPane.showMessageDialog(null,"El Centro Dinámica-Mente es una institución creada para brindar y promover servicios en materia de la salud mental\n"
			+ "\n"
			+ "Su comportamiento es el adecuado a la hora de atenderte.\n"
			+ "\n"
			+ "Te ayudarán a superar las siguientes situaciones:\n"
			+ "\n"
			+ "1.Adicciones.\n"
			+ "2.Violencia.\n"
			+ "3.Prevención del Suicidio.\n"
			+ "4.Contención Emocional.\n"
			+ "\n"
			+ "Su número telefónico es 8002900024\n"
			+ "\n"
			+ "Están disponibles las 24 horas del día, los 365 días del año.");
	JOptionPane.showMessageDialog(null, "¡Gracias por utilizar nuestro programa!\nEsperamos que te haya sido de ayuda.\nRecuerda que no estás solo y por más difícil que se vea el camino, podrás salir de ésto.");
	break;
	case 10:
		JOptionPane.showMessageDialog(null,"La Facultad de Psicología (FP) de la Universidad Autonóma de México (UNAM) podrá ayudarte en diversos temas como:\n"
				+ "No tienes de qué preocuparte, ya que, éste servicio es anónimo."
				+ "\n"
				+ "Al momento te atenderá una contestadora, la cual te dará instrucciones a seguir dependiendo de la situación que tengas.\n"
				+ "\n"
				+ "1.Ansiedad.\n"
				+ "2.Depresión\n"
				+ "3.Suicidio.\n"
				+ "4.Violencia.\n"
				+ "5.Agresión.\n"
				+ "6.Adicciones.\n"
				+ "7.Pérdida de un familiar.\n"
				+ "\n"
				+ "Te podrás comunicar con ellos mediante vía telefónica al 5550250855.\n"
				+ "\n"
				+ "Tienen un horario de atención de Lunes a Viernes en un horario de 9:00 a.m. a 5:00 p.m.");
	JOptionPane.showMessageDialog(null, "El Consejo Ciudadano para la Seguridad y Justicia Ciudad de México te ayudará a controlar problemas emocionales como:\n"
			+ "\n"
			+ "1.Ansiedad.\n"
			+ "2.Depresión.\n"
			+ "3.Estrés.\n"
			+ "4.Pérdida de un familiar.\n"
			+ "\n"
			+ "Sus números telefónicos son (55)55335533 y 8000005428.\n"
			+ "\n"
			+ "Te atienden las 24 horas de los 365 días del año.\n");
	JOptionPane.showMessageDialog(null, "¡Gracias por utilizar nuestro programa!\nEsperamos que te haya sido de ayuda.\nRecuerda que no estás solo y por más difícil que se vea el camino, podrás salir de ésto.");
	break;
	}
	}
        }
	}
	}
	}
}
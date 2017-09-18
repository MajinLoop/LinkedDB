package com.main;


import java.io.IOException;
import java.util.function.ObjDoubleConsumer;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.clasesSolucion.Atributo;
import com.clasesSolucion.Documento;
import com.clasesSolucion.JSON_Store;
import com.clasesSolucion.Link;
import com.clasesSolucion.Objeto_JSON;
import com.estructuras.*;
import com.herramientas.*;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application
{
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException
	{
		
		JSON_Store j = new JSON_Store("Kanto");
		Documento d1 = VG.getInstancia().devolverJSON_Store("JSON_Store 1").recuperarDocumento("Pokemones");
		d1.mostrarDatos();
		System.out.println("_______________________________________\n\n\n");
		
		
		d1.actualizar("ID", "=", 178, "Nombre", "Pikashu");
		d1.mostrarDatos();
		System.out.println("_______________________________________\n\n\n");
		
		
		Documento d2 = VG.getInstancia().devolverJSON_Store("JSON_Store 1").recuperarDocumento("Entrenadores");
		d2.mostrarDatos();
		System.out.println("_______________________________________\n\n\n");
		
		
		
		Lista_Simple<String> a = new Lista_Simple<>();a.insertar_al_final("ID");
		Lista_Simple<Object> a2 = new Lista_Simple<>();a2.insertar_al_final(178);
		d1.eliminarObjeto_JSON(a,a2);
		d1.mostrarDatos();
		System.out.println("_______________________________________\n\n\n");

		
		d2.mostrarDatos();
		System.out.println("_______________________________________\n\n\n");
		
		d1.actualizar("ID", "=", 9, "ID", 666);
		d2.actualizar("ID", "=", 1, "Pokemon Principal", 666);
		d1.mostrarDatos();
		System.out.println("_______________________________________\n\n\n");
		d2.mostrarDatos();
		System.out.println("_______________________________________\n\n\n");
		
		d1.actualizar("ID", "=", 666, "ID", 90);
		d1.mostrarDatos();
		d2.mostrarDatos();
		
		//d.mostrarEstructura();
		//d.mostrarDatos();
//		System.out.println("_______________________________________\n\n\n");
//		
//		
//		
//		Documento d2 = new Documento("Entrenadores","JSON_Store 1");
//		d2.crearAtributo("ID", Integer.class, true, false, false, -1);
//		d2.crearAtributo("Nombre", String.class, false, false, false, "Sin Nombre");
//		d2.crearAtributo("Pokemones", Lista_Simple.class, false, false, false, new Lista_Simple<>());
//		d2.crearAtributo("Pokemon Principal", Integer.class, false, true, false, -1);
//		d2.crearLink("Pokemon Principal", d.getNombre(), "ID");
//		d2.mostrarEstructura();
//		System.out.println("_______________________________________\n\n\n");
//
//		
//		Objeto_JSON o1 = new Objeto_JSON();
//		o1.getValores().insertar_al_final(1);
//		o1.getValores().insertar_al_final("Ach Moztaza");
//		o1.getValores().insertar_al_final(new Lista_Simple<Integer>());
//		o1.getValores().insertar_al_final(178);
//		d2.insertarObjeto_JSON(o1);
//		d2.mostrarDatos();
//		System.out.println("_______________________________________\n\n\n");
//
//		
//		
//		d.actualizar("ID", "=", 6, "ID", 178);
//		d.mostrarDatos();
//		System.out.println("_______________________________________\n\n\n");
//		
//		
//		d2.insertarObjeto_JSON(o1);
//		d2.mostrarDatos();
//		System.out.println("_______________________________________\n\n\n");
//		
//		VG.getInstancia().devolverJSON_Store("JSON_Store 1").insertarDocumento(d2);
		//VG.getInstancia().commit();
		
		
//		Lista_Simple<String> q = new Lista_Simple<>();
//		q.insertar_al_final("ID Pokemon");
//		Lista_Simple<Object> q2 = new Lista_Simple<>();
//		q2.insertar_al_final(178);
//		d.eliminarObjeto_JSON(q,q2);
//		d.mostrarDatos();
//		System.out.println("_______________________________________\n\n\n");
		
		
		
		
		
		
		
		
		
		
//		Lista_Simple<Integer> l = (Lista_Simple<Integer>)d2.devolverValor(d2.find("ID", 1).getPrimero().getDato(), "Pokemones");
//		l.insertar_al_final(3);
//		l.insertar_al_final(4);
//		l.insertar_al_final(8);
//		d2.mostrarDatos();
//		System.out.println("_______________________________________\n\n\n");
//
//		
//		Lista_Simple<Integer> l2 = new Lista_Simple<>();
//		l2.insertar_al_final(1);
//		l2.insertar_al_final(2);
//		l2.insertar_al_final(4);		
//		d2.actualizar("ID", "=", 1, "Pokemones", l2);
//		d2.mostrarDatos();
//		System.out.println("_______________________________________\n\n\n");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Documento d3 = new Documento("Pokemones","JSON_Store 1");
//		d3.crearAtributo("ID", Integer.class, true, false, false, -1);
//		d3.crearAtributo("Nombre", String.class, false, false, false, "Sin Nombre");
//
//		Objeto_JSON o1 = new Objeto_JSON();o1.getValores().insertar_al_final(0);o1.getValores().insertar_al_final("Sin Nombre");
//		Objeto_JSON o2 = new Objeto_JSON();o2.getValores().insertar_al_final(1);o2.getValores().insertar_al_final("Sin Nombre");
//		Objeto_JSON o3 = new Objeto_JSON();o3.getValores().insertar_al_final(2);o3.getValores().insertar_al_final("Sin Nombre");
//		Objeto_JSON o4 = new Objeto_JSON();o4.getValores().insertar_al_final(3);o4.getValores().insertar_al_final("Sin Nombre");
//		Objeto_JSON o5 = new Objeto_JSON();o5.getValores().insertar_al_final(4);o5.getValores().insertar_al_final("Sin Nombre");
//		Objeto_JSON o6 = new Objeto_JSON();o6.getValores().insertar_al_final(5);o6.getValores().insertar_al_final("Sin Nombre");
//		Objeto_JSON o7 = new Objeto_JSON();o7.getValores().insertar_al_final(6);o7.getValores().insertar_al_final("Sin Nombre");
//		Objeto_JSON o8 = new Objeto_JSON();o8.getValores().insertar_al_final(7);o8.getValores().insertar_al_final("Sin Nombre");
//		Objeto_JSON o9 = new Objeto_JSON();o9.getValores().insertar_al_final(9);o9.getValores().insertar_al_final("Sin Nombre");
//		
//		d3.insertarObjeto_JSON(o1);
//		d3.insertarObjeto_JSON(o2);
//		d3.insertarObjeto_JSON(o3);
//		d3.insertarObjeto_JSON(o4);
//		d3.insertarObjeto_JSON(o5);
//		d3.insertarObjeto_JSON(o6);
//		d3.insertarObjeto_JSON(o7);
//		d3.insertarObjeto_JSON(o8);
//		d3.insertarObjeto_JSON(o9);
//		
//		d3.mostrarDatos();
//		
//		System.out.println(Serializador.serializar(d3, d3.devolverPath(), d3.getNombre()));
		
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		
	}

}


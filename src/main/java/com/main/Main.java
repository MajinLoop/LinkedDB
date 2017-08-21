package com.main;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.estructuras.Lista_Simple;
import com.herramientas.Serializador;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application
{
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException
	{
		
		Lista_Simple<Integer> l = new Lista_Simple<>();
		l = (Lista_Simple<Integer>)Serializador.desSerializar("l.json",l);
		l.mostrar(false);
		//
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		
	}

}

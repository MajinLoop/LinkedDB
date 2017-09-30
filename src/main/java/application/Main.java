package application;


import java.io.IOException;
import java.util.function.ObjDoubleConsumer;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParseException;
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
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application
{	
	private Stage ventana;
	private static BorderPane mainLayout;
	
	
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException
	{	
		//Documento d = VG.getInstancia().ESTRUCTURA_PRINCIPAL.get_dato_por_indice(1).recuperarDocumento("Documento A");
		//d.mostrarEstructura();
		//d.getLista_de_objetos().mostrar(false);
		
		launch(args);
	}
	
	public static void mostrarVentanaAgregarObjetoJSON() throws IOException
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("AgregarObjetoJSON.fxml"));
		BorderPane mainBorderPane = loader.load();
		mainLayout.setCenter(mainBorderPane);
	}
	public static void mostrarVentanaEliminarPorPK() throws IOException
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("EliminarPorPK.fxml"));
		BorderPane mainBorderPane = loader.load();
		mainLayout.setCenter(mainBorderPane);
	}
	public static void mostrarVentanaBuscarPorPK() throws IOException
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("BuscarPorPK.fxml"));
		BorderPane mainBorderPane = loader.load();
		mainLayout.setCenter(mainBorderPane);
	}
	public static void mostrarVentanaCrearDocumento() throws IOException
	{	
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("crearDocumento.fxml"));
		BorderPane mainBorderPane = loader.load();
		mainLayout.setCenter(mainBorderPane);
	}
	public static void mostrarVentanaActualizar() throws IOException
	{	
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("Actualizar.fxml"));
		BorderPane mainBorderPane = loader.load();
		mainLayout.setCenter(mainBorderPane);
	}			
	public static void mostrarVentanaMain() throws IOException
	{	
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("Main2.fxml"));
		BorderPane mainBorderPane = loader.load();
		mainLayout.setCenter(mainBorderPane);
	}

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		try
		{
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("Main2.fxml"));
			mainLayout = loader.load();
			Scene scene = new Scene(mainLayout);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}


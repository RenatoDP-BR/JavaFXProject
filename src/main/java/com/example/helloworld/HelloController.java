package com.example.helloworld;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class HelloController {

    @FXML
    protected void onHelloButtonClick() {
      try {
          // Carrega o arquivo FXML e cria a cena correspondente
          FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
          VBox root = loader.load();

          // Acessa os objetos TextField com ID "txValor1" e "txValor2"
          TextField txValor1 = (TextField) loader.getNamespace().get("txValor1");
          TextField txValor2 = (TextField) loader.getNamespace().get("txValor2");

          String strCampo1 = txValor1.getText();
          String strCampo2 = txValor2.getText();
          System.out.println("Valor do 1o campo editado: " + strCampo1);
          System.out.println("Valor do 2o campo editado: " + strCampo1);

      } catch (Exception e) {
          e.printStackTrace();
      }

    }
}
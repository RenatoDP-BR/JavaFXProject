package com.example.helloworld;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class HelloController {

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
      try {
        //Crie um objeto File para representar o arquivo FXML
        File file = new File("hello-view.fxml");

        //Crie um objeto DocumentBuilderFactory e configure-o para criar um DocumentBuilder
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

        //Use o DocumentBuilder para analisar o arquivo FXML e criar um objeto Document
        Document doc = dBuilder.parse(file);
        doc.getDocumentElement().normalize();

        //Agora você pode usar o objeto Document para acessar e manipular os elementos do arquivo FXML
        Element root = doc.getDocumentElement();
        welcomeText.setText(root.getNodeName());

      } catch (Exception e) {
          e.printStackTrace();
      }

    }
}
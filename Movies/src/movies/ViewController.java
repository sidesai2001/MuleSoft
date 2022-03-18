/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movies;

import java.awt.HeadlessException;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author sides
 */
public class ViewController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private TableView<List> mvtb;
    
    @FXML
    private TableColumn<List, String> tname;

    @FXML
    private TableColumn<List, String> tactor;

    @FXML
    private TableColumn<List, String> tactress;

    @FXML
    private TableColumn<List, String> yor;

    @FXML
    private TableColumn<List, String> dir;
    
    @FXML
    private ImageView show;
    
    private Stage stage;
    private Scene scene;
    private Parent root;

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    @FXML
    private void tablevisible(MouseEvent event) throws IOException 
    {
        {
            if (mvtb.isVisible() == false) 
            {
                mvtb.setVisible(true);
                conn = (Connection) mysql.ConnectDb();
                String sql = "SELECT * FROM movies ";
                
                try 
                {
                    pst = (PreparedStatement) conn.prepareStatement(sql);
                    pst.execute();
                    rs = pst.executeQuery();
                    
                    while (rs.next()) 
                    {
                        List historyf = new List(rs.getString("m_name"),rs.getString("m_actor"),rs.getString("m_actress"),rs.getString("m_year"),rs.getString("m_director"));
                        ObservableList<List> list = mvtb.getItems();
                        list.add(historyf);
                        mvtb.setItems(list);

                        tname.setCellValueFactory(new PropertyValueFactory<List, String>("name"));
                        tactor.setCellValueFactory(new PropertyValueFactory<List, String>("actname"));
                        tactress.setCellValueFactory(new PropertyValueFactory<List, String>("actresname"));
                        yor.setCellValueFactory(new PropertyValueFactory<List, String>("year"));
                        dir.setCellValueFactory(new PropertyValueFactory<List, String>("director"));
                    }
                } 
                catch(HeadlessException | SQLException e) 
                {
                    JOptionPane.showMessageDialog(null, e);
                }  
            }
            else 
            {
                mvtb.setVisible(false);
                mvtb.getItems().clear();
            }
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    
    
}

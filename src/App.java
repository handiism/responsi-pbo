import database.Database;
import database.MySQL;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import view.Home;

public class App {
  public static void main(String[] args) {
    try {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

      for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
        if ("GTK+".equals(info.getName())) {
          UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (Exception e) {
      Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, e);
    }

    Database database = new MySQL();
    view.Home view = new view.Home();
    model.query.TransaksiQuery query =
        new model.query.MySQLTransaksiQuery(database);
    new controller.Home(query, view);
  }
}

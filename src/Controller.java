import models.DbCinemas;
import models.DbModel;

import java.io.IOException;

public class Controller {
    DbModel dbModel;

    //DbModel mb bad - very more abstraction
    public Controller (DbModel model) {
        this.dbModel = model;
    }

    //need specialized func in controller? "addCinemaSessionInDb()"
    public void addModelInDb() throws Exception {
        this.dbModel.add();// bad?
    }
}

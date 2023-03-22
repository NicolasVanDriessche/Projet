package mvp.presenter;

import mvp.model.DAOCours;
import mvp.view.CoursViewInterface;

public class CoursPresenter {

    private DAOCours model;

    private CoursViewInterface view;

    public CoursPresenter(DAOCours model, CoursViewInterface view){
        this.model = model;
        this.view = view;


    }

}

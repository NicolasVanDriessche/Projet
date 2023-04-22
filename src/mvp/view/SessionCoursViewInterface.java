package mvp.view;

import Classes.Cours;
import Classes.SessionCours;
import mvp.presenter.CoursPresenter;
import mvp.presenter.SessionCoursPresenter;

import java.util.List;

public interface SessionCoursViewInterface {

    public void setPresenter(SessionCoursPresenter presenter);

    public void setListDatas(List<SessionCours> sessions);

    public void affMsg(String msg);
}

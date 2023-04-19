package mvp.view;

import Classes.Formateur;
import mvp.presenter.FormateurPresenter;

import java.util.List;

public interface FormateurViewInterface {
    public void setPresenter(FormateurPresenter presenter);

    public void setListDatas(List<Formateur> formateurs);

    public void affMsg(String msg);



}

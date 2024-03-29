package mvp.view;

import Classes.Local;
import mvp.presenter.LocalPresenter;

import java.util.List;

public interface LocalViewInterface {

    public void setPresenter(LocalPresenter presenter);

    public void setListDatas(List<Local> locs);

    public void affMsg(String msg);

}

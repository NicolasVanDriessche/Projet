package mvp.model;

import Classes.Local;

import java.util.List;

public interface DAOLocal {
    Local addLocal(Local loc);

    boolean removeLocal(Local loc);

    List<Local> getLocal();

    Local updateLocal(Local local);

    Local readLocal(int idLocal);
}

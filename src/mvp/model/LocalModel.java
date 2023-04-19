package mvp.model;

import Classes.Formateur;
import Classes.Local;

import java.util.ArrayList;
import java.util.List;

public class LocalModel implements DAOLocal {

    private List<Local> locs = new ArrayList<>();

    @Override
    public Local addLocal(Local loc){
        boolean present = locs.contains(loc);
        if(!present){
            locs.add(loc);
            return loc;
        }
        else return null;
    }

    @Override
    public boolean removeLocal(Local loc){
        return locs.remove(loc);
    }

    @Override
    public List<Local> getLocal(){
        return new ArrayList<>(locs);
    }

    @Override
    public Local updateLocal(Local local){
        int p = locs.indexOf(local);
        if(p<0) return null;
        locs.set(p, local);
        return local;
    }

    @Override
    public Local readLocal(int idlocal){
        for(Local l : locs){
            if(l.getId() == idlocal) return l;
        }
        return null;
    }
}

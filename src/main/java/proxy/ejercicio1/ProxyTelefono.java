package proxy.ejercicio1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class ProxyTelefono<Telefono> implements Set<Telefono> {

    private int referencia;
    private TelefonosDAO dao = new TelefonosDAO();

    public ProxyTelefono(int referencia) {
        this.referencia = referencia;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Telefono> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        var telefonos = dao.telefonoPorIdPersona(referencia);
        return telefonos.toArray(a);

    }

    @Override
    public boolean add(Telefono telefono) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Telefono> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}

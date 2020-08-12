package net.meloniumcraft.utils.list;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ReverseListIterator<T> implements Iterable<T>, Iterator<T> {
    ListIterator<? extends T> listIterator;
    
    public ReverseListIterator(List<? extends T> list) {
        this.listIterator = list.listIterator(list.size());
    }
    
    @Override
    public Iterator<T> iterator() {
        return this;
    }
    
    @Override
    public boolean hasNext() {
        return listIterator.hasPrevious();
    }
    
    @Override
    public T next() {
        return listIterator.previous();
    }
}

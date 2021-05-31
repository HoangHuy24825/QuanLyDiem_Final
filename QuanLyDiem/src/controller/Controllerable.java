package controller;

public interface Controllerable {

    public <T> boolean capNhat(T obj);

    public <T> boolean themMoi(T obj);

    public <T> boolean xoa(T obj);
}

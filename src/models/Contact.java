package models;

public class Contact<T,U> {
    private T nombre;
    private U phone;
    public T getNombre() {
        return nombre;
    }
    public U getPhone() {
        return phone;
    }
    @Override
    public String toString() {
        return "Contact [nombre=" + nombre + ", phone=" + phone + "]";
    }
    
}

package models;


public class Contact {
    private String name;
    private String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    

    public Contact(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Contact contact = (Contact) obj;
        return name.equals(contact.getName());
    }

    

    @Override
    public String toString() {
        return "Nombre: " + name + ", Teléfono: " + phone;
    }

    
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}

package repasoexrecu;
public class exre02class {
    private int ISBN;
    private String title;
    private String author;
    private String editorial;
    private int stock;
    private double precio;

  

    public exre02class() {
    }
    
      public exre02class(int ISBN, String title, String author, String editorial, int stock, double precio) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.editorial = editorial;
        this.stock = stock;
        this.precio = precio;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
      
      
    public void imprimir(){
        System.out.println(this.ISBN);
        System.out.println(this.title);
        System.out.println(this.author);
        System.out.println(this.editorial);
        System.out.println(this.stock);
        System.out.println(this.precio);
        
    }
    
}
 
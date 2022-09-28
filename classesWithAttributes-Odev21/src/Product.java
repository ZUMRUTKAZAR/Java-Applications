public class Product {
     private int id;
     String name;
     String description;
     double price;
     int stocAmount;
     String renk;
     String kod;

    //getter
    public int getId() {
        return id;
    }

    //setter
    public void setid(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStocAmount() {
        return stocAmount;
    }

    public void setStocAmount(int stocAmount) {
        this.stocAmount = stocAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }
//burada setter vermeyerek kullanıcının kodu yazmasını engelledik
//ve kodun namein ilk harfi + id olarak alınmasını sağlamış olduk
    public String getKod() {
        return this.name.substring(0,1) + id;
    }

    }



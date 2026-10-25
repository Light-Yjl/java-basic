package homework.exercise2.productManage;

import java.util.Objects;

public class Product {
    private String code;
    private String name;
    private int price;

    public Product(String code, String name, int price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null || !(obj instanceof Product)){
            return false;
        }
        Product other = (Product) obj;
        return Objects.equals(this.code , other.code);
    }
    @Override
    public String toString(){
        return code + " " + name + " " + price;
    }
}

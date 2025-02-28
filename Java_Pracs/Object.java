public class Object {
    public static void main(String a[]) {

        Laptop lapy = new Laptop();
        lapy.model = "MacBook Air";
        lapy.price = 2000;

        Laptop lapy2 = new Laptop();
        lapy2.model = "MacBook Air";
        lapy2.price = 2000;

        System.out.println(lapy.toString());

    }
}

class Laptop {
    String model;
    int price;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }

}

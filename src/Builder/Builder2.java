package Builder;

class Builder2 extends Builder{
    Product product = new Product();

    public void BuildPart(){
        product.Add("A");
        product.Add("B");
        product.Add("C");
        product.Add("D");
        product.Add("E");

    }
    public Product getResult(){
        return product;
    }
}

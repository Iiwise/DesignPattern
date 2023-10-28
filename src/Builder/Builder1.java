package Builder;

class Builder1 extends Builder{
    Product product = new Product();

    public void BuildPart(){
        product.Add("A");
        product.Add("B");
        product.Add("C");
    }
    public Product getResult(){
        return product;
    }
}

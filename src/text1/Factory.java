package text1;

class Factory {
    public static Product createProduct(String type) {
        Product product = null;
        switch (type) {
            case "A" -> {
                product = new ProductA();
            }
            case "B" -> {
                product = new ProductB();
            }
            default -> {
                System.out.println("没有" + type + "类型产品");
            }
        }
        return product;
    }
}

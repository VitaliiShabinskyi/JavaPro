// Класс для управления автосалоном
class CarDealership {
    private Manager manager;
    private Seller seller;
    private Security security;

    public CarDealership() {
        this.manager = new Manager();
        this.seller = new Seller();
        this.security = new Security();
    }

    public void manageDealership() {
        manager.manage();
        seller.sell();
        security.guard();
    }
}

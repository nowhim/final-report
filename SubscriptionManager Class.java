public class SubscriptionManager {
    private boolean isPremium;

    public SubscriptionManager() {
        this.isPremium = false;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void upgradeToPremium() {
        isPremium = true;
        System.out.println("User upgraded to premium!");
    }

    public void downgradeToBasic() {
        isPremium = false;
        System.out.println("User downgraded to basic.");
    }
}

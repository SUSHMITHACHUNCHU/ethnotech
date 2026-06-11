public class bus {
    String stopName;
    bus next;
    bus(String stopName) {
        this.stopName = stopName;
}
    public static void main(String[] args) {
        BusRoute route = new BusRoute();
        route.addRailwayStation();
        route.addViswamCollege();
        route.printStops();
    }
}
class BusRoute {
    bus stop;
    public void add(String stopName) {
        bus newStop = new bus(stopName);
        if (stop == null)
            stop = newStop;
        else {
            bus temp = stop;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newStop;
        }
    }
    public void addRailwayStation() {
        add("Railway Station");
    }
    public void addViswamCollege() {
        add("Viswam College");
     }
    public void printStops() {
        bus temp = stop;
        while (temp != null) {
            System.out.println(temp.stopName);
            temp = temp.next;
        }
    }
}
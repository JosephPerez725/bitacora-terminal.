// ABSTRACTION: esta historia usa operaciones del dominio sin conocer los atributos privados.
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Joseph");
        Account savings = customer.openAccount("001", 100);
        Account expenses = customer.openAccount("002", 50);
        savings.deposit(25);
        expenses.withdraw(20);
        try {
            expenses.withdraw(1000);
            throw new AssertionError("Se permitio retirar de mas");
        } catch (IllegalArgumentException e) {
            System.out.println("Retiro rechazado: " + e.getMessage());
        }
        System.out.println("Cliente: " + customer.getName());
        System.out.println("Saldo total: " + customer.getTotalBalance());
    }
}

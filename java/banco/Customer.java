// Implementacion asistida durante la recuperacion; ver ASISTENCIA.md.
public final class Customer {
    // ENCAPSULATION: el arreglo nunca sale de Customer y no admite cuentas duplicadas.
    private final String name;
    private Account[] accounts = new Account[2];
    private int count;

    public Customer(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
        this.name = name;
    }

    // ABSTRACTION: abrir una cuenta oculta el manejo y crecimiento del arreglo.
    public Account openAccount(String number, double initialBalance) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].getNumber().equals(number)) {
                throw new IllegalArgumentException("El numero de cuenta ya existe");
            }
        }
        Account account = new Account(number, initialBalance);
        if (count == accounts.length) {
            Account[] expanded = new Account[accounts.length * 2];
            System.arraycopy(accounts, 0, expanded, 0, count);
            accounts = expanded;
        }
        accounts[count] = account;
        count++;
        return account;
    }

    public double getTotalBalance() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += accounts[i].getBalance();
        }
        return total;
    }

    public String getName() {
        return name;
    }
}

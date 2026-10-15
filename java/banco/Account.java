// Implementacion asistida durante la recuperacion; ver ASISTENCIA.md.
public final class Account {
    // ENCAPSULATION: el saldo solo cambia mediante operaciones validadas; no hay setBalance.
    private final String number;
    private double balance;

    public Account(String number, double balance) {
        if (number == null || number.isBlank()) {
            throw new IllegalArgumentException("El numero de cuenta no puede estar vacio");
        }
        if (!Double.isFinite(balance) || balance < 0) {
            throw new IllegalArgumentException("El saldo inicial debe ser finito y no negativo");
        }
        this.number = number;
        this.balance = balance;
    }

    // ABSTRACTION: se expresa una operacion bancaria sin exponer el saldo para escritura.
    public void deposit(double amount) {
        validateAmount(amount);
        if (!Double.isFinite(balance + amount)) {
            throw new IllegalArgumentException("El deposito excede el saldo representable");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        validateAmount(amount);
        if (amount > balance) {
            throw new IllegalArgumentException("Fondos insuficientes");
        }
        balance -= amount;
    }

    private void validateAmount(double amount) {
        if (!Double.isFinite(amount) || amount <= 0) {
            throw new IllegalArgumentException("El monto debe ser finito y positivo");
        }
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }
}

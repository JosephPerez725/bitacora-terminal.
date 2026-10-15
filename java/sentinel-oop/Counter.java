// Mision B: la contabilidad del flujo pertenece a Counter, no al historial de lecturas validas.
public final class Counter {
    // ENCAPSULATION: nadie puede reducir los contadores ni registrar mas invalidas que leidas.
    private int read;
    private int invalid;

    public void recordRead() {
        read++;
    }

    public void recordInvalid() {
        if (invalid >= read) {
            throw new IllegalStateException("invalid cannot exceed read");
        }
        invalid++;
    }

    // ABSTRACTION: Main consulta cantidades sin conocer su almacenamiento.
    public int getRead() {
        return read;
    }

    public int getInvalid() {
        return invalid;
    }
}

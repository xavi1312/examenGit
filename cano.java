package net.davidvalles.batalla;


/**
 * Defineix un objecte que es mou per pantalla.
 *
 * @author david
 */
public abstract class CosaMobil extends Cosa {

    /**
     * Direcci� del moviment.
     */
    private Direccio direccio;
    /**
     * Velocitat del moviment.
     */
    private double velocitat;

    /**
     * Construeix una cosa a partir d'una imatge
     * i la posiciona en les coordenades que se li
     * especifiquen.
     *
     * @param img imatge a posar
     * @param x   Coordenada x
     * @param y   Coordenada y
     */
    public CosaMobil(final Image img, final double x, final double y) {
        super(img, x, y);
        velocitat = 0;
        direccio = Direccio.DRETA;
    }

    /**
     * Els personatges es poden moure.
     */
    public void mou() {
        GImage dibuix = getImatge();
        dibuix.movePolar(velocitat, direccio.getValor());
    }

    /**
     * Els personatges poden tornar enrere.
     */
    public final void mouUndo() {
        GImage dibuix = getImatge();
        dibuix.movePolar(velocitat * -1, direccio.getValor());
    }

    /**
     * Defineix una nova direcci�.
     *
     * @param dreta Direcci� en que es vol moure
     */
    public final void setDireccio(final Direccio dreta) {
        direccio = dreta;
    }

    /**
     * Defineix una nova direcci� i velocitat.
     *
     * @param dir Direcci� en que es vol moure
     * @param vel Velocitat a la que es mour�
     */
    public final void setDireccioIVelocitat(final Direccio dir, final int vel) {
        direccio = dir;
        velocitat = vel;
    }

    /**
     * Retorna la direcci� en la que s'est� movent.
     *
     * @return la direcci� en graus
     */
    public final Direccio getDireccio() {
        return direccio;
    }

    /**
     * Defineix una nova velocitat per l'objecte.
     *
     * @param mida velocitat en p�xels
     */
    public final void setVelocitat(final double mida) {
        velocitat = mida;
    }

    /**
     * @return Obtenir la velocitat
     */
    public final double getVelocitat() {
        return velocitat;
    }
}
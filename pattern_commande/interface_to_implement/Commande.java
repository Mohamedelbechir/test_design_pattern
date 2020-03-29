
package pattern_commande.interface_to_implement;

/**
 * Commande
 */
public interface Commande {

    // Mettre les instructions pour allumer un appareil
    public void executer();

    // mettre les instruction contraire de executer
    public void annuler();
}

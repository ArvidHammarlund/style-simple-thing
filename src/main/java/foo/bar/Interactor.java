package foo.bar;

/**
 *  Configures display and controll options
 */
public abstract class Interactor {
    // --- Attributes ---
    /**
     *  Choice of controller.
     */
    private final Controller controle;
    /**
     *  Choice of visualization/view.
     */
    private final View view;

    // --- Constructor ---
    /**
     *  Main constructor
     *  @param controle
     *  @param view
     */
    public Interactor(Controller controle, View view) {
        this.contole = controle;
        this.view = view;
    }

    // --- Main methods ---
    /**
     *  Abstraction for execution of application.
     */
    public abstract void run() {

    }
}

class SwingAndCLI extends Interactor {
    // --- Constructor ---
    /**
     *  {@inheritDoc}
     */ 
    public SwingAndCLI() {
        super(controleCLI, ViewSwing);
    }

    // --- Methods
    /**
     *  Execution of model.
     */
    public void run() {

    }
}


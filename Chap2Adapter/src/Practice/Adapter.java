package Practice;

/**
 * @author ryanw
 */
public class Adapter implements Translator {
    private final Speaker speaker;

    public Adapter(Speaker speaker) {
        this.speaker = speaker;
    }

    @Override
    public String translate() {
        return speaker.speak();
    }
}

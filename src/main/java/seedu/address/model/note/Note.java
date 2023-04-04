package seedu.address.model.note;

import static java.util.Objects.requireNonNull;

/**
 * Represents a Note in the HMHero.
 * Guarantees: immutable;
 */
public class Note {

    public final String noteName;
    public static final int MAX_LENGTH = 45;

    /**
     * Constructs a {@code Note}.
     *
     * @param noteName A valid note name.
     */
    public Note(String noteName) {
        requireNonNull(noteName);
        this.noteName = noteName;
    }

    public String getNoteName() {
        return this.noteName;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Note // instanceof handles nulls
                && noteName.equals(((Note) other).noteName)); // state check
    }

    @Override
    public int hashCode() {
        return noteName.hashCode();
    }

    /**
     * Format state as text for viewing.
     */
    public String toString() {
        return '[' + noteName + ']';
    }

}

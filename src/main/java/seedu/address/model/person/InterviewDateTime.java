package seedu.address.model.person;

import java.time.LocalDateTime;
import java.util.Optional;

import seedu.address.logic.parser.DateTimeParser;
import seedu.address.logic.parser.exceptions.ParseException;


/**
 * Represents a Person's interview date and time in the address book.
 */
public class InterviewDateTime {
    public static final String MESSAGE_CONSTRAINTS = "Interview date time not in valid format!";
    public static final String EMPTY_DATE_TIME = "";

    private final LocalDateTime dateTime;

    public InterviewDateTime(String dateTime) throws ParseException {
        this.dateTime = DateTimeParser.parseDateTime(dateTime);
    }

    /**
     * method to create InterviewDateTime, used in converting from json
     * @param dateTime String form of dateTime or empty string
     * @return {@code Optional.empty()} if empty String, otherwise returns {@code Optional<InterviewDateTime>}.
     * @throws ParseException if dateTime String cannot be parsed
     */
    public static Optional<InterviewDateTime> createInterviewDateTime(String dateTime) throws ParseException {
        if (dateTime.equals("")) {
            return Optional.empty();
        } else {
            return Optional.of(new InterviewDateTime(dateTime));
        }
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return DateTimeParser.datetimeFormatter(dateTime);
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof InterviewDateTime // instanceof handles nulls
                && dateTime.equals(((InterviewDateTime) other).dateTime)); // state check
    }
}

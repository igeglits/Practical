package UdemyDmitryPractic;

import java.util.Arrays;

class VerifierForGitCommitMessages {
    public static void main(String[] args) {
        String commitMessage =
                """
                        Summarizes changes in around 50 characters or less
                                                
                        More detailed explanatory text, if necessary. Wrap it to about 72
                        characters or so. In some contexts, the first line is treated as the
                        subject of the commit and the rest of the text as the body. The
                        blank line separating the summary from the body is critical (unless
                        you omit the body entirely); various tools like `log`, `shortlog`
                        and `rebase` can get confused if you run the two together.

                        Explain the problem that this commit is solving. Focus on why you
                        are making this change as opposed to how (the code explains that).
                        Are there side effects or other unintuitive consequences of this
                        change? Here's the place to explain them.""";
        validateGitCommitMessage(commitMessage);
    }

    private static void validateGitCommitMessage(final String commitMessage) {
        String[] lines = splitMessageByLineSeparator(commitMessage);
        String subject = lines[0];
        verifyThatSubjectNotEmpty(subject);
        verufyThatSubjectSeparatedfromBody(lines);
        verifyThatSubjectLengthIsLessThan50(subject);
        verifyThatSubjectStartsWithCapitalLetter(subject);
        verifyThatSubjectNotEndsWithPeriod(subject);
        verifyThatSubjectIsStartedFromVerbInImpertaiveMood(subject);
        if (isBodyFound(lines)) {
            verifyThatBodyLineIsWrappedAt72Characters(subArray(lines, 2));
        }
        System.out.println("Message is valid!");
    }

    private static String[] splitMessageByLineSeparator(String commitMessage) {
        return commitMessage.split("\n");
    }

    private static void verifyThatSubjectNotEmpty(String subject) {
        if (subject.isEmpty()) {
            System.out.println("Subject is empty!");
            System.exit(10);
        }
    }

    private static void verufyThatSubjectSeparatedfromBody(String[] lines) {
        if (lines.length > 1 && !lines[1].isEmpty()) {
            System.out.println("Subject is not separated from body!");
            System.exit(1);
        }
    }

    private static void verifyThatSubjectLengthIsLessThan50(String subject) {
        if (subject.length() > 50) {
            System.out.println("Subject is too long! = " + subject.length());
            System.exit(2);
        }
    }

    private static void verifyThatSubjectStartsWithCapitalLetter(String subject) {
        if (!Character.isUpperCase(subject.charAt(0))) {
            System.out.println("Subject starts with lower case letter! '" + subject.charAt(0) + "'");
            System.exit(3);
        }
    }

    private static void verifyThatSubjectNotEndsWithPeriod(String subject) {
        if (subject.endsWith(".")) {
            System.out.println("Subject ends with period!");
            System.exit(4);
        }
    }

    private static void verifyThatSubjectIsStartedFromVerbInImpertaiveMood(String subject) {
        String firstWord = getFirstWord(subject);
        if (isVerb(firstWord)) {
            System.out.printf(" %s%s%s\n", "Subject is started from verb '", firstWord, "' - not in imperative mood!");
            //System.out.println("Subject is started from verb '" + firstWord + "' - not in imperative mood!");
            System.exit(5);
        }
    }

    private static String getFirstWord(String subject) {
        return subject.split(" ")[0];
    }

    private static boolean isVerb(String firstWord) {
        return firstWord.endsWith("ing") || firstWord.endsWith("ed") || firstWord.endsWith("es") || firstWord.endsWith("s");
    }

    private static boolean isBodyFound(String[] lines) {
        return lines.length > 2;
    }

    private static void verifyThatBodyLineIsWrappedAt72Characters(String[] lines) {
        for (final String line : lines) {
            if (line.length() > 72) {
                System.out.println("Body line '" + line + "' is too long! = " + line.length());
                System.exit(6);
            }
        }
    }

    private static String[] subArray(String[] lines, int startIndex) {
        return Arrays.copyOfRange(lines, startIndex, lines.length);
    }
}

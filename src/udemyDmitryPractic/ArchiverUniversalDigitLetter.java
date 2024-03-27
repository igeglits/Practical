package udemyDmitryPractic;

//архиватор принимает каждое четное за символ, нечетное за кол-во повторений.
public class ArchiverUniversalDigitLetter {
    public static void main(String[] args) {
        // read source data
        String source = "A".repeat(18) + "B".repeat(3) + "C".repeat(5) + "8".repeat(1);
        System.out.println("Source text:   " + source);

        // processing
        String zipped = zip(source);
        // display results
        System.out.println("Zipped text:   " + zipped);

        // processing
        String unzipped = unzip(zipped);
        // display results
        System.out.println("Unzipped text: " + unzipped);
    }

    private static String zip(String source) {
        StringBuilder zipBuilder = new StringBuilder();
        var count = 1;
        var index = 0;
        var repeatTime = 0;
        var reminder = 0;
        for (int i = 0; i < source.length() - 1; i++) {
            if (source.charAt(i) == source.charAt(i + 1)) {
                count++;
            } else if (source.charAt(i) != source.charAt(i + 1)) {
                if (count > 9) {
                    repeatTime = count / 9;
                    reminder = count % 9;
                    for (int j = 1; j <= repeatTime; j++) {
                        zipBuilder.append(source.charAt(i));
                        zipBuilder.append(9);
                    }
                    if (reminder != 0) {
                        zipBuilder.append(source.charAt(i));
                        zipBuilder.append(reminder);
                    }
                } else {
                    zipBuilder.append(source.charAt(i));
                    zipBuilder.append(count);
                }
                count = 1;
                index = i;
            }
        }
        if (count > 9) {
            repeatTime = count / 9;
            reminder = count % 9;
            for (int j = 1; j <= repeatTime; j++) {
                zipBuilder.append(source.charAt(index + 1));
                zipBuilder.append(9);
            }
            if (reminder != 0) {
                zipBuilder.append(source.charAt(index + 1));
                zipBuilder.append(reminder);
            }
        } else {
            zipBuilder.append(source.charAt(index + 1));
            zipBuilder.append(count);
        }
        return zipBuilder.toString();
    }

    private static String unzip(String zipped) {
        StringBuilder unzipBuilder = new StringBuilder();

        for (int i = 0, j = 1; i < zipped.length() - 1; i += 2, j += 2) {
            for (int k = 1; k <= Integer.parseInt(String.valueOf(zipped.charAt(j))); k++) {
                unzipBuilder.append(zipped.charAt(i));
            }
        }

        return unzipBuilder.toString();
    }
}


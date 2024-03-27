package udemyDmitryPractic;

public class ArchiverOprimized {

        public static void main(String[] args) {
            String source = "A".repeat(18) + "B".repeat(3) + "C".repeat(5) + "8".repeat(19);
            System.out.println("Source text:   " + source);

            String zipped = zip(source);
            System.out.println("Zipped text:   " + zipped);

            String unzipped = unzip(zipped);
            System.out.println("Unzipped text: " + unzipped);
        }

        private static String zip(String source) {
            StringBuilder zipBuilder = new StringBuilder();
            int count = 1;

            for (int i = 0; i < source.length() - 1; i++) {
                if (source.charAt(i) == source.charAt(i + 1)) {
                    count++;
                } else {
                    appendToZipBuilder(zipBuilder, source.charAt(i), count);
                    count = 1;
                }
            }
            appendToZipBuilder(zipBuilder, source.charAt(source.length() - 1), count);
            return zipBuilder.toString();
        }

        private static void appendToZipBuilder(StringBuilder zipBuilder, char c, int count) {
            if (count > 9) {
                int repeatTime = count / 9;
                int reminder = count % 9;
                for (int j = 0; j < repeatTime; j++) {
                    zipBuilder.append(c);
                    zipBuilder.append(9);
                }
                if (reminder != 0) {
                    zipBuilder.append(c);
                    zipBuilder.append(reminder);
                }
            } else {
                zipBuilder.append(c);
                zipBuilder.append(count);
            }
        }

        private static String unzip(String zipped) {
            StringBuilder unzipBuilder = new StringBuilder();

            for (int i = 0; i < zipped.length(); i += 2) {
                char character = zipped.charAt(i);
                int count = Character.getNumericValue(zipped.charAt(i + 1));
                unzipBuilder.append(String.valueOf(character).repeat(Math.max(0, count)));
            }

            return unzipBuilder.toString();
        }
    }

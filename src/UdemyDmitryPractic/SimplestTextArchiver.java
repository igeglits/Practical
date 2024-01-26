package UdemyDmitryPractic;

public class SimplestTextArchiver {

    public static void main(String[] args) {
        // read source data
        String source = "A".repeat(8) + "B".repeat(3) + "C".repeat(5) + "E";
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
        for (int i = 0; i < source.length() - 1; i++) {
            if (source.charAt(i) == source.charAt(i + 1)) {
                count++;
            } else if (source.charAt(i) != source.charAt(i + 1)) {
                zipBuilder.append(source.charAt(i));
                zipBuilder.append(count);
                count = 1;
                index = i + 1;
            }
        }
        zipBuilder.append(source.charAt(index));
        zipBuilder.append(count);
        return zipBuilder.toString();
    }

    private static String unzip(String zipped) {
        StringBuilder unzipBuilder = new StringBuilder();

        for (int i = 0; i < zipped.length() - 1; i = i + 2)
            for (int j = 0; j == zipped.charAt(i + 1); j++) {
                unzipBuilder.append(zipped.charAt(i));
            }

        return unzipBuilder.toString();
    }
}
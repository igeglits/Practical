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
        StringBuilder count = new StringBuilder();
        char ch = zipped.charAt(0);
        var b = 1;
        for (int i = b; i < zipped.length()-1; i++) {
            if (Character.isDigit(zipped.charAt(i))) {
                count.append(zipped.charAt(i));
            }
            int repeatTime = Integer.parseInt(String.valueOf(count));
            unzipBuilder.append(String.valueOf(ch).repeat(Math.max(0, repeatTime)));
            ch = zipped.charAt(++i);
            count.setLength(0);
            b = i;
        }
        return unzipBuilder.toString();
    }
}
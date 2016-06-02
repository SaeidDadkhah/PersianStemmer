import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Created by 9231066 on 5/2/2016.
 * Project: Stemmer
 */
public class Stemmer {

    private ArrayList<Pattern> patterns;
    private ArrayList<Integer> stemIndex;

    public static void main(String[] args) {
        Stemmer stemmer = new Stemmer();

        System.out.println("\n==========================");
        System.out.println("Mazie Eltezamie Manfi");
        System.out.println(stemmer.stem("نرفته باشم"));
        System.out.println(stemmer.stem("نرفته باشی"));
        System.out.println(stemmer.stem("نرفته باشد"));
        System.out.println(stemmer.stem("نرفته باشیم"));
        System.out.println(stemmer.stem("نرفته باشید"));
        System.out.println(stemmer.stem("نرفته باشند"));

        System.out.println("\n==========================");
        System.out.println("Mazie Eltezami");
        System.out.println(stemmer.stem("رفته باشم"));
        System.out.println(stemmer.stem("رفته باشی"));
        System.out.println(stemmer.stem("رفته باشد"));
        System.out.println(stemmer.stem("رفته باشیم"));
        System.out.println(stemmer.stem("رفته باشید"));
        System.out.println(stemmer.stem("رفته باشند"));

        System.out.println("\n==========================");
        System.out.println("Mazie Baeide Manfi");
        System.out.println(stemmer.stem("نرفته بودم"));
        System.out.println(stemmer.stem("نرفته بودی"));
        System.out.println(stemmer.stem("نرفته بود"));
        System.out.println(stemmer.stem("نرفته بودیم"));
        System.out.println(stemmer.stem("نرفته بودید"));
        System.out.println(stemmer.stem("نرفته بودند"));

        System.out.println("\n==========================");
        System.out.println("Mazie Baeid");
        System.out.println(stemmer.stem("رفته بودم"));
        System.out.println(stemmer.stem("رفته بودی"));
        System.out.println(stemmer.stem("رفته بود"));
        System.out.println(stemmer.stem("رفته بودیم"));
        System.out.println(stemmer.stem("رفته بودید"));
        System.out.println(stemmer.stem("رفته بودند"));

        System.out.println("\n==========================");
        System.out.println("Nahy");
        System.out.println(stemmer.stem("نروم"));
        System.out.println(stemmer.stem("نرو"));
        System.out.println(stemmer.stem("نرویم"));
        System.out.println(stemmer.stem("نروید"));

        System.out.println("\n==========================");
        System.out.println("Amr");
        System.out.println(stemmer.stem("بروم"));
        System.out.println(stemmer.stem("برو"));
        System.out.println(stemmer.stem("برویم"));
        System.out.println(stemmer.stem("بروید"));

        System.out.println("\n==========================");
        System.out.println("Mozare'e Sadeye Manfi");
        System.out.println(stemmer.stem("نروم"));
        System.out.println(stemmer.stem("نروی"));
        System.out.println(stemmer.stem("نرود"));
        System.out.println(stemmer.stem("نرویم"));
        System.out.println(stemmer.stem("نروید"));
        System.out.println(stemmer.stem("نروند"));

        System.out.println("\n==========================");
        System.out.println("Mozare'e Sade");
        System.out.println(stemmer.stem("بروم"));
        System.out.println(stemmer.stem("بروی"));
        System.out.println(stemmer.stem("برود"));
        System.out.println(stemmer.stem("برویم"));
        System.out.println(stemmer.stem("بروید"));
        System.out.println(stemmer.stem("بروند"));

        System.out.println("\n==========================");
        System.out.println("Mazie Naqlie Manfi");
        System.out.println(stemmer.stem("نرفته ام"));
        System.out.println(stemmer.stem("نرفته ای"));
        System.out.println(stemmer.stem("نرفته است"));
        System.out.println(stemmer.stem("نرفته ایم"));
        System.out.println(stemmer.stem("نرفته اید"));
        System.out.println(stemmer.stem("نرفته اند"));

        System.out.println("\n==========================");
        System.out.println("Mazie Naqli");
        System.out.println(stemmer.stem("رفته ام"));
        System.out.println(stemmer.stem("رفته ای"));
        System.out.println(stemmer.stem("رفته است"));
        System.out.println(stemmer.stem("رفته ایم"));
        System.out.println(stemmer.stem("رفته اید"));
        System.out.println(stemmer.stem("رفته اند"));

        System.out.println("\n==========================");
        System.out.println("Mozare'e Ekhbarie Manfi");
        System.out.println(stemmer.stem("نمی روم"));
        System.out.println(stemmer.stem("نمی روی"));
        System.out.println(stemmer.stem("نمی رود"));
        System.out.println(stemmer.stem("نمی رویم"));
        System.out.println(stemmer.stem("نمی روید"));
        System.out.println(stemmer.stem("نمی روند"));

        System.out.println("\n==========================");
        System.out.println("Mozare'e Ekhbari");
        System.out.println(stemmer.stem("می روم"));
        System.out.println(stemmer.stem("می روی"));
        System.out.println(stemmer.stem("می رود"));
        System.out.println(stemmer.stem("می رویم"));
        System.out.println(stemmer.stem("می روید"));
        System.out.println(stemmer.stem("می روند"));

        System.out.println("\n==========================");
        System.out.println("Mazie Estemrarie Manfi");
        System.out.println(stemmer.stem("نمی رفتم"));
        System.out.println(stemmer.stem("نمی رفتی"));
        System.out.println(stemmer.stem("نمی رفت"));
        System.out.println(stemmer.stem("نمی رفتیم"));
        System.out.println(stemmer.stem("نمی رفتید"));
        System.out.println(stemmer.stem("نمی رفتند"));

        System.out.println("\n==========================");
        System.out.println("Mazie Estemrari");
        System.out.println(stemmer.stem("می رفتم"));
        System.out.println(stemmer.stem("می رفتی"));
        System.out.println(stemmer.stem("می رفت"));
        System.out.println(stemmer.stem("می رفتیم"));
        System.out.println(stemmer.stem("می رفتید"));
        System.out.println(stemmer.stem("می رفتند"));

        System.out.println("\n==========================");
        System.out.println("Mazie Sadeye Manfi");
        System.out.println(stemmer.stem("نرفتم"));
        System.out.println(stemmer.stem("نرفتی"));
        System.out.println(stemmer.stem("نرفت"));
        System.out.println(stemmer.stem("نرفتیم"));
        System.out.println(stemmer.stem("نرفتید"));
        System.out.println(stemmer.stem("نرفتند"));

        System.out.println("\n==========================");
        System.out.println("Mazie Sade");
        System.out.println(stemmer.stem("رفتم"));
        System.out.println(stemmer.stem("رفتی"));
        System.out.println(stemmer.stem("رفت"));
        System.out.println(stemmer.stem("رفتیم"));
        System.out.println(stemmer.stem("رفتید"));
        System.out.println(stemmer.stem("رفتند"));
    }

    public Stemmer() {
        ArrayList<String> regexs = new ArrayList<>();
        stemIndex = new ArrayList<>();

        // Mazie Eltezami va Mazie Eltezamie Manfi
        regexs.add("ن?" + "(.*)" + "ه (باشم|باشی|باشد|باشیم|باشید|باشند)" + "$");
        stemIndex.add(1);

        // Mazie Baeid va Mazie Baeide Manfi
        regexs.add("ن?" + "(.*)" + "ه (بودم|بودی|بود|بودیم|بودید|بودند)" + "$");
        stemIndex.add(1);

        // Mazie Estemrari, Mazie Estemrarie Manfi, Mozare'e Ekhbari va Mozare'e Ekhbarie Manfi
        regexs.add("(می|نمی)" + "(.*)" + "(یم|ید|ند)" + "$");
        stemIndex.add(2);
        regexs.add("(می|نمی)" + "(.*)" + "(م|ی|د)" + "$");
        stemIndex.add(2);
        regexs.add("(می|نمی)" + "(.*)" + "$");
        stemIndex.add(2);

        // Mazie Naqli va Mazie Naqlie Manfi
        regexs.add("ن?" + "(.*)" + "ه (ام|ای|است|ایم|اید|اند)" + "$");
        stemIndex.add(1);

        // Mozare'e Sade, Mozare'e Sadeye Manfi, Amr va Nahy
        regexs.add("(ب|ن)" + "(.*)" + "(یم|ید|ند)" + "$");
        stemIndex.add(2);
        regexs.add("(ب|ن)" + "(.*)" + "(م|ی|د)" + "$");
        stemIndex.add(2);
        regexs.add("(ب|ن)" + "(.*)" + "$");
        stemIndex.add(2);

        // Mazie Sade va Mazie Sadeye Manfi
        regexs.add("ن?" + "(.*)" + "(یم|ید|ند)" + "$");
        stemIndex.add(1);
        regexs.add("ن?" + "(.*)" + "(م|ی)" + "$");
        stemIndex.add(1);

        patterns = new ArrayList<>();

        patterns.addAll(regexs.stream().map(Pattern::compile).collect(Collectors.toList()));
    }

    public String stem(String word) {
        for (int i = 0; i < patterns.size(); i++) {
            Matcher m = patterns.get(i).matcher(word);
            if (m.find()) {
                System.out.println("MATCHED: " + i);
                return m.group(stemIndex.get(i));
            }
        }

        System.out.println("NOT MATCHED");
        return word;
    }
}

import java.util.TreeMap;

class Platform implements Comparable<Platform> {

    String name = null;
    int foundYear = 0;

    Platform(String name, int foundYear) {
        this.foundYear = foundYear;
        this.name = name;
    }

    public String toString() {
        return "{" + name + " : " + foundYear + "}";
    }

    public int compareTo(Platform otherPlatform) {
        return this.foundYear - otherPlatform.foundYear;
    }
}

class TreeMapDemo {
    public static void main(String[] args) {

        TreeMap<Platform, String> tm = new TreeMap<>();

        tm.put(new Platform("YouTube", 2005), "Google");
        tm.put(new Platform("Facebook", 2004), "Meta");
        tm.put(new Platform("ChatGPT", 2023), "OpenAI");
        tm.put(new Platform("Instagram", 2005), "Meta");

        System.out.println(tm);
    }
}

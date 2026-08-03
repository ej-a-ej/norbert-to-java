/**
 * CHAPITRE 23 — JSON
 */

public class SimpleJsonParser {
    public static String getString(String json, String key) {
        String searchKey = "\"" + key + "\"";
        int keyIndex = json.indexOf(searchKey);
        if (keyIndex == -1) return null;
        int valueStart = json.indexOf(":", keyIndex) + 1;
        while (json.charAt(valueStart) == ' ') valueStart++;
        if (json.charAt(valueStart) != '"') return null;
        int valueEnd = json.indexOf("\"", valueStart + 1);
        return json.substring(valueStart + 1, valueEnd);
    }

    public static Integer getInt(String json, String key) {
        String searchKey = "\"" + key + "\"";
        int keyIndex = json.indexOf(searchKey);
        if (keyIndex == -1) return null;
        int valueStart = json.indexOf(":", keyIndex) + 1;
        while (json.charAt(valueStart) == ' ') valueStart++;
        if (json.charAt(valueStart) == '"') return null;
        int valueEnd = valueStart;
        while (valueEnd < json.length() &&
               (Character.isDigit(json.charAt(valueEnd)) ||
                json.charAt(valueEnd) == '-')) {
            valueEnd++;
        }
        try {
            return Integer.parseInt(json.substring(valueStart, valueEnd));
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static Boolean getBoolean(String json, String key) {
        String searchKey = "\"" + key + "\"";
        int keyIndex = json.indexOf(searchKey);
        if (keyIndex == -1) return null;
        int valueStart = json.indexOf(":", keyIndex) + 1;
        while (json.charAt(valueStart) == ' ') valueStart++;
        String value = json.substring(valueStart, Math.min(valueStart + 5, json.length())).toLowerCase();
        if (value.startsWith("true")) return true;
        if (value.startsWith("false")) return false;
        return null;
    }

    public static String[] getArray(String json, String key) {
        String searchKey = "\"" + key + "\":";
        int start = json.indexOf(searchKey);
        if (start == -1) return new String[0];
        int bracketStart = json.indexOf("[", start);
        int bracketEnd = json.indexOf("]", bracketStart);
        if (bracketStart == -1 || bracketEnd == -1) return new String[0];
        String arrayContent = json.substring(bracketStart + 1, bracketEnd);
        String[] items = arrayContent.split(",");
        String[] result = new String[items.length];
        for (int i = 0; i < items.length; i++) {
            result[i] = items[i].trim().replace("\"", "");
        }
        return result;
    }
}

class LyaProfile {
    private String name;
    private String version;
    private boolean active;
    private int messagesProcessed;

    public LyaProfile(String name, String version, boolean active, int messagesProcessed) {
        this.name = name;
        this.version = version;
        this.active = active;
        this.messagesProcessed = messagesProcessed;
    }

    public String toJson() {
        return "{" +
               "\"name\":\"" + name + "\"," +
               "\"version\":\"" + version + "\"," +
               "\"active\":" + active + "," +
               "\"messagesProcessed\":" + messagesProcessed +
               "}";
    }

    public static LyaProfile fromJson(String json) {
        String name = SimpleJsonParser.getString(json, "name");
        String version = SimpleJsonParser.getString(json, "version");
        Boolean active = SimpleJsonParser.getBoolean(json, "active");
        Integer messages = SimpleJsonParser.getInt(json, "messagesProcessed");
        if (name == null) name = "Lya";
        if (version == null) version = "1.0";
        if (active == null) active = true;
        if (messages == null) messages = 0;
        return new LyaProfile(name, version, active, messages);
    }
}

class TestJson {
    public static void main(String[] args) {
        LyaProfile profile = new LyaProfile("Lya", "2.0", true, 42);
        String json = profile.toJson();
        System.out.println("JSON: " + json);
        LyaProfile parsed = LyaProfile.fromJson(json);
        System.out.println("Parsed profile: " + parsed.toJson());
        String jsonArray = "{\"commands\":[\"hello\",\"help\",\"goodbye\"]}";
        String[] commands = SimpleJsonParser.getArray(jsonArray, "commands");
        System.out.println("Commands:");
        for (String cmd : commands) {
            System.out.println("- " + cmd);
        }
    }
}

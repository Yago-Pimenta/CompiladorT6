package br.ufscar.dc.compiladores.cooklang;

public class GeradorHTMLUtils {

    public static String getCSS() {
        return "<style>\n" +
               "body { font-family: Arial, sans-serif; max-width: 800px; margin: auto; padding: 20px; background: #fdfdfd; color: #333; }\n" +
               "h1 { color: #d35400; font-size: 2em; }\n" +
               "h2 { color: #2980b9; margin-top: 1.5em; }\n" +
               "ul, ol { margin-left: 20px; }\n" +
               "li { margin-bottom: 0.5em; }\n" +
               "</style>\n";
    }

    public static String escapeHTML(String text) {
        if (text == null) return "";
        return text.replace("&", "&amp;")
                   .replace("<", "&lt;")
                   .replace(">", "&gt;");
    }

    public static String extractTitle(String line) {
        int idx = line.indexOf(":");
        return idx >= 0 ? line.substring(idx + 1).trim() : line;
    }

    public static String formatIngredient(String line) {
        String[] parts = line.split("\\s+", 3);
        String qtd = parts.length > 0 ? escapeHTML(parts[0]) : "";
        String und = parts.length > 1 ? escapeHTML(parts[1]) : "";
        String desc = parts.length > 2 ? escapeHTML(parts[2]) : "";
        return (qtd + " " + und + " " + desc).trim();
    }

    public static String formatPasso(String line) {
        String[] parts = line.split("\\.", 2);
        String resto = parts.length > 1 ? parts[1].trim() : parts[0].trim();
        return escapeHTML(resto);
    }
}

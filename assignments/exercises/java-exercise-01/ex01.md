# Aufgabe 1: Hello World (8 Punkte)

Schreiben Sie das nachfolgende "HelloWorld"–Programm exakt mit einem geeigneten Texteditor ab und speichern Sie es als HelloWorld.java auf Ihrem Computer. Übersetzen Sie das Programm mit dem Java-Compiler javac und führen Sie es mit java aus.

```
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

Das obige Programm ist korrekt und sollte ohne Fehler übersetzt und ausgeführt werden können.

Führen Sie jeweils folgende Änderungen an dem Programm durch und testen Sie das Ergebnis:

    1. Entfernen Sie das Semikolon hinter println() (Zeile 3)
    2. Benennen Sie In der ersten Zeile HelloWorld in HalloWelt um (den Dateinamen aber bei HelloWorld.java belassen) (Zeile 1)
    3. Fügen Sie einen Tippfehler in den Funktionsnamen main ein, z.B. mein (Zeile 2)
    4. Schreiben Sie hinter println() zwei Semikolons (Zeile 3)

Erhalten Sie Fehlernachrichten beim Kompilieren oder Ausführen des Programms? Wenn ja, welche? Wann tritt der Fehler auf, beim Kompilieren und/oder bei der Ausführung?

Schreiben Sie die Art des Fehlers in eine Textdatei (aufgabe1.txt) und kopieren Sie die jeweilige Fehlermeldung dazu. Benutzen Sie dazu folgendes Format:

Teilaufgabe
Art des Fehlers (Compilerfehler|Laufzeitfehler|kein Fehler)
Fehlermeldung (wenn vorhanden)

Ein Fehler, der bei der Kompilierung des Programms auftritt, würde bspw. wie folgt angegeben:

1)
Compilerfehler
HelloWorld.java:2: error: cannot find symbol
public static void main(Strig[] args) {


---

Hinweise:

    Nutzen Sie einen einfachen Texteditor, um die Textdatei mit Ihren Lösungen zu erstellen. Verwenden Sie insbesondere nicht ein normales Textverarbeitungsprogramm (Microsoft Word, Libre Office, Google Docs o.ä.).
    Die abgegebene Textdatei, darf keine Formatierungsangaben (bspw. fett, kursiv, farbig, o.ä.) beinhalten und soll mit dem Unix-Befehl 'more aufgabe1.txt' gelesen werden können.
    Die dargestellten Beispiele illustrieren nur die Formatierung der Angaben innerhalb der Datei und sind nicht als Musterlösungen zu betrachten.


# 🎮 Gra RPG w Javie (z zapisem stanu gry)

Projekt gry RPG w języku **Java**, działający w terminalu/console, zawierający:
- wybór klasy postaci (mag, łucznik, wojownik),
- system walki turowej,
- poziomy trudności i awans postaci (XP, level),
- **zapis i wczytywanie stanu gry z pliku `save.txt`**.

---

## 🚀 Uruchamianie gry

### ✅ Wymagania

- Java JDK 17+  
- Visual Studio Code z rozszerzeniem _Java Extension Pack_ **lub** zwykły terminal

### 🧪 Kompilacja i uruchomienie

W terminalu w folderze z plikami `driver.java` i `dice.java` wpisz:

```bash
javac driver.java dice.java
java driver
```

---

## 🧙‍♂️ Dostępne klasy postaci

| Klasa      | HP | Mana | Obrażenia | Specjalność       |
|------------|----|------|-----------|-------------------|
| Mag        | 10 | 20   | 2         | Fireball, Leczenie |
| Łucznik    | 14 | —    | 6         | Duży dmg, brak many |
| Wojownik   | 20 | 20   | 4         | Szarża, wytrzymałość |

---

## 💾 System zapisu gry

Po każdej walce gra zapisuje się automatycznie do `save.txt`.  
Po uruchomieniu gry możesz wybrać:

```
1. Nowa gra
2. Wczytaj zapis
```

---

## 📁 Struktura plików

```
📦 gra-rpg-java
┣ 📜 driver.java
┣ 📜 dice.java
┣ 📜 save.txt          # (tworzy się automatycznie)
┣ 📜 README.md         # (ten plik)
```

---

## 📌 Planowane funkcje

- [ ] Boss na końcu 5 poziomu
- [ ] System ekwipunku
- [ ] GUI (JavaFX / Swing)
- [ ] System misji

---

## 📜 Licencja

Projekt stworzony do nauki. Możesz używać i modyfikować swobodnie.
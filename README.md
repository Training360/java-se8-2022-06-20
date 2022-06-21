# Java 8 képzés

## Gyakorlati feladat - Négyzet alakú terítő

Készíts egy `cloth.cloth.Square` nevű interfészt, melyben négy default metódus is található:

* `int getNumberOfSides()`: visszaadja egy négyzet oldalainak számát.
* `double getPerimeter()`: az oldal hosszának ismeretében visszaadja a négyzet kerületét.
* `double getArea()`: az oldal hosszának ismeretében visszaadja a négyzet területét.

Legyen az interfészben egy absztrakt `double getSide()` metódus is! A default metódusok ezt a metódust hívják 
meg a visszaadott értékeik kiszámolásához!

Legyen egy `TableCloth` osztály, amely implementálja ezt az interfészt, és van egy `double side` 
attribútuma, melynek értékét konstruktorban állítja be! A `getSide()` metódus ezt adja vissza!

Írj tesztet a `TableClothTest` osztályban a metódusok működésének ellenőrzésére!

## Nevezetes programozási tételek

### Összegzés tétele

Hozzatok létre egy egész számok listáját, és számoljátok ki a számok összegét!

### Számlálás tétele

Hozzatok létre egy egész számok listáját, pozitív és negatív számokkal,
és számoljátok össze, hogy hány negatív szám szerepel a listában!

### Szélsőérték keresés tétele

Hozzatok létre szavak listáját, és keressétek ki a leghosszabb szót!

### Eldöntés tétele

Mond meg egy egész számokat tartalmazó listáról, hogy csak
páros számokat tartalmaz-e!

## Transzformáció

Hozz létre egy Employee osztályt, névvel. Majd hozz létre egy Employee
objektumokat tartalmazó listát!
Hozz létre egy olyan másik String listát, mely az alkalmazottaknak csak a neveit
tartalmazza!

List<Employee> -> List<String>

## Szűrés

Hozz létre egy List<Employee> objektumot, és szűrd ki belőle a 100_000-nél 
nagyobb fizetésű alkalmazottakat. Hozz létre egy új listát a feltételnek
megfelelő alkalmazottakkal.

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

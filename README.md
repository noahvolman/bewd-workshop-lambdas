# bewd-workshop-lambdas
Workshop over Java lambda's. 

## Voorkennis
- Java interfaces (OOPD)
- Java geheugenmodel (OOPD)

## Workshop

### 1. Workshop repository clonen

Clone deze git repository zodat je er met je eigen favoriete java IDE mee kan werken.

Bestudeer de code in de Main class. Volg de code naar de Reis class, VervoerStrategy class en de verschillende implementaties van VervoerStrategy.

### 2. Eigen implementatie van interface

Schrijf je eigen implementatie van VervoerStrategy. Wees creatief in het type vervoer dat je toevoegt (UFO, teleportatie, astrale projectie, etc...).

### 3. Geheugenmodel

Teken voor jezelf het geheugenmodel zoals je dat geleerd hebt bij OOPD. Teken de situatie vlak voor de aanroep naar ```simuleerReis()```

### 4. Lambda theorie

Om een eigen implementatie van de VervoerStrategy te gebruiken moet je nu zelf een klasse maken welke de interface implementeerd, de methode implementeren en vervolgens een eigen objectinstantie aanmaken en injecteren in je Reis. Dat is flink wat werk, en er is een snellere manier: Lambda's.

Kijk het filmpje van Coding With John over lambda's: https://www.youtube.com/watch?v=tj5sLSFjVj4

### 5. Reis met lambda Vervoer

John gebruikt een ander voorbeeld dan wij. Waar John een 'Printable' interface gebruikt hebben wij een 'VervoerStrategy'. En waar John alleen een Cat class gebruikt die de printable interface implementeerd zijn er in het workshop project meerdere implementerende classes (OVVervoerStrategy, AutoVervoerStrategy, FietsVervoerStrategy en je eigen implementatie).

Onze Reis code gebruikt ook een interface met alleen een enkele abstracte methode. Voeg een vijfde reis toe en maak deze keer gebruik van een eigen nieuwe VervoerStrategy aan de hand van een lambda.

### Toelichting Strategy Pattern

Dit stuk voorbeeld code is een voorbeeld van het Strategy Pattern. Bij een strategy pattern gebruik je niet altijd een functionele interface (interface met een enkele abstracte methode), maar als je dat wel doet kan je deze dus ook gebruiken met Lambda's. Hier kan je daar meer over lezen: https://refactoring.guru/design-patterns/strategy

### Verder leesmateriaal

Hier zie je nog veel meer voorbeelden van alternatieven (Zoals het gebruik van anonieme classes), het document is echter zeer technisch dus maak je geen zorgen als je het niet kunt volgen: https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html

Als je je eigen functional interfaces gaat maken kan je hier nog tips lezen over wat je wel en niet kunt doen: https://www.baeldung.com/java-8-lambda-expressions-tips

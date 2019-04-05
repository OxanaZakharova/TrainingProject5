# TrainingProject5
DiceGames, 10/2018, Intellij IDEA

Uppgift - tärningsspel
Uppgift 1 - Die
I den första uppgiften skall vi modellera en tärning med hjälp av en klass Die. Vi skall sedan
använda den här tärningsklassen för att skapa ett enkelt tärningsspel.
Tärningen skall ha två variabler: nuvarande värde och antal sidor (dvs max-värde för tärningen)
● Antal sidor skall sättas i klassens konstruktor. Skall vara av typen int. Skall ha en gettermetod.
● Nuvarande värde skall förändras när man kallar på roll()-metoden.
● Slumpgeneratorn skall vara av typen Random och kommer att användas i vår roll()-
metod.
För att kunna använda klassen kommer vi att behöva  en metod roll() :
Den här metoden skall använda sig av slumpgeneratorn för att förändra
tärningens nuvarande värde.

Uppgift 2 - Player
För att kunna göra ett simpelt tärningsspel skall vi nu också skapa en klass Player för att
representera en spelare.
En spelare skall ha tre instansvariabler: ett namn, en poäng och en lista av tärningar.
● Namnet skall vara av typen String. Ska ha en getter-metod.
● Poängen skall vara av typen int och skall representera hur många poäng spelaren har
lyckats samla ihop. Ska ha en getter-metod.
● Listan med tärningar är vad spelaren kommer att använda för att spela tärningsspelet.
Skall vara av typen ArrayList<Die>.
En spelare skall också ha ett antal metoder:
● rollDice();
○ Skall rulla alla tärningar i spelarens tärnings-lista.
● getDieValue();
○ Skall summera och returnera värdet på spelarens alla tärningar i form av ett
heltal.
● increaseScore();
○ Skall öka spelarens poäng med ett.
● addDie(int sides);
○ Skapar en ny tärning med sidor sides och lägger till den till spelaren.
  
Uppgift 3 - SimpleDiceGame
Vi skall nu skapa vårat enkla tärningsspel. !
Beskrivning av spelet
Programmet frågar först hur många spelare som vill spela, hur många tärningar varje spelare
skall ha och hur många sidor tärningarna skall ha. Det frågar sedan efter namnen på spelarna.
Ni kan anta att användaren matar in korrekta värden, dvs ni behöver ej ha med felhantering.
Spelet kommer sedan att spelas i fem omgångar. Varje omgång består av att spelarna, en efter
en, gissar på ett värde och sedan rullar sina tärningar. Om värdet spelaren gissade på är lika
med det sammanlagda värdet på tärningarna, så får spelaren en poäng. En omgång är slut då
en sista spelaren har gissat och rullat sina tärningar.
Spelaren som har flest poäng efter 5 omgångar vinner spelet. 


Lite mer utmanande uppgift
Uppgift 4 - PigGame
I den här uppgiften skall vi skapa ett nytt tärningsspel som heter Pig. Spelet går ut på följande
sätt:
Spelet kan spelas med två eller fler spelare. Varje spelare har en sex-sidig tärning. Alla spelarna
kommer sedan i tur och ordning få rulla på sin tärning.
Vid en spelares skall den först rulla sin tärning. Resultatet på tärningen läggs till en pott för den
här turen. Spelaren får nu ett val att stanna eller fortsätta. Om spelaren stannar läggs potten till
dess totala poäng och turen går vidare till nästa spelare. Väljer spelaren att fortsätta rulla, får
den rulla tärningen igen och addera resultatet till potten. Spelaren får nu göra samma val igen.
Dock, om spelare skulle någon gång rulla en etta, försvinner alla poäng som ligger i potten och
turen går över till nästa spelare.
Den första spelaren som når upp till en totalpoäng av 100 vinner spelet

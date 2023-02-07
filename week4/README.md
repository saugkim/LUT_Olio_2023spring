**Viikon 4 harjoitustehtävät**

Tämän viikon harjoituksissa rakennetaan laskin luokka, joka osaa kalkuloida opiskelija luokalla olevia kurssisuorituksia. Tarvitset taasen App.javan, jossa pyörii valikko ja tämän lisäksi Calculator, University ja Student-luokat. Mahdollisesti myös Grade-luokan riippuen toteutuksestasi.

Ohjelman tarkoitus on syöttää opiskelijalle kurssisuorituksia (Kurssin nimi ja numero – HashMap on toimiva tietorakenne, mutta myös ArrayList + Grade-luokka on varsin toimiva ja huomattavasti helpommin laajennettavissa. Käytä jälkimmäistä, jos HashMap ei tunnu tutulta). Ohjelma voi pitää siis sisällään 0-N määrän opiskelijoita ja opiskelijalla on 0-N määrä kurssisuoritteita.

Laskinohjelma osaa laskea kurssisuorituksista keskiarvon ja mediaanin. Tämän lisäksi se kykenee tulostamaan ruudulle kaikkien opiskelijoiden suoritukset esimerkkiajon mukaisesti.

Ohjelmassa on erikseen toiminto tietojen tallentamiseen tiedostoon ja niiden lukemiseen tiedostosta. Käytännössä tämä tarkoittaa sitä, että University-luokka vastaa students-tietorakenteen kirjoittamisesta tiedostoon. Olio pitää sisällään kaiken datan, joten tämä data tulee kirjoitettua tiedostoon automaattisesti. Student-luokan tulee olla siis serialisoituva – kuten myös Grade-luokan, mikäli sellainen on käytössä.


Calculator-luokalla tulee olla tarkasti seuraavat toiminallisuudet:

getAverageGrade(Student s) – palauttaa keskiarvon kurssisuorituksista double-liukulukuna. Mikäli suorituksia ei ole, palauttaa nollan.

getMedianGrade(Student s) – palauttaa mediaaniarvosanan double-liukulukuna. 
Tämä onnistuu helpoiten järjestämällä tietorakenne suuruusjärjestykseen ja palauttamalla keskimmäinen alkio (tee sorttaus kuitenkin tietorakenteen kopiolle, jotta alkuperäinen rakenne ei muutu – tavallinen Array on toimiva tässä). 
Mikäli alkioita on parillinen määrä tulee palauttaa kahden keskimmäisen alkion arvojen keskiarvo. Mikäli suorituksia ei ole, palauttaa nollan.


Student-luokalla seuraavat toiminnallisuudet:

addGrade(String course, int grade) – tallentaa kurssisuorituksen listaan


1 piste

Ohjelmaan on mahdollista syöttää uusia opiskelijoita ja listata ne


2 pistettä

Ohjelmaan on mahdollista syöttää arvosanoja valituille opiskelijoille


3 pistettä

Ohjelma osaa tallentaa syötetyt tiedot tiedostoon ja lukea syötteet sieltä


4 pistettä

Ohjelma osaa laskea opiskelijan arvosanojen keskiarvon


5 pistettä

Ohjelma osaa laskea opiskelijan arvosanojen mediaaniarvon ja tulostaa väärän syötteen saattuaan “Syöte oli väärä”.



*** Esimerkkiajo ***

```
1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma
1
Anna opiskelijan nimi?
Ville Virtanen
Anna opiskelijan opiskelijanumero:
0556677
1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma
1
Anna opiskelijan nimi?
Jane Doe
Anna opiskelijan opiskelijanumero:
0882256
1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma
2
Opiskelijat:
0556677: Ville Virtanen
0882256: Jane Doe
1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma
3
0: Ville Virtanen
1: Jane Doe
Mille opiskelijalle suorite lisätään?
1
Mille kurssille suorite lisätään?
Olio-ohjelmointi
Mikä arvosana kurssille lisätään?
5
1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma
3
0: Ville Virtanen
1: Jane Doe
Mille opiskelijalle suorite lisätään?
1
Mille kurssille suorite lisätään?
Testikurssi
Mikä arvosana kurssille lisätään?
4
1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma
5
0: Ville Virtanen
1: Jane Doe
Minkä opiskelijan suoritteiden keskiarvo lasketaan?
1
Keskiarvo on 4.5
1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma
4
0: Ville Virtanen
1: Jane Doe
Minkä opiskelijan suoritteet listataan?
1
Olio-ohjelmointi: 5
Testikurssi: 4
1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma
6
0: Ville Virtanen
1: Jane Doe
Minkä opiskelijan suoritteiden mediaani lasketaan?
1
Mediaani on 4.5
1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma
3
0: Ville Virtanen
1: Jane Doe
Mille opiskelijalle suorite lisätään?
1
Mille kurssille suorite lisätään?
Fail
Mikä arvosana kurssille lisätään?
0
1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma
5
0: Ville Virtanen
1: Jane Doe
Minkä opiskelijan suoritteiden keskiarvo lasketaan?
1
Keskiarvo on 3.0
1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma
6
0: Ville Virtanen
1: Jane Doe
Minkä opiskelijan suoritteiden mediaani lasketaan?
1
Mediaani on 4.0
1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma
7
1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma
1
Anna opiskelijan nimi?
Pena Poistuva
Anna opiskelijan opiskelijanumero:
666
1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma
8
1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma
2
Opiskelijat:
0556677: Ville Virtanen
0882256: Jane Doe
1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma
0
Kiitos ohjelman käytöstä.
```

*** Esimerkkiajo päättyy ***

**Viikon 3 harjoitustehtävät / Week 3 exercises**

Tämän viikon harjoituksissa rakennetaan eläintarha. Tarvitset taasen App.javan, jossa pyörii valikko ja tämän lisäksi Zoo- ja Animal-luokat.

Valikon kautta voidaan luoda uusia eläimiä. Animal-luokan rakentajalle annetaan parametreinä eläimen laji, nimi ja ikä. Kaksi ensimmäistä ovat merkkijonoja ja viimeinen on kokonaisluku. Juuri luotu uusi eläinolio annetaan eläintarhaoliolle, joka säilöö eläimen sisäänsä ArrayList on hyvin hyödyllinen tässä.

Valikon kautta voidaan käskyttää eläintarhaolio, jolta löytyy metodit addAnimal, listAnimals ja runAnimals. listAnimals tulostaa ruudulle jokaisen eläimen tiedot omalle rivilleen (for(each)-silmukka on tässä hyödyllinen) ja runAnimals, juoksuttaa jokaista eläintä käyttäjältä kysytyn kierrosmäärän verran. Eläimiä juoksutetaan siinä järjestyksessä, kun ne on ArrayList:iin sijoitettu.


1 piste  
Ohjelma kysyy alussa eläintarhan nimeä.


3 pistettä  
Eläinten lisääminen eläintarhaan onnistuu. Samoin voidaan listata kaikki eläimet eläintarhasta.


5 pistettä  
Eläimiä voidaan juoksuttaa ja ohjelma kertoo syötteen olevan väärä, mikäli käyttäjä yrittää valita valikosta tuntemattoman syötteen.


*** Esimerkkiajo ***

```
Anna eläintarhalle nimi:
Korkeasaari
1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma
1
Mikä laji?
Siili
Anna eläimen nimi:
Pikseli
Anna eläimen ikä:
5
1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma
1
Mikä laji?
Possu
Anna eläimen nimi:
Pipsa
Anna eläimen ikä:
5
1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma
1
Mikä laji?
Ryhmä Hau
Anna eläimen nimi:
Rolle
Anna eläimen ikä:
3
1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma
2
Korkeasaari pitää sisällään seuraavat eläimet:
Siili: Pikseli, 5 vuotta
Possu: Pipsa, 5 vuotta
Ryhmä Hau: Rolle, 3 vuotta
1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma
3
Kuinka monta kierrosta?
2
Pikseli juoksee kovaa vauhtia!
Pikseli juoksee kovaa vauhtia!
Pipsa juoksee kovaa vauhtia!
Pipsa juoksee kovaa vauhtia!
Rolle juoksee kovaa vauhtia!
Rolle juoksee kovaa vauhtia!
1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma
4
Syöte oli väärä
1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma
1
Mikä laji?
Hämähäkki
Anna eläimen nimi:
Mies
Anna eläimen ikä:
32
1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma
2
Korkeasaari pitää sisällään seuraavat eläimet:
Siili: Pikseli, 5 vuotta
Possu: Pipsa, 5 vuotta
Ryhmä Hau: Rolle, 3 vuotta
Hämähäkki: Mies, 32 vuotta
1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma
0
Kiitos ohjelman käytöstä.
```
*** Esimerkkiajo päättyy ***

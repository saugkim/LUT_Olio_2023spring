**Viikon 2 tehtävät**

Kirjoita ohjelma, jossa luot siili-olion ja käskytät sitä valikkorakenteen kautta. Tarvitset tähän samanlaisen App.java-tiedoston kuin ensimmäisellä viikolla. Tämä tiedosto sisältää main-metodin, jonka sisällä on valikkorakenne. Tämän lisäksi tarvitset Hedgehog.java-tiedoston, jonka sisällä määritellään Hedgehog-luokka.


2 pistettä (saat suoraan 2 pistettä tästä vaiheesta)  
Luokassa tulee määrittää oletusrakentaja, jossa siilille määritellään nimi ja ikä (String name, int age). Oletuksena nämä ovat “Pikseli” ja 5. Tämän lisäksi siilin tulee olla mahdollista puhua. Tämä hoituu speak-metodin kautta. Metodi saa parametrinään String-muuttujan ja tulostaa ruudulle tekstin “<siilin nimi>: <teksti>”. Ohjelman alussa luodaan oletussiili, joka on käytössä heti.


3 pistettä  
Lisää mahdollisuus määrittää siilille uusi nimi ja ikä. Käytännössä tässä voi siis luoda uuden siilin ja kutsua rakentajaa, joka ottaa nimen ja iän parametreinä.


Valikko kertoo, että “Syöte oli väärä”, mikäli käyttäjä antaa numeron, jota ei ole speksattu.


4 pistettä  
Siili osaa myös juosta, eli tee luokkaan run-metodi, joka saa parametrinään kokonaisluvun ja tulostaa niin monta kertaa tekstin “<siilin nimi> juoksee kovaa vauhtia!”. Valikossa kysytään kuinka monta kertaa siili juoksee.


5 pistettä  
Mikäli siilille annetaan syötteenä puhuttavaksi tyhjä syöte, kertoo siili nimensä ja pyytää uutta syötettä “Olen <siilin nimi> ja ikäni on <siilin ikä>, mutta antaisitko silti syötteen?”


*** Esimerkkiajo ***
```
1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma
1
Mitä siili sanoo:
Moikka!
Pikseli: Moikka!
1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma
3
Kuinka monta kierrosta?
2
Pikseli juoksee kovaa vauhtia!
Pikseli juoksee kovaa vauhtia!
1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma
4
Syöte oli väärä
1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma
2
Anna siilin nimi:
Tekseli
Anna siilin ikä:
3
1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma
1
Mitä siili sanoo:

Olen Tekseli ja ikäni on 3 vuotta, mutta antaisitko silti syötteen?
1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma
3
Kuinka monta kierrosta?
1
Tekseli juoksee kovaa vauhtia!
1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma
0
Kiitos ohjelman käytöstä.

```

*** Esimerkkiajo päättyy ***

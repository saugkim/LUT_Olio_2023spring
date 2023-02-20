**Viikon 6 harjoitustehtävät**

Tällä viikolla tarkoituksena on treenata periytymistä. Tehtävänäsi on luoda Vehicle, Car, Plane, Ship ja Engine -luokat. Edellämaininut nimet ovat pakolliset, eikä niitä saa muuttaa. Kaikilla kulkuneuvoilla on moottori-olionsa. Moottorista tiedetään nimi ja teho. Auton tapauksessa arvot ovat aina “V8” ja 300, lentokoneella “Suihkumoottori” ja 500 sekä laivalla “Wärtsilä Super” ja 1000.


2 pistettä

Ohjelman testaus alkaa sillä, että testicaset varmistavat, että Car, Plane ja Ship -luokat periytyvät Vehicle-luokasta. 


3 pistettä

Toisena testinä tarkistetaan, että metodit drive, fly ja sail (metodien nimet ovat oltava kirjoitettuna näin) löytyvät vain aliluokista, ei kantaluokasta; drive Car-luokasta, fly Plane-luokasta ja sail Ship-luokasta.


Seuraavia testejä ei suoriteta, mikäli edelliset eivät mene läpi.


4 pistettä

Ohjelmassa on mahdollisuus rakentaa uusia autoja, lentokoneita ja laivoja esimerkkiajon mukaisesti sekä listata niiden tiedot. Tallenna oliot ArrayList<Vehicle> tietorakenteeseen. 


5 pistettä

Ohjelmassa on mahdollisuus ajaa, lentää tai seilata luoduilla olioilla. Voit käskyttää kaikki autot ajamaan, lentokoneet lentämään tai laivat seilaamaan. Käytä instanceof-operaattoria ja tyyppimuunnosta, jotta pystyt liikuttamaan oikeita olioita.

```
*** Esimerkkiajo ***

1) Luo uusi kulkuneuvo, 2) Listaa kulkuneuvot 3) Aja autoja, 4) Lennä lentokoneita, 5) Seilaa laivoja, 0) Lopeta ohjelma
1
Minkä kulkuneuvon haluat rakentaa? 1) auto, 2) lentokone, 3) laiva
1
Anna kulkuneuvon valmistaja:
Volvo
Anna kulkuneuvon malli:
240
Anna kulkuneuvon huippunopeus:
180
1) Luo uusi kulkuneuvo, 2) Listaa kulkuneuvot 3) Aja autoja, 4) Lennä lentokoneita, 5) Seilaa laivoja, 0) Lopeta ohjelma
1
Minkä kulkuneuvon haluat rakentaa? 1) auto, 2) lentokone, 3) laiva
1
Anna kulkuneuvon valmistaja:
Lada
Anna kulkuneuvon malli:
2105
Anna kulkuneuvon huippunopeus:
160
1) Luo uusi kulkuneuvo, 2) Listaa kulkuneuvot 3) Aja autoja, 4) Lennä lentokoneita, 5) Seilaa laivoja, 0) Lopeta ohjelma
1
Minkä kulkuneuvon haluat rakentaa? 1) auto, 2) lentokone, 3) laiva
3
Anna kulkuneuvon valmistaja:
Rauman telakka
Anna kulkuneuvon malli:
Oasis of the seas
Anna kulkuneuvon huippunopeus:
40
1) Luo uusi kulkuneuvo, 2) Listaa kulkuneuvot 3) Aja autoja, 4) Lennä lentokoneita, 5) Seilaa laivoja, 0) Lopeta ohjelma
1
Minkä kulkuneuvon haluat rakentaa? 1) auto, 2) lentokone, 3) laiva
2
Anna kulkuneuvon valmistaja:
Airbus
Anna kulkuneuvon malli:
727
Anna kulkuneuvon huippunopeus:
800
1) Luo uusi kulkuneuvo, 2) Listaa kulkuneuvot 3) Aja autoja, 4) Lennä lentokoneita, 5) Seilaa laivoja, 0) Lopeta ohjelma
2
Auto: Volvo 240
Moottori: V8 300kW
Huippunopeus: 180km/h

Auto: Lada 2105
Moottori: V8 300kW
Huippunopeus: 160km/h

Laiva: Rauman telakka Oasis of the seas
Moottori: Wärtsilä Super 1000kW
Huippunopeus: 40km/h

Lentokone: Airbus 727
Moottori: Suihkumoottori 500kW
Huippunopeus: 800km/h

1) Luo uusi kulkuneuvo, 2) Listaa kulkuneuvot 3) Aja autoja, 4) Lennä lentokoneita, 5) Seilaa laivoja, 0) Lopeta ohjelma
3
Volvo 240 paahtaa tietä eteenpäin!
Lada 2105 paahtaa tietä eteenpäin!
1) Luo uusi kulkuneuvo, 2) Listaa kulkuneuvot 3) Aja autoja, 4) Lennä lentokoneita, 5) Seilaa laivoja, 0) Lopeta ohjelma
4
Airbus 727 lentää kohteeseen!
1) Luo uusi kulkuneuvo, 2) Listaa kulkuneuvot 3) Aja autoja, 4) Lennä lentokoneita, 5) Seilaa laivoja, 0) Lopeta ohjelma
5
Rauman telakka Oasis of the seas seilaa merten ääriin!
1) Luo uusi kulkuneuvo, 2) Listaa kulkuneuvot 3) Aja autoja, 4) Lennä lentokoneita, 5) Seilaa laivoja, 0) Lopeta ohjelma
0
Kiitos ohjelman käytöstä.

*** Esimerkkiajo päättyy ***
```

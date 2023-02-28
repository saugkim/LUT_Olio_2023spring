**Viikon 7 harjoitustehtävät**

Viikon 7 tehtävä on hieman laajempi kuin aiemmat tehtävät ja siitä voi saada 5 pisteen sijaan 7 pistettä. Nämä kaksi ylimääräistä pistettä lasketaan ylimääräisiksi kurssin arvostelussa, joten tällä voi paikata menetettyjä pisteitä tai varautua pahan päivän varalle.


Tehtävänä on rakentaa opintojärjestelmä tyyliin Sisu. Alla on luokkakaavio, jonka mukainen järjestelmä on tarkoitus rakentaa. Pääohjelmassa (App.java) luodaan Gifu-luokasta olio, jonka läpi pystytään luomaan uusia kursseja, uusia opiskelijoita ja lisäämään opiskelijoita kursseille. Tämän lisäksi on mahdollista tehdä erilaisia listauksia.

![image](https://user-images.githubusercontent.com/25344978/221795201-815f4ca4-fd90-4959-8a9b-c1f97e70e6f8.png)


Muutama huomio ohjelmasta: 

Vaikka kurssilla on suurin mahdollinen määrä opiskelijoita, ei tätä arvoa käytetä missään.

Kun opiskelija ilmoittautuu kurssille, arvosanan oletusarvo on -1. Kun kurssi arvostellaan, tämä arvosana muutetaan vastaamaan todellista kurssiarvosanaa.

Gifu-luokan voi toteuttaa niin, että se pitää sisällään kolme ArrayListiä: courses, students ja enrollments.

Metodit, kuten getCourses(), palauttavat ArrayListin sopivaa tyyppiä. Esimerkin tapauksessa paluuarvon tyyppi olisi ArrayList<Course>.

Enrollment-luokka pitää sisällään arvosanan, mutta myös viittauksen Student ja Course-olioihin. Käytännössä, kun Enrollment-olio luodaan, annetaan sille parametreinä Student ja Course oliot.

getEnrollments-metodit vertaavat enrollments-ArrayListin sisältöä, löytyykö sieltä esim. parametrinä saatua Student-olioita. Tarkistuksen voi tehdä suoraan, esim. Fi (enrollment.getStudent() == studentParameter)

Esim. Student-luokalla ei ole mitään metodia tulostamaan yhtään mitään. Tulostus on hoidettu pääohjelmassa, eli pääohjelma tulostaa Student-luokan implementoiman getInformation-rajapinnan sisällön käyttäjälle tarvittaessa.


1 piste  
Ohjelmassa on mahdollista luoda uusia kursseja ja lista niitä.

2 pistettä  
Ohjelmassa on mahdollista luoda uusia opiskelijoita ja lista niitä.

3 pistettä  
Luokkien rajapinnat toimivat, kuten luokkakaaviossa on määritelty. Tässä vaiheessa testataan metodeja addCourse, getCourse, listCourses, addStudent, getStudent listStudents. Tästä eteenpäin lisäpisteiden kohdalla testataan myös aina sitä vastaava rajapinta.

4 pistettä  
Ohjelmassa on mahdollista lisätä opiskelija X kurssille Y ja listata kurssilla olevat opiskelijat.

5 pistettä  
Ohjelmassa on mahdollista antaa kurssilla oleville opiskelijoille arvosana.

6 pistettä  
Ohjelmassa on mahdollista listata yksittäisen opiskelijat saamat arvosanat.

7 pistettä  
Ohjelmassa on mahdollista listata kaikkien kurssien kaikkien opiskelijoiden  arvosanat.


*** Esimerkkiajo ***

```
Tervetuloa Gifu-järjestelmään
Mille yliopistolle haluat ottaa järjestelmän käyttöön?
LUT
1) Luo uusi kurssi, 2) Luo uusi opiskelija, 3) Listaa kurssit, 4) Listaa opiskelijat, 5) Lisää opiskelija kurssille 6) Anna kurssiarvosanat, 7) Listaa kurssilla olevat opiskelijat, 8) Listaa opiskelijan arvosanat, 9) Listaa kaikkien kurssien kaikkien opiskelijoiden arvosanat, 0) Lopeta ohjelma
1
Anna kurssin nimi:
Olio-ohjelmointi
Anna kurssin ID:
CT9234232
Anna kurssin maksimi opiskelijamäärä:
300
1) Luo uusi kurssi, 2) Luo uusi opiskelija, 3) Listaa kurssit, 4) Listaa opiskelijat, 5) Lisää opiskelija kurssille 6) Anna kurssiarvosanat, 7) Listaa kurssilla olevat opiskelijat, 8) Listaa opiskelijan arvosanat, 9) Listaa kaikkien kurssien kaikkien opiskelijoiden arvosanat, 0) Lopeta ohjelma
1
Anna kurssin nimi:
Ohjelmoinnin perusteet
Anna kurssin ID:
CT464774
Anna kurssin maksimi opiskelijamäärä:
1000
1) Luo uusi kurssi, 2) Luo uusi opiskelija, 3) Listaa kurssit, 4) Listaa opiskelijat, 5) Lisää opiskelija kurssille 6) Anna kurssiarvosanat, 7) Listaa kurssilla olevat opiskelijat, 8) Listaa opiskelijan arvosanat, 9) Listaa kaikkien kurssien kaikkien opiskelijoiden arvosanat, 0) Lopeta ohjelma
1
Anna kurssin nimi:
Tietokannat
Anna kurssin ID:
CT343373
Anna kurssin maksimi opiskelijamäärä:
200
1) Luo uusi kurssi, 2) Luo uusi opiskelija, 3) Listaa kurssit, 4) Listaa opiskelijat, 5) Lisää opiskelija kurssille 6) Anna kurssiarvosanat, 7) Listaa kurssilla olevat opiskelijat, 8) Listaa opiskelijan arvosanat, 9) Listaa kaikkien kurssien kaikkien opiskelijoiden arvosanat, 0) Lopeta ohjelma
2
Anna opiskelijan nimi:
Matti Meikäläinen
Anna opiskelijan opiskelijanumero:
0045646
1) Luo uusi kurssi, 2) Luo uusi opiskelija, 3) Listaa kurssit, 4) Listaa opiskelijat, 5) Lisää opiskelija kurssille 6) Anna kurssiarvosanat, 7) Listaa kurssilla olevat opiskelijat, 8) Listaa opiskelijan arvosanat, 9) Listaa kaikkien kurssien kaikkien opiskelijoiden arvosanat, 0) Lopeta ohjelma
2
Anna opiskelijan nimi:
Paula Suomalainen
Anna opiskelijan opiskelijanumero:
00345334
1) Luo uusi kurssi, 2) Luo uusi opiskelija, 3) Listaa kurssit, 4) Listaa opiskelijat, 5) Lisää opiskelija kurssille 6) Anna kurssiarvosanat, 7) Listaa kurssilla olevat opiskelijat, 8) Listaa opiskelijan arvosanat, 9) Listaa kaikkien kurssien kaikkien opiskelijoiden arvosanat, 0) Lopeta ohjelma
2
Anna opiskelijan nimi:
John Doe
Anna opiskelijan opiskelijanumero:
023432252
1) Luo uusi kurssi, 2) Luo uusi opiskelija, 3) Listaa kurssit, 4) Listaa opiskelijat, 5) Lisää opiskelija kurssille 6) Anna kurssiarvosanat, 7) Listaa kurssilla olevat opiskelijat, 8) Listaa opiskelijan arvosanat, 9) Listaa kaikkien kurssien kaikkien opiskelijoiden arvosanat, 0) Lopeta ohjelma
2
Anna opiskelijan nimi:
Kim Kim
Anna opiskelijan opiskelijanumero:
0055667
1) Luo uusi kurssi, 2) Luo uusi opiskelija, 3) Listaa kurssit, 4) Listaa opiskelijat, 5) Lisää opiskelija kurssille 6) Anna kurssiarvosanat, 7) Listaa kurssilla olevat opiskelijat, 8) Listaa opiskelijan arvosanat, 9) Listaa kaikkien kurssien kaikkien opiskelijoiden arvosanat, 0) Lopeta ohjelma
3
0) CT9234232 Olio-ohjelmointi
1) CT464774 Ohjelmoinnin perusteet
2) CT343373 Tietokannat
1) Luo uusi kurssi, 2) Luo uusi opiskelija, 3) Listaa kurssit, 4) Listaa opiskelijat, 5) Lisää opiskelija kurssille 6) Anna kurssiarvosanat, 7) Listaa kurssilla olevat opiskelijat, 8) Listaa opiskelijan arvosanat, 9) Listaa kaikkien kurssien kaikkien opiskelijoiden arvosanat, 0) Lopeta ohjelma
4
0) 0045646 Matti Meikäläinen
1) 00345334 Paula Suomalainen
2) 023432252 John Doe
3) 0055667 Kim Kim
1) Luo uusi kurssi, 2) Luo uusi opiskelija, 3) Listaa kurssit, 4) Listaa opiskelijat, 5) Lisää opiskelija kurssille 6) Anna kurssiarvosanat, 7) Listaa kurssilla olevat opiskelijat, 8) Listaa opiskelijan arvosanat, 9) Listaa kaikkien kurssien kaikkien opiskelijoiden arvosanat, 0) Lopeta ohjelma
9
CT9234232 Olio-ohjelmointi
CT464774 Ohjelmoinnin perusteet
CT343373 Tietokannat
1) Luo uusi kurssi, 2) Luo uusi opiskelija, 3) Listaa kurssit, 4) Listaa opiskelijat, 5) Lisää opiskelija kurssille 6) Anna kurssiarvosanat, 7) Listaa kurssilla olevat opiskelijat, 8) Listaa opiskelijan arvosanat, 9) Listaa kaikkien kurssien kaikkien opiskelijoiden arvosanat, 0) Lopeta ohjelma
5
0) CT9234232 Olio-ohjelmointi
1) CT464774 Ohjelmoinnin perusteet
2) CT343373 Tietokannat
Mille kurssille haluat lisätä opiskelijan? Syötä kurssin numero:
0
0) 0045646 Matti Meikäläinen
1) 00345334 Paula Suomalainen
2) 023432252 John Doe
3) 0055667 Kim Kim
Minkä opiskelijan haluat lisätä kurssille? Syötä opiskelijan numero:
0
1) Luo uusi kurssi, 2) Luo uusi opiskelija, 3) Listaa kurssit, 4) Listaa opiskelijat, 5) Lisää opiskelija kurssille 6) Anna kurssiarvosanat, 7) Listaa kurssilla olevat opiskelijat, 8) Listaa opiskelijan arvosanat, 9) Listaa kaikkien kurssien kaikkien opiskelijoiden arvosanat, 0) Lopeta ohjelma
5
0) CT9234232 Olio-ohjelmointi
1) CT464774 Ohjelmoinnin perusteet
2) CT343373 Tietokannat
Mille kurssille haluat lisätä opiskelijan? Syötä kurssin numero:
1
0) 0045646 Matti Meikäläinen
1) 00345334 Paula Suomalainen
2) 023432252 John Doe
3) 0055667 Kim Kim
Minkä opiskelijan haluat lisätä kurssille? Syötä opiskelijan numero:
2
1) Luo uusi kurssi, 2) Luo uusi opiskelija, 3) Listaa kurssit, 4) Listaa opiskelijat, 5) Lisää opiskelija kurssille 6) Anna kurssiarvosanat, 7) Listaa kurssilla olevat opiskelijat, 8) Listaa opiskelijan arvosanat, 9) Listaa kaikkien kurssien kaikkien opiskelijoiden arvosanat, 0) Lopeta ohjelma
5
0) CT9234232 Olio-ohjelmointi
1) CT464774 Ohjelmoinnin perusteet
2) CT343373 Tietokannat
Mille kurssille haluat lisätä opiskelijan? Syötä kurssin numero:
1
0) 0045646 Matti Meikäläinen
1) 00345334 Paula Suomalainen
2) 023432252 John Doe
3) 0055667 Kim Kim
Minkä opiskelijan haluat lisätä kurssille? Syötä opiskelijan numero:
0
1) Luo uusi kurssi, 2) Luo uusi opiskelija, 3) Listaa kurssit, 4) Listaa opiskelijat, 5) Lisää opiskelija kurssille 6) Anna kurssiarvosanat, 7) Listaa kurssilla olevat opiskelijat, 8) Listaa opiskelijan arvosanat, 9) Listaa kaikkien kurssien kaikkien opiskelijoiden arvosanat, 0) Lopeta ohjelma
5
0) CT9234232 Olio-ohjelmointi
1) CT464774 Ohjelmoinnin perusteet
2) CT343373 Tietokannat
Mille kurssille haluat lisätä opiskelijan? Syötä kurssin numero:
1
0) 0045646 Matti Meikäläinen
1) 00345334 Paula Suomalainen
2) 023432252 John Doe
3) 0055667 Kim Kim
Minkä opiskelijan haluat lisätä kurssille? Syötä opiskelijan numero:
3
1) Luo uusi kurssi, 2) Luo uusi opiskelija, 3) Listaa kurssit, 4) Listaa opiskelijat, 5) Lisää opiskelija kurssille 6) Anna kurssiarvosanat, 7) Listaa kurssilla olevat opiskelijat, 8) Listaa opiskelijan arvosanat, 9) Listaa kaikkien kurssien kaikkien opiskelijoiden arvosanat, 0) Lopeta ohjelma
5
0) CT9234232 Olio-ohjelmointi
1) CT464774 Ohjelmoinnin perusteet
2) CT343373 Tietokannat
Mille kurssille haluat lisätä opiskelijan? Syötä kurssin numero:
2
0) 0045646 Matti Meikäläinen
1) 00345334 Paula Suomalainen
2) 023432252 John Doe
3) 0055667 Kim Kim
Minkä opiskelijan haluat lisätä kurssille? Syötä opiskelijan numero:
0
1) Luo uusi kurssi, 2) Luo uusi opiskelija, 3) Listaa kurssit, 4) Listaa opiskelijat, 5) Lisää opiskelija kurssille 6) Anna kurssiarvosanat, 7) Listaa kurssilla olevat opiskelijat, 8) Listaa opiskelijan arvosanat, 9) Listaa kaikkien kurssien kaikkien opiskelijoiden arvosanat, 0) Lopeta ohjelma
9
CT9234232 Olio-ohjelmointi
0045646 Matti Meikäläinen, arvosana: -1
CT464774 Ohjelmoinnin perusteet
023432252 John Doe, arvosana: -1
0045646 Matti Meikäläinen, arvosana: -1
0055667 Kim Kim, arvosana: -1
CT343373 Tietokannat
0045646 Matti Meikäläinen, arvosana: -1
1) Luo uusi kurssi, 2) Luo uusi opiskelija, 3) Listaa kurssit, 4) Listaa opiskelijat, 5) Lisää opiskelija kurssille 6) Anna kurssiarvosanat, 7) Listaa kurssilla olevat opiskelijat, 8) Listaa opiskelijan arvosanat, 9) Listaa kaikkien kurssien kaikkien opiskelijoiden arvosanat, 0) Lopeta ohjelma
6
0) CT9234232 Olio-ohjelmointi
1) CT464774 Ohjelmoinnin perusteet
2) CT343373 Tietokannat
Minkä kurssin haluat arvostella? Syötä kurssin numero:
1
Anna arvosana opiskelijalle 023432252 John Doe
5
Anna arvosana opiskelijalle 0045646 Matti Meikäläinen
3
Anna arvosana opiskelijalle 0055667 Kim Kim
4
1) Luo uusi kurssi, 2) Luo uusi opiskelija, 3) Listaa kurssit, 4) Listaa opiskelijat, 5) Lisää opiskelija kurssille 6) Anna kurssiarvosanat, 7) Listaa kurssilla olevat opiskelijat, 8) Listaa opiskelijan arvosanat, 9) Listaa kaikkien kurssien kaikkien opiskelijoiden arvosanat, 0) Lopeta ohjelma
7
0) CT9234232 Olio-ohjelmointi
1) CT464774 Ohjelmoinnin perusteet
2) CT343373 Tietokannat
Minkä kurssin opiskelijat haluat listata? Syötä kurssin numero:
2
0045646 Matti Meikäläinen, arvosana: -1
1) Luo uusi kurssi, 2) Luo uusi opiskelija, 3) Listaa kurssit, 4) Listaa opiskelijat, 5) Lisää opiskelija kurssille 6) Anna kurssiarvosanat, 7) Listaa kurssilla olevat opiskelijat, 8) Listaa opiskelijan arvosanat, 9) Listaa kaikkien kurssien kaikkien opiskelijoiden arvosanat, 0) Lopeta ohjelma
8
0) 0045646 Matti Meikäläinen
1) 00345334 Paula Suomalainen
2) 023432252 John Doe
3) 0055667 Kim Kim
Minkä opiskelijan arvosanat haluat listata? Syötä opiskelijan numero:
3
Opiskelijan 0055667 Kim Kim arvosanat:
CT464774 Ohjelmoinnin perusteet, arvosana: 4
1) Luo uusi kurssi, 2) Luo uusi opiskelija, 3) Listaa kurssit, 4) Listaa opiskelijat, 5) Lisää opiskelija kurssille 6) Anna kurssiarvosanat, 7) Listaa kurssilla olevat opiskelijat, 8) Listaa opiskelijan arvosanat, 9) Listaa kaikkien kurssien kaikkien opiskelijoiden arvosanat, 0) Lopeta ohjelma
9
CT9234232 Olio-ohjelmointi
0045646 Matti Meikäläinen, arvosana: -1
CT464774 Ohjelmoinnin perusteet
023432252 John Doe, arvosana: 5
0045646 Matti Meikäläinen, arvosana: 3
0055667 Kim Kim, arvosana: 4
CT343373 Tietokannat
0045646 Matti Meikäläinen, arvosana: -1
1) Luo uusi kurssi, 2) Luo uusi opiskelija, 3) Listaa kurssit, 4) Listaa opiskelijat, 5) Lisää opiskelija kurssille 6) Anna kurssiarvosanat, 7) Listaa kurssilla olevat opiskelijat, 8) Listaa opiskelijan arvosanat, 9) Listaa kaikkien kurssien kaikkien opiskelijoiden arvosanat, 0) Lopeta ohjelma
8
0) 0045646 Matti Meikäläinen
1) 00345334 Paula Suomalainen
2) 023432252 John Doe
3) 0055667 Kim Kim
Minkä opiskelijan arvosanat haluat listata? Syötä opiskelijan numero:
0
Opiskelijan 0045646 Matti Meikäläinen arvosanat:
CT9234232 Olio-ohjelmointi, arvosana: -1
CT464774 Ohjelmoinnin perusteet, arvosana: 3
CT343373 Tietokannat, arvosana: -1
1) Luo uusi kurssi, 2) Luo uusi opiskelija, 3) Listaa kurssit, 4) Listaa opiskelijat, 5) Lisää opiskelija kurssille 6) Anna kurssiarvosanat, 7) Listaa kurssilla olevat opiskelijat, 8) Listaa opiskelijan arvosanat, 9) Listaa kaikkien kurssien kaikkien opiskelijoiden arvosanat, 0) Lopeta ohjelma
0
Kiitos ohjelman käytöstä.
```
*** Esimerkkiajo päättyy ***

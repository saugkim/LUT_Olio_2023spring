Android studio: Electric Eel  
Virtual Device: API 29, Android Q  

UI
Main activity + 3 fragments view (one fragment has no content) + one bottom fixed fragment
Tool: Android studio (Electric Eel 2022.1.1 Patch 1)

Test device: Virtual device, Android 10(Q) API 29

Source code: repository at week11/Ostos/...


**Views (3 different views in One activity)**    

|HOME|LIST|ADD|
|-|-|-|
|<kbd> <img src="https://user-images.githubusercontent.com/25344978/229900104-bcf5fc8b-8706-47b5-9983-e5757a313f95.png" width=120> </kbd>|<kbd> <img src="https://user-images.githubusercontent.com/25344978/229900061-be5b175e-ce8a-4f6a-8a46-74db8a6905de.png" width=120> </kbd>|<kbd> <img src="https://user-images.githubusercontent.com/25344978/229900085-3be039e1-5e50-44ab-8a03-48edc03fbd5e.png" width=120> </kbd>|


**Demo clip**


<br>
<br>

**Implemented features**  

```
Listaan uutta asiaa lisätessä voi sen merkitä supertärkeäksi
Ohjelma käyttää vähintään kahta fragmenttia
Ohjelmassa on vain yksi Activity
Ohjelmassa on käytössä TabLayout
Ohjelmassa on erillinen Fragment, joka näyttää tärkeiksi merkityt asiat

1. Add new shopping item in item managing activity
2. Show list using recyclerview
3. Remove selected item from main(list view) and edit screen - without warning
4. Edit selected item in edit screen (item managing activity)
5. Sort list by item name(toggling descending and ascending order) and by date(from old to new) 
```

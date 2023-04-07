Tool: Android studio (Electric Eel 2022.1.1 Patch 1)

Test device: Virtual device, Android 10(Q) API 29

Source code: repository at week11/Ostos/...


**Views (Activities)**    

|ManageActivity(new)|MainActivity|ManageActivity(edit)|
|-|-|-|
|<kbd> <img src="https://user-images.githubusercontent.com/25344978/229900104-bcf5fc8b-8706-47b5-9983-e5757a313f95.png" width=120> </kbd>|<kbd> <img src="https://user-images.githubusercontent.com/25344978/229900061-be5b175e-ce8a-4f6a-8a46-74db8a6905de.png" width=120> </kbd>|<kbd> <img src="https://user-images.githubusercontent.com/25344978/229900085-3be039e1-5e50-44ab-8a03-48edc03fbd5e.png" width=120> </kbd>|


**Demo clip**

https://user-images.githubusercontent.com/25344978/229900847-1378a950-99c2-4298-8ae8-41676eacd29c.mp4


<br>
<br>

**Implemented features**  

```
1. Add new shopping item in item managing activity
2. Show list using recyclerview
3. Remove selected item from main(list view) and edit screen - without warning
4. Edit selected item in edit screen (item managing activity)
5. Sort list by item name(toggling descending and ascending order) and by date(from old to new) 

* I am not sure that I am supposed to implement with one activity or not, I tried to put all first but UI was getting busy and ugly...
* date picker and additional info are optional feature:  
* today(current day) is default date-time and info is null, when there is no user input. 
* date can be modified when edit the shopping item later, after date modification, original date is not available.
* when user changed item name or item info, but not the date, date remains same as before (not automatically changed as a date of editing, it can be easily implemented though)
* sorting by date can be based on either original date or edited date
* I am bit lost with the concept of the time in this task
* I tried to figure out the meaning of aika(date of shopping?), I added kind of date-time information as a string to sort items by time and name. 
```

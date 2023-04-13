Tool: Android studio (Electric Eel 2022.1.1 Patch 1)

Test device: Virtual device, Android 10(Q) API 29

Main activity + 3 fragments view + one bottom fixed fragment

Source code: repository at week12/Ostos2/...


**Views (3 different views in One activity)**    

|fragment HOME|fragment LIST|fragment ADD|
|-|-|-|
|<kbd> <img src="https://user-images.githubusercontent.com/25344978/231813643-187853c9-3c87-4658-9e15-10235c3f1b04.png" width=120> </kbd>|<kbd> <img src="https://user-images.githubusercontent.com/25344978/231813699-40b6598c-c754-411c-bd5b-0e1850f6f0df.png" width=120> </kbd>|<kbd> <img src="https://user-images.githubusercontent.com/25344978/231813736-fa186f6d-cc65-4fab-a3e8-8c34e4a980d5.png" width=120> </kbd>|


**Demo clip**

https://user-images.githubusercontent.com/25344978/231814589-8623fac0-adc1-44c9-8443-1543fe250c7c.mp4


<br>
<br>

**Implemented features**  

```
1. Item has attribute of boolean, important or not when adding
2. Two fragments are used (home fragment is empty) to add and list
3. MainActivity only
4. LabLayout and ViewPager2 are used to navigate different view
5. One fragment is included on bottom to show important items only (scroll-view in case of many items are important, recyclerview is not implemented on bottom fragment)

* Not implemented modify or remove item
```

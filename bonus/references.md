reference: 

chatbot (AI)  
https://www.youtube.com/watch?v=7_Cc36c7EW0

Jun 4, 2021  #androidprojects #chatbot #geeksforgeeks

In this video, we're going to discuss how to create a Chatbot Application in Android. In this Chatbot Application, the users will be able to ask some common questions to the bot and the bot will answer the questions. We'll be using the BrainShop API to create this application. Now, let's get started.

https://www.geeksforgeeks.org/how-to-create-a-chatbot-in-android-with-brainshop-api/

https://github.com/ChinmayMunje/GFG-Bot

```
dependency:   
implementation ‘com.android.volley:volley:1.1.1’
 
<!--permissions for internet-->  
<uses-permission android:name="android.permission.INTERNET" />  
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />  
```



https://stackoverflow.com/questions/44912239/automatically-scroll-to-bottom-of-recyclerview

```
LinearLayoutManager mLinearLayoutManager = new LinearLayoutManager(Application.Context);
mLinearLayoutManager.setStackFromEnd(true); 
mRecyclerView.SetLayoutManager(mLinearLayoutManager);
mRecyclerView.scrollToPosition(someList.Count - 1);
//smoothScrollToPosition 
```

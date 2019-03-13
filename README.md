# Android-study
This repo holds some example code from android that I learned in class

#### [CallTest](https://github.com/mathors/Android-study/tree/master/CallTest)

Call instances of other components through buttons, such as jump to another interface, web site, or make a phone call

#### [PassValue](https://github.com/mathors/Android-study/tree/master/PassValue)

This example shows several ways in which data can be transferred between multiple interfaces

#### [ActivityLifeCycle](https://github.com/mathors/Android-study/tree/master/ActivityLifeCycle)

An example shows the transformation during the Android application life cycle

There are four modes of Activity startup:standard,singleTop,singleTask,singleInstance 

We can set the launchMode directly in the `<activity>` of AndroidManifest.xml

```java
<activity
            android:name=".SingleTaskActivity"
            android:label="singleTask launchMode"
            android:launchMode="singleTask">
```



- **Standard**: It is the default startup mode for an Activity.Each time, a new Activity is started at the top of the stack
- **singleTop**: When the started Activity is already at the top of the Activity stack, it is used directly
- **singleTask**: Starting the Activity checks the stack for the presence of the Activity, and if so, simply pushes all activities above the Activity off the stack
- **singleInstance**: If another Activity is called from this kind of Activity, a new Task would be automatically created to place that new Activity. Likewise, if singleInstance Activity is called, new Task would be created to place the Activity. 

#### [ActivityLifeCycle](https://github.com/mathors/Android-study/tree/master/ClickListener)

There are three ways to bind a Button

#### [Radio&CheckBox](https://github.com/mathors/Android-study/tree/master/Radio&CheckBox)

Use instances of radio and multiple checkboxes, including event listening

# KRouter

#### Description
A simple router for modular and componentization


## 添加新模块流程

### 1、新建模块
### 2、在Router中继承Service，定义暴露的函数接口ModuleService
    ```
        interface ModuleService : Service {
            fun toXXX(ctx: Context)
        }

    ```
### 3、在module中实现ModuleApp,ModuleServiceImpl，在ModuleApp中注入ModuleServiceImpl
    ```
        //导入其他子module暴露的接口
        internal val topicService by lazy(NONE) { getService<TopicService>() }

        //注意，这里需要用internal ，避免被其他module直接引用
       internal object ModuleServiceImpl : ModuleService {
            override fun toXXX(ctx: Context) {
            ...
            }
        }

        class ModuleApp : Application() {
            override fun onCreate() {
                super.onCreate()
                injectService<ModuleService>(ModuleServiceImpl)
            }
        }

    ```
### 4、在app中通过反射添加ModuleApp
    ``` "com.xxx.xxx.ModuleApp".newInstance() ```


### 5、在module的build中，引用kRouter、common模块

## 如果想要单独运行

### 6、在config添加配置，在module中判断控制运行类型，报名，引入包
```
    def isMainModule = isRuningModule
    if (isMainModule)
        apply plugin: 'com.android.application'
    else
        apply plugin: 'com.android.library'
...

    defaultConfig {
        if (isMainModule)
            applicationId "com.xxx.xxx"
        ...
    }
...
    if (isMainModule) {
        implementation project(path: ':module-a')
        implementation project(path: ':module-b')
    }

```

### 7、在debug文件夹下添加DebugModuleApp 和 AndroidManifest，添加启动activity
```
class DebugModuleApp :Application(){

    private val modules = listOf(
        "com.xxx.xxx.XXXApp".newInstance(),
        "com.xxx.xxx.XXXApp".newInstance(),
    )

    override fun onCreate() {
        super.onCreate()
        modules.forEach {
            require(it is Application)
            it.onCreate()
        }
    }
}


    <application
        android:name=".DebugModuleApp"
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:supportsRtl="true"
        tools:replace="android:name"
        android:theme="@style/AppTheme">

        <activity
            android:name=".ModuleActivity"
            android:theme="@style/AppTheme">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />
                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>


```

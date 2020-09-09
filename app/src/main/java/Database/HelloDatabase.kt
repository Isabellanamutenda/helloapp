package Database

class HelloDatabase {
    class HelloApp: Application() {
        override fun onCreate() {
            super.onCreate()
            Stetho.initializeWithDefaults(this)
        }
    }
}
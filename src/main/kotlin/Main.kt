package org.example
import org.freedesktop.dbus.connections.impl.DBusConnection
import org.freedesktop.dbus.connections.impl.DBusConnectionBuilder

fun main() = Main().run()

class Main {
    fun run() {
        val conn: DBusConnection = DBusConnectionBuilder.forSessionBus().build()
        conn.connect()

        println("Connected to DBUS")
    }
}
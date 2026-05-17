package org.example
import org.example.dbus.NetworkManager
import org.freedesktop.dbus.connections.impl.DBusConnection
import org.freedesktop.dbus.connections.impl.DBusConnectionBuilder

fun main() = Main().run()

class Main {
    fun run() {
        val conn: DBusConnection = DBusConnectionBuilder.forSystemBus().build()
        conn.connect()
        println("Connected to DBUS")
        val nm = conn.getRemoteObject(
            "org.freedesktop.NetworkManager",
            "/org/freedesktop/NetworkManager",
            NetworkManager::class.java
        )

        val devices = nm.GetAllDevices()

        devices.forEach { println(it) }
        conn.disconnect()
        println("DBUS Disconnected")
    }
}
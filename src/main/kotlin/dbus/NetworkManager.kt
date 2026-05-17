package org.example.dbus

import org.freedesktop.dbus.ObjectPath
import org.freedesktop.dbus.interfaces.DBusInterface

interface NetworkManager: DBusInterface{
    fun GetAllDevices(): List<ObjectPath>
}
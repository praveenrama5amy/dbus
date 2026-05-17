package org.example.dbus

import org.freedesktop.dbus.DBusPath
import org.freedesktop.dbus.ObjectPath
import org.freedesktop.dbus.annotations.DBusInterfaceName
import org.freedesktop.dbus.interfaces.DBusInterface

@DBusInterfaceName("org.freedesktop.NetworkManager")
interface NetworkManager: DBusInterface{
    fun GetAllDevices(): List<DBusPath>
}
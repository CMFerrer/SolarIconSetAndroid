package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearGroup
import com.chiksmedina.solar.linear.electronicdevices.Airbuds
import com.chiksmedina.solar.linear.electronicdevices.AirbudsCase
import com.chiksmedina.solar.linear.electronicdevices.AirbudsCaseCharge
import com.chiksmedina.solar.linear.electronicdevices.AirbudsCaseMinimalistic
import com.chiksmedina.solar.linear.electronicdevices.AirbudsCaseOpen
import com.chiksmedina.solar.linear.electronicdevices.AirbudsCharge
import com.chiksmedina.solar.linear.electronicdevices.AirbudsCheck
import com.chiksmedina.solar.linear.electronicdevices.AirbudsLeft
import com.chiksmedina.solar.linear.electronicdevices.AirbudsRemove
import com.chiksmedina.solar.linear.electronicdevices.AirbudsRight
import com.chiksmedina.solar.linear.electronicdevices.Bluetooth
import com.chiksmedina.solar.linear.electronicdevices.BluetoothCircle
import com.chiksmedina.solar.linear.electronicdevices.BluetoothSquare
import com.chiksmedina.solar.linear.electronicdevices.BluetoothWave
import com.chiksmedina.solar.linear.electronicdevices.Boombox
import com.chiksmedina.solar.linear.electronicdevices.Cassette
import com.chiksmedina.solar.linear.electronicdevices.Cassette2
import com.chiksmedina.solar.linear.electronicdevices.CloudStorage
import com.chiksmedina.solar.linear.electronicdevices.Cpu
import com.chiksmedina.solar.linear.electronicdevices.CpuBolt
import com.chiksmedina.solar.linear.electronicdevices.Devices
import com.chiksmedina.solar.linear.electronicdevices.Diskette
import com.chiksmedina.solar.linear.electronicdevices.Display
import com.chiksmedina.solar.linear.electronicdevices.FlashDrive
import com.chiksmedina.solar.linear.electronicdevices.Gameboy
import com.chiksmedina.solar.linear.electronicdevices.Gamepad
import com.chiksmedina.solar.linear.electronicdevices.GamepadCharge
import com.chiksmedina.solar.linear.electronicdevices.GamepadMinimalistic
import com.chiksmedina.solar.linear.electronicdevices.GamepadNoCharge
import com.chiksmedina.solar.linear.electronicdevices.GamepadOld
import com.chiksmedina.solar.linear.electronicdevices.HeadphonesRound
import com.chiksmedina.solar.linear.electronicdevices.HeadphonesRoundSound
import com.chiksmedina.solar.linear.electronicdevices.HeadphonesSquare
import com.chiksmedina.solar.linear.electronicdevices.HeadphonesSquareSound
import com.chiksmedina.solar.linear.electronicdevices.Iphone
import com.chiksmedina.solar.linear.electronicdevices.Keyboard
import com.chiksmedina.solar.linear.electronicdevices.Laptop
import com.chiksmedina.solar.linear.electronicdevices.Laptop2
import com.chiksmedina.solar.linear.electronicdevices.Laptop3
import com.chiksmedina.solar.linear.electronicdevices.LaptopMinimalistic
import com.chiksmedina.solar.linear.electronicdevices.Lightbulb
import com.chiksmedina.solar.linear.electronicdevices.LightbulbBolt
import com.chiksmedina.solar.linear.electronicdevices.LightbulbMinimalistic
import com.chiksmedina.solar.linear.electronicdevices.Lightning
import com.chiksmedina.solar.linear.electronicdevices.Monitor
import com.chiksmedina.solar.linear.electronicdevices.MonitorCamera
import com.chiksmedina.solar.linear.electronicdevices.MonitorSmartphone
import com.chiksmedina.solar.linear.electronicdevices.Mouse
import com.chiksmedina.solar.linear.electronicdevices.MouseCircle
import com.chiksmedina.solar.linear.electronicdevices.MouseMinimalistic
import com.chiksmedina.solar.linear.electronicdevices.PlugCircle
import com.chiksmedina.solar.linear.electronicdevices.Printer
import com.chiksmedina.solar.linear.electronicdevices.Printer2
import com.chiksmedina.solar.linear.electronicdevices.PrinterMinimalistic
import com.chiksmedina.solar.linear.electronicdevices.Projector
import com.chiksmedina.solar.linear.electronicdevices.Radio
import com.chiksmedina.solar.linear.electronicdevices.RadioMinimalistic
import com.chiksmedina.solar.linear.electronicdevices.SdCard
import com.chiksmedina.solar.linear.electronicdevices.Server
import com.chiksmedina.solar.linear.electronicdevices.Server2
import com.chiksmedina.solar.linear.electronicdevices.ServerMinimalistic
import com.chiksmedina.solar.linear.electronicdevices.ServerPath
import com.chiksmedina.solar.linear.electronicdevices.ServerSquare
import com.chiksmedina.solar.linear.electronicdevices.ServerSquareCloud
import com.chiksmedina.solar.linear.electronicdevices.ServerSquareUpdate
import com.chiksmedina.solar.linear.electronicdevices.SimCard
import com.chiksmedina.solar.linear.electronicdevices.SimCardMinimalistic
import com.chiksmedina.solar.linear.electronicdevices.SimCards
import com.chiksmedina.solar.linear.electronicdevices.SmartSpeaker
import com.chiksmedina.solar.linear.electronicdevices.SmartSpeaker2
import com.chiksmedina.solar.linear.electronicdevices.SmartSpeakerMinimalistic
import com.chiksmedina.solar.linear.electronicdevices.Smartphone
import com.chiksmedina.solar.linear.electronicdevices.Smartphone2
import com.chiksmedina.solar.linear.electronicdevices.SmartphoneRotate2
import com.chiksmedina.solar.linear.electronicdevices.SmartphoneRotateAngle
import com.chiksmedina.solar.linear.electronicdevices.SmartphoneRotateOrientation
import com.chiksmedina.solar.linear.electronicdevices.SmartphoneUpdate
import com.chiksmedina.solar.linear.electronicdevices.SmartphoneVibration
import com.chiksmedina.solar.linear.electronicdevices.Socket
import com.chiksmedina.solar.linear.electronicdevices.SsdRound
import com.chiksmedina.solar.linear.electronicdevices.SsdSquare
import com.chiksmedina.solar.linear.electronicdevices.Tablet
import com.chiksmedina.solar.linear.electronicdevices.Telescope
import com.chiksmedina.solar.linear.electronicdevices.Turntable
import com.chiksmedina.solar.linear.electronicdevices.TurntableMinimalistic
import com.chiksmedina.solar.linear.electronicdevices.TurntableMusicNote
import com.chiksmedina.solar.linear.electronicdevices.Tv
import com.chiksmedina.solar.linear.electronicdevices.Weigher
import com.chiksmedina.solar.linear.electronicdevices.WirelessCharge
import kotlin.collections.List as ____KtList

public object ElectronicDevicesGroup

public val LinearGroup.ElectronicDevices: ElectronicDevicesGroup
  get() = ElectronicDevicesGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ElectronicDevicesGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Airbuds, AirbudsCase, AirbudsCaseCharge, AirbudsCaseMinimalistic,
        AirbudsCaseOpen, AirbudsCharge, AirbudsCheck, AirbudsLeft, AirbudsRemove, AirbudsRight,
        Bluetooth, BluetoothCircle, BluetoothSquare, BluetoothWave, Boombox, Cassette, Cassette2,
        CloudStorage, Cpu, CpuBolt, Devices, Diskette, Display, FlashDrive, Gameboy, Gamepad,
        GamepadCharge, GamepadMinimalistic, GamepadNoCharge, GamepadOld, HeadphonesRound,
        HeadphonesRoundSound, HeadphonesSquare, HeadphonesSquareSound, Iphone, Keyboard, Laptop,
        Laptop2, Laptop3, LaptopMinimalistic, Lightbulb, LightbulbBolt, LightbulbMinimalistic,
        Lightning, Monitor, MonitorCamera, MonitorSmartphone, Mouse, MouseCircle, MouseMinimalistic,
        PlugCircle, Printer, Printer2, PrinterMinimalistic, Projector, Radio, RadioMinimalistic,
        SdCard, Server, Server2, ServerMinimalistic, ServerPath, ServerSquare, ServerSquareCloud,
        ServerSquareUpdate, SimCard, SimCards, SimCardMinimalistic, Smartphone, Smartphone2,
        SmartphoneRotate2, SmartphoneRotateAngle, SmartphoneRotateOrientation, SmartphoneUpdate,
        SmartphoneVibration, SmartSpeaker, SmartSpeaker2, SmartSpeakerMinimalistic, Socket,
        SsdRound, SsdSquare, Tablet, Telescope, Turntable, TurntableMinimalistic,
        TurntableMusicNote, Tv, Weigher, WirelessCharge)
    return __AllIcons!!
  }

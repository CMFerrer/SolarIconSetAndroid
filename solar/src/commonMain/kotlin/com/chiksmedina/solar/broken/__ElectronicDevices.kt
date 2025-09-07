package com.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BrokenSolar
import com.chiksmedina.solar.broken.electronicdevices.Airbuds
import com.chiksmedina.solar.broken.electronicdevices.AirbudsCase
import com.chiksmedina.solar.broken.electronicdevices.AirbudsCaseCharge
import com.chiksmedina.solar.broken.electronicdevices.AirbudsCaseMinimalistic
import com.chiksmedina.solar.broken.electronicdevices.AirbudsCaseOpen
import com.chiksmedina.solar.broken.electronicdevices.AirbudsCharge
import com.chiksmedina.solar.broken.electronicdevices.AirbudsCheck
import com.chiksmedina.solar.broken.electronicdevices.AirbudsLeft
import com.chiksmedina.solar.broken.electronicdevices.AirbudsRemove
import com.chiksmedina.solar.broken.electronicdevices.AirbudsRight
import com.chiksmedina.solar.broken.electronicdevices.Bluetooth
import com.chiksmedina.solar.broken.electronicdevices.BluetoothCircle
import com.chiksmedina.solar.broken.electronicdevices.BluetoothSquare
import com.chiksmedina.solar.broken.electronicdevices.BluetoothWave
import com.chiksmedina.solar.broken.electronicdevices.Boombox
import com.chiksmedina.solar.broken.electronicdevices.Cassette
import com.chiksmedina.solar.broken.electronicdevices.Cassette2
import com.chiksmedina.solar.broken.electronicdevices.CloudStorage
import com.chiksmedina.solar.broken.electronicdevices.Cpu
import com.chiksmedina.solar.broken.electronicdevices.CpuBolt
import com.chiksmedina.solar.broken.electronicdevices.Devices
import com.chiksmedina.solar.broken.electronicdevices.Diskette
import com.chiksmedina.solar.broken.electronicdevices.Display
import com.chiksmedina.solar.broken.electronicdevices.FlashDrive
import com.chiksmedina.solar.broken.electronicdevices.Gameboy
import com.chiksmedina.solar.broken.electronicdevices.Gamepad
import com.chiksmedina.solar.broken.electronicdevices.GamepadCharge
import com.chiksmedina.solar.broken.electronicdevices.GamepadMinimalistic
import com.chiksmedina.solar.broken.electronicdevices.GamepadNoCharge
import com.chiksmedina.solar.broken.electronicdevices.GamepadOld
import com.chiksmedina.solar.broken.electronicdevices.HeadphonesRound
import com.chiksmedina.solar.broken.electronicdevices.HeadphonesRoundSound
import com.chiksmedina.solar.broken.electronicdevices.HeadphonesSquare
import com.chiksmedina.solar.broken.electronicdevices.HeadphonesSquareSound
import com.chiksmedina.solar.broken.electronicdevices.Iphone
import com.chiksmedina.solar.broken.electronicdevices.Keyboard
import com.chiksmedina.solar.broken.electronicdevices.Laptop
import com.chiksmedina.solar.broken.electronicdevices.Laptop2
import com.chiksmedina.solar.broken.electronicdevices.Laptop3
import com.chiksmedina.solar.broken.electronicdevices.LaptopMinimalistic
import com.chiksmedina.solar.broken.electronicdevices.Lightbulb
import com.chiksmedina.solar.broken.electronicdevices.LightbulbBolt
import com.chiksmedina.solar.broken.electronicdevices.LightbulbMinimalistic
import com.chiksmedina.solar.broken.electronicdevices.Lightning
import com.chiksmedina.solar.broken.electronicdevices.Monitor
import com.chiksmedina.solar.broken.electronicdevices.MonitorCamera
import com.chiksmedina.solar.broken.electronicdevices.MonitorSmartphone
import com.chiksmedina.solar.broken.electronicdevices.Mouse
import com.chiksmedina.solar.broken.electronicdevices.MouseCircle
import com.chiksmedina.solar.broken.electronicdevices.MouseMinimalistic
import com.chiksmedina.solar.broken.electronicdevices.PlugCircle
import com.chiksmedina.solar.broken.electronicdevices.Printer
import com.chiksmedina.solar.broken.electronicdevices.Printer2
import com.chiksmedina.solar.broken.electronicdevices.PrinterMinimalistic
import com.chiksmedina.solar.broken.electronicdevices.Projector
import com.chiksmedina.solar.broken.electronicdevices.Radio
import com.chiksmedina.solar.broken.electronicdevices.RadioMinimalistic
import com.chiksmedina.solar.broken.electronicdevices.SdCard
import com.chiksmedina.solar.broken.electronicdevices.Server
import com.chiksmedina.solar.broken.electronicdevices.Server2
import com.chiksmedina.solar.broken.electronicdevices.ServerMinimalistic
import com.chiksmedina.solar.broken.electronicdevices.ServerPath
import com.chiksmedina.solar.broken.electronicdevices.ServerSquare
import com.chiksmedina.solar.broken.electronicdevices.ServerSquareCloud
import com.chiksmedina.solar.broken.electronicdevices.ServerSquareUpdate
import com.chiksmedina.solar.broken.electronicdevices.SimCard
import com.chiksmedina.solar.broken.electronicdevices.SimCardMinimalistic
import com.chiksmedina.solar.broken.electronicdevices.SimCards
import com.chiksmedina.solar.broken.electronicdevices.SmartSpeaker
import com.chiksmedina.solar.broken.electronicdevices.SmartSpeaker2
import com.chiksmedina.solar.broken.electronicdevices.SmartSpeakerMinimalistic
import com.chiksmedina.solar.broken.electronicdevices.Smartphone
import com.chiksmedina.solar.broken.electronicdevices.Smartphone2
import com.chiksmedina.solar.broken.electronicdevices.SmartphoneRotate2
import com.chiksmedina.solar.broken.electronicdevices.SmartphoneRotateAngle
import com.chiksmedina.solar.broken.electronicdevices.SmartphoneRotateOrientation
import com.chiksmedina.solar.broken.electronicdevices.SmartphoneUpdate
import com.chiksmedina.solar.broken.electronicdevices.SmartphoneVibration
import com.chiksmedina.solar.broken.electronicdevices.Socket
import com.chiksmedina.solar.broken.electronicdevices.SsdRound
import com.chiksmedina.solar.broken.electronicdevices.SsdSquare
import com.chiksmedina.solar.broken.electronicdevices.Tablet
import com.chiksmedina.solar.broken.electronicdevices.Telescope
import com.chiksmedina.solar.broken.electronicdevices.Turntable
import com.chiksmedina.solar.broken.electronicdevices.TurntableMinimalistic
import com.chiksmedina.solar.broken.electronicdevices.TurntableMusicNote
import com.chiksmedina.solar.broken.electronicdevices.Tv
import com.chiksmedina.solar.broken.electronicdevices.Weigher
import com.chiksmedina.solar.broken.electronicdevices.WirelessCharge
import kotlin.collections.List as KtList

object ElectronicDevicesGroup

val BrokenSolar.ElectronicDevices: ElectronicDevicesGroup
    get() = ElectronicDevicesGroup

private var _AllIcons: KtList<ImageVector>? = null

val ElectronicDevicesGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            Airbuds,
            AirbudsCase,
            AirbudsCaseCharge,
            AirbudsCaseMinimalistic,
            AirbudsCaseOpen,
            AirbudsCharge,
            AirbudsCheck,
            AirbudsLeft,
            AirbudsRemove,
            AirbudsRight,
            Bluetooth,
            BluetoothCircle,
            BluetoothSquare,
            BluetoothWave,
            Boombox,
            Cassette,
            Cassette2,
            CloudStorage,
            Cpu,
            CpuBolt,
            Devices,
            Diskette,
            Display,
            FlashDrive,
            Gameboy,
            Gamepad,
            GamepadCharge,
            GamepadMinimalistic,
            GamepadNoCharge,
            GamepadOld,
            HeadphonesRound,
            HeadphonesRoundSound,
            HeadphonesSquare,
            HeadphonesSquareSound,
            Iphone,
            Keyboard,
            Laptop,
            Laptop2,
            Laptop3,
            LaptopMinimalistic,
            Lightbulb,
            LightbulbBolt,
            LightbulbMinimalistic,
            Lightning,
            Monitor,
            MonitorCamera,
            MonitorSmartphone,
            Mouse,
            MouseCircle,
            MouseMinimalistic,
            PlugCircle,
            Printer,
            Printer2,
            PrinterMinimalistic,
            Projector,
            Radio,
            RadioMinimalistic,
            SdCard,
            Server,
            Server2,
            ServerMinimalistic,
            ServerPath,
            ServerSquare,
            ServerSquareCloud,
            ServerSquareUpdate,
            SimCard,
            SimCards,
            SimCardMinimalistic,
            Smartphone,
            Smartphone2,
            SmartphoneRotate2,
            SmartphoneRotateAngle,
            SmartphoneRotateOrientation,
            SmartphoneUpdate,
            SmartphoneVibration,
            SmartSpeaker,
            SmartSpeaker2,
            SmartSpeakerMinimalistic,
            Socket,
            SsdRound,
            SsdSquare,
            Tablet,
            Telescope,
            Turntable,
            TurntableMinimalistic,
            TurntableMusicNote,
            Tv,
            Weigher,
            WirelessCharge
        )
        return _AllIcons!!
    }

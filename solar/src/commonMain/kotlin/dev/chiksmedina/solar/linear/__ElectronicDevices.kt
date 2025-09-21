package dev.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LinearSolar
import dev.chiksmedina.solar.linear.electronicdevices.Airbuds
import dev.chiksmedina.solar.linear.electronicdevices.AirbudsCase
import dev.chiksmedina.solar.linear.electronicdevices.AirbudsCaseCharge
import dev.chiksmedina.solar.linear.electronicdevices.AirbudsCaseMinimalistic
import dev.chiksmedina.solar.linear.electronicdevices.AirbudsCaseOpen
import dev.chiksmedina.solar.linear.electronicdevices.AirbudsCharge
import dev.chiksmedina.solar.linear.electronicdevices.AirbudsCheck
import dev.chiksmedina.solar.linear.electronicdevices.AirbudsLeft
import dev.chiksmedina.solar.linear.electronicdevices.AirbudsRemove
import dev.chiksmedina.solar.linear.electronicdevices.AirbudsRight
import dev.chiksmedina.solar.linear.electronicdevices.Bluetooth
import dev.chiksmedina.solar.linear.electronicdevices.BluetoothCircle
import dev.chiksmedina.solar.linear.electronicdevices.BluetoothSquare
import dev.chiksmedina.solar.linear.electronicdevices.BluetoothWave
import dev.chiksmedina.solar.linear.electronicdevices.Boombox
import dev.chiksmedina.solar.linear.electronicdevices.Cassette
import dev.chiksmedina.solar.linear.electronicdevices.Cassette2
import dev.chiksmedina.solar.linear.electronicdevices.CloudStorage
import dev.chiksmedina.solar.linear.electronicdevices.Cpu
import dev.chiksmedina.solar.linear.electronicdevices.CpuBolt
import dev.chiksmedina.solar.linear.electronicdevices.Devices
import dev.chiksmedina.solar.linear.electronicdevices.Diskette
import dev.chiksmedina.solar.linear.electronicdevices.Display
import dev.chiksmedina.solar.linear.electronicdevices.FlashDrive
import dev.chiksmedina.solar.linear.electronicdevices.Gameboy
import dev.chiksmedina.solar.linear.electronicdevices.Gamepad
import dev.chiksmedina.solar.linear.electronicdevices.GamepadCharge
import dev.chiksmedina.solar.linear.electronicdevices.GamepadMinimalistic
import dev.chiksmedina.solar.linear.electronicdevices.GamepadNoCharge
import dev.chiksmedina.solar.linear.electronicdevices.GamepadOld
import dev.chiksmedina.solar.linear.electronicdevices.HeadphonesRound
import dev.chiksmedina.solar.linear.electronicdevices.HeadphonesRoundSound
import dev.chiksmedina.solar.linear.electronicdevices.HeadphonesSquare
import dev.chiksmedina.solar.linear.electronicdevices.HeadphonesSquareSound
import dev.chiksmedina.solar.linear.electronicdevices.Iphone
import dev.chiksmedina.solar.linear.electronicdevices.Keyboard
import dev.chiksmedina.solar.linear.electronicdevices.Laptop
import dev.chiksmedina.solar.linear.electronicdevices.Laptop2
import dev.chiksmedina.solar.linear.electronicdevices.Laptop3
import dev.chiksmedina.solar.linear.electronicdevices.LaptopMinimalistic
import dev.chiksmedina.solar.linear.electronicdevices.Lightbulb
import dev.chiksmedina.solar.linear.electronicdevices.LightbulbBolt
import dev.chiksmedina.solar.linear.electronicdevices.LightbulbMinimalistic
import dev.chiksmedina.solar.linear.electronicdevices.Lightning
import dev.chiksmedina.solar.linear.electronicdevices.Monitor
import dev.chiksmedina.solar.linear.electronicdevices.MonitorCamera
import dev.chiksmedina.solar.linear.electronicdevices.MonitorSmartphone
import dev.chiksmedina.solar.linear.electronicdevices.Mouse
import dev.chiksmedina.solar.linear.electronicdevices.MouseCircle
import dev.chiksmedina.solar.linear.electronicdevices.MouseMinimalistic
import dev.chiksmedina.solar.linear.electronicdevices.PlugCircle
import dev.chiksmedina.solar.linear.electronicdevices.Printer
import dev.chiksmedina.solar.linear.electronicdevices.Printer2
import dev.chiksmedina.solar.linear.electronicdevices.PrinterMinimalistic
import dev.chiksmedina.solar.linear.electronicdevices.Projector
import dev.chiksmedina.solar.linear.electronicdevices.Radio
import dev.chiksmedina.solar.linear.electronicdevices.RadioMinimalistic
import dev.chiksmedina.solar.linear.electronicdevices.SdCard
import dev.chiksmedina.solar.linear.electronicdevices.Server
import dev.chiksmedina.solar.linear.electronicdevices.Server2
import dev.chiksmedina.solar.linear.electronicdevices.ServerMinimalistic
import dev.chiksmedina.solar.linear.electronicdevices.ServerPath
import dev.chiksmedina.solar.linear.electronicdevices.ServerSquare
import dev.chiksmedina.solar.linear.electronicdevices.ServerSquareCloud
import dev.chiksmedina.solar.linear.electronicdevices.ServerSquareUpdate
import dev.chiksmedina.solar.linear.electronicdevices.SimCard
import dev.chiksmedina.solar.linear.electronicdevices.SimCardMinimalistic
import dev.chiksmedina.solar.linear.electronicdevices.SimCards
import dev.chiksmedina.solar.linear.electronicdevices.SmartSpeaker
import dev.chiksmedina.solar.linear.electronicdevices.SmartSpeaker2
import dev.chiksmedina.solar.linear.electronicdevices.SmartSpeakerMinimalistic
import dev.chiksmedina.solar.linear.electronicdevices.Smartphone
import dev.chiksmedina.solar.linear.electronicdevices.Smartphone2
import dev.chiksmedina.solar.linear.electronicdevices.SmartphoneRotate2
import dev.chiksmedina.solar.linear.electronicdevices.SmartphoneRotateAngle
import dev.chiksmedina.solar.linear.electronicdevices.SmartphoneRotateOrientation
import dev.chiksmedina.solar.linear.electronicdevices.SmartphoneUpdate
import dev.chiksmedina.solar.linear.electronicdevices.SmartphoneVibration
import dev.chiksmedina.solar.linear.electronicdevices.Socket
import dev.chiksmedina.solar.linear.electronicdevices.SsdRound
import dev.chiksmedina.solar.linear.electronicdevices.SsdSquare
import dev.chiksmedina.solar.linear.electronicdevices.Tablet
import dev.chiksmedina.solar.linear.electronicdevices.Telescope
import dev.chiksmedina.solar.linear.electronicdevices.Turntable
import dev.chiksmedina.solar.linear.electronicdevices.TurntableMinimalistic
import dev.chiksmedina.solar.linear.electronicdevices.TurntableMusicNote
import dev.chiksmedina.solar.linear.electronicdevices.Tv
import dev.chiksmedina.solar.linear.electronicdevices.Weigher
import dev.chiksmedina.solar.linear.electronicdevices.WirelessCharge
import kotlin.collections.List as KtList

object ElectronicDevicesGroup

val LinearSolar.ElectronicDevices: ElectronicDevicesGroup
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

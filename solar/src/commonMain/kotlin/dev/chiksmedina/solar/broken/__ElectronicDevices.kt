package dev.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BrokenSolar
import dev.chiksmedina.solar.broken.electronicdevices.Airbuds
import dev.chiksmedina.solar.broken.electronicdevices.AirbudsCase
import dev.chiksmedina.solar.broken.electronicdevices.AirbudsCaseCharge
import dev.chiksmedina.solar.broken.electronicdevices.AirbudsCaseMinimalistic
import dev.chiksmedina.solar.broken.electronicdevices.AirbudsCaseOpen
import dev.chiksmedina.solar.broken.electronicdevices.AirbudsCharge
import dev.chiksmedina.solar.broken.electronicdevices.AirbudsCheck
import dev.chiksmedina.solar.broken.electronicdevices.AirbudsLeft
import dev.chiksmedina.solar.broken.electronicdevices.AirbudsRemove
import dev.chiksmedina.solar.broken.electronicdevices.AirbudsRight
import dev.chiksmedina.solar.broken.electronicdevices.Bluetooth
import dev.chiksmedina.solar.broken.electronicdevices.BluetoothCircle
import dev.chiksmedina.solar.broken.electronicdevices.BluetoothSquare
import dev.chiksmedina.solar.broken.electronicdevices.BluetoothWave
import dev.chiksmedina.solar.broken.electronicdevices.Boombox
import dev.chiksmedina.solar.broken.electronicdevices.Cassette
import dev.chiksmedina.solar.broken.electronicdevices.Cassette2
import dev.chiksmedina.solar.broken.electronicdevices.CloudStorage
import dev.chiksmedina.solar.broken.electronicdevices.Cpu
import dev.chiksmedina.solar.broken.electronicdevices.CpuBolt
import dev.chiksmedina.solar.broken.electronicdevices.Devices
import dev.chiksmedina.solar.broken.electronicdevices.Diskette
import dev.chiksmedina.solar.broken.electronicdevices.Display
import dev.chiksmedina.solar.broken.electronicdevices.FlashDrive
import dev.chiksmedina.solar.broken.electronicdevices.Gameboy
import dev.chiksmedina.solar.broken.electronicdevices.Gamepad
import dev.chiksmedina.solar.broken.electronicdevices.GamepadCharge
import dev.chiksmedina.solar.broken.electronicdevices.GamepadMinimalistic
import dev.chiksmedina.solar.broken.electronicdevices.GamepadNoCharge
import dev.chiksmedina.solar.broken.electronicdevices.GamepadOld
import dev.chiksmedina.solar.broken.electronicdevices.HeadphonesRound
import dev.chiksmedina.solar.broken.electronicdevices.HeadphonesRoundSound
import dev.chiksmedina.solar.broken.electronicdevices.HeadphonesSquare
import dev.chiksmedina.solar.broken.electronicdevices.HeadphonesSquareSound
import dev.chiksmedina.solar.broken.electronicdevices.Iphone
import dev.chiksmedina.solar.broken.electronicdevices.Keyboard
import dev.chiksmedina.solar.broken.electronicdevices.Laptop
import dev.chiksmedina.solar.broken.electronicdevices.Laptop2
import dev.chiksmedina.solar.broken.electronicdevices.Laptop3
import dev.chiksmedina.solar.broken.electronicdevices.LaptopMinimalistic
import dev.chiksmedina.solar.broken.electronicdevices.Lightbulb
import dev.chiksmedina.solar.broken.electronicdevices.LightbulbBolt
import dev.chiksmedina.solar.broken.electronicdevices.LightbulbMinimalistic
import dev.chiksmedina.solar.broken.electronicdevices.Lightning
import dev.chiksmedina.solar.broken.electronicdevices.Monitor
import dev.chiksmedina.solar.broken.electronicdevices.MonitorCamera
import dev.chiksmedina.solar.broken.electronicdevices.MonitorSmartphone
import dev.chiksmedina.solar.broken.electronicdevices.Mouse
import dev.chiksmedina.solar.broken.electronicdevices.MouseCircle
import dev.chiksmedina.solar.broken.electronicdevices.MouseMinimalistic
import dev.chiksmedina.solar.broken.electronicdevices.PlugCircle
import dev.chiksmedina.solar.broken.electronicdevices.Printer
import dev.chiksmedina.solar.broken.electronicdevices.Printer2
import dev.chiksmedina.solar.broken.electronicdevices.PrinterMinimalistic
import dev.chiksmedina.solar.broken.electronicdevices.Projector
import dev.chiksmedina.solar.broken.electronicdevices.Radio
import dev.chiksmedina.solar.broken.electronicdevices.RadioMinimalistic
import dev.chiksmedina.solar.broken.electronicdevices.SdCard
import dev.chiksmedina.solar.broken.electronicdevices.Server
import dev.chiksmedina.solar.broken.electronicdevices.Server2
import dev.chiksmedina.solar.broken.electronicdevices.ServerMinimalistic
import dev.chiksmedina.solar.broken.electronicdevices.ServerPath
import dev.chiksmedina.solar.broken.electronicdevices.ServerSquare
import dev.chiksmedina.solar.broken.electronicdevices.ServerSquareCloud
import dev.chiksmedina.solar.broken.electronicdevices.ServerSquareUpdate
import dev.chiksmedina.solar.broken.electronicdevices.SimCard
import dev.chiksmedina.solar.broken.electronicdevices.SimCardMinimalistic
import dev.chiksmedina.solar.broken.electronicdevices.SimCards
import dev.chiksmedina.solar.broken.electronicdevices.SmartSpeaker
import dev.chiksmedina.solar.broken.electronicdevices.SmartSpeaker2
import dev.chiksmedina.solar.broken.electronicdevices.SmartSpeakerMinimalistic
import dev.chiksmedina.solar.broken.electronicdevices.Smartphone
import dev.chiksmedina.solar.broken.electronicdevices.Smartphone2
import dev.chiksmedina.solar.broken.electronicdevices.SmartphoneRotate2
import dev.chiksmedina.solar.broken.electronicdevices.SmartphoneRotateAngle
import dev.chiksmedina.solar.broken.electronicdevices.SmartphoneRotateOrientation
import dev.chiksmedina.solar.broken.electronicdevices.SmartphoneUpdate
import dev.chiksmedina.solar.broken.electronicdevices.SmartphoneVibration
import dev.chiksmedina.solar.broken.electronicdevices.Socket
import dev.chiksmedina.solar.broken.electronicdevices.SsdRound
import dev.chiksmedina.solar.broken.electronicdevices.SsdSquare
import dev.chiksmedina.solar.broken.electronicdevices.Tablet
import dev.chiksmedina.solar.broken.electronicdevices.Telescope
import dev.chiksmedina.solar.broken.electronicdevices.Turntable
import dev.chiksmedina.solar.broken.electronicdevices.TurntableMinimalistic
import dev.chiksmedina.solar.broken.electronicdevices.TurntableMusicNote
import dev.chiksmedina.solar.broken.electronicdevices.Tv
import dev.chiksmedina.solar.broken.electronicdevices.Weigher
import dev.chiksmedina.solar.broken.electronicdevices.WirelessCharge
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

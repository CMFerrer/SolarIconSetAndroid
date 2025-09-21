package dev.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldSolar
import dev.chiksmedina.solar.bold.electronicdevices.Airbuds
import dev.chiksmedina.solar.bold.electronicdevices.AirbudsCase
import dev.chiksmedina.solar.bold.electronicdevices.AirbudsCaseCharge
import dev.chiksmedina.solar.bold.electronicdevices.AirbudsCaseMinimalistic
import dev.chiksmedina.solar.bold.electronicdevices.AirbudsCaseOpen
import dev.chiksmedina.solar.bold.electronicdevices.AirbudsCharge
import dev.chiksmedina.solar.bold.electronicdevices.AirbudsCheck
import dev.chiksmedina.solar.bold.electronicdevices.AirbudsLeft
import dev.chiksmedina.solar.bold.electronicdevices.AirbudsRemove
import dev.chiksmedina.solar.bold.electronicdevices.AirbudsRight
import dev.chiksmedina.solar.bold.electronicdevices.Bluetooth
import dev.chiksmedina.solar.bold.electronicdevices.BluetoothCircle
import dev.chiksmedina.solar.bold.electronicdevices.BluetoothSquare
import dev.chiksmedina.solar.bold.electronicdevices.BluetoothWave
import dev.chiksmedina.solar.bold.electronicdevices.Boombox
import dev.chiksmedina.solar.bold.electronicdevices.Cassette
import dev.chiksmedina.solar.bold.electronicdevices.Cassette2
import dev.chiksmedina.solar.bold.electronicdevices.CloudStorage
import dev.chiksmedina.solar.bold.electronicdevices.Cpu
import dev.chiksmedina.solar.bold.electronicdevices.CpuBolt
import dev.chiksmedina.solar.bold.electronicdevices.Devices
import dev.chiksmedina.solar.bold.electronicdevices.Diskette
import dev.chiksmedina.solar.bold.electronicdevices.Display
import dev.chiksmedina.solar.bold.electronicdevices.FlashDrive
import dev.chiksmedina.solar.bold.electronicdevices.Gameboy
import dev.chiksmedina.solar.bold.electronicdevices.Gamepad
import dev.chiksmedina.solar.bold.electronicdevices.GamepadCharge
import dev.chiksmedina.solar.bold.electronicdevices.GamepadMinimalistic
import dev.chiksmedina.solar.bold.electronicdevices.GamepadNoCharge
import dev.chiksmedina.solar.bold.electronicdevices.GamepadOld
import dev.chiksmedina.solar.bold.electronicdevices.HeadphonesRound
import dev.chiksmedina.solar.bold.electronicdevices.HeadphonesRoundSound
import dev.chiksmedina.solar.bold.electronicdevices.HeadphonesSquare
import dev.chiksmedina.solar.bold.electronicdevices.HeadphonesSquareSound
import dev.chiksmedina.solar.bold.electronicdevices.Iphone
import dev.chiksmedina.solar.bold.electronicdevices.Keyboard
import dev.chiksmedina.solar.bold.electronicdevices.Laptop
import dev.chiksmedina.solar.bold.electronicdevices.Laptop2
import dev.chiksmedina.solar.bold.electronicdevices.Laptop3
import dev.chiksmedina.solar.bold.electronicdevices.LaptopMinimalistic
import dev.chiksmedina.solar.bold.electronicdevices.Lightbulb
import dev.chiksmedina.solar.bold.electronicdevices.LightbulbBolt
import dev.chiksmedina.solar.bold.electronicdevices.LightbulbMinimalistic
import dev.chiksmedina.solar.bold.electronicdevices.Lightning
import dev.chiksmedina.solar.bold.electronicdevices.Monitor
import dev.chiksmedina.solar.bold.electronicdevices.MonitorCamera
import dev.chiksmedina.solar.bold.electronicdevices.MonitorSmartphone
import dev.chiksmedina.solar.bold.electronicdevices.Mouse
import dev.chiksmedina.solar.bold.electronicdevices.MouseCircle
import dev.chiksmedina.solar.bold.electronicdevices.MouseMinimalistic
import dev.chiksmedina.solar.bold.electronicdevices.PlugCircle
import dev.chiksmedina.solar.bold.electronicdevices.Printer
import dev.chiksmedina.solar.bold.electronicdevices.Printer2
import dev.chiksmedina.solar.bold.electronicdevices.PrinterMinimalistic
import dev.chiksmedina.solar.bold.electronicdevices.Projector
import dev.chiksmedina.solar.bold.electronicdevices.Radio
import dev.chiksmedina.solar.bold.electronicdevices.RadioMinimalistic
import dev.chiksmedina.solar.bold.electronicdevices.SdCard
import dev.chiksmedina.solar.bold.electronicdevices.Server
import dev.chiksmedina.solar.bold.electronicdevices.Server2
import dev.chiksmedina.solar.bold.electronicdevices.ServerMinimalistic
import dev.chiksmedina.solar.bold.electronicdevices.ServerPath
import dev.chiksmedina.solar.bold.electronicdevices.ServerSquare
import dev.chiksmedina.solar.bold.electronicdevices.ServerSquareCloud
import dev.chiksmedina.solar.bold.electronicdevices.ServerSquareUpdate
import dev.chiksmedina.solar.bold.electronicdevices.SimCard
import dev.chiksmedina.solar.bold.electronicdevices.SimCardMinimalistic
import dev.chiksmedina.solar.bold.electronicdevices.SimCards
import dev.chiksmedina.solar.bold.electronicdevices.SmartSpeaker
import dev.chiksmedina.solar.bold.electronicdevices.SmartSpeaker2
import dev.chiksmedina.solar.bold.electronicdevices.SmartSpeakerMinimalistic
import dev.chiksmedina.solar.bold.electronicdevices.Smartphone
import dev.chiksmedina.solar.bold.electronicdevices.Smartphone2
import dev.chiksmedina.solar.bold.electronicdevices.SmartphoneRotate2
import dev.chiksmedina.solar.bold.electronicdevices.SmartphoneRotateAngle
import dev.chiksmedina.solar.bold.electronicdevices.SmartphoneRotateOrientation
import dev.chiksmedina.solar.bold.electronicdevices.SmartphoneUpdate
import dev.chiksmedina.solar.bold.electronicdevices.SmartphoneVibration
import dev.chiksmedina.solar.bold.electronicdevices.Socket
import dev.chiksmedina.solar.bold.electronicdevices.SsdRound
import dev.chiksmedina.solar.bold.electronicdevices.SsdSquare
import dev.chiksmedina.solar.bold.electronicdevices.Tablet
import dev.chiksmedina.solar.bold.electronicdevices.Telescope
import dev.chiksmedina.solar.bold.electronicdevices.Turntable
import dev.chiksmedina.solar.bold.electronicdevices.TurntableMinimalistic
import dev.chiksmedina.solar.bold.electronicdevices.TurntableMusicNote
import dev.chiksmedina.solar.bold.electronicdevices.Tv
import dev.chiksmedina.solar.bold.electronicdevices.Weigher
import dev.chiksmedina.solar.bold.electronicdevices.WirelessCharge
import kotlin.collections.List as KtList

object ElectronicDevicesGroup

val BoldSolar.ElectronicDevices: ElectronicDevicesGroup
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

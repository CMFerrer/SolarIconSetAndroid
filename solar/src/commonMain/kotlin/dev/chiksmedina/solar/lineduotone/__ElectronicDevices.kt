package dev.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LineDuotoneSolar
import dev.chiksmedina.solar.lineduotone.electronicdevices.Airbuds
import dev.chiksmedina.solar.lineduotone.electronicdevices.AirbudsCase
import dev.chiksmedina.solar.lineduotone.electronicdevices.AirbudsCaseCharge
import dev.chiksmedina.solar.lineduotone.electronicdevices.AirbudsCaseMinimalistic
import dev.chiksmedina.solar.lineduotone.electronicdevices.AirbudsCaseOpen
import dev.chiksmedina.solar.lineduotone.electronicdevices.AirbudsCharge
import dev.chiksmedina.solar.lineduotone.electronicdevices.AirbudsCheck
import dev.chiksmedina.solar.lineduotone.electronicdevices.AirbudsLeft
import dev.chiksmedina.solar.lineduotone.electronicdevices.AirbudsRemove
import dev.chiksmedina.solar.lineduotone.electronicdevices.AirbudsRight
import dev.chiksmedina.solar.lineduotone.electronicdevices.Bluetooth
import dev.chiksmedina.solar.lineduotone.electronicdevices.BluetoothCircle
import dev.chiksmedina.solar.lineduotone.electronicdevices.BluetoothSquare
import dev.chiksmedina.solar.lineduotone.electronicdevices.BluetoothWave
import dev.chiksmedina.solar.lineduotone.electronicdevices.Boombox
import dev.chiksmedina.solar.lineduotone.electronicdevices.Cassette
import dev.chiksmedina.solar.lineduotone.electronicdevices.Cassette2
import dev.chiksmedina.solar.lineduotone.electronicdevices.CloudStorage
import dev.chiksmedina.solar.lineduotone.electronicdevices.Cpu
import dev.chiksmedina.solar.lineduotone.electronicdevices.CpuBolt
import dev.chiksmedina.solar.lineduotone.electronicdevices.Devices
import dev.chiksmedina.solar.lineduotone.electronicdevices.Diskette
import dev.chiksmedina.solar.lineduotone.electronicdevices.Display
import dev.chiksmedina.solar.lineduotone.electronicdevices.FlashDrive
import dev.chiksmedina.solar.lineduotone.electronicdevices.Gameboy
import dev.chiksmedina.solar.lineduotone.electronicdevices.Gamepad
import dev.chiksmedina.solar.lineduotone.electronicdevices.GamepadCharge
import dev.chiksmedina.solar.lineduotone.electronicdevices.GamepadMinimalistic
import dev.chiksmedina.solar.lineduotone.electronicdevices.GamepadNoCharge
import dev.chiksmedina.solar.lineduotone.electronicdevices.GamepadOld
import dev.chiksmedina.solar.lineduotone.electronicdevices.HeadphonesRound
import dev.chiksmedina.solar.lineduotone.electronicdevices.HeadphonesRoundSound
import dev.chiksmedina.solar.lineduotone.electronicdevices.HeadphonesSquare
import dev.chiksmedina.solar.lineduotone.electronicdevices.HeadphonesSquareSound
import dev.chiksmedina.solar.lineduotone.electronicdevices.Iphone
import dev.chiksmedina.solar.lineduotone.electronicdevices.Keyboard
import dev.chiksmedina.solar.lineduotone.electronicdevices.Laptop
import dev.chiksmedina.solar.lineduotone.electronicdevices.Laptop2
import dev.chiksmedina.solar.lineduotone.electronicdevices.Laptop3
import dev.chiksmedina.solar.lineduotone.electronicdevices.LaptopMinimalistic
import dev.chiksmedina.solar.lineduotone.electronicdevices.Lightbulb
import dev.chiksmedina.solar.lineduotone.electronicdevices.LightbulbBolt
import dev.chiksmedina.solar.lineduotone.electronicdevices.LightbulbMinimalistic
import dev.chiksmedina.solar.lineduotone.electronicdevices.Lightning
import dev.chiksmedina.solar.lineduotone.electronicdevices.Monitor
import dev.chiksmedina.solar.lineduotone.electronicdevices.MonitorCamera
import dev.chiksmedina.solar.lineduotone.electronicdevices.MonitorSmartphone
import dev.chiksmedina.solar.lineduotone.electronicdevices.Mouse
import dev.chiksmedina.solar.lineduotone.electronicdevices.MouseCircle
import dev.chiksmedina.solar.lineduotone.electronicdevices.MouseMinimalistic
import dev.chiksmedina.solar.lineduotone.electronicdevices.PlugCircle
import dev.chiksmedina.solar.lineduotone.electronicdevices.Printer
import dev.chiksmedina.solar.lineduotone.electronicdevices.Printer2
import dev.chiksmedina.solar.lineduotone.electronicdevices.PrinterMinimalistic
import dev.chiksmedina.solar.lineduotone.electronicdevices.Projector
import dev.chiksmedina.solar.lineduotone.electronicdevices.Radio
import dev.chiksmedina.solar.lineduotone.electronicdevices.RadioMinimalistic
import dev.chiksmedina.solar.lineduotone.electronicdevices.SdCard
import dev.chiksmedina.solar.lineduotone.electronicdevices.Server
import dev.chiksmedina.solar.lineduotone.electronicdevices.Server2
import dev.chiksmedina.solar.lineduotone.electronicdevices.ServerMinimalistic
import dev.chiksmedina.solar.lineduotone.electronicdevices.ServerPath
import dev.chiksmedina.solar.lineduotone.electronicdevices.ServerSquare
import dev.chiksmedina.solar.lineduotone.electronicdevices.ServerSquareCloud
import dev.chiksmedina.solar.lineduotone.electronicdevices.ServerSquareUpdate
import dev.chiksmedina.solar.lineduotone.electronicdevices.SimCard
import dev.chiksmedina.solar.lineduotone.electronicdevices.SimCardMinimalistic
import dev.chiksmedina.solar.lineduotone.electronicdevices.SimCards
import dev.chiksmedina.solar.lineduotone.electronicdevices.SmartSpeaker
import dev.chiksmedina.solar.lineduotone.electronicdevices.SmartSpeaker2
import dev.chiksmedina.solar.lineduotone.electronicdevices.SmartSpeakerMinimalistic
import dev.chiksmedina.solar.lineduotone.electronicdevices.Smartphone
import dev.chiksmedina.solar.lineduotone.electronicdevices.Smartphone2
import dev.chiksmedina.solar.lineduotone.electronicdevices.SmartphoneRotate2
import dev.chiksmedina.solar.lineduotone.electronicdevices.SmartphoneRotateAngle
import dev.chiksmedina.solar.lineduotone.electronicdevices.SmartphoneRotateOrientation
import dev.chiksmedina.solar.lineduotone.electronicdevices.SmartphoneUpdate
import dev.chiksmedina.solar.lineduotone.electronicdevices.SmartphoneVibration
import dev.chiksmedina.solar.lineduotone.electronicdevices.Socket
import dev.chiksmedina.solar.lineduotone.electronicdevices.SsdRound
import dev.chiksmedina.solar.lineduotone.electronicdevices.SsdSquare
import dev.chiksmedina.solar.lineduotone.electronicdevices.Tablet
import dev.chiksmedina.solar.lineduotone.electronicdevices.Telescope
import dev.chiksmedina.solar.lineduotone.electronicdevices.Turntable
import dev.chiksmedina.solar.lineduotone.electronicdevices.TurntableMinimalistic
import dev.chiksmedina.solar.lineduotone.electronicdevices.TurntableMusicNote
import dev.chiksmedina.solar.lineduotone.electronicdevices.Tv
import dev.chiksmedina.solar.lineduotone.electronicdevices.Weigher
import dev.chiksmedina.solar.lineduotone.electronicdevices.WirelessCharge
import kotlin.collections.List as KtList

object ElectronicDevicesGroup

val LineDuotoneSolar.ElectronicDevices: ElectronicDevicesGroup
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

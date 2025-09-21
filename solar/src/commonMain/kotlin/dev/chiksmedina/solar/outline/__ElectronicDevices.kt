package dev.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.OutlineSolar
import dev.chiksmedina.solar.outline.electronicdevices.Airbuds
import dev.chiksmedina.solar.outline.electronicdevices.AirbudsCase
import dev.chiksmedina.solar.outline.electronicdevices.AirbudsCaseCharge
import dev.chiksmedina.solar.outline.electronicdevices.AirbudsCaseMinimalistic
import dev.chiksmedina.solar.outline.electronicdevices.AirbudsCaseOpen
import dev.chiksmedina.solar.outline.electronicdevices.AirbudsCharge
import dev.chiksmedina.solar.outline.electronicdevices.AirbudsCheck
import dev.chiksmedina.solar.outline.electronicdevices.AirbudsLeft
import dev.chiksmedina.solar.outline.electronicdevices.AirbudsRemove
import dev.chiksmedina.solar.outline.electronicdevices.AirbudsRight
import dev.chiksmedina.solar.outline.electronicdevices.Bluetooth
import dev.chiksmedina.solar.outline.electronicdevices.BluetoothCircle
import dev.chiksmedina.solar.outline.electronicdevices.BluetoothSquare
import dev.chiksmedina.solar.outline.electronicdevices.BluetoothWave
import dev.chiksmedina.solar.outline.electronicdevices.Boombox
import dev.chiksmedina.solar.outline.electronicdevices.Cassette
import dev.chiksmedina.solar.outline.electronicdevices.Cassette2
import dev.chiksmedina.solar.outline.electronicdevices.CloudStorage
import dev.chiksmedina.solar.outline.electronicdevices.Cpu
import dev.chiksmedina.solar.outline.electronicdevices.CpuBolt
import dev.chiksmedina.solar.outline.electronicdevices.Devices
import dev.chiksmedina.solar.outline.electronicdevices.Diskette
import dev.chiksmedina.solar.outline.electronicdevices.Display
import dev.chiksmedina.solar.outline.electronicdevices.FlashDrive
import dev.chiksmedina.solar.outline.electronicdevices.Gameboy
import dev.chiksmedina.solar.outline.electronicdevices.Gamepad
import dev.chiksmedina.solar.outline.electronicdevices.GamepadCharge
import dev.chiksmedina.solar.outline.electronicdevices.GamepadMinimalistic
import dev.chiksmedina.solar.outline.electronicdevices.GamepadNoCharge
import dev.chiksmedina.solar.outline.electronicdevices.GamepadOld
import dev.chiksmedina.solar.outline.electronicdevices.HeadphonesRound
import dev.chiksmedina.solar.outline.electronicdevices.HeadphonesRoundSound
import dev.chiksmedina.solar.outline.electronicdevices.HeadphonesSquare
import dev.chiksmedina.solar.outline.electronicdevices.HeadphonesSquareSound
import dev.chiksmedina.solar.outline.electronicdevices.Iphone
import dev.chiksmedina.solar.outline.electronicdevices.Keyboard
import dev.chiksmedina.solar.outline.electronicdevices.Laptop
import dev.chiksmedina.solar.outline.electronicdevices.Laptop2
import dev.chiksmedina.solar.outline.electronicdevices.Laptop3
import dev.chiksmedina.solar.outline.electronicdevices.LaptopMinimalistic
import dev.chiksmedina.solar.outline.electronicdevices.Lightbulb
import dev.chiksmedina.solar.outline.electronicdevices.LightbulbBolt
import dev.chiksmedina.solar.outline.electronicdevices.LightbulbMinimalistic
import dev.chiksmedina.solar.outline.electronicdevices.Lightning
import dev.chiksmedina.solar.outline.electronicdevices.Monitor
import dev.chiksmedina.solar.outline.electronicdevices.MonitorCamera
import dev.chiksmedina.solar.outline.electronicdevices.MonitorSmartphone
import dev.chiksmedina.solar.outline.electronicdevices.Mouse
import dev.chiksmedina.solar.outline.electronicdevices.MouseCircle
import dev.chiksmedina.solar.outline.electronicdevices.MouseMinimalistic
import dev.chiksmedina.solar.outline.electronicdevices.PlugCircle
import dev.chiksmedina.solar.outline.electronicdevices.Printer
import dev.chiksmedina.solar.outline.electronicdevices.Printer2
import dev.chiksmedina.solar.outline.electronicdevices.PrinterMinimalistic
import dev.chiksmedina.solar.outline.electronicdevices.Projector
import dev.chiksmedina.solar.outline.electronicdevices.Radio
import dev.chiksmedina.solar.outline.electronicdevices.RadioMinimalistic
import dev.chiksmedina.solar.outline.electronicdevices.SdCard
import dev.chiksmedina.solar.outline.electronicdevices.Server
import dev.chiksmedina.solar.outline.electronicdevices.Server2
import dev.chiksmedina.solar.outline.electronicdevices.ServerMinimalistic
import dev.chiksmedina.solar.outline.electronicdevices.ServerPath
import dev.chiksmedina.solar.outline.electronicdevices.ServerSquare
import dev.chiksmedina.solar.outline.electronicdevices.ServerSquareCloud
import dev.chiksmedina.solar.outline.electronicdevices.ServerSquareUpdate
import dev.chiksmedina.solar.outline.electronicdevices.SimCard
import dev.chiksmedina.solar.outline.electronicdevices.SimCardMinimalistic
import dev.chiksmedina.solar.outline.electronicdevices.SimCards
import dev.chiksmedina.solar.outline.electronicdevices.SmartSpeaker
import dev.chiksmedina.solar.outline.electronicdevices.SmartSpeaker2
import dev.chiksmedina.solar.outline.electronicdevices.SmartSpeakerMinimalistic
import dev.chiksmedina.solar.outline.electronicdevices.Smartphone
import dev.chiksmedina.solar.outline.electronicdevices.Smartphone2
import dev.chiksmedina.solar.outline.electronicdevices.SmartphoneRotate2
import dev.chiksmedina.solar.outline.electronicdevices.SmartphoneRotateAngle
import dev.chiksmedina.solar.outline.electronicdevices.SmartphoneRotateOrientation
import dev.chiksmedina.solar.outline.electronicdevices.SmartphoneUpdate
import dev.chiksmedina.solar.outline.electronicdevices.SmartphoneVibration
import dev.chiksmedina.solar.outline.electronicdevices.Socket
import dev.chiksmedina.solar.outline.electronicdevices.SsdRound
import dev.chiksmedina.solar.outline.electronicdevices.SsdSquare
import dev.chiksmedina.solar.outline.electronicdevices.Tablet
import dev.chiksmedina.solar.outline.electronicdevices.Telescope
import dev.chiksmedina.solar.outline.electronicdevices.Turntable
import dev.chiksmedina.solar.outline.electronicdevices.TurntableMinimalistic
import dev.chiksmedina.solar.outline.electronicdevices.TurntableMusicNote
import dev.chiksmedina.solar.outline.electronicdevices.Tv
import dev.chiksmedina.solar.outline.electronicdevices.Weigher
import dev.chiksmedina.solar.outline.electronicdevices.WirelessCharge
import kotlin.collections.List as KtList

object ElectronicDevicesGroup

val OutlineSolar.ElectronicDevices: ElectronicDevicesGroup
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

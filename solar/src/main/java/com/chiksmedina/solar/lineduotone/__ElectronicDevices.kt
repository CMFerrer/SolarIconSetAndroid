package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineDuotoneSolar
import com.chiksmedina.solar.lineduotone.electronicdevices.Airbuds
import com.chiksmedina.solar.lineduotone.electronicdevices.AirbudsCase
import com.chiksmedina.solar.lineduotone.electronicdevices.AirbudsCaseCharge
import com.chiksmedina.solar.lineduotone.electronicdevices.AirbudsCaseMinimalistic
import com.chiksmedina.solar.lineduotone.electronicdevices.AirbudsCaseOpen
import com.chiksmedina.solar.lineduotone.electronicdevices.AirbudsCharge
import com.chiksmedina.solar.lineduotone.electronicdevices.AirbudsCheck
import com.chiksmedina.solar.lineduotone.electronicdevices.AirbudsLeft
import com.chiksmedina.solar.lineduotone.electronicdevices.AirbudsRemove
import com.chiksmedina.solar.lineduotone.electronicdevices.AirbudsRight
import com.chiksmedina.solar.lineduotone.electronicdevices.Bluetooth
import com.chiksmedina.solar.lineduotone.electronicdevices.BluetoothCircle
import com.chiksmedina.solar.lineduotone.electronicdevices.BluetoothSquare
import com.chiksmedina.solar.lineduotone.electronicdevices.BluetoothWave
import com.chiksmedina.solar.lineduotone.electronicdevices.Boombox
import com.chiksmedina.solar.lineduotone.electronicdevices.Cassette
import com.chiksmedina.solar.lineduotone.electronicdevices.Cassette2
import com.chiksmedina.solar.lineduotone.electronicdevices.CloudStorage
import com.chiksmedina.solar.lineduotone.electronicdevices.Cpu
import com.chiksmedina.solar.lineduotone.electronicdevices.CpuBolt
import com.chiksmedina.solar.lineduotone.electronicdevices.Devices
import com.chiksmedina.solar.lineduotone.electronicdevices.Diskette
import com.chiksmedina.solar.lineduotone.electronicdevices.Display
import com.chiksmedina.solar.lineduotone.electronicdevices.FlashDrive
import com.chiksmedina.solar.lineduotone.electronicdevices.Gameboy
import com.chiksmedina.solar.lineduotone.electronicdevices.Gamepad
import com.chiksmedina.solar.lineduotone.electronicdevices.GamepadCharge
import com.chiksmedina.solar.lineduotone.electronicdevices.GamepadMinimalistic
import com.chiksmedina.solar.lineduotone.electronicdevices.GamepadNoCharge
import com.chiksmedina.solar.lineduotone.electronicdevices.GamepadOld
import com.chiksmedina.solar.lineduotone.electronicdevices.HeadphonesRound
import com.chiksmedina.solar.lineduotone.electronicdevices.HeadphonesRoundSound
import com.chiksmedina.solar.lineduotone.electronicdevices.HeadphonesSquare
import com.chiksmedina.solar.lineduotone.electronicdevices.HeadphonesSquareSound
import com.chiksmedina.solar.lineduotone.electronicdevices.Iphone
import com.chiksmedina.solar.lineduotone.electronicdevices.Keyboard
import com.chiksmedina.solar.lineduotone.electronicdevices.Laptop
import com.chiksmedina.solar.lineduotone.electronicdevices.Laptop2
import com.chiksmedina.solar.lineduotone.electronicdevices.Laptop3
import com.chiksmedina.solar.lineduotone.electronicdevices.LaptopMinimalistic
import com.chiksmedina.solar.lineduotone.electronicdevices.Lightbulb
import com.chiksmedina.solar.lineduotone.electronicdevices.LightbulbBolt
import com.chiksmedina.solar.lineduotone.electronicdevices.LightbulbMinimalistic
import com.chiksmedina.solar.lineduotone.electronicdevices.Lightning
import com.chiksmedina.solar.lineduotone.electronicdevices.Monitor
import com.chiksmedina.solar.lineduotone.electronicdevices.MonitorCamera
import com.chiksmedina.solar.lineduotone.electronicdevices.MonitorSmartphone
import com.chiksmedina.solar.lineduotone.electronicdevices.Mouse
import com.chiksmedina.solar.lineduotone.electronicdevices.MouseCircle
import com.chiksmedina.solar.lineduotone.electronicdevices.MouseMinimalistic
import com.chiksmedina.solar.lineduotone.electronicdevices.PlugCircle
import com.chiksmedina.solar.lineduotone.electronicdevices.Printer
import com.chiksmedina.solar.lineduotone.electronicdevices.Printer2
import com.chiksmedina.solar.lineduotone.electronicdevices.PrinterMinimalistic
import com.chiksmedina.solar.lineduotone.electronicdevices.Projector
import com.chiksmedina.solar.lineduotone.electronicdevices.Radio
import com.chiksmedina.solar.lineduotone.electronicdevices.RadioMinimalistic
import com.chiksmedina.solar.lineduotone.electronicdevices.SdCard
import com.chiksmedina.solar.lineduotone.electronicdevices.Server
import com.chiksmedina.solar.lineduotone.electronicdevices.Server2
import com.chiksmedina.solar.lineduotone.electronicdevices.ServerMinimalistic
import com.chiksmedina.solar.lineduotone.electronicdevices.ServerPath
import com.chiksmedina.solar.lineduotone.electronicdevices.ServerSquare
import com.chiksmedina.solar.lineduotone.electronicdevices.ServerSquareCloud
import com.chiksmedina.solar.lineduotone.electronicdevices.ServerSquareUpdate
import com.chiksmedina.solar.lineduotone.electronicdevices.SimCard
import com.chiksmedina.solar.lineduotone.electronicdevices.SimCardMinimalistic
import com.chiksmedina.solar.lineduotone.electronicdevices.SimCards
import com.chiksmedina.solar.lineduotone.electronicdevices.SmartSpeaker
import com.chiksmedina.solar.lineduotone.electronicdevices.SmartSpeaker2
import com.chiksmedina.solar.lineduotone.electronicdevices.SmartSpeakerMinimalistic
import com.chiksmedina.solar.lineduotone.electronicdevices.Smartphone
import com.chiksmedina.solar.lineduotone.electronicdevices.Smartphone2
import com.chiksmedina.solar.lineduotone.electronicdevices.SmartphoneRotate2
import com.chiksmedina.solar.lineduotone.electronicdevices.SmartphoneRotateAngle
import com.chiksmedina.solar.lineduotone.electronicdevices.SmartphoneRotateOrientation
import com.chiksmedina.solar.lineduotone.electronicdevices.SmartphoneUpdate
import com.chiksmedina.solar.lineduotone.electronicdevices.SmartphoneVibration
import com.chiksmedina.solar.lineduotone.electronicdevices.Socket
import com.chiksmedina.solar.lineduotone.electronicdevices.SsdRound
import com.chiksmedina.solar.lineduotone.electronicdevices.SsdSquare
import com.chiksmedina.solar.lineduotone.electronicdevices.Tablet
import com.chiksmedina.solar.lineduotone.electronicdevices.Telescope
import com.chiksmedina.solar.lineduotone.electronicdevices.Turntable
import com.chiksmedina.solar.lineduotone.electronicdevices.TurntableMinimalistic
import com.chiksmedina.solar.lineduotone.electronicdevices.TurntableMusicNote
import com.chiksmedina.solar.lineduotone.electronicdevices.Tv
import com.chiksmedina.solar.lineduotone.electronicdevices.Weigher
import com.chiksmedina.solar.lineduotone.electronicdevices.WirelessCharge
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

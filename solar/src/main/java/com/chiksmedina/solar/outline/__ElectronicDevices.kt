package com.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.OutlineSolar
import com.chiksmedina.solar.outline.electronicdevices.Airbuds
import com.chiksmedina.solar.outline.electronicdevices.AirbudsCase
import com.chiksmedina.solar.outline.electronicdevices.AirbudsCaseCharge
import com.chiksmedina.solar.outline.electronicdevices.AirbudsCaseMinimalistic
import com.chiksmedina.solar.outline.electronicdevices.AirbudsCaseOpen
import com.chiksmedina.solar.outline.electronicdevices.AirbudsCharge
import com.chiksmedina.solar.outline.electronicdevices.AirbudsCheck
import com.chiksmedina.solar.outline.electronicdevices.AirbudsLeft
import com.chiksmedina.solar.outline.electronicdevices.AirbudsRemove
import com.chiksmedina.solar.outline.electronicdevices.AirbudsRight
import com.chiksmedina.solar.outline.electronicdevices.Bluetooth
import com.chiksmedina.solar.outline.electronicdevices.BluetoothCircle
import com.chiksmedina.solar.outline.electronicdevices.BluetoothSquare
import com.chiksmedina.solar.outline.electronicdevices.BluetoothWave
import com.chiksmedina.solar.outline.electronicdevices.Boombox
import com.chiksmedina.solar.outline.electronicdevices.Cassette
import com.chiksmedina.solar.outline.electronicdevices.Cassette2
import com.chiksmedina.solar.outline.electronicdevices.CloudStorage
import com.chiksmedina.solar.outline.electronicdevices.Cpu
import com.chiksmedina.solar.outline.electronicdevices.CpuBolt
import com.chiksmedina.solar.outline.electronicdevices.Devices
import com.chiksmedina.solar.outline.electronicdevices.Diskette
import com.chiksmedina.solar.outline.electronicdevices.Display
import com.chiksmedina.solar.outline.electronicdevices.FlashDrive
import com.chiksmedina.solar.outline.electronicdevices.Gameboy
import com.chiksmedina.solar.outline.electronicdevices.Gamepad
import com.chiksmedina.solar.outline.electronicdevices.GamepadCharge
import com.chiksmedina.solar.outline.electronicdevices.GamepadMinimalistic
import com.chiksmedina.solar.outline.electronicdevices.GamepadNoCharge
import com.chiksmedina.solar.outline.electronicdevices.GamepadOld
import com.chiksmedina.solar.outline.electronicdevices.HeadphonesRound
import com.chiksmedina.solar.outline.electronicdevices.HeadphonesRoundSound
import com.chiksmedina.solar.outline.electronicdevices.HeadphonesSquare
import com.chiksmedina.solar.outline.electronicdevices.HeadphonesSquareSound
import com.chiksmedina.solar.outline.electronicdevices.Iphone
import com.chiksmedina.solar.outline.electronicdevices.Keyboard
import com.chiksmedina.solar.outline.electronicdevices.Laptop
import com.chiksmedina.solar.outline.electronicdevices.Laptop2
import com.chiksmedina.solar.outline.electronicdevices.Laptop3
import com.chiksmedina.solar.outline.electronicdevices.LaptopMinimalistic
import com.chiksmedina.solar.outline.electronicdevices.Lightbulb
import com.chiksmedina.solar.outline.electronicdevices.LightbulbBolt
import com.chiksmedina.solar.outline.electronicdevices.LightbulbMinimalistic
import com.chiksmedina.solar.outline.electronicdevices.Lightning
import com.chiksmedina.solar.outline.electronicdevices.Monitor
import com.chiksmedina.solar.outline.electronicdevices.MonitorCamera
import com.chiksmedina.solar.outline.electronicdevices.MonitorSmartphone
import com.chiksmedina.solar.outline.electronicdevices.Mouse
import com.chiksmedina.solar.outline.electronicdevices.MouseCircle
import com.chiksmedina.solar.outline.electronicdevices.MouseMinimalistic
import com.chiksmedina.solar.outline.electronicdevices.PlugCircle
import com.chiksmedina.solar.outline.electronicdevices.Printer
import com.chiksmedina.solar.outline.electronicdevices.Printer2
import com.chiksmedina.solar.outline.electronicdevices.PrinterMinimalistic
import com.chiksmedina.solar.outline.electronicdevices.Projector
import com.chiksmedina.solar.outline.electronicdevices.Radio
import com.chiksmedina.solar.outline.electronicdevices.RadioMinimalistic
import com.chiksmedina.solar.outline.electronicdevices.SdCard
import com.chiksmedina.solar.outline.electronicdevices.Server
import com.chiksmedina.solar.outline.electronicdevices.Server2
import com.chiksmedina.solar.outline.electronicdevices.ServerMinimalistic
import com.chiksmedina.solar.outline.electronicdevices.ServerPath
import com.chiksmedina.solar.outline.electronicdevices.ServerSquare
import com.chiksmedina.solar.outline.electronicdevices.ServerSquareCloud
import com.chiksmedina.solar.outline.electronicdevices.ServerSquareUpdate
import com.chiksmedina.solar.outline.electronicdevices.SimCard
import com.chiksmedina.solar.outline.electronicdevices.SimCardMinimalistic
import com.chiksmedina.solar.outline.electronicdevices.SimCards
import com.chiksmedina.solar.outline.electronicdevices.SmartSpeaker
import com.chiksmedina.solar.outline.electronicdevices.SmartSpeaker2
import com.chiksmedina.solar.outline.electronicdevices.SmartSpeakerMinimalistic
import com.chiksmedina.solar.outline.electronicdevices.Smartphone
import com.chiksmedina.solar.outline.electronicdevices.Smartphone2
import com.chiksmedina.solar.outline.electronicdevices.SmartphoneRotate2
import com.chiksmedina.solar.outline.electronicdevices.SmartphoneRotateAngle
import com.chiksmedina.solar.outline.electronicdevices.SmartphoneRotateOrientation
import com.chiksmedina.solar.outline.electronicdevices.SmartphoneUpdate
import com.chiksmedina.solar.outline.electronicdevices.SmartphoneVibration
import com.chiksmedina.solar.outline.electronicdevices.Socket
import com.chiksmedina.solar.outline.electronicdevices.SsdRound
import com.chiksmedina.solar.outline.electronicdevices.SsdSquare
import com.chiksmedina.solar.outline.electronicdevices.Tablet
import com.chiksmedina.solar.outline.electronicdevices.Telescope
import com.chiksmedina.solar.outline.electronicdevices.Turntable
import com.chiksmedina.solar.outline.electronicdevices.TurntableMinimalistic
import com.chiksmedina.solar.outline.electronicdevices.TurntableMusicNote
import com.chiksmedina.solar.outline.electronicdevices.Tv
import com.chiksmedina.solar.outline.electronicdevices.Weigher
import com.chiksmedina.solar.outline.electronicdevices.WirelessCharge
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

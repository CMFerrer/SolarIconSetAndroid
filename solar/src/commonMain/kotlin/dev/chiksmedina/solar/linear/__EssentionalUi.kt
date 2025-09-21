package dev.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LinearSolar
import dev.chiksmedina.solar.linear.essentionalui.Accessibility
import dev.chiksmedina.solar.linear.essentionalui.AddCircle
import dev.chiksmedina.solar.linear.essentionalui.AddSquare
import dev.chiksmedina.solar.linear.essentionalui.AugmentedReality
import dev.chiksmedina.solar.linear.essentionalui.Balloon
import dev.chiksmedina.solar.linear.essentionalui.BatteryCharge
import dev.chiksmedina.solar.linear.essentionalui.BatteryChargeMinimalistic
import dev.chiksmedina.solar.linear.essentionalui.BatteryFull
import dev.chiksmedina.solar.linear.essentionalui.BatteryFullMinimalistic
import dev.chiksmedina.solar.linear.essentionalui.BatteryHalf
import dev.chiksmedina.solar.linear.essentionalui.BatteryHalfMinimalistic
import dev.chiksmedina.solar.linear.essentionalui.BatteryLow
import dev.chiksmedina.solar.linear.essentionalui.BatteryLowMinimalistic
import dev.chiksmedina.solar.linear.essentionalui.Body
import dev.chiksmedina.solar.linear.essentionalui.Bolt
import dev.chiksmedina.solar.linear.essentionalui.BoltCircle
import dev.chiksmedina.solar.linear.essentionalui.Box
import dev.chiksmedina.solar.linear.essentionalui.BoxMinimalistic
import dev.chiksmedina.solar.linear.essentionalui.Broom
import dev.chiksmedina.solar.linear.essentionalui.Cat
import dev.chiksmedina.solar.linear.essentionalui.CheckCircle
import dev.chiksmedina.solar.linear.essentionalui.CheckSquare
import dev.chiksmedina.solar.linear.essentionalui.CloseCircle
import dev.chiksmedina.solar.linear.essentionalui.CloseSquare
import dev.chiksmedina.solar.linear.essentionalui.Confetti
import dev.chiksmedina.solar.linear.essentionalui.ConfettiMinimalistic
import dev.chiksmedina.solar.linear.essentionalui.Copy
import dev.chiksmedina.solar.linear.essentionalui.Copyright
import dev.chiksmedina.solar.linear.essentionalui.Cosmetic
import dev.chiksmedina.solar.linear.essentionalui.CreativeCommons
import dev.chiksmedina.solar.linear.essentionalui.Crown
import dev.chiksmedina.solar.linear.essentionalui.CrownLine
import dev.chiksmedina.solar.linear.essentionalui.CrownMinimalistic
import dev.chiksmedina.solar.linear.essentionalui.CrownStar
import dev.chiksmedina.solar.linear.essentionalui.Cup
import dev.chiksmedina.solar.linear.essentionalui.CupFirst
import dev.chiksmedina.solar.linear.essentionalui.CupMusic
import dev.chiksmedina.solar.linear.essentionalui.CupStar
import dev.chiksmedina.solar.linear.essentionalui.Cursor
import dev.chiksmedina.solar.linear.essentionalui.CursorSquare
import dev.chiksmedina.solar.linear.essentionalui.Danger
import dev.chiksmedina.solar.linear.essentionalui.DangerCircle
import dev.chiksmedina.solar.linear.essentionalui.DangerSquare
import dev.chiksmedina.solar.linear.essentionalui.DangerTriangle
import dev.chiksmedina.solar.linear.essentionalui.Database
import dev.chiksmedina.solar.linear.essentionalui.Delivery
import dev.chiksmedina.solar.linear.essentionalui.Explicit
import dev.chiksmedina.solar.linear.essentionalui.Feed
import dev.chiksmedina.solar.linear.essentionalui.FerrisWheel
import dev.chiksmedina.solar.linear.essentionalui.Figma
import dev.chiksmedina.solar.linear.essentionalui.Filter
import dev.chiksmedina.solar.linear.essentionalui.Flag
import dev.chiksmedina.solar.linear.essentionalui.Flag2
import dev.chiksmedina.solar.linear.essentionalui.Flashlight
import dev.chiksmedina.solar.linear.essentionalui.FlashlightOn
import dev.chiksmedina.solar.linear.essentionalui.Forbidden
import dev.chiksmedina.solar.linear.essentionalui.ForbiddenCircle
import dev.chiksmedina.solar.linear.essentionalui.Fuel
import dev.chiksmedina.solar.linear.essentionalui.Ghost
import dev.chiksmedina.solar.linear.essentionalui.GhostSmile
import dev.chiksmedina.solar.linear.essentionalui.Gift
import dev.chiksmedina.solar.linear.essentionalui.Glasses
import dev.chiksmedina.solar.linear.essentionalui.HamburgerMenu
import dev.chiksmedina.solar.linear.essentionalui.Hanger
import dev.chiksmedina.solar.linear.essentionalui.Hanger2
import dev.chiksmedina.solar.linear.essentionalui.Help
import dev.chiksmedina.solar.linear.essentionalui.HighDefinition
import dev.chiksmedina.solar.linear.essentionalui.HighQuality
import dev.chiksmedina.solar.linear.essentionalui.Home
import dev.chiksmedina.solar.linear.essentionalui.Home2
import dev.chiksmedina.solar.linear.essentionalui.HomeAdd
import dev.chiksmedina.solar.linear.essentionalui.HomeAddAngle
import dev.chiksmedina.solar.linear.essentionalui.HomeAngle
import dev.chiksmedina.solar.linear.essentionalui.HomeAngle2
import dev.chiksmedina.solar.linear.essentionalui.HomeSmile
import dev.chiksmedina.solar.linear.essentionalui.HomeSmileAngle
import dev.chiksmedina.solar.linear.essentionalui.HomeWifi
import dev.chiksmedina.solar.linear.essentionalui.HomeWifiAngle
import dev.chiksmedina.solar.linear.essentionalui.InfoCircle
import dev.chiksmedina.solar.linear.essentionalui.InfoSquare
import dev.chiksmedina.solar.linear.essentionalui.MagicStick
import dev.chiksmedina.solar.linear.essentionalui.MagicStick2
import dev.chiksmedina.solar.linear.essentionalui.MagicStick3
import dev.chiksmedina.solar.linear.essentionalui.Magnet
import dev.chiksmedina.solar.linear.essentionalui.MagnetWave
import dev.chiksmedina.solar.linear.essentionalui.MaskHapply
import dev.chiksmedina.solar.linear.essentionalui.MaskSad
import dev.chiksmedina.solar.linear.essentionalui.Masks
import dev.chiksmedina.solar.linear.essentionalui.MentionCircle
import dev.chiksmedina.solar.linear.essentionalui.MentionSquare
import dev.chiksmedina.solar.linear.essentionalui.MenuDots
import dev.chiksmedina.solar.linear.essentionalui.MenuDotsCircle
import dev.chiksmedina.solar.linear.essentionalui.MenuDotsSquare
import dev.chiksmedina.solar.linear.essentionalui.MinusCircle
import dev.chiksmedina.solar.linear.essentionalui.MinusSquare
import dev.chiksmedina.solar.linear.essentionalui.Mirror
import dev.chiksmedina.solar.linear.essentionalui.PaperBin
import dev.chiksmedina.solar.linear.essentionalui.Paw
import dev.chiksmedina.solar.linear.essentionalui.Perfume
import dev.chiksmedina.solar.linear.essentionalui.Pin
import dev.chiksmedina.solar.linear.essentionalui.PinCircle
import dev.chiksmedina.solar.linear.essentionalui.PinList
import dev.chiksmedina.solar.linear.essentionalui.Plate
import dev.chiksmedina.solar.linear.essentionalui.PostsCarouselHorizontal
import dev.chiksmedina.solar.linear.essentionalui.PostsCarouselVertical
import dev.chiksmedina.solar.linear.essentionalui.Power
import dev.chiksmedina.solar.linear.essentionalui.QuestionCircle
import dev.chiksmedina.solar.linear.essentionalui.QuestionSquare
import dev.chiksmedina.solar.linear.essentionalui.Reorder
import dev.chiksmedina.solar.linear.essentionalui.Revote
import dev.chiksmedina.solar.linear.essentionalui.Scissors
import dev.chiksmedina.solar.linear.essentionalui.ScissorsSquare
import dev.chiksmedina.solar.linear.essentionalui.Share
import dev.chiksmedina.solar.linear.essentionalui.ShareCircle
import dev.chiksmedina.solar.linear.essentionalui.Skirt
import dev.chiksmedina.solar.linear.essentionalui.Sledgehammer
import dev.chiksmedina.solar.linear.essentionalui.Sleeping
import dev.chiksmedina.solar.linear.essentionalui.SliderHorizontal
import dev.chiksmedina.solar.linear.essentionalui.SliderMinimalisticHorizontal
import dev.chiksmedina.solar.linear.essentionalui.SliderVertical
import dev.chiksmedina.solar.linear.essentionalui.SliderVerticalMinimalistic
import dev.chiksmedina.solar.linear.essentionalui.SmartHome
import dev.chiksmedina.solar.linear.essentionalui.SmartHomeAngle
import dev.chiksmedina.solar.linear.essentionalui.Sort
import dev.chiksmedina.solar.linear.essentionalui.SpecialEffects
import dev.chiksmedina.solar.linear.essentionalui.Subtitles
import dev.chiksmedina.solar.linear.essentionalui.TShirt
import dev.chiksmedina.solar.linear.essentionalui.Target
import dev.chiksmedina.solar.linear.essentionalui.Traffic
import dev.chiksmedina.solar.linear.essentionalui.TrafficEconomy
import dev.chiksmedina.solar.linear.essentionalui.TrashBin2
import dev.chiksmedina.solar.linear.essentionalui.TrashBinMinimalistic
import dev.chiksmedina.solar.linear.essentionalui.TrashBinMinimalistic2
import dev.chiksmedina.solar.linear.essentionalui.TrashBinTrash
import dev.chiksmedina.solar.linear.essentionalui.Umbrella
import dev.chiksmedina.solar.linear.essentionalui.Waterdrop
import dev.chiksmedina.solar.linear.essentionalui.Winrar
import dev.chiksmedina.solar.linear.essentionalui.Xxx
import dev.chiksmedina.solar.linear.essentionalui._4k
import kotlin.collections.List as KtList

object EssentionalUiGroup

val LinearSolar.EssentionalUi: EssentionalUiGroup
    get() = EssentionalUiGroup

private var _AllIcons: KtList<ImageVector>? = null

val EssentionalUiGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            _4k,
            Accessibility,
            AddCircle,
            AddSquare,
            AugmentedReality,
            Balloon,
            BatteryCharge,
            BatteryChargeMinimalistic,
            BatteryFull,
            BatteryFullMinimalistic,
            BatteryHalf,
            BatteryHalfMinimalistic,
            BatteryLow,
            BatteryLowMinimalistic,
            Body,
            Bolt,
            BoltCircle,
            Box,
            BoxMinimalistic,
            Broom,
            Cat,
            CheckCircle,
            CheckSquare,
            CloseCircle,
            CloseSquare,
            Confetti,
            ConfettiMinimalistic,
            Copy,
            Copyright,
            Cosmetic,
            CreativeCommons,
            Crown,
            CrownLine,
            CrownMinimalistic,
            CrownStar,
            Cup,
            CupFirst,
            CupMusic,
            CupStar,
            Cursor,
            CursorSquare,
            Danger,
            DangerCircle,
            DangerSquare,
            DangerTriangle,
            Database,
            Delivery,
            Explicit,
            Feed,
            FerrisWheel,
            Figma,
            Filter,
            Flag,
            Flag2,
            Flashlight,
            FlashlightOn,
            Forbidden,
            ForbiddenCircle,
            Fuel,
            Ghost,
            GhostSmile,
            Gift,
            Glasses,
            HamburgerMenu,
            Hanger,
            Hanger2,
            Help,
            HighDefinition,
            HighQuality,
            Home,
            Home2,
            HomeAdd,
            HomeAddAngle,
            HomeAngle,
            HomeAngle2,
            HomeSmile,
            HomeSmileAngle,
            HomeWifi,
            HomeWifiAngle,
            InfoCircle,
            InfoSquare,
            MagicStick,
            MagicStick2,
            MagicStick3,
            Magnet,
            MagnetWave,
            Masks,
            MaskHapply,
            MaskSad,
            MentionCircle,
            MentionSquare,
            MenuDots,
            MenuDotsCircle,
            MenuDotsSquare,
            MinusCircle,
            MinusSquare,
            Mirror,
            PaperBin,
            Paw,
            Perfume,
            Pin,
            PinCircle,
            PinList,
            Plate,
            PostsCarouselHorizontal,
            PostsCarouselVertical,
            Power,
            QuestionCircle,
            QuestionSquare,
            Reorder,
            Revote,
            Scissors,
            ScissorsSquare,
            Share,
            ShareCircle,
            Skirt,
            Sledgehammer,
            Sleeping,
            SliderHorizontal,
            SliderMinimalisticHorizontal,
            SliderVertical,
            SliderVerticalMinimalistic,
            SmartHome,
            SmartHomeAngle,
            Sort,
            SpecialEffects,
            Subtitles,
            TShirt,
            Target,
            Traffic,
            TrafficEconomy,
            TrashBin2,
            TrashBinMinimalistic,
            TrashBinMinimalistic2,
            TrashBinTrash,
            Umbrella,
            Waterdrop,
            Winrar,
            Xxx
        )
        return _AllIcons!!
    }

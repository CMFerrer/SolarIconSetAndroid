package dev.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LineDuotoneSolar
import dev.chiksmedina.solar.lineduotone.essentionalui.Accessibility
import dev.chiksmedina.solar.lineduotone.essentionalui.AddCircle
import dev.chiksmedina.solar.lineduotone.essentionalui.AddSquare
import dev.chiksmedina.solar.lineduotone.essentionalui.AugmentedReality
import dev.chiksmedina.solar.lineduotone.essentionalui.Balloon
import dev.chiksmedina.solar.lineduotone.essentionalui.BatteryCharge
import dev.chiksmedina.solar.lineduotone.essentionalui.BatteryChargeMinimalistic
import dev.chiksmedina.solar.lineduotone.essentionalui.BatteryFull
import dev.chiksmedina.solar.lineduotone.essentionalui.BatteryFullMinimalistic
import dev.chiksmedina.solar.lineduotone.essentionalui.BatteryHalf
import dev.chiksmedina.solar.lineduotone.essentionalui.BatteryHalfMinimalistic
import dev.chiksmedina.solar.lineduotone.essentionalui.BatteryLow
import dev.chiksmedina.solar.lineduotone.essentionalui.BatteryLowMinimalistic
import dev.chiksmedina.solar.lineduotone.essentionalui.Body
import dev.chiksmedina.solar.lineduotone.essentionalui.Bolt
import dev.chiksmedina.solar.lineduotone.essentionalui.BoltCircle
import dev.chiksmedina.solar.lineduotone.essentionalui.Box
import dev.chiksmedina.solar.lineduotone.essentionalui.BoxMinimalistic
import dev.chiksmedina.solar.lineduotone.essentionalui.Broom
import dev.chiksmedina.solar.lineduotone.essentionalui.Cat
import dev.chiksmedina.solar.lineduotone.essentionalui.CheckCircle
import dev.chiksmedina.solar.lineduotone.essentionalui.CheckSquare
import dev.chiksmedina.solar.lineduotone.essentionalui.CloseCircle
import dev.chiksmedina.solar.lineduotone.essentionalui.CloseSquare
import dev.chiksmedina.solar.lineduotone.essentionalui.Confetti
import dev.chiksmedina.solar.lineduotone.essentionalui.ConfettiMinimalistic
import dev.chiksmedina.solar.lineduotone.essentionalui.Copy
import dev.chiksmedina.solar.lineduotone.essentionalui.Copyright
import dev.chiksmedina.solar.lineduotone.essentionalui.Cosmetic
import dev.chiksmedina.solar.lineduotone.essentionalui.CreativeCommons
import dev.chiksmedina.solar.lineduotone.essentionalui.Crown
import dev.chiksmedina.solar.lineduotone.essentionalui.CrownLine
import dev.chiksmedina.solar.lineduotone.essentionalui.CrownMinimalistic
import dev.chiksmedina.solar.lineduotone.essentionalui.CrownStar
import dev.chiksmedina.solar.lineduotone.essentionalui.Cup
import dev.chiksmedina.solar.lineduotone.essentionalui.CupFirst
import dev.chiksmedina.solar.lineduotone.essentionalui.CupMusic
import dev.chiksmedina.solar.lineduotone.essentionalui.CupStar
import dev.chiksmedina.solar.lineduotone.essentionalui.Cursor
import dev.chiksmedina.solar.lineduotone.essentionalui.CursorSquare
import dev.chiksmedina.solar.lineduotone.essentionalui.Danger
import dev.chiksmedina.solar.lineduotone.essentionalui.DangerCircle
import dev.chiksmedina.solar.lineduotone.essentionalui.DangerSquare
import dev.chiksmedina.solar.lineduotone.essentionalui.DangerTriangle
import dev.chiksmedina.solar.lineduotone.essentionalui.Database
import dev.chiksmedina.solar.lineduotone.essentionalui.Delivery
import dev.chiksmedina.solar.lineduotone.essentionalui.Explicit
import dev.chiksmedina.solar.lineduotone.essentionalui.Feed
import dev.chiksmedina.solar.lineduotone.essentionalui.FerrisWheel
import dev.chiksmedina.solar.lineduotone.essentionalui.Figma
import dev.chiksmedina.solar.lineduotone.essentionalui.Filter
import dev.chiksmedina.solar.lineduotone.essentionalui.Flag
import dev.chiksmedina.solar.lineduotone.essentionalui.Flag2
import dev.chiksmedina.solar.lineduotone.essentionalui.Flashlight
import dev.chiksmedina.solar.lineduotone.essentionalui.FlashlightOn
import dev.chiksmedina.solar.lineduotone.essentionalui.Forbidden
import dev.chiksmedina.solar.lineduotone.essentionalui.ForbiddenCircle
import dev.chiksmedina.solar.lineduotone.essentionalui.Fuel
import dev.chiksmedina.solar.lineduotone.essentionalui.Ghost
import dev.chiksmedina.solar.lineduotone.essentionalui.GhostSmile
import dev.chiksmedina.solar.lineduotone.essentionalui.Gift
import dev.chiksmedina.solar.lineduotone.essentionalui.Glasses
import dev.chiksmedina.solar.lineduotone.essentionalui.HamburgerMenu
import dev.chiksmedina.solar.lineduotone.essentionalui.Hanger
import dev.chiksmedina.solar.lineduotone.essentionalui.Hanger2
import dev.chiksmedina.solar.lineduotone.essentionalui.Help
import dev.chiksmedina.solar.lineduotone.essentionalui.HighDefinition
import dev.chiksmedina.solar.lineduotone.essentionalui.HighQuality
import dev.chiksmedina.solar.lineduotone.essentionalui.Home
import dev.chiksmedina.solar.lineduotone.essentionalui.Home2
import dev.chiksmedina.solar.lineduotone.essentionalui.HomeAdd
import dev.chiksmedina.solar.lineduotone.essentionalui.HomeAddAngle
import dev.chiksmedina.solar.lineduotone.essentionalui.HomeAngle
import dev.chiksmedina.solar.lineduotone.essentionalui.HomeAngle2
import dev.chiksmedina.solar.lineduotone.essentionalui.HomeSmile
import dev.chiksmedina.solar.lineduotone.essentionalui.HomeSmileAngle
import dev.chiksmedina.solar.lineduotone.essentionalui.HomeWifi
import dev.chiksmedina.solar.lineduotone.essentionalui.HomeWifiAngle
import dev.chiksmedina.solar.lineduotone.essentionalui.InfoCircle
import dev.chiksmedina.solar.lineduotone.essentionalui.InfoSquare
import dev.chiksmedina.solar.lineduotone.essentionalui.MagicStick
import dev.chiksmedina.solar.lineduotone.essentionalui.MagicStick2
import dev.chiksmedina.solar.lineduotone.essentionalui.MagicStick3
import dev.chiksmedina.solar.lineduotone.essentionalui.Magnet
import dev.chiksmedina.solar.lineduotone.essentionalui.MagnetWave
import dev.chiksmedina.solar.lineduotone.essentionalui.MaskHapply
import dev.chiksmedina.solar.lineduotone.essentionalui.MaskSad
import dev.chiksmedina.solar.lineduotone.essentionalui.Masks
import dev.chiksmedina.solar.lineduotone.essentionalui.MentionCircle
import dev.chiksmedina.solar.lineduotone.essentionalui.MentionSquare
import dev.chiksmedina.solar.lineduotone.essentionalui.MenuDots
import dev.chiksmedina.solar.lineduotone.essentionalui.MenuDotsCircle
import dev.chiksmedina.solar.lineduotone.essentionalui.MenuDotsSquare
import dev.chiksmedina.solar.lineduotone.essentionalui.MinusCircle
import dev.chiksmedina.solar.lineduotone.essentionalui.MinusSquare
import dev.chiksmedina.solar.lineduotone.essentionalui.Mirror
import dev.chiksmedina.solar.lineduotone.essentionalui.PaperBin
import dev.chiksmedina.solar.lineduotone.essentionalui.Paw
import dev.chiksmedina.solar.lineduotone.essentionalui.Perfume
import dev.chiksmedina.solar.lineduotone.essentionalui.Pin
import dev.chiksmedina.solar.lineduotone.essentionalui.PinCircle
import dev.chiksmedina.solar.lineduotone.essentionalui.PinList
import dev.chiksmedina.solar.lineduotone.essentionalui.Plate
import dev.chiksmedina.solar.lineduotone.essentionalui.PostsCarouselHorizontal
import dev.chiksmedina.solar.lineduotone.essentionalui.PostsCarouselVertical
import dev.chiksmedina.solar.lineduotone.essentionalui.Power
import dev.chiksmedina.solar.lineduotone.essentionalui.QuestionCircle
import dev.chiksmedina.solar.lineduotone.essentionalui.QuestionSquare
import dev.chiksmedina.solar.lineduotone.essentionalui.Reorder
import dev.chiksmedina.solar.lineduotone.essentionalui.Revote
import dev.chiksmedina.solar.lineduotone.essentionalui.Scissors
import dev.chiksmedina.solar.lineduotone.essentionalui.ScissorsSquare
import dev.chiksmedina.solar.lineduotone.essentionalui.Share
import dev.chiksmedina.solar.lineduotone.essentionalui.ShareCircle
import dev.chiksmedina.solar.lineduotone.essentionalui.Skirt
import dev.chiksmedina.solar.lineduotone.essentionalui.Sledgehammer
import dev.chiksmedina.solar.lineduotone.essentionalui.Sleeping
import dev.chiksmedina.solar.lineduotone.essentionalui.SliderHorizontal
import dev.chiksmedina.solar.lineduotone.essentionalui.SliderMinimalisticHorizontal
import dev.chiksmedina.solar.lineduotone.essentionalui.SliderVertical
import dev.chiksmedina.solar.lineduotone.essentionalui.SliderVerticalMinimalistic
import dev.chiksmedina.solar.lineduotone.essentionalui.SmartHome
import dev.chiksmedina.solar.lineduotone.essentionalui.SmartHomeAngle
import dev.chiksmedina.solar.lineduotone.essentionalui.Sort
import dev.chiksmedina.solar.lineduotone.essentionalui.SpecialEffects
import dev.chiksmedina.solar.lineduotone.essentionalui.Subtitles
import dev.chiksmedina.solar.lineduotone.essentionalui.TShirt
import dev.chiksmedina.solar.lineduotone.essentionalui.Target
import dev.chiksmedina.solar.lineduotone.essentionalui.Traffic
import dev.chiksmedina.solar.lineduotone.essentionalui.TrafficEconomy
import dev.chiksmedina.solar.lineduotone.essentionalui.TrashBin2
import dev.chiksmedina.solar.lineduotone.essentionalui.TrashBinMinimalistic
import dev.chiksmedina.solar.lineduotone.essentionalui.TrashBinMinimalistic2
import dev.chiksmedina.solar.lineduotone.essentionalui.TrashBinTrash
import dev.chiksmedina.solar.lineduotone.essentionalui.Umbrella
import dev.chiksmedina.solar.lineduotone.essentionalui.Waterdrop
import dev.chiksmedina.solar.lineduotone.essentionalui.Winrar
import dev.chiksmedina.solar.lineduotone.essentionalui.Xxx
import dev.chiksmedina.solar.lineduotone.essentionalui._4k
import kotlin.collections.List as KtList

object EssentionalUiGroup

val LineDuotoneSolar.EssentionalUi: EssentionalUiGroup
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

package dev.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BrokenSolar
import dev.chiksmedina.solar.broken.essentionalui.Accessibility
import dev.chiksmedina.solar.broken.essentionalui.AddCircle
import dev.chiksmedina.solar.broken.essentionalui.AddSquare
import dev.chiksmedina.solar.broken.essentionalui.AugmentedReality
import dev.chiksmedina.solar.broken.essentionalui.Balloon
import dev.chiksmedina.solar.broken.essentionalui.BatteryCharge
import dev.chiksmedina.solar.broken.essentionalui.BatteryChargeMinimalistic
import dev.chiksmedina.solar.broken.essentionalui.BatteryFull
import dev.chiksmedina.solar.broken.essentionalui.BatteryFullMinimalistic
import dev.chiksmedina.solar.broken.essentionalui.BatteryHalf
import dev.chiksmedina.solar.broken.essentionalui.BatteryHalfMinimalistic
import dev.chiksmedina.solar.broken.essentionalui.BatteryLow
import dev.chiksmedina.solar.broken.essentionalui.BatteryLowMinimalistic
import dev.chiksmedina.solar.broken.essentionalui.Body
import dev.chiksmedina.solar.broken.essentionalui.Bolt
import dev.chiksmedina.solar.broken.essentionalui.BoltCircle
import dev.chiksmedina.solar.broken.essentionalui.Box
import dev.chiksmedina.solar.broken.essentionalui.BoxMinimalistic
import dev.chiksmedina.solar.broken.essentionalui.Broom
import dev.chiksmedina.solar.broken.essentionalui.Cat
import dev.chiksmedina.solar.broken.essentionalui.CheckCircle
import dev.chiksmedina.solar.broken.essentionalui.CheckSquare
import dev.chiksmedina.solar.broken.essentionalui.CloseCircle
import dev.chiksmedina.solar.broken.essentionalui.CloseSquare
import dev.chiksmedina.solar.broken.essentionalui.Confetti
import dev.chiksmedina.solar.broken.essentionalui.ConfettiMinimalistic
import dev.chiksmedina.solar.broken.essentionalui.Copy
import dev.chiksmedina.solar.broken.essentionalui.Copyright
import dev.chiksmedina.solar.broken.essentionalui.Cosmetic
import dev.chiksmedina.solar.broken.essentionalui.CreativeCommons
import dev.chiksmedina.solar.broken.essentionalui.Crown
import dev.chiksmedina.solar.broken.essentionalui.CrownLine
import dev.chiksmedina.solar.broken.essentionalui.CrownMinimalistic
import dev.chiksmedina.solar.broken.essentionalui.CrownStar
import dev.chiksmedina.solar.broken.essentionalui.Cup
import dev.chiksmedina.solar.broken.essentionalui.CupFirst
import dev.chiksmedina.solar.broken.essentionalui.CupMusic
import dev.chiksmedina.solar.broken.essentionalui.CupStar
import dev.chiksmedina.solar.broken.essentionalui.Cursor
import dev.chiksmedina.solar.broken.essentionalui.CursorSquare
import dev.chiksmedina.solar.broken.essentionalui.Danger
import dev.chiksmedina.solar.broken.essentionalui.DangerCircle
import dev.chiksmedina.solar.broken.essentionalui.DangerSquare
import dev.chiksmedina.solar.broken.essentionalui.DangerTriangle
import dev.chiksmedina.solar.broken.essentionalui.Database
import dev.chiksmedina.solar.broken.essentionalui.Delivery
import dev.chiksmedina.solar.broken.essentionalui.Explicit
import dev.chiksmedina.solar.broken.essentionalui.Feed
import dev.chiksmedina.solar.broken.essentionalui.FerrisWheel
import dev.chiksmedina.solar.broken.essentionalui.Figma
import dev.chiksmedina.solar.broken.essentionalui.Filter
import dev.chiksmedina.solar.broken.essentionalui.Flag
import dev.chiksmedina.solar.broken.essentionalui.Flag2
import dev.chiksmedina.solar.broken.essentionalui.Flashlight
import dev.chiksmedina.solar.broken.essentionalui.FlashlightOn
import dev.chiksmedina.solar.broken.essentionalui.Forbidden
import dev.chiksmedina.solar.broken.essentionalui.ForbiddenCircle
import dev.chiksmedina.solar.broken.essentionalui.Fuel
import dev.chiksmedina.solar.broken.essentionalui.Ghost
import dev.chiksmedina.solar.broken.essentionalui.GhostSmile
import dev.chiksmedina.solar.broken.essentionalui.Gift
import dev.chiksmedina.solar.broken.essentionalui.Glasses
import dev.chiksmedina.solar.broken.essentionalui.HamburgerMenu
import dev.chiksmedina.solar.broken.essentionalui.Hanger
import dev.chiksmedina.solar.broken.essentionalui.Hanger2
import dev.chiksmedina.solar.broken.essentionalui.Help
import dev.chiksmedina.solar.broken.essentionalui.HighDefinition
import dev.chiksmedina.solar.broken.essentionalui.HighQuality
import dev.chiksmedina.solar.broken.essentionalui.Home
import dev.chiksmedina.solar.broken.essentionalui.Home2
import dev.chiksmedina.solar.broken.essentionalui.HomeAdd
import dev.chiksmedina.solar.broken.essentionalui.HomeAddAngle
import dev.chiksmedina.solar.broken.essentionalui.HomeAngle
import dev.chiksmedina.solar.broken.essentionalui.HomeAngle2
import dev.chiksmedina.solar.broken.essentionalui.HomeSmile
import dev.chiksmedina.solar.broken.essentionalui.HomeSmileAngle
import dev.chiksmedina.solar.broken.essentionalui.HomeWifi
import dev.chiksmedina.solar.broken.essentionalui.HomeWifiAngle
import dev.chiksmedina.solar.broken.essentionalui.InfoCircle
import dev.chiksmedina.solar.broken.essentionalui.InfoSquare
import dev.chiksmedina.solar.broken.essentionalui.MagicStick
import dev.chiksmedina.solar.broken.essentionalui.MagicStick2
import dev.chiksmedina.solar.broken.essentionalui.MagicStick3
import dev.chiksmedina.solar.broken.essentionalui.Magnet
import dev.chiksmedina.solar.broken.essentionalui.MagnetWave
import dev.chiksmedina.solar.broken.essentionalui.MaskHapply
import dev.chiksmedina.solar.broken.essentionalui.MaskSad
import dev.chiksmedina.solar.broken.essentionalui.Masks
import dev.chiksmedina.solar.broken.essentionalui.MentionCircle
import dev.chiksmedina.solar.broken.essentionalui.MentionSquare
import dev.chiksmedina.solar.broken.essentionalui.MenuDots
import dev.chiksmedina.solar.broken.essentionalui.MenuDotsCircle
import dev.chiksmedina.solar.broken.essentionalui.MenuDotsSquare
import dev.chiksmedina.solar.broken.essentionalui.MinusCircle
import dev.chiksmedina.solar.broken.essentionalui.MinusSquare
import dev.chiksmedina.solar.broken.essentionalui.Mirror
import dev.chiksmedina.solar.broken.essentionalui.PaperBin
import dev.chiksmedina.solar.broken.essentionalui.Paw
import dev.chiksmedina.solar.broken.essentionalui.Perfume
import dev.chiksmedina.solar.broken.essentionalui.Pin
import dev.chiksmedina.solar.broken.essentionalui.PinCircle
import dev.chiksmedina.solar.broken.essentionalui.PinList
import dev.chiksmedina.solar.broken.essentionalui.Plate
import dev.chiksmedina.solar.broken.essentionalui.PostsCarouselHorizontal
import dev.chiksmedina.solar.broken.essentionalui.PostsCarouselVertical
import dev.chiksmedina.solar.broken.essentionalui.Power
import dev.chiksmedina.solar.broken.essentionalui.QuestionCircle
import dev.chiksmedina.solar.broken.essentionalui.QuestionSquare
import dev.chiksmedina.solar.broken.essentionalui.Reorder
import dev.chiksmedina.solar.broken.essentionalui.Revote
import dev.chiksmedina.solar.broken.essentionalui.Scissors
import dev.chiksmedina.solar.broken.essentionalui.ScissorsSquare
import dev.chiksmedina.solar.broken.essentionalui.Share
import dev.chiksmedina.solar.broken.essentionalui.ShareCircle
import dev.chiksmedina.solar.broken.essentionalui.Skirt
import dev.chiksmedina.solar.broken.essentionalui.Sledgehammer
import dev.chiksmedina.solar.broken.essentionalui.Sleeping
import dev.chiksmedina.solar.broken.essentionalui.SliderHorizontal
import dev.chiksmedina.solar.broken.essentionalui.SliderMinimalisticHorizontal
import dev.chiksmedina.solar.broken.essentionalui.SliderVertical
import dev.chiksmedina.solar.broken.essentionalui.SliderVerticalMinimalistic
import dev.chiksmedina.solar.broken.essentionalui.SmartHome
import dev.chiksmedina.solar.broken.essentionalui.SmartHomeAngle
import dev.chiksmedina.solar.broken.essentionalui.Sort
import dev.chiksmedina.solar.broken.essentionalui.SpecialEffects
import dev.chiksmedina.solar.broken.essentionalui.Subtitles
import dev.chiksmedina.solar.broken.essentionalui.TShirt
import dev.chiksmedina.solar.broken.essentionalui.Target
import dev.chiksmedina.solar.broken.essentionalui.Traffic
import dev.chiksmedina.solar.broken.essentionalui.TrafficEconomy
import dev.chiksmedina.solar.broken.essentionalui.TrashBin2
import dev.chiksmedina.solar.broken.essentionalui.TrashBinMinimalistic
import dev.chiksmedina.solar.broken.essentionalui.TrashBinMinimalistic2
import dev.chiksmedina.solar.broken.essentionalui.TrashBinTrash
import dev.chiksmedina.solar.broken.essentionalui.Umbrella
import dev.chiksmedina.solar.broken.essentionalui.Waterdrop
import dev.chiksmedina.solar.broken.essentionalui.Winrar
import dev.chiksmedina.solar.broken.essentionalui.Xxx
import dev.chiksmedina.solar.broken.essentionalui._4k
import kotlin.collections.List as KtList

object EssentionalUiGroup

val BrokenSolar.EssentionalUi: EssentionalUiGroup
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

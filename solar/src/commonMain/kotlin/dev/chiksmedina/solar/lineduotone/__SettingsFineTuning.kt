package dev.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LineDuotoneSolar
import dev.chiksmedina.solar.lineduotone.settingsfinetuning.Settings
import dev.chiksmedina.solar.lineduotone.settingsfinetuning.SettingsMinimalistic
import dev.chiksmedina.solar.lineduotone.settingsfinetuning.Tuning
import dev.chiksmedina.solar.lineduotone.settingsfinetuning.Tuning2
import dev.chiksmedina.solar.lineduotone.settingsfinetuning.Tuning3
import dev.chiksmedina.solar.lineduotone.settingsfinetuning.Tuning4
import dev.chiksmedina.solar.lineduotone.settingsfinetuning.TuningSquare
import dev.chiksmedina.solar.lineduotone.settingsfinetuning.TuningSquare2
import dev.chiksmedina.solar.lineduotone.settingsfinetuning.Widget
import dev.chiksmedina.solar.lineduotone.settingsfinetuning.Widget2
import dev.chiksmedina.solar.lineduotone.settingsfinetuning.Widget3
import dev.chiksmedina.solar.lineduotone.settingsfinetuning.Widget4
import dev.chiksmedina.solar.lineduotone.settingsfinetuning.Widget5
import dev.chiksmedina.solar.lineduotone.settingsfinetuning.Widget6
import dev.chiksmedina.solar.lineduotone.settingsfinetuning.WidgetAdd
import kotlin.collections.List as KtList

object SettingsFineTuningGroup

val LineDuotoneSolar.SettingsFineTuning: SettingsFineTuningGroup
    get() = SettingsFineTuningGroup

private var _AllIcons: KtList<ImageVector>? = null

val SettingsFineTuningGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            Settings,
            SettingsMinimalistic,
            Tuning,
            Tuning2,
            Tuning3,
            Tuning4,
            TuningSquare,
            TuningSquare2,
            Widget,
            Widget2,
            Widget3,
            Widget4,
            Widget5,
            Widget6,
            WidgetAdd
        )
        return _AllIcons!!
    }

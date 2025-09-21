package dev.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LinearSolar
import dev.chiksmedina.solar.linear.settingsfinetuning.Settings
import dev.chiksmedina.solar.linear.settingsfinetuning.SettingsMinimalistic
import dev.chiksmedina.solar.linear.settingsfinetuning.Tuning
import dev.chiksmedina.solar.linear.settingsfinetuning.Tuning2
import dev.chiksmedina.solar.linear.settingsfinetuning.Tuning3
import dev.chiksmedina.solar.linear.settingsfinetuning.Tuning4
import dev.chiksmedina.solar.linear.settingsfinetuning.TuningSquare
import dev.chiksmedina.solar.linear.settingsfinetuning.TuningSquare2
import dev.chiksmedina.solar.linear.settingsfinetuning.Widget
import dev.chiksmedina.solar.linear.settingsfinetuning.Widget2
import dev.chiksmedina.solar.linear.settingsfinetuning.Widget3
import dev.chiksmedina.solar.linear.settingsfinetuning.Widget4
import dev.chiksmedina.solar.linear.settingsfinetuning.Widget5
import dev.chiksmedina.solar.linear.settingsfinetuning.Widget6
import dev.chiksmedina.solar.linear.settingsfinetuning.WidgetAdd
import kotlin.collections.List as KtList

object SettingsFineTuningGroup

val LinearSolar.SettingsFineTuning: SettingsFineTuningGroup
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

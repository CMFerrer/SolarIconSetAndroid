package dev.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.OutlineSolar
import dev.chiksmedina.solar.outline.settingsfinetuning.Settings
import dev.chiksmedina.solar.outline.settingsfinetuning.SettingsMinimalistic
import dev.chiksmedina.solar.outline.settingsfinetuning.Tuning
import dev.chiksmedina.solar.outline.settingsfinetuning.Tuning2
import dev.chiksmedina.solar.outline.settingsfinetuning.Tuning3
import dev.chiksmedina.solar.outline.settingsfinetuning.Tuning4
import dev.chiksmedina.solar.outline.settingsfinetuning.TuningSquare
import dev.chiksmedina.solar.outline.settingsfinetuning.TuningSquare2
import dev.chiksmedina.solar.outline.settingsfinetuning.Widget
import dev.chiksmedina.solar.outline.settingsfinetuning.Widget2
import dev.chiksmedina.solar.outline.settingsfinetuning.Widget3
import dev.chiksmedina.solar.outline.settingsfinetuning.Widget4
import dev.chiksmedina.solar.outline.settingsfinetuning.Widget5
import dev.chiksmedina.solar.outline.settingsfinetuning.Widget6
import dev.chiksmedina.solar.outline.settingsfinetuning.WidgetAdd
import kotlin.collections.List as KtList

object SettingsFineTuningGroup

val OutlineSolar.SettingsFineTuning: SettingsFineTuningGroup
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

package com.chiksmedina.solar.broken.settingsfinetuning

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.SettingsFineTuningGroup

val SettingsFineTuningGroup.SettingsMinimalistic: ImageVector
    get() {
        if (_settingsMinimalistic != null) {
            return _settingsMinimalistic!!
        }
        _settingsMinimalistic = Builder(
            name = "SettingsMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.8431f, 20.1979f)
                curveTo(9.8718f, 21.3993f, 10.8862f, 22.0f, 12.0f, 22.0f)
                curveTo(13.1138f, 22.0f, 14.1282f, 21.3993f, 16.1569f, 20.1979f)
                lineTo(16.8431f, 19.7915f)
                curveTo(18.8718f, 18.5901f, 19.8862f, 17.9894f, 20.4431f, 17.0f)
                curveTo(21.0f, 16.0106f, 21.0f, 14.8092f, 21.0f, 12.4063f)
                moveTo(20.8147f, 8.0f)
                curveTo(20.7326f, 7.6276f, 20.6141f, 7.3038f, 20.4431f, 7.0f)
                curveTo(19.8862f, 6.0106f, 18.8718f, 5.4099f, 16.8431f, 4.2085f)
                lineTo(16.1569f, 3.8021f)
                curveTo(14.1282f, 2.6007f, 13.1138f, 2.0f, 12.0f, 2.0f)
                curveTo(10.8862f, 2.0f, 9.8718f, 2.6007f, 7.8431f, 3.8021f)
                lineTo(7.1569f, 4.2085f)
                curveTo(5.1282f, 5.4099f, 4.1138f, 6.0106f, 3.5569f, 7.0f)
                curveTo(3.0f, 7.9894f, 3.0f, 9.1908f, 3.0f, 11.5937f)
                verticalLineTo(12.4063f)
                curveTo(3.0f, 14.8092f, 3.0f, 16.0106f, 3.5569f, 17.0f)
                curveTo(3.7833f, 17.4021f, 4.0852f, 17.74f, 4.5f, 18.0802f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-3.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
            }
        }
            .build()
        return _settingsMinimalistic!!
    }

private var _settingsMinimalistic: ImageVector? = null

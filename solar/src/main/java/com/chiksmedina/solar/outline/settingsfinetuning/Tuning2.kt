package com.chiksmedina.solar.outline.settingsfinetuning

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.SettingsFineTuningGroup

val SettingsFineTuningGroup.Tuning2: ImageVector
    get() {
        if (_tuning2 != null) {
            return _tuning2!!
        }
        _tuning2 = Builder(
            name = "Tuning2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(18.25f, 7.0f)
                curveTo(18.25f, 9.0711f, 16.5711f, 10.75f, 14.5f, 10.75f)
                curveTo(12.4289f, 10.75f, 10.75f, 9.0711f, 10.75f, 7.0f)
                curveTo(10.75f, 4.9289f, 12.4289f, 3.25f, 14.5f, 3.25f)
                curveTo(16.5711f, 3.25f, 18.25f, 4.9289f, 18.25f, 7.0f)
                close()
                moveTo(14.5f, 9.25f)
                curveTo(15.7426f, 9.25f, 16.75f, 8.2426f, 16.75f, 7.0f)
                curveTo(16.75f, 5.7574f, 15.7426f, 4.75f, 14.5f, 4.75f)
                curveTo(13.2574f, 4.75f, 12.25f, 5.7574f, 12.25f, 7.0f)
                curveTo(12.25f, 8.2426f, 13.2574f, 9.25f, 14.5f, 9.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(5.75f, 17.0f)
                curveTo(5.75f, 19.0711f, 7.4289f, 20.75f, 9.5f, 20.75f)
                curveTo(11.5711f, 20.75f, 13.25f, 19.0711f, 13.25f, 17.0f)
                curveTo(13.25f, 14.9289f, 11.5711f, 13.25f, 9.5f, 13.25f)
                curveTo(7.4289f, 13.25f, 5.75f, 14.9289f, 5.75f, 17.0f)
                close()
                moveTo(9.5f, 19.25f)
                curveTo(8.2574f, 19.25f, 7.25f, 18.2426f, 7.25f, 17.0f)
                curveTo(7.25f, 15.7574f, 8.2574f, 14.75f, 9.5f, 14.75f)
                curveTo(10.7426f, 14.75f, 11.75f, 15.7574f, 11.75f, 17.0f)
                curveTo(11.75f, 18.2426f, 10.7426f, 19.25f, 9.5f, 19.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.25f, 16.9585f)
                curveTo(14.25f, 16.5443f, 14.5858f, 16.2085f, 15.0f, 16.2085f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 16.2085f, 22.75f, 16.5443f, 22.75f, 16.9585f)
                curveTo(22.75f, 17.3727f, 22.4142f, 17.7085f, 22.0f, 17.7085f)
                horizontalLineTo(15.0f)
                curveTo(14.5858f, 17.7085f, 14.25f, 17.3727f, 14.25f, 16.9585f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.0f, 6.2085f)
                curveTo(9.4142f, 6.2085f, 9.75f, 6.5443f, 9.75f, 6.9585f)
                curveTo(9.75f, 7.3727f, 9.4142f, 7.7085f, 9.0f, 7.7085f)
                lineTo(2.0f, 7.7085f)
                curveTo(1.5858f, 7.7085f, 1.25f, 7.3727f, 1.25f, 6.9585f)
                curveTo(1.25f, 6.5443f, 1.5858f, 6.2085f, 2.0f, 6.2085f)
                lineTo(9.0f, 6.2085f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(1.25f, 16.9585f)
                curveTo(1.25f, 16.5443f, 1.5858f, 16.2085f, 2.0f, 16.2085f)
                horizontalLineTo(4.0f)
                curveTo(4.4142f, 16.2085f, 4.75f, 16.5443f, 4.75f, 16.9585f)
                curveTo(4.75f, 17.3727f, 4.4142f, 17.7085f, 4.0f, 17.7085f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 17.7085f, 1.25f, 17.3727f, 1.25f, 16.9585f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(22.0f, 6.2085f)
                curveTo(22.4142f, 6.2085f, 22.75f, 6.5443f, 22.75f, 6.9585f)
                curveTo(22.75f, 7.3727f, 22.4142f, 7.7085f, 22.0f, 7.7085f)
                horizontalLineTo(20.0f)
                curveTo(19.5858f, 7.7085f, 19.25f, 7.3727f, 19.25f, 6.9585f)
                curveTo(19.25f, 6.5443f, 19.5858f, 6.2085f, 20.0f, 6.2085f)
                horizontalLineTo(22.0f)
                close()
            }
        }
            .build()
        return _tuning2!!
    }

private var _tuning2: ImageVector? = null

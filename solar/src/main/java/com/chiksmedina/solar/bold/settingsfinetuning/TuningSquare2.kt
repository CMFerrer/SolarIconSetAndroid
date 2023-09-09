package com.chiksmedina.solar.bold.settingsfinetuning

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.SettingsFineTuningGroup

public val SettingsFineTuningGroup.TuningSquare2: ImageVector
    get() {
        if (_tuningSquare2 != null) {
            return _tuningSquare2!!
        }
        _tuningSquare2 = Builder(name = "TuningSquare2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 17.25f)
                curveTo(9.3096f, 17.25f, 8.75f, 16.6904f, 8.75f, 16.0f)
                curveTo(8.75f, 15.3096f, 9.3096f, 14.75f, 10.0f, 14.75f)
                curveTo(10.6904f, 14.75f, 11.25f, 15.3096f, 11.25f, 16.0f)
                curveTo(11.25f, 16.6904f, 10.6904f, 17.25f, 10.0f, 17.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.25f, 8.0f)
                curveTo(15.25f, 8.6904f, 14.6904f, 9.25f, 14.0f, 9.25f)
                curveTo(13.3096f, 9.25f, 12.75f, 8.6904f, 12.75f, 8.0f)
                curveTo(12.75f, 7.3096f, 13.3096f, 6.75f, 14.0f, 6.75f)
                curveTo(14.6904f, 6.75f, 15.25f, 7.3096f, 15.25f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                close()
                moveTo(10.0f, 18.75f)
                curveTo(8.4812f, 18.75f, 7.25f, 17.5188f, 7.25f, 16.0f)
                curveTo(7.25f, 14.4812f, 8.4812f, 13.25f, 10.0f, 13.25f)
                curveTo(11.5188f, 13.25f, 12.75f, 14.4812f, 12.75f, 16.0f)
                curveTo(12.75f, 17.5188f, 11.5188f, 18.75f, 10.0f, 18.75f)
                close()
                moveTo(16.75f, 8.0f)
                curveTo(16.75f, 9.5188f, 15.5188f, 10.75f, 14.0f, 10.75f)
                curveTo(12.4812f, 10.75f, 11.25f, 9.5188f, 11.25f, 8.0f)
                curveTo(11.25f, 6.4812f, 12.4812f, 5.25f, 14.0f, 5.25f)
                curveTo(15.5188f, 5.25f, 16.75f, 6.4812f, 16.75f, 8.0f)
                close()
                moveTo(13.25f, 16.0f)
                curveTo(13.25f, 15.5858f, 13.5858f, 15.25f, 14.0f, 15.25f)
                horizontalLineTo(19.0f)
                curveTo(19.4142f, 15.25f, 19.75f, 15.5858f, 19.75f, 16.0f)
                curveTo(19.75f, 16.4142f, 19.4142f, 16.75f, 19.0f, 16.75f)
                horizontalLineTo(14.0f)
                curveTo(13.5858f, 16.75f, 13.25f, 16.4142f, 13.25f, 16.0f)
                close()
                moveTo(10.0f, 7.25f)
                curveTo(10.4142f, 7.25f, 10.75f, 7.5858f, 10.75f, 8.0f)
                curveTo(10.75f, 8.4142f, 10.4142f, 8.75f, 10.0f, 8.75f)
                lineTo(5.0f, 8.75f)
                curveTo(4.5858f, 8.75f, 4.25f, 8.4142f, 4.25f, 8.0f)
                curveTo(4.25f, 7.5858f, 4.5858f, 7.25f, 5.0f, 7.25f)
                lineTo(10.0f, 7.25f)
                close()
                moveTo(4.25f, 16.0f)
                curveTo(4.25f, 15.5858f, 4.5858f, 15.25f, 5.0f, 15.25f)
                horizontalLineTo(6.0f)
                curveTo(6.4142f, 15.25f, 6.75f, 15.5858f, 6.75f, 16.0f)
                curveTo(6.75f, 16.4142f, 6.4142f, 16.75f, 6.0f, 16.75f)
                horizontalLineTo(5.0f)
                curveTo(4.5858f, 16.75f, 4.25f, 16.4142f, 4.25f, 16.0f)
                close()
                moveTo(19.0f, 7.25f)
                curveTo(19.4142f, 7.25f, 19.75f, 7.5858f, 19.75f, 8.0f)
                curveTo(19.75f, 8.4142f, 19.4142f, 8.75f, 19.0f, 8.75f)
                horizontalLineTo(18.0f)
                curveTo(17.5858f, 8.75f, 17.25f, 8.4142f, 17.25f, 8.0f)
                curveTo(17.25f, 7.5858f, 17.5858f, 7.25f, 18.0f, 7.25f)
                horizontalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _tuningSquare2!!
    }

private var _tuningSquare2: ImageVector? = null

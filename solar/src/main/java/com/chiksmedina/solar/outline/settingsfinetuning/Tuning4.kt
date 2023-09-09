package com.chiksmedina.solar.outline.settingsfinetuning

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
import com.chiksmedina.solar.outline.SettingsFineTuningGroup

public val SettingsFineTuningGroup.Tuning4: ImageVector
    get() {
        if (_tuning4 != null) {
            return _tuning4!!
        }
        _tuning4 = Builder(name = "Tuning4", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.75f, 4.0f)
                curveTo(16.75f, 5.5188f, 15.5188f, 6.75f, 14.0f, 6.75f)
                curveTo(12.4812f, 6.75f, 11.25f, 5.5188f, 11.25f, 4.0f)
                curveTo(11.25f, 2.4812f, 12.4812f, 1.25f, 14.0f, 1.25f)
                curveTo(15.5188f, 1.25f, 16.75f, 2.4812f, 16.75f, 4.0f)
                close()
                moveTo(14.0f, 5.25f)
                curveTo(14.6904f, 5.25f, 15.25f, 4.6904f, 15.25f, 4.0f)
                curveTo(15.25f, 3.3096f, 14.6904f, 2.75f, 14.0f, 2.75f)
                curveTo(13.3096f, 2.75f, 12.75f, 3.3096f, 12.75f, 4.0f)
                curveTo(12.75f, 4.6904f, 13.3096f, 5.25f, 14.0f, 5.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 14.75f)
                curveTo(10.4812f, 14.75f, 9.25f, 13.5188f, 9.25f, 12.0f)
                curveTo(9.25f, 10.4812f, 10.4812f, 9.25f, 12.0f, 9.25f)
                curveTo(13.5188f, 9.25f, 14.75f, 10.4812f, 14.75f, 12.0f)
                curveTo(14.75f, 13.5188f, 13.5188f, 14.75f, 12.0f, 14.75f)
                close()
                moveTo(10.75f, 12.0f)
                curveTo(10.75f, 12.6904f, 11.3096f, 13.25f, 12.0f, 13.25f)
                curveTo(12.6904f, 13.25f, 13.25f, 12.6904f, 13.25f, 12.0f)
                curveTo(13.25f, 11.3096f, 12.6904f, 10.75f, 12.0f, 10.75f)
                curveTo(11.3096f, 10.75f, 10.75f, 11.3096f, 10.75f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.0f, 22.75f)
                curveTo(8.4812f, 22.75f, 7.25f, 21.5188f, 7.25f, 20.0f)
                curveTo(7.25f, 18.4812f, 8.4812f, 17.25f, 10.0f, 17.25f)
                curveTo(11.5188f, 17.25f, 12.75f, 18.4812f, 12.75f, 20.0f)
                curveTo(12.75f, 21.5188f, 11.5188f, 22.75f, 10.0f, 22.75f)
                close()
                moveTo(8.75f, 20.0f)
                curveTo(8.75f, 20.6904f, 9.3096f, 21.25f, 10.0f, 21.25f)
                curveTo(10.6904f, 21.25f, 11.25f, 20.6904f, 11.25f, 20.0f)
                curveTo(11.25f, 19.3096f, 10.6904f, 18.75f, 10.0f, 18.75f)
                curveTo(9.3096f, 18.75f, 8.75f, 19.3096f, 8.75f, 20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.25f, 12.0f)
                curveTo(15.25f, 11.5858f, 15.5858f, 11.25f, 16.0f, 11.25f)
                horizontalLineTo(19.0f)
                curveTo(19.4142f, 11.25f, 19.75f, 11.5858f, 19.75f, 12.0f)
                curveTo(19.75f, 12.4142f, 19.4142f, 12.75f, 19.0f, 12.75f)
                horizontalLineTo(16.0f)
                curveTo(15.5858f, 12.75f, 15.25f, 12.4142f, 15.25f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 19.25f)
                curveTo(13.5858f, 19.25f, 13.25f, 19.5858f, 13.25f, 20.0f)
                curveTo(13.25f, 20.4142f, 13.5858f, 20.75f, 14.0f, 20.75f)
                horizontalLineTo(19.0f)
                curveTo(19.4142f, 20.75f, 19.75f, 20.4142f, 19.75f, 20.0f)
                curveTo(19.75f, 19.5858f, 19.4142f, 19.25f, 19.0f, 19.25f)
                horizontalLineTo(14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.75f, 4.0f)
                curveTo(10.75f, 3.5858f, 10.4142f, 3.25f, 10.0f, 3.25f)
                lineTo(5.0f, 3.25f)
                curveTo(4.5858f, 3.25f, 4.25f, 3.5858f, 4.25f, 4.0f)
                curveTo(4.25f, 4.4142f, 4.5858f, 4.75f, 5.0f, 4.75f)
                lineTo(10.0f, 4.75f)
                curveTo(10.4142f, 4.75f, 10.75f, 4.4142f, 10.75f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 11.25f)
                curveTo(4.5858f, 11.25f, 4.25f, 11.5858f, 4.25f, 12.0f)
                curveTo(4.25f, 12.4142f, 4.5858f, 12.75f, 5.0f, 12.75f)
                horizontalLineTo(8.0f)
                curveTo(8.4142f, 12.75f, 8.75f, 12.4142f, 8.75f, 12.0f)
                curveTo(8.75f, 11.5858f, 8.4142f, 11.25f, 8.0f, 11.25f)
                horizontalLineTo(5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.25f, 20.0f)
                curveTo(4.25f, 19.5858f, 4.5858f, 19.25f, 5.0f, 19.25f)
                horizontalLineTo(6.0f)
                curveTo(6.4142f, 19.25f, 6.75f, 19.5858f, 6.75f, 20.0f)
                curveTo(6.75f, 20.4142f, 6.4142f, 20.75f, 6.0f, 20.75f)
                horizontalLineTo(5.0f)
                curveTo(4.5858f, 20.75f, 4.25f, 20.4142f, 4.25f, 20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.25f)
                curveTo(19.4142f, 3.25f, 19.75f, 3.5858f, 19.75f, 4.0f)
                curveTo(19.75f, 4.4142f, 19.4142f, 4.75f, 19.0f, 4.75f)
                horizontalLineTo(18.0f)
                curveTo(17.5858f, 4.75f, 17.25f, 4.4142f, 17.25f, 4.0f)
                curveTo(17.25f, 3.5858f, 17.5858f, 3.25f, 18.0f, 3.25f)
                horizontalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _tuning4!!
    }

private var _tuning4: ImageVector? = null

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

public val SettingsFineTuningGroup.Tuning3: ImageVector
    get() {
        if (_tuning3 != null) {
            return _tuning3!!
        }
        _tuning3 = Builder(name = "Tuning3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.75f)
                curveTo(11.5858f, 8.75f, 11.25f, 8.4142f, 11.25f, 8.0f)
                verticalLineTo(5.0f)
                curveTo(11.25f, 4.5858f, 11.5858f, 4.25f, 12.0f, 4.25f)
                curveTo(12.4142f, 4.25f, 12.75f, 4.5858f, 12.75f, 5.0f)
                verticalLineTo(8.0f)
                curveTo(12.75f, 8.4142f, 12.4142f, 8.75f, 12.0f, 8.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 7.25f)
                curveTo(5.5188f, 7.25f, 6.75f, 8.4812f, 6.75f, 10.0f)
                curveTo(6.75f, 11.5188f, 5.5188f, 12.75f, 4.0f, 12.75f)
                curveTo(2.4812f, 12.75f, 1.25f, 11.5188f, 1.25f, 10.0f)
                curveTo(1.25f, 8.4812f, 2.4812f, 7.25f, 4.0f, 7.25f)
                close()
                moveTo(5.25f, 10.0f)
                curveTo(5.25f, 9.3096f, 4.6904f, 8.75f, 4.0f, 8.75f)
                curveTo(3.3096f, 8.75f, 2.75f, 9.3096f, 2.75f, 10.0f)
                curveTo(2.75f, 10.6904f, 3.3096f, 11.25f, 4.0f, 11.25f)
                curveTo(4.6904f, 11.25f, 5.25f, 10.6904f, 5.25f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.75f, 12.0f)
                curveTo(14.75f, 13.5188f, 13.5188f, 14.75f, 12.0f, 14.75f)
                curveTo(10.4812f, 14.75f, 9.25f, 13.5188f, 9.25f, 12.0f)
                curveTo(9.25f, 10.4812f, 10.4812f, 9.25f, 12.0f, 9.25f)
                curveTo(13.5188f, 9.25f, 14.75f, 10.4812f, 14.75f, 12.0f)
                close()
                moveTo(12.0f, 13.25f)
                curveTo(12.6904f, 13.25f, 13.25f, 12.6904f, 13.25f, 12.0f)
                curveTo(13.25f, 11.3096f, 12.6904f, 10.75f, 12.0f, 10.75f)
                curveTo(11.3096f, 10.75f, 10.75f, 11.3096f, 10.75f, 12.0f)
                curveTo(10.75f, 12.6904f, 11.3096f, 13.25f, 12.0f, 13.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.75f, 14.0f)
                curveTo(22.75f, 15.5188f, 21.5188f, 16.75f, 20.0f, 16.75f)
                curveTo(18.4812f, 16.75f, 17.25f, 15.5188f, 17.25f, 14.0f)
                curveTo(17.25f, 12.4812f, 18.4812f, 11.25f, 20.0f, 11.25f)
                curveTo(21.5188f, 11.25f, 22.75f, 12.4812f, 22.75f, 14.0f)
                close()
                moveTo(20.0f, 15.25f)
                curveTo(20.6904f, 15.25f, 21.25f, 14.6904f, 21.25f, 14.0f)
                curveTo(21.25f, 13.3096f, 20.6904f, 12.75f, 20.0f, 12.75f)
                curveTo(19.3096f, 12.75f, 18.75f, 13.3096f, 18.75f, 14.0f)
                curveTo(18.75f, 14.6904f, 19.3096f, 15.25f, 20.0f, 15.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.25f, 10.0f)
                curveTo(19.25f, 10.4142f, 19.5858f, 10.75f, 20.0f, 10.75f)
                curveTo(20.4142f, 10.75f, 20.75f, 10.4142f, 20.75f, 10.0f)
                verticalLineTo(5.0f)
                curveTo(20.75f, 4.5858f, 20.4142f, 4.25f, 20.0f, 4.25f)
                curveTo(19.5858f, 4.25f, 19.25f, 4.5858f, 19.25f, 5.0f)
                verticalLineTo(10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 13.25f)
                curveTo(3.5858f, 13.25f, 3.25f, 13.5858f, 3.25f, 14.0f)
                lineTo(3.25f, 19.0f)
                curveTo(3.25f, 19.4142f, 3.5858f, 19.75f, 4.0f, 19.75f)
                curveTo(4.4142f, 19.75f, 4.75f, 19.4142f, 4.75f, 19.0f)
                lineTo(4.75f, 14.0f)
                curveTo(4.75f, 13.5858f, 4.4142f, 13.25f, 4.0f, 13.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.25f, 19.0f)
                curveTo(11.25f, 19.4142f, 11.5858f, 19.75f, 12.0f, 19.75f)
                curveTo(12.4142f, 19.75f, 12.75f, 19.4142f, 12.75f, 19.0f)
                verticalLineTo(16.0f)
                curveTo(12.75f, 15.5858f, 12.4142f, 15.25f, 12.0f, 15.25f)
                curveTo(11.5858f, 15.25f, 11.25f, 15.5858f, 11.25f, 16.0f)
                verticalLineTo(19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 19.75f)
                curveTo(19.5858f, 19.75f, 19.25f, 19.4142f, 19.25f, 19.0f)
                verticalLineTo(18.0f)
                curveTo(19.25f, 17.5858f, 19.5858f, 17.25f, 20.0f, 17.25f)
                curveTo(20.4142f, 17.25f, 20.75f, 17.5858f, 20.75f, 18.0f)
                verticalLineTo(19.0f)
                curveTo(20.75f, 19.4142f, 20.4142f, 19.75f, 20.0f, 19.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.25f, 5.0f)
                curveTo(3.25f, 4.5858f, 3.5858f, 4.25f, 4.0f, 4.25f)
                curveTo(4.4142f, 4.25f, 4.75f, 4.5858f, 4.75f, 5.0f)
                verticalLineTo(6.0f)
                curveTo(4.75f, 6.4142f, 4.4142f, 6.75f, 4.0f, 6.75f)
                curveTo(3.5858f, 6.75f, 3.25f, 6.4142f, 3.25f, 6.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _tuning3!!
    }

private var _tuning3: ImageVector? = null

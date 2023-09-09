package com.chiksmedina.solar.bold.settingsfinetuning

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val SettingsFineTuningGroup.Tuning4: ImageVector
    get() {
        if (_tuning4 != null) {
            return _tuning4!!
        }
        _tuning4 = Builder(name = "Tuning4", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveTo(12.0f, 2.8954f, 12.8954f, 2.0f, 14.0f, 2.0f)
                curveTo(15.1046f, 2.0f, 16.0f, 2.8954f, 16.0f, 4.0f)
                curveTo(16.0f, 5.1046f, 15.1046f, 6.0f, 14.0f, 6.0f)
                curveTo(12.8954f, 6.0f, 12.0f, 5.1046f, 12.0f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                curveTo(13.1046f, 10.0f, 14.0f, 10.8954f, 14.0f, 12.0f)
                curveTo(14.0f, 13.1046f, 13.1046f, 14.0f, 12.0f, 14.0f)
                curveTo(10.8954f, 14.0f, 10.0f, 13.1046f, 10.0f, 12.0f)
                curveTo(10.0f, 10.8954f, 10.8954f, 10.0f, 12.0f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 18.0f)
                curveTo(11.1046f, 18.0f, 12.0f, 18.8954f, 12.0f, 20.0f)
                curveTo(12.0f, 21.1046f, 11.1046f, 22.0f, 10.0f, 22.0f)
                curveTo(8.8954f, 22.0f, 8.0f, 21.1046f, 8.0f, 20.0f)
                curveTo(8.0f, 18.8954f, 8.8954f, 18.0f, 10.0f, 18.0f)
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

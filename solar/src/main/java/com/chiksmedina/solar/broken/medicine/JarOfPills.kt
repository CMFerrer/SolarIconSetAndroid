package com.chiksmedina.solar.broken.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.MedicineGroup

public val MedicineGroup.JarOfPills: ImageVector
    get() {
        if (_jarOfPills != null) {
            return _jarOfPills!!
        }
        _jarOfPills = Builder(name = "JarOfPills", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 3.5f)
                curveTo(6.0f, 3.0341f, 6.0f, 2.8011f, 6.0761f, 2.6173f)
                curveTo(6.1776f, 2.3723f, 6.3723f, 2.1776f, 6.6173f, 2.0761f)
                curveTo(6.8011f, 2.0f, 7.0341f, 2.0f, 7.5f, 2.0f)
                horizontalLineTo(16.5f)
                curveTo(16.9659f, 2.0f, 17.1989f, 2.0f, 17.3827f, 2.0761f)
                curveTo(17.6277f, 2.1776f, 17.8224f, 2.3723f, 17.9239f, 2.6173f)
                curveTo(18.0f, 2.8011f, 18.0f, 3.0341f, 18.0f, 3.5f)
                curveTo(18.0f, 3.9659f, 18.0f, 4.1989f, 17.9239f, 4.3827f)
                curveTo(17.8224f, 4.6277f, 17.6277f, 4.8224f, 17.3827f, 4.9239f)
                curveTo(17.1989f, 5.0f, 16.9659f, 5.0f, 16.5f, 5.0f)
                horizontalLineTo(7.5f)
                curveTo(7.0341f, 5.0f, 6.8011f, 5.0f, 6.6173f, 4.9239f)
                curveTo(6.3723f, 4.8224f, 6.1776f, 4.6277f, 6.0761f, 4.3827f)
                curveTo(6.0f, 4.1989f, 6.0f, 3.9659f, 6.0f, 3.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.5f, 18.0f)
                horizontalLineTo(19.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.5f, 10.0f)
                horizontalLineTo(8.25f)
                moveTo(19.5f, 10.0f)
                horizontalLineTo(12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 10.9083f)
                curveTo(20.0f, 9.7013f, 19.455f, 8.5588f, 18.5168f, 7.7993f)
                lineTo(16.1595f, 5.891f)
                curveTo(15.6146f, 5.4499f, 15.3421f, 5.2293f, 15.0182f, 5.1147f)
                curveTo(14.6943f, 5.0f, 14.3438f, 5.0f, 13.6427f, 5.0f)
                horizontalLineTo(10.4031f)
                curveTo(9.7083f, 5.0f, 9.361f, 5.0f, 9.0395f, 5.1127f)
                curveTo(8.7181f, 5.2255f, 8.4469f, 5.4425f, 7.9043f, 5.8765f)
                lineTo(5.5012f, 7.799f)
                curveTo(4.5524f, 8.5581f, 4.0f, 9.7074f, 4.0f, 10.9225f)
                verticalLineTo(12.5f)
                moveTo(20.0f, 15.0f)
                verticalLineTo(17.5649f)
                curveTo(20.0f, 18.4927f, 19.6775f, 19.3916f, 19.0877f, 20.1078f)
                lineTo(18.7294f, 20.5428f)
                curveTo(17.9696f, 21.4655f, 16.837f, 22.0f, 15.6417f, 22.0f)
                horizontalLineTo(8.9569f)
                curveTo(8.3858f, 22.0f, 8.1003f, 22.0f, 7.8296f, 21.9628f)
                curveTo(7.0266f, 21.8526f, 6.2761f, 21.5011f, 5.6774f, 20.9548f)
                curveTo(5.4755f, 20.7706f, 5.2927f, 20.5513f, 4.9271f, 20.1125f)
                curveTo(4.3281f, 19.3937f, 4.0f, 18.4875f, 4.0f, 17.5518f)
                verticalLineTo(16.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                verticalLineTo(16.0f)
                moveTo(10.0f, 14.0f)
                lineTo(14.0f, 14.0f)
            }
        }
        .build()
        return _jarOfPills!!
    }

private var _jarOfPills: ImageVector? = null

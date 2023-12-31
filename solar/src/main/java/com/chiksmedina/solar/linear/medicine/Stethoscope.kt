package com.chiksmedina.solar.linear.medicine

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
import com.chiksmedina.solar.linear.MedicineGroup

val MedicineGroup.Stethoscope: ImageVector
    get() {
        if (_stethoscope != null) {
            return _stethoscope!!
        }
        _stethoscope = Builder(
            name = "Stethoscope", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 14.2354f)
                verticalLineTo(17.0001f)
                curveTo(9.0f, 19.7615f, 11.2386f, 22.0001f, 14.0f, 22.0001f)
                horizontalLineTo(14.8824f)
                curveTo(16.7691f, 22.0001f, 18.3595f, 20.7311f, 18.8465f, 19.0001f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.4286f, 3.0f)
                horizontalLineTo(5.3369f)
                curveTo(5.024f, 3.0f, 4.8676f, 3.0f, 4.7357f, 3.0117f)
                curveTo(3.2876f, 3.1397f, 2.1397f, 4.2876f, 2.0117f, 5.7357f)
                curveTo(2.0f, 5.8676f, 2.0f, 6.024f, 2.0f, 6.3369f)
                verticalLineTo(7.2353f)
                curveTo(2.0f, 11.1013f, 5.134f, 14.2353f, 9.0f, 14.2353f)
                curveTo(12.7082f, 14.2353f, 15.7143f, 11.2292f, 15.7143f, 7.521f)
                verticalLineTo(6.3369f)
                curveTo(15.7143f, 6.024f, 15.7143f, 5.8676f, 15.7026f, 5.7357f)
                curveTo(15.5746f, 4.2876f, 14.4267f, 3.1397f, 12.9785f, 3.0117f)
                curveTo(12.8467f, 3.0f, 12.6902f, 3.0f, 12.3774f, 3.0f)
                horizontalLineTo(12.2857f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.0f, 16.0f)
                moveToRelative(-3.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 2.0f)
                verticalLineTo(4.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 2.0f)
                verticalLineTo(4.0f)
            }
        }
            .build()
        return _stethoscope!!
    }

private var _stethoscope: ImageVector? = null
